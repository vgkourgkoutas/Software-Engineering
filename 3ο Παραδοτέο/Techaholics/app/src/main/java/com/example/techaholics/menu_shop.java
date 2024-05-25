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

public class menu_shop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menu);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button work_cord = (Button) findViewById(R.id.work_cord);

        work_cord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), work_coordination.class);
                startActivity(startIntent);
            }
        });

        Button supplier_button = (Button) findViewById(R.id.supplier_button);

        supplier_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), supplier.class);
                startActivity(startIntent);
            }
        });

        Button new_technologies = (Button) findViewById(R.id.new_technologies);

        new_technologies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), fill_form.class);
                startActivity(startIntent);
            }
        });

        Button job_advert = (Button) findViewById(R.id.job_advert);

        job_advert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), ad_form.class);
                startActivity(startIntent);
            }
        });


        Button discounts_and_packages = (Button) findViewById(R.id.discounts_and_packages);

        discounts_and_packages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), choose_page.class);
                startActivity(startIntent);
            }
        });

    }
}