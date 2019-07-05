package com.dicoding.picodiploma.fiki.submission1moviecatalogue;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailMovieActivity extends AppCompatActivity {
    private TextView tvName;
    private TextView tvDescription;
    private ImageView imgPhoto;

    public static final String EXTRA_MOVIE = "extra_movie";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_movie);

        //penerima intent
        tvName = findViewById(R.id.tv_name);
        tvDescription = findViewById(R.id.tv_description);
        imgPhoto = findViewById(R.id.img_photo);

        Movie movie = getIntent().getExtras().getParcelable("EXTRAS");
        String nama = movie.getName();
        String description = movie.getDescription();

        tvName.setText(nama);
        tvDescription.setText(description);
        Picasso.get().load(movie.getPhoto()).fit().centerCrop().into(imgPhoto);

    }
}
