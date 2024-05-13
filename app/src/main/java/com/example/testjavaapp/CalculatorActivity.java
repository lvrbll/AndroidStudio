package com.example.testjavaapp;

import android.annotation.SuppressLint;
import android.util.Log;
import android.widget.TextView;

import org.w3c.dom.ls.LSOutput;

public class CalculatorActivity {


    private int firstArg;
    private int secondArg;

    private StringBuilder inputStr = new StringBuilder();
    private String temp = "";

    private int actionSelected;
    private State state;

    private enum State {
        firstArgInput,
        secondArgInput,
        resultShow,
        clearAll
    }

    public CalculatorActivity() {
        state = State.firstArgInput;
    }

    public void onNumPressed (int buttonId) {
        if (inputStr.length() < 9) {
            switch (buttonId){
                case R.id.zero:
                    if (inputStr.length() != 0){
                        inputStr.append("0");
                    }
                    break;
                case R.id.one:
                    inputStr.append("1");
                    temp += "1";
                    break;
                case R.id.two:
                    inputStr.append("2");
                    temp += "2";
                    break;
                case R.id.three:
                    inputStr.append("3");
                    temp += "3";
                    break;
                case R.id.four:
                    inputStr.append("4");
                    temp += "4";
                    break;
                case R.id.five:
                    inputStr.append("5");
                    temp += "5";
                    break;
                case R.id.six:
                    inputStr.append("6");
                    temp += "6";
                    break;
                case R.id.seven:
                    inputStr.append("7");
                    temp += "7";
                    break;
                case R.id.eight:
                    inputStr.append("8");
                    temp += "8";
                    break;
                case R.id.nine:
                    inputStr.append("9");
                    temp += "9";
                    break;
            }
        }
    }
    public void onActionPressed (int actionId) {
        if (!temp.isEmpty()) {
            int firstArgTemp = Integer.parseInt(temp);
            Log.d("CA", "temp: " + firstArgTemp);
            inputStr.setLength(0);
            temp = "";
        } else {
            Log.d("CA", "temp is empty!");
        }
        switch (actionId) {
            case R.id.plus:
            case R.id.minus:
            case R.id.multiply:
            case R.id.division:
                state = State.secondArgInput;
                break;
            case R.id.equals:
                state = State.resultShow;
                break;
            case R.id.start:
                state = State.clearAll;
                break;
        }
    }

    public String getText() {
        return inputStr.toString();
    }

}
