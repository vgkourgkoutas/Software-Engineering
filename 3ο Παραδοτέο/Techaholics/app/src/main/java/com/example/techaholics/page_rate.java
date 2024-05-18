package com.example.techaholics;

import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class page_rate extends AppCompatActivity {
    TextView feedback;
    RatingBar rbStars;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_page_rate);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button backtoratepro = (Button) findViewById(R.id.backtoratepro);

        backtoratepro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), rating.class);
                startActivity(startIntent);
            }
        });

        Button submform = (Button) findViewById(R.id.submform);

        submform.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), message_ratecode.class);
                startActivity(startIntent);
            }
        });

        feedback = findViewById(R.id.feedback);
        rbStars = findViewById(R.id.rbStars);
        rbStars.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if(rating==0)
                {
                    feedback.setText("Πολύ Δυσαρεστημένος");
                }
                else if(rating==1)
                {
                    feedback.setText("Δυσαρεστημένος");
                }
                else if(rating==2 || rating==3)
                {
                    feedback.setText("OK");
                }
                else if(rating==4)
                {
                    feedback.setText("Ικανοποιημένος");
                }
                else if(rating==5)
                {
                    feedback.setText("Πολύ Ικανοποιημένος");
                }
                else
                {

                }
            }
        });
    }
}