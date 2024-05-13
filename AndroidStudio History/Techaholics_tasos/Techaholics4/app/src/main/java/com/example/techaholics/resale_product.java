package com.example.techaholics;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

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
                EditText name = (EditText) findViewById(R.id.name);
                EditText Emailaddress = (EditText) findViewById(R.id.Emailaddress);
                EditText Phone = (EditText) findViewById(R.id.Phone);
                EditText Postaladdress = (EditText) findViewById(R.id.Postaladdress);
                EditText describeproduct = (EditText) findViewById(R.id.describeproduct);

            }
        });
    }

    public void main2(View view) {
        startActivity(new Intent(this,message_reproduct.class));
    }
}