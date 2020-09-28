package com.emeq.dancevarsity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class Artist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);
    }

    public void submitOrder(View view) {
        // Get user's name
        EditText nameFieldb = findViewById(R.id.name_field1);
        Editable nameEditable = nameFieldb.getText();
        String name = nameEditable.toString();

        // Figure out if dj selected
        CheckBox dj = findViewById(R.id.checkBox);
        boolean hasDj = dj.isChecked();

        // Figure if / group
        CheckBox group = findViewById(R.id.checkBox5);
        boolean hasGroup = group.isChecked();

        //figure if oness selected

        CheckBox oness = findViewById(R.id.checkBox2);
        boolean hasOness = oness.isChecked();

        //figure if vide selected

        CheckBox vide = findViewById(R.id.checkBox3);
        boolean hasVide = vide.isChecked();

        //figure if shem selected

        CheckBox shem = findViewById(R.id.checkBox2);
        boolean hasShem = shem.isChecked();

        //Dncera
        CheckBox dancera = findViewById(R.id.checkBox6);
        boolean hasDancera = dancera.isChecked();

        //Dancerb

        CheckBox dancerb = findViewById(R.id.checkBox7);
        Boolean hasdancerb = dancerb.isChecked();

        // Display
        String message = createSubmitSummary(name, hasDancera, hasdancerb, hasDj, hasGroup, hasOness, hasShem, hasVide);
        // Use an intent to launch an email app.
        // Send the order summary in the email body.
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:souniquedancevarsity@gmail.com")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT,
                "Sounique Dance Varsity customer selection (Customer)");
        intent.putExtra(Intent.EXTRA_TEXT, message);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }


    }

    /**
     * @param Identifier
     * @param hasDancera
     * @param hasDj
     * @param hasdancerb
     * @param hasGroup
     * @param hasOness
     * @param hasShem
     * @param hasVide
     * @return
     */

    private String createSubmitSummary(String Identifier, boolean hasDancera, boolean hasdancerb, boolean hasDj, boolean hasGroup, boolean hasOness, boolean hasShem, boolean hasVide) {
        String submitList = getString(R.string.artist_name, Identifier);
        submitList += "\n" + getString(R.string.has_Dancer_a, hasDancera);

        submitList = "hasGroup";

        return submitList;

    }

}
