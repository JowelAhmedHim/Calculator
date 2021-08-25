package com.example.scientificcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    TextView input,signview;
    String sign,v1,v2;
    double num1,num2,result,ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input=findViewById(R.id.txtinput);
        signview=findViewById(R.id.txtsign);



    }
    public void zero(View view) {
        input.setText(input.getText()+"0");

    }

    public void one(View view) {
        input.setText(input.getText()+"1");
    }

    public void two(View view) {
        input.setText(input.getText()+"2");
    }

    public void three(View view) {
        input.setText(input.getText()+"3");
    }

    public void four(View view) {
        input.setText(input.getText()+"4");
    }

    public void five(View view) {
        input.setText(input.getText()+"5");
    }

    public void six(View view) {
        input.setText(input.getText()+"6");
    }

    public void seven(View view) {
        input.setText(input.getText()+"7");
    }

    public void eight(View view) {
        input.setText(input.getText()+"8");
    }

    public void nine(View view) {
        input.setText(input.getText()+"9");
    }

    public void dot(View view) {
        input.setText(input.getText()+".");
    }

    public void div(View view) {
        sign="/";
        v1=input.getText().toString();
        input.setText(null);
        signview.setText("\u00f7");


    }

    public void mul(View view) {
        sign="*";
        v1=input.getText().toString();
        input.setText(null);
        signview.setText("\u00d7");

    }

    public void sub(View view) {
        sign="-";
        v1=input.getText().toString();
        input.setText(null);
        signview.setText("-");


    }

    public void sum(View view) {
        sign="+";
        v1=input.getText().toString();
        input.setText(null);
        signview.setText("+");

    }

    public void sin(View view) {
        sign="sin";
        input.setText(null);
        signview.setText("sin");



    }

    public void cos(View view) {
        sign="cos";
        input.setText(null);
        signview.setText("cos");


    }

    public void tan(View view) {
        sign="tan";
        input.setText(null);
        signview.setText("tan");

    }

    public void ln(View view) {
        sign="ln";
        input.setText(null);
        signview.setText("ln");


    }

    public void log(View view) {
        sign="log";
        input.setText(null);
        signview.setText("log");



    }

    public void rootq(View view) {

        sign="cuberoot";
        input.setText(null);
        signview.setText("\u221b");

    }

    public void root(View view) {
        sign="root";
        input.setText(null);
        signview.setText("\u221A");


    }

    public void power(View view) {
        sign="power";
        v1=input.getText().toString();
        input.setText(null);
        signview.setText("\u005e");

    }


    public void factorial(View view) {

        sign="fac";
        input.setText(null);
        signview.setText("!");

    }

    public void percent(View view) {
        sign="%";
        v1=input.getText().toString();
        input.setText(null);
        signview.setText("%");
    }

    public void clear(View view) {
        input.setText(null);
        signview.setText(null);
        sign=null;
        v1=null;
        v2=null;


    }

    public void del(View view) {
        try {
            if (input.getText().equals("")) {
                input.setText("");
            } else {
                int len = input.getText().length();
                String s = input.getText().toString();
                if (s.charAt(len - 1) == '.') {
                    input.setText(input.getText().subSequence(0, input.getText().length() - 1));
                } else {
                    input.setText(input.getText().subSequence(0, input.getText().length() - 1));
                }
            }
        }catch (Exception e)
        {

        }


    }

    @SuppressLint("SetTextI18n")
    public void equal(View view) {
        if (sign == null)
        {
            signview.setText("Error!");
        }
        else if (input.getText().equals("")) {
            signview.setText("Error!");
        }
        else if ((sign.equals("+") || sign.equals("-") || sign.equals("*") || sign.equals("/")) && v1.equals("")) {
            signview.setText("Error!");
        }
        else {
            switch (sign) {
                default:
                    break;
                case "+":
                    v2 = input.getText().toString();
                    num1 = Double.parseDouble(v1);
                    num2 = Double.parseDouble(v2);
                    result = num1 + num2;
                    input.setText(result + "");
                    sign = null;
                    signview.setText(null);
                    break;
                case "-":
                    v2 = input.getText().toString();
                    num1 = Double.parseDouble(v1);
                    num2 = Double.parseDouble(v2);
                    result = num1 - num2;
                    input.setText(result + "");
                    sign = null;
                    signview.setText(null);
                    break;
                case "*":
                    v2= input.getText().toString();
                    num1 = Double.parseDouble(v1);
                    num2 = Double.parseDouble(v2);
                    result = num1 * num2;
                    input.setText(result + "");
                    sign = null;
                    signview.setText(null);
                    break;
                case "/":
                    v2 = input.getText().toString();
                    num1 = Double.parseDouble(v1);
                    num2 = Double.parseDouble(v2);
                    result = num1 / num2;
                    input.setText(result + "");
                    sign = null;
                    signview.setText(null);
                    break;
                case "sin":
                    v1= input.getText().toString();
                    num1 = Double.parseDouble((v1));
                    input.setText(Math.sin(Math.toRadians(num1)) + "");
                    sign = null;
                    signview.setText(null);
                    break;
                case "cos":
                    v1 = input.getText().toString();
                    num1 = Double.parseDouble((v1));
                    input.setText(Math.cos(Math.toRadians(num1)) + "");
                    sign = null;
                    signview.setText(null);
                    break;
                case "tan":
                    v1 = input.getText().toString();
                    num1 = Double.parseDouble((v1));
                    input.setText(Math.tan(Math.toRadians(num1)) + "");
                    sign = null;
                    signview.setText(null);
                    break;

                case "log":
                    v1 = input.getText().toString();
                    num1 = Double.parseDouble(v1);
                    input.setText(Math.log10(num1) + "");
                    sign = null;
                    signview.setText(null);
                    break;
                case "ln":
                    v1 = input.getText().toString();
                    num1 = Double.parseDouble(v1);
                    input.setText(Math.log(num1) + "");
                    sign = null;
                    signview.setText(null);
                    break;
                case "power":
                    num1 = Double.parseDouble((v1));
                    v2 = input.getText().toString();
                    num2 = Double.parseDouble(v2);
                    input.setText(Math.pow(num1, num2) + "");
                    sign = null;
                    signview.setText(null);
                    break;
                case "root":
                    v1 = input.getText().toString();
                    num1 = Double.parseDouble((v1));
                    input.setText(Math.sqrt(num1) + "");
                    sign = null;
                    signview.setText(null);
                    break;
                case "fac":
                    v1 = input.getText().toString();
                    num1 = Double.parseDouble((v1));
                    int i = Integer.parseInt(v1) - 1;

                    while (i > 0) {
                        num1 = num1 * i;
                        i--;
                    }

                    input.setText(num1 + "");
                    sign = null;
                    signview.setText(null);
                    break;

                case "cuberoot":
                    v1 = input.getText().toString();
                    num1 = Double.parseDouble((v1));
                    input.setText(Math.cbrt(num1) + "");
                    sign = null;
                    signview.setText(null);
                    break;
                case "%":
                     v1 = input.getText().toString();
                     num1=Double.parseDouble(v1);
                    result = (num1/100);
                    input.setText(result + "");
                    sign = null;
                    signview.setText(null);
                    break;


            }

          ans = Double.parseDouble(input.getText().toString());
        }
    }


    public void ans(View view) {
        input.setText(ans+"");
    }
}
