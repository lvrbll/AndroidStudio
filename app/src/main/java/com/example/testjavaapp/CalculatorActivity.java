package com.example.testjavaapp;

import android.annotation.SuppressLint;

public class CalculatorActivity {


    private int firstArg;
    private int secondArg;

    private StringBuilder inputStr = new StringBuilder();

    private int actionSelected;
    private State state;

    private enum State {
        firstArgInput,
        secondArgInput,
        resultShow
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
                    break;
                case R.id.two:
                    inputStr.append("2");
                    break;
                case R.id.three:
                    inputStr.append("3");
                    break;
                case R.id.four:
                    inputStr.append("4");
                    break;
                case R.id.five:
                    inputStr.append("5");
                    break;
                case R.id.six:
                    inputStr.append("6");
                    break;
                case R.id.seven:
                    inputStr.append("7");
                    break;
                case R.id.eight:
                    inputStr.append("8");
                    break;
                case R.id.nine:
                    inputStr.append("9");
                    break;
            }
        }
    }
    public void onActionPressed (int actionId) {
        switch (actionId) {
            case R.id.plus:
                break;
            case R.id.minus:
                break;
            case R.id.multiply:
                break;
            case R.id.division:
                break;
            case R.id.equals:
                break;
        }
    }

    public String getText(){
        return inputStr.toString();
    }
}
