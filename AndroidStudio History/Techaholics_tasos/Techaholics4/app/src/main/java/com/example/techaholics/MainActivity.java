package com.example.techaholics;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.content.Intent;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    String user = "shop";
    String user2 = "client";
    String user3 = "delivery";
    String pass = "1234";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.next);
        button.setOnClickListener(new View.OnClickListener(){
            /**
             * @param v The view that was clicked.
             */
            @Override
            public void onClick(View v) {

                EditText username = (EditText) findViewById(R.id.username);
                EditText password = (EditText) findViewById(R.id.password);

                // Retrieve entered username and password
                String Username = username.getText().toString();
                String Password = password.getText().toString();

                // Implement authentication logic here
                if ( Username.equals(user) && Password.equals(pass)) {
                    // Successful login
                    Toast.makeText(MainActivity.this, "Login successful", Toast.LENGTH_SHORT).show();

                    Intent startIntent = new Intent(getApplicationContext(), menu.class);
                    startActivity(startIntent);

                }
                else if( Username.equals(user2) && Password.equals(pass) )
                {
                    Intent startIntent = new Intent(getApplicationContext(), menu_client.class);
                    startActivity(startIntent);
                }
                else if( Username.equals(user3) && Password.equals(pass) )
                {
                    Intent startIntent = new Intent(getApplicationContext(), menu_delivery.class);
                    startActivity(startIntent);
                }
                else {
                    // Failed login
                    Toast.makeText(MainActivity.this, "Invalid username or password", Toast.LENGTH_SHORT).show();
                }


            }
        });


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main2), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}