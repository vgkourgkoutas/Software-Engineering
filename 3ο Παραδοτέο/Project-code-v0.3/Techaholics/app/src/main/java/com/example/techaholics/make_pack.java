package com.example.techaholics;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class make_pack extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_make_pack);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        Button back_to_choose = (Button) findViewById(R.id.back_to_choose);

        back_to_choose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), menu_shop.class);
                startActivity(startIntent);
            }
        });


        Button back_tochoose = (Button) findViewById(R.id.back_to_choose);

        back_tochoose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), select_page.class);
                startActivity(startIntent);
            }
        });

        Button make_packet = (Button) findViewById(R.id.make_packet);

        make_packet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(make_pack.this, "Το πακέτο δημιουργήθηκε με επιτυχία", Toast.LENGTH_SHORT).show();
                Intent startIntent = new Intent(getApplicationContext(), choose_page.class);
                startActivity(startIntent);



            }
        });

    }
}