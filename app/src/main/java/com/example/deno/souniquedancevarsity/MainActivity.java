package com.example.deno.souniquedancevarsity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.net.Uri;
import android.widget.MediaController;
import android.widget.VideoView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG =
            MainActivity.class.getSimpleName();




    private void loadVideo() {
        VideoView videoView = (VideoView) findViewById(R.id.videoView);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        Uri video = Uri.parse("http://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4");
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(video);
        videoView.start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //initiate button to show the about us page of the dance crew,
        final Button button = findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "we are so unique sajsajvsajvjasvasjvjsvs  vasjsavjvsajsvjsvjsvs", Toast.LENGTH_LONG).show();//display the text of button2
                // Code here executes on main thread after user presses button

                //initiate button
                final Button button = findViewById(R.id.button3);
                button.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {

                        // Code here executes on main thread after user presses button

                        //initiate button
                        final Button button = findViewById(R.id.button4);
                        button.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                // Code here executes on main thread after user presses button

                                //initiate button
                                final Button button = findViewById(R.id.button5);
                                button.setOnClickListener(new View.OnClickListener() {
                                    public void onClick(View v) {
                                        Intent browserIntent =
                                                new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.instagram.com/souniquedancevarsity/"));
                                        startActivity(browserIntent);
                                        // Code here executes on main thread after user presses button

                                        //initiate button
                                        final Button button = findViewById(R.id.button6);
                                        button.setOnClickListener(new View.OnClickListener() {
                                            public void onClick(View v) {
                                                Intent browserIntent =
                                                        new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.youtube.com/channel/UCAN2Ce3PX3z9Tqh-N_Lu45A"));
                                                startActivity(browserIntent);
                                                // Code here executes on main thread after user presses button

                                                //initiate button
                                                final Button button = findViewById(R.id.button7);
                                                button.setOnClickListener(new View.OnClickListener() {
                                                    public void onClick(View V) {
                                                        Intent browserIntent =
                                                                new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com/pg/souniquedancecrew/about/"));
                                                        startActivity(browserIntent);
                                                        // Code here executes on main thread after user presses button


                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });


                    }
                });
            }
        });

    }



}










