package com.amplifyframework.samples.gettingstarted.Login;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.amazonaws.mobile.client.AWSMobileClient;
import com.amazonaws.mobile.client.Callback;
import com.amazonaws.mobile.client.HostedUIOptions;
import com.amazonaws.mobile.client.SignInUIOptions;
import com.amazonaws.mobile.client.UserStateDetails;
import com.amplifyframework.samples.gettingstarted.TodoList.TodoListActivity;
import com.amplifyframework.samples.gettingstarted.R;


public class AuthMainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3;

    private static final String TAG = AuthMainActivity.class.getSimpleName();

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity_auth_main);

        btn1 = findViewById(R.id.user_signup_btn);
        btn2 = findViewById(R.id.em_btn);
        btn3 = findViewById(R.id.btn_join);

        context = this;

       // CommonAction.checkSession(this, true);

        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //이메일 버튼 클릭시, 이메일 로그인 페이지로 이동
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //비상 버튼 클릭시, 메인 페이지로 이동
                Intent intent = new Intent(getApplicationContext(), TodoListActivity.class);
                startActivity(intent);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //회원가입 버튼 클릭시, 회원가입 페이지로 이동
                Intent intent = new Intent(getApplicationContext(), SignUpActivity.class);
                startActivity(intent);
            }
        });
    }

    private void _openFacebookLogin() {
        HostedUIOptions hostedUIOptions = HostedUIOptions.builder()
                .scopes("openid", "email")
                .identityProvider("Facebook")
                .build();

        SignInUIOptions signInUIOptions = SignInUIOptions.builder()
                .hostedUIOptions(hostedUIOptions)
                .build();

        AWSMobileClient.getInstance().showSignIn((Activity) context, signInUIOptions, new Callback<UserStateDetails>() {
            @Override
            public void onResult(UserStateDetails details) {
                Log.d(TAG, "onResult: " + details.getUserState());
            }

            @Override
            public void onError(Exception e) {
                Log.e(TAG, "onError: ", e);
            }
        });
    }

    public void openFacebookLogin(View view) {
        _openFacebookLogin();
    }

    @Override
    protected void onResume() {
        super.onResume();

        Intent activityIntent = getIntent();
        if (activityIntent.getData() != null &&
                "bigfoot".equals(activityIntent.getData().getScheme())) {
            if (AWSMobileClient.getInstance().handleAuthResponse(activityIntent))
                CommonAction.checkSession(this, true);
        }
    }
}
