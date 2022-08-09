package com.amplifyframework.samples.gettingstarted.ViewList;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.amplifyframework.samples.core.ItemAdapter;
import com.amplifyframework.samples.core.ListActivity;
import com.amplifyframework.samples.gettingstarted.R;
import com.amplifyframework.samples.gettingstarted.TodoList.TodoListActivity;

public class PhotoItemActivity extends ListActivity implements PhotoItemAdapter.OnItemClickListener{
    private final PhotoItemAdapter photoItemAdapter = new PhotoItemAdapter(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        SwipeRefreshLayout swipeRefresh = findViewById(R.id.swiperefresh);
        recyclerView.setAdapter(photoItemAdapter);
        int numberOfColumns = 2;
        recyclerView.setLayoutManager(new GridLayoutManager(this, numberOfColumns));

        // Pull to refresh feature
        swipeRefresh.setOnRefreshListener(
                () -> {
                    photoItemAdapter.query();
                    swipeRefresh.setRefreshing(false);
                }
        );

        ItemAdapter.setContext(this);
        photoItemAdapter.observe();
    }

    @Override
    public void onStart() {
        super.onStart();
        photoItemAdapter.query();
    }

    @Override
    public void fabAction() {
    }

    @Override
    public void fabAction2() {
        Intent intent = new Intent(PhotoItemActivity.this, TodoListActivity.class);
        startActivity(intent);
    }

    @Override
    public void onBookClick(int position, String book_name, String book_description) {
        Log.i("Todo ", "Book is Clicked");
    }
}