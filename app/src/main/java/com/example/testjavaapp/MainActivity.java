package com.example.testjavaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private CalculatorActivity calculator;
    private TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[] numberIds = new int[] {
                R.id.zero,
                R.id.one,
                R.id.two,
                R.id.three,
                R.id.four,
                R.id.five,
                R.id.six,
                R.id.seven,
                R.id.eight,
                R.id.nine
        };

        int[] actionIds = new int[] {
                R.id.plus,
                R.id.minus,
                R.id.multiply,
                R.id.division,
                R.id.equals,
                R.id.start
        };

        text = findViewById(R.id.text);

        calculator = new CalculatorActivity();

        View.OnClickListener numberButtonClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view){
                calculator.onNumPressed(view.getId());
                text.setText(calculator.getText());
            }
        };

        View.OnClickListener actionButtonClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view){
                text.setText("");
                calculator.onActionPressed(view.getId());
            }
        };

        for (int i = 0; i < numberIds.length; i++){
            findViewById(numberIds[i]).setOnClickListener(numberButtonClickListener);
        }
        for (int i = 0; i < actionIds.length; i++){
            findViewById(actionIds[i]).setOnClickListener(actionButtonClickListener);
        }

    }
}
