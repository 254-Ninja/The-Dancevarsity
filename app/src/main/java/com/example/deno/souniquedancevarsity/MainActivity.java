package com.example.deno.souniquedancevarsity;

import android.app.Application;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.net.Uri;
import android.widget.MediaController;
import android.widget.VideoView;
import android.util.Log;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public Button button4;

    public void init() {
        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mer = new Intent(MainActivity.this, merchandise.class);

                startActivity(mer);

            }
        });

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();


        VideoView view = (VideoView) findViewById(R.id.videoView);
        String path = "android.resource://" + getPackageName() + "/" + R.raw.yoh;
        view.setVideoURI(Uri.parse(path));
        view.start();


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


}










