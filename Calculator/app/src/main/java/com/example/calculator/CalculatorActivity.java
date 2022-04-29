package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {
    TextView textV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        textV=findViewById(R.id.textView);
    }
    public void clickButton(View v){
        textV.append(((Button) v).getText());

    }
    public void equalButton(View v){
        res=operation(res,op,textV.getText().toString());
        textV.setText(res);
        res="";
        op="";
    }

    String res="";
    String op="";

    public void onOperation(View v){
    if(op.isEmpty()){
        res=textV.getText().toString();
        op= ((Button) v).getText().toString();
        textV.setText("");

    }else{
        res=operation(res,op,textV.getText().toString());
        op= ((Button) v).getText().toString();
        textV.setText(res);
        op= ((Button) v).getText().toString();
        textV.setText("");


    }
    }
    public String operation(String lhs, String op , String rhs){
        double num1=Double.parseDouble(lhs);
        double num2=Double.parseDouble(rhs);
        double res=-0;
        if(op.equals("+")){
            res=num1+num2;
        }else if(op.equals("-")){
            res=num1-num2;
        }
        else if(op.equals("*")){
            res=num1*num2;
        }
        else if(op.equals("/")){
            res=num1/num2;
        }
        return res+"";

    }


}