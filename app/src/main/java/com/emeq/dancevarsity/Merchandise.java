package com.emeq.dancevarsity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;


/**
 * This page displays an order form to order merchandise.
 */

public class Merchandise extends AppCompatActivity {


    /**
     * This page displays an order form to order merchandise.
     */
    Button button ;
    int quantity = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_merchandise);

        //to locate the service button
        button = findViewById(R.id.button);

        //to activate the button
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                               //start intent
                Intent myIntent = new Intent(Merchandise.this,Artist.class);
                startActivity(myIntent);

            }
        });


    }
    /**
     * This method is called when the plus button is clicked.
     */
    public void increment(View view) {
        if (quantity == 100) {
            return;
        }
        quantity = quantity + 1;
        displayQuantity(quantity);
    }

    /**
     * This method is called when the minus button is clicked.
     */
    public void decrement(View view) {
        if (quantity == 10) {
            return;
        }
        quantity = quantity - 1;
        displayQuantity(quantity);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        // Get user's name
        EditText nameField = findViewById(R.id.name_field);
        Editable nameEditable = nameField.getText();
        String name = nameEditable.toString();

        // Figure out if the user Trade marked
        CheckBox plain = findViewById(R.id.name_t_shirt_checkbox);
        boolean hasTshirt = plain.isChecked();

        // Figure out if the user wants Shoes
        CheckBox marked = findViewById(R.id.name_marked_checkbox);
        boolean hasMarked = marked.isChecked();

        // Calculate the price
        int price = calculatePrice(hasTshirt, hasMarked);

        // Display the order summary on the screen
        String message = createOrderSummary(name, price, hasTshirt, hasMarked);

        // Use an intent to launch an email app.
        // Send the order summary in the email body.
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:souniquedancevarsity@gmail.com")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT,
                "Sounique Dance Varsity order for (Customer)");
        intent.putExtra(Intent.EXTRA_TEXT, message);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    /**
     * Calculates the price of the order.
     *
     */
    private int calculatePrice(boolean hasMarked, boolean hasTshirts) {
        // First calculate the price of one item
        int basePrice = 800;


        //If user wants shoes
        if (hasMarked){
            basePrice = basePrice + 200 ;
        }

        if (hasTshirts){

            basePrice = basePrice + 0;
        }



        // Calculate the total order price by multiplying by the quantity
        return quantity * basePrice ;

    }

    /**
     *
     * @param name
     * @param price
     * @param hasTshirt
     * @param hasMarked
     * @return
     */


    private String createOrderSummary(String name, int price, boolean hasTshirt, boolean hasMarked) {

        String priceMessage = getString(R.string.order_summary_name, name);
        priceMessage += "\n" + getString(R.string.order_summary_whipped_cream, hasTshirt);
        priceMessage += "\n" + getString(R.string.order_summary_chocolate, hasMarked);
        priceMessage += "\n" + getString(R.string.order_summary_quantity, quantity);
        priceMessage += "\n" + getString(R.string.order_summary_price,
                NumberFormat.getCurrencyInstance().format(price));
        priceMessage += "\n" + getString(R.string.thank_you);
        return priceMessage;

    }


    

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity(int numberOfMerchandise) {
        TextView quantityTextView = findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + numberOfMerchandise);
    }
}
