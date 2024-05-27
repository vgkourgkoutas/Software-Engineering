package com.example.techaholics;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class device_technical_problem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_device_technical_problem);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button back = (Button) findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), menu_client.class);
                startActivity(startIntent);
            }
        });

        Button playstation = (Button) findViewById(R.id.playstation);

        playstation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), technical_support_ps5.class);
                startActivity(startIntent);
            }
        });

        Button samsung = (Button) findViewById(R.id.samsung);

        samsung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), technical_support_samsung.class);
                startActivity(startIntent);
            }
        });

        Button iphone = (Button) findViewById(R.id.iphone);

        iphone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), technical_support_iphone.class);
                startActivity(startIntent);
            }
        });

        Button mi = (Button) findViewById(R.id.mi);

        mi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), technical_support_mi.class);
                startActivity(startIntent);
            }
        });

        Button huawei = (Button) findViewById(R.id.huawei);

        huawei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), technical_support_huawei.class);
                startActivity(startIntent);
            }
        });


    }
}