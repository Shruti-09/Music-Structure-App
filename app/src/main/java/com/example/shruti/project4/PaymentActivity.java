package com.example.shruti.project4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PaymentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        //for home
        //when home is clicked in the category
        TextView home= (TextView) findViewById(R.id.home);
        //click listener on View
        home.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the song View is clicked on.
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(PaymentActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });
        //for album
        //when home is clicked in the category
        TextView album = (TextView) findViewById(R.id.album0);
        //click listener on View
        album.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the song View is clicked on.
            @Override
            public void onClick(View view) {
                Intent albumIntent = new Intent(PaymentActivity.this, AlbumsActivity.class);
                startActivity(albumIntent);
            }
        });
        //for artist
        //when home is clicked in the category
        TextView artist = (TextView) findViewById(R.id.artist0);
        //click listener on View
        artist.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the song View is clicked on.
            @Override
            public void onClick(View view) {
                Intent artistIntent = new Intent(PaymentActivity.this, ArtistsActivity.class);
                startActivity(artistIntent);
            }
        });
    }
}
