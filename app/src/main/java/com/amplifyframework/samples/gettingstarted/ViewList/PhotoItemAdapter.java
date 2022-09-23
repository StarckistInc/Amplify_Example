package com.amplifyframework.samples.gettingstarted.ViewList;

import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

import com.amplifyframework.core.Amplify;
import com.amplifyframework.datastore.generated.model.Book;
import com.amplifyframework.samples.core.ItemAdapter;
import com.amplifyframework.samples.gettingstarted.R;
import com.bumptech.glide.Glide;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PhotoItemAdapter extends ItemAdapter<Book> implements Serializable {
    private final List<Book> bookItem;
    private final PhotoItemAdapter.OnItemClickListener listener;

    public void observe() {
        Amplify.DataStore.observe(Book.class,
                started -> Log.i("BookInfo", "Book Observation began."),
                change -> Log.i("BookInfo", change.item().toString()),
                failure -> Log.e("BookInfo", "Book Observation failed.", failure),
                () -> Log.i("BookInfo", "Book Observation complete.")
        );
    }

    public PhotoItemAdapter(OnItemClickListener listener) {
        this.listener = listener;
        bookItem = new ArrayList<>();
    }

    @Override
    public Class<Book> getModelClass() {
        return Book.class;
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
        Log.i("BookList", "BookInfo Query Online");
        clearList();
        bookItem.clear();
        Amplify.DataStore.query(
                getModelClass(),
                results -> {
                    while (results.hasNext()) {
                        Book item = results.next();
                        addModel(item, false);
                        bookItem.add(item);
                        Log.i("BookInfo", "Book Item loaded: " + item.getId());
                    }
                },
                failure -> Log.e("BookInfo", "Book Query Failed", failure)
        );
    }

    public class photoItemViewHolder extends ViewHolder implements Binder<Book>, OnClickListener {
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
        public void bind(Book data) {
//            imageView.setImageURI(null);
//            Uri bookImageUri = Uri.parse(data.getPhoto().getLocalUri() + R.drawable.ic_launcher_background);
            Glide.with(this.imageView).load(data.getImage().getLocalUri()).into(imageView);
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