package com.example.techaholics;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;  // Εισαγωγή της κλάσης View
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class supplier_products extends AppCompatActivity {
    TextView value;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_supplier_products);

        value = (TextView) findViewById(R.id.button1);

        Button add_to_cart = (Button) findViewById(R.id.add_to_cart);

        add_to_cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), supplier_buy.class);
                startActivity(startIntent);
            }
        });

        Button goback = (Button) findViewById(R.id.goback);

        goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), supplier.class);
                startActivity(startIntent);
            }
        });

    }



    public void increment(View v) {
        count++;
        value.setText(String.valueOf(count));  // Μέθοδος String.valueOf για μετατροπή του int σε String
    }

    public void decrement(View v) {
        if (count > 0) {
            count--;
        }
        value.setText(String.valueOf(count));  // Μέθοδος String.valueOf για μετατροπή του int σε String
    }


}