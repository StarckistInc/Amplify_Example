package com.amplifyframework.samples.gettingstarted.ViewList;

import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

import com.amplifyframework.core.Amplify;
import com.amplifyframework.datastore.generated.model.Photo;
import com.amplifyframework.samples.core.ItemAdapter;
import com.amplifyframework.samples.gettingstarted.R;
import com.bumptech.glide.Glide;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PhotoItemAdapter extends ItemAdapter<Photo> implements Serializable {
    private final List<Photo> photoItems;
    private final PhotoItemAdapter.OnItemClickListener listener;

    public void observe() {
        Amplify.DataStore.observe(Photo.class,
                started -> Log.i("MyAmplifyApp", "Observation began."),
                change -> Log.i("MyAmplifyApp", change.item().toString()),
                failure -> Log.e("MyAmplifyApp", "Observation failed.", failure),
                () -> Log.i("MyAmplifyApp", "Observation complete.")
        );
    }

    public PhotoItemAdapter(OnItemClickListener listener) {
        this.listener = listener;
        photoItems = new ArrayList<>();
    }

    @Override
    public Class<Photo> getModelClass() {
        return Photo.class;
    }

    @Override
    public int getLayout() {
        return R.layout.photo_item;
    }

    @Override
    public RecyclerView.ViewHolder getViewHolder(View view) {
        return new photoItemViewHolder(view);
    }

    public void query() {
        clearList();
        photoItems.clear();
        Amplify.DataStore.query(
                getModelClass(),
                results -> {
                    while (results.hasNext()) {
                        Photo item = results.next();
                        addModel(item, false);
                        photoItems.add(item);
                        Log.i("Tutorial", "Photo Item loaded: " + item.getId());
                    }
//                    if (cont instanceof Activity) {
//                        ((Activity) cont).runOnUiThread(this::notifyDataSetChanged);
//                    }
                },
                failure -> Log.e("Tutorial", "Photo Query Failed", failure)
        );
    }

    public class photoItemViewHolder extends ViewHolder implements Binder<Photo>, OnClickListener {
        ImageView imageView;
        private final TextView textView1;
        private final TextView textView2;
        private String book_name;
        private String book_description;

//        public void getImage() {
//            Amplify.Storage.downloadFile(
//                    book_key,
//                    new File(getApplicationContext().getFilesDir() + "/download.jpg"),
//                    result -> Log.i("MyAmplifyApp", "Successfully downloaded: " + result.getFile().getName()),
//                    error -> Log.e("MyAmplifyApp",  "Download Failure", error)
//            );
//        }

        public photoItemViewHolder(View view) {
            super(view);
            this.imageView = view.findViewById(R.id.book_image);
            this.textView1 = view.findViewById(R.id.book_name);
            this.textView2 = view.findViewById(R.id.book_description);
            this.textView1.setOnClickListener(this);
            this.textView2.setOnClickListener(this);
        }

        @Override
        public void bind(Photo data) {
//            imageView.setImageURI(null);
//            Uri bookImageUri = Uri.parse(data.getPhoto().getLocalUri() + R.drawable.ic_launcher_background);
            Glide.with(this.imageView).load(data.getPhoto().getLocalUri()).into(imageView);
            textView1.setText(data.getName());
            textView2.setText(data.getDescription());
            book_name = data.getName();
            book_description = data.getDescription();
        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            if (v.getId() == R.id.book_name) {
                listener.onBookClick(position, book_name, book_description);
            }
        }
    }

    interface OnItemClickListener {
        void onBookClick(int position, String book_name, String book_description);
    }
}