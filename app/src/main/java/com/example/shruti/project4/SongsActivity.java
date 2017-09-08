package com.example.shruti.project4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs2);

        //for songs
        // to find the View that shows the list
        TextView song1 = (TextView) findViewById(R.id.song1);
        //click listener on View
        song1.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the song View is clicked on.
            @Override
            public void onClick(View view) {
                Intent song1Intent = new Intent(SongsActivity.this, PlayingNowActivity.class);
                startActivity(song1Intent);
            }
        });
        //for songs
        // to find the View that shows the list
        TextView song2 = (TextView) findViewById(R.id.song2);
        //click listener on View
        song2.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the song View is clicked on.
            @Override
            public void onClick(View view) {
                Intent song2Intent = new Intent(SongsActivity.this, PlayingNowActivity.class);
                startActivity(song2Intent);
            }
        });
        //for home
        //when home is clicked in the category
        TextView home= (TextView) findViewById(R.id.home);
        //click listener on View
        home.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the song View is clicked on.
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(SongsActivity.this, MainActivity.class);
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
                Intent albumIntent = new Intent(SongsActivity.this, AlbumsActivity.class);
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
                Intent artistIntent = new Intent(SongsActivity.this, ArtistsActivity.class);
                startActivity(artistIntent);
            }
        });
    }
}
