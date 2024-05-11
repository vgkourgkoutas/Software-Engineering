package com.example.techaholics;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.view.View;
import android.widget.Button;


public class resale_product extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_resale_product);

        Button submissionform = (Button) findViewById(R.id.submissionform);
        submissionform.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        })
    }
}