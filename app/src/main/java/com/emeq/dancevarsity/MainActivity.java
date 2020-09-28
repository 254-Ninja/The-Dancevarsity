package com.emeq.dancevarsity;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.PixelFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;



public class MainActivity extends AppCompatActivity {


    public Button button;

    /**
     * This opens the second activity .Merchandise
     */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



            // Locate the button in activity_main.xml
            button = findViewById(R.id.button2);
            // Capture button clicks
            button.setOnClickListener(new View.OnClickListener() {
                public void onClick(View arg0) {

                    // Start NewActivity.class
                    Intent myIntent = new Intent(MainActivity.this,
                            Merchandise.class);
                    startActivity(myIntent);

                }
            });




        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                myWebLink.setData(Uri.parse("https://www.youtube.com/channel/UCAN2Ce3PX3z9Tqh-N_Lu45A"));
                startActivity(myWebLink);

                Button btn = findViewById(R.id.button4);
                btn.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                        myWebLink.setData(Uri.parse("https://instagram.com/souniquedancevarsity?igshid=1d4jbm1tq3zf8"));
                        startActivity(myWebLink);


                        Button btn = findViewById(R.id.button5);
                        btn.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                                myWebLink.setData(Uri.parse("https://www.facebook.com/Sounique-Dancevarsity-2232222037023770/"));
                                startActivity(myWebLink);




                            }

                            });

                        }

                    });
                }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.send_mail) {
            sendmail();
            return true;
        }
            else if (id == R.id.cancelo){
                openTwitter();
                return true;
        }


        else if (id == R.id.next_action){
            moveNext();
        }

        return super.onOptionsItemSelected(item);
    }

    private void openTwitter() {

        Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
        myWebLink.setData(Uri.parse("https://twitter.com/souniquedancev"));
        startActivity(myWebLink);
    }

    private void moveNext() {
        Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
        myWebLink.setData(Uri.parse("https://www.youtube.com/channel/UCAN2Ce3PX3z9Tqh-N_Lu45A"));
        startActivity(myWebLink);

    }


    private void sendmail() {
        // Use an intent to launch an email app.
        // Send the order summary in the email body.
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:souniquedancevarsity@gmail.com")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT,
                "Thank you for contacting us (Customer)");
        intent.putExtra(Intent.EXTRA_TEXT, "We will get back to you in a few!!");
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }


    }











