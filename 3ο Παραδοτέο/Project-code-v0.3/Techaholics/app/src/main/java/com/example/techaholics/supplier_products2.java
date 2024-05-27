package com.example.techaholics;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class supplier_products2 extends AppCompatActivity {

    TextView value;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_supplier_products2);

        value = (TextView) findViewById(R.id.button2);

        Button add_to_cart2 = (Button) findViewById(R.id.add_to_cart2);

        add_to_cart2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), supplier_buy.class);
                startActivity(startIntent);
            }
        });

        Button back_button2 = (Button) findViewById(R.id.back_button2);

        back_button2.setOnClickListener(new View.OnClickListener() {
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
