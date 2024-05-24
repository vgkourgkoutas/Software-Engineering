package com.example.techaholics;

import android.os.Bundle;
import android.view.View;  // Εισαγωγή της κλάσης View
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
    }

    public void increment(View v) {
        count++;
        value.setText(String.valueOf(count));  // Χρησιμοποίησε την μέθοδο String.valueOf για μετατροπή του int σε String
    }

    public void decrement(View v) {
        if (count > 0) {
            count--;
        }
        value.setText(String.valueOf(count));  // Χρησιμοποίησε την μέθοδο String.valueOf για μετατροπή του int σε String
    }
}