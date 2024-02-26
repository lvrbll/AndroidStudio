package com.example.testjavaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.button1) {
            Toast.makeText(this, "Hello World!", Toast.LENGTH_LONG).show();
        } else if (view.getId() == R.id.button2) {
            Toast.makeText(this, "Imię + Nazwisko", Toast.LENGTH_LONG).show();
        } else if (view.getId() == R.id.button3) {
            Toast.makeText(this, "Goodbye!", Toast.LENGTH_LONG).show();
        }

    }
}