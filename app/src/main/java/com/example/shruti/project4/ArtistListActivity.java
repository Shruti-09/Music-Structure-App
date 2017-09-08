package com.example.shruti.project4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ArtistListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist_list);
        //when song is clicked in the category
        TextView arSong1 = (TextView) findViewById(R.id.artistsong1);
        //click listener on View
        arSong1.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the song View is clicked on.
            @Override
            public void onClick(View view) {
                Intent ar1Intent = new Intent(ArtistListActivity.this, PlayingNowActivity.class);
                startActivity(ar1Intent);
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
                Intent homeIntent = new Intent(ArtistListActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });
        //for album
        //when home is clicked in the category
        TextView al= (TextView) findViewById(R.id.album0);
        //click listener on View
        al.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the song View is clicked on.
            @Override
            public void onClick(View view) {
                Intent alIntent = new Intent(ArtistListActivity.this, AlbumsActivity.class);
                startActivity(alIntent);
            }
        });
        //for artist
        //when home is clicked in the category
        TextView artist= (TextView) findViewById(R.id.artist0);
        //click listener on View
        artist.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the song View is clicked on.
            @Override
            public void onClick(View view) {
                Intent artistIntent = new Intent(ArtistListActivity.this, ArtistsActivity.class);
                startActivity(artistIntent);
            }
        });
    }
}
