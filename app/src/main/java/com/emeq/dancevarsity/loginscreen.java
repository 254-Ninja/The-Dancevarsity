package com.emeq.dancevarsity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class loginscreen extends AppCompatActivity {

    public Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginscreen);

        // Locate the button in activity_main.xml
        button = findViewById(R.id.buttonmain);
        // Capture button clicks
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start MainActivity.class
                Intent myIntent = new Intent(loginscreen.this,
                        MainActivity.class);
                startActivity(myIntent);

            }
        });

    }
}