package com.example.shruti.project4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //for playing now
        // to find the View that shows the playing now list
        TextView playingNow = (TextView) findViewById(R.id.playing_now);
        //click listener on View
        playingNow.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the playing now View is clicked on.
            @Override
            public void onClick(View view) {
                Intent playingNowIntent = new Intent(MainActivity.this, PlayingNowActivity.class);
                startActivity(playingNowIntent);
            }
        });
        //for songs
        // to find the View that shows the songs list
        TextView songs = (TextView) findViewById(R.id.songs);
        //click listener on View
        songs.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the songs View is clicked on.
            @Override
            public void onClick(View view) {
                Intent songsIntent = new Intent(MainActivity.this, SongsActivity.class);
                startActivity(songsIntent);
            }
        });

        //for playlists
        // to find the View that shows the playlists list
        TextView playlists = (TextView) findViewById(R.id.playlists);
        //click listener on View
        playlists.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the playlists View is clicked on.
            @Override
            public void onClick(View view) {
                Intent playlistsIntent = new Intent(MainActivity.this, PlaylistsActivity.class);
                startActivity(playlistsIntent);
            }
        });
        //for liked songs
        // to find the View that shows the liked songs list
        TextView likedSongs = (TextView) findViewById(R.id.liked_songs);
        //click listener on View
        likedSongs.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the liked songs View is clicked on.
            @Override
            public void onClick(View view) {
                Intent likedSongsIntent = new Intent(MainActivity.this, LikedSongsActivity.class);
                startActivity(likedSongsIntent);
            }
        });
        //for artists
        // to find the View that shows the artists list
        TextView artists = (TextView) findViewById(R.id.artists);
        //click listener on View
        artists.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the artists View is clicked on.
            @Override
            public void onClick(View view) {
                Intent artistsIntent = new Intent(MainActivity.this, ArtistsActivity.class);
                startActivity(artistsIntent);
            }
        });
        //for albums
        // to find the View that shows the albums list
        TextView albums = (TextView) findViewById(R.id.albums);
        //click listener on View
        albums.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the albums View is clicked on.
            @Override
            public void onClick(View view) {
                Intent albumsIntent = new Intent(MainActivity.this, AlbumsActivity.class);
                startActivity(albumsIntent);
            }
        });
        //for payment
        // to find the View that shows how to pay for songs
        TextView payment = (TextView) findViewById(R.id.payment);
        //click listener on View
        payment.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the albums View is clicked on.
            @Override
            public void onClick(View view) {
                Intent paymentIntent = new Intent(MainActivity.this, PaymentActivity.class);
                startActivity(paymentIntent);
            }
        });
    }
}
