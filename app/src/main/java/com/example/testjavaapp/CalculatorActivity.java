package com.example.testjavaapp;

import android.annotation.SuppressLint;
import android.util.Log;
import android.widget.TextView;
import java.util.ArrayList;
import org.w3c.dom.ls.LSOutput;

public class CalculatorActivity {


    private int firstArg;
    private int secondArg;

    private StringBuilder inputStr = new StringBuilder();
    private String temp = "";
    private String tempAction = "";
    ArrayList<Integer> numbers_to_action = new ArrayList<>();

    private int actionSelected;
    /*private State state;

    private enum State {
        firstArgInput,
        secondArgInput,
        resultShow,
        clearAll
    }

    public CalculatorActivity() {
        state = State.firstArgInput;
    }*/

    public void onNumPressed (int buttonId) {
        if (inputStr.length() < 9) {
            switch (buttonId){
                case R.id.zero:
                    inputStr.append("0");
                    temp += "0";
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
            int ArgTemp = Integer.parseInt(temp);
            inputStr.setLength(0);
            numbers_to_action.add(ArgTemp);
            Log.d("CA", "temp: " + numbers_to_action);
            temp = "";
        } else {
            Log.d("CA", "temp is empty!");
            inputStr.setLength(0);
        }
        switch (actionId) {
            case R.id.plus:
                tempAction = "plus";
                break;
            case R.id.minus:
                tempAction = "minus";
                break;
            case R.id.multiply:
                tempAction = "multiply";
                break;
            case R.id.division:
                tempAction = "division";
                break;
            case R.id.equals:
                if(numbers_to_action.size()>0){
                    if (tempAction=="plus"){
                        int xnta = numbers_to_action.get(0);
                        int ynta = numbers_to_action.get(1);
                        int znta = xnta+ynta;
                        Log.d("Action", "Plus: " + znta);
                        tempAction = "";
                        numbers_to_action.clear();
                        inputStr.append(znta);
                        numbers_to_action.add(znta);
                    } else if (tempAction=="minus") {
                        int xnta = numbers_to_action.get(0);
                        int ynta = numbers_to_action.get(1);
                        int znta = xnta-ynta;
                        Log.d("Action", "Minus: " + znta);
                        tempAction = "";
                        numbers_to_action.clear();
                        inputStr.append(znta);
                        numbers_to_action.add(znta);
                    } else if (tempAction=="multiply") {
                        int xnta = numbers_to_action.get(0);
                        int ynta = numbers_to_action.get(1);
                        int znta = xnta*ynta;
                        Log.d("Action", "Multiply: " + znta);
                        tempAction = "";
                        numbers_to_action.clear();
                        inputStr.append(znta);
                        numbers_to_action.add(znta);
                    } else {
                        int xnta = numbers_to_action.get(0);
                        int ynta = numbers_to_action.get(1);
                        int znta = xnta/ynta;
                        Log.d("Action", "Division: " + znta);
                        tempAction = "";
                        numbers_to_action.clear();
                        inputStr.append(znta);
                        numbers_to_action.add(znta);
                    }
                }
                break;
            case R.id.start:
                inputStr.append(0);
                tempAction = "";
                numbers_to_action.clear();
                numbers_to_action.add(0);
                break;
        }
    }

    public String getText() {
        return inputStr.toString();
    }

}
