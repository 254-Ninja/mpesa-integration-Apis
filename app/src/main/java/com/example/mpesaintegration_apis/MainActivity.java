package com.example.mpesaintegration_apis;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * This page displays the main activity.
 */


public class MainActivity extends AppCompatActivity {

    Button b1, b2;
    EditText edp, edu;

    TextView txt; 
    int counter = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.button1);
        edp = (EditText) findViewById(R.id.password);
        edu = (EditText) findViewById(R.id.username);

        b2 = (Button) findViewById(R.id.button2);
        txt = (TextView) findViewById(R.id.text1);
        txt.setVisibility(View.GONE);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edp.getText().toString().equals("admin") &&
                        edu.getText().toString().equals("admin")) {
                    Toast.makeText(getApplicationContext(),
                            "Redirecting...", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Wrong Credentials", Toast.LENGTH_SHORT).show();

                    txt.setVisibility(View.VISIBLE);
                    txt.setBackgroundColor(Color.RED);
                    counter--;
                    txt.setText(Integer.toString(counter));

                    if (counter == 0) {
                        b1.setEnabled(false);

                    }
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }
}
