package com.example.techaholics;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class make_order extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_create_order);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button go_back = (Button) findViewById(R.id.go_back);

        go_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), menu_client.class);
                startActivity(startIntent);
            }
        });

        Button buy = (Button) findViewById(R.id.buy);

        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), choose_quantityofproduct.class);
                startActivity(startIntent);
            }
        });

        Button buy2 = (Button) findViewById(R.id.buy2);

        buy2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), choose_quantityofproduct.class);
                startActivity(startIntent);
            }
        });

        Button buy3 = (Button) findViewById(R.id.buy3);

        buy3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), choose_quantityofproduct.class);
                startActivity(startIntent);
            }
        });

        Button buy4 = (Button) findViewById(R.id.buy4);

        buy4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), choose_quantityofproduct.class);
                startActivity(startIntent);
            }
        });

        Button buy5 = (Button) findViewById(R.id.buy5);

        buy5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), choose_quantityofproduct.class);
                startActivity(startIntent);
            }
        });

        Button create_order = (Button) findViewById(R.id.create_order);

        create_order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), choose_payment_method.class);
                startActivity(startIntent);
            }
        });

    }
}