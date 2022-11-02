package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView oneTextView;
    private TextView twoTextView;
    private TextView threeTextView;
    private TextView fourTextView;
    private TextView fiveTextView;
    private TextView sixTextView;
    private TextView sevenTextView;
    private TextView eightTextView;
    private TextView nineTextView;
    private TextView zeroTextView;
    private TextView plusTextView;
    private TextView caTextView;
    private TextView resultTextView;
    private TextView minusTextView;


    String oldValue = "0";
    String newValue = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        addEventListener();
    }

    private void initData() {
        oneTextView = findViewById(R.id.one);
        twoTextView = findViewById(R.id.two);
        threeTextView = findViewById(R.id.three);
        fourTextView = findViewById(R.id.four);
        fiveTextView = findViewById(R.id.five);
        sixTextView = findViewById(R.id.six);
        sevenTextView = findViewById(R.id.seven);
        eightTextView = findViewById(R.id.eight);
        nineTextView = findViewById(R.id.nine);
        zeroTextView = findViewById(R.id.zero);
        plusTextView = findViewById(R.id.plus);
        minusTextView = findViewById(R.id.minus);
        caTextView = findViewById(R.id.ca);
        resultTextView = findViewById(R.id.resultTextView);
    }

    private void addEventListener() {
        // implements 안하면 익명클래스!!!!

        oneTextView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                newValue = newValue + "1";
                resultTextView.setText(newValue);
                Log.d("TAG", "one 버튼 눌러짐");
                Log.d("TAG", view.toString());
            }
        });
//        람다식
//        twoTextView.setOnClickListener(view -> {
//
//        });
        twoTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                newValue = newValue + "2";
                resultTextView.setText(newValue);
                Log.d("TAG", "two 버튼 눌러짐");
                Log.d("TAG", view.toString());
            }
        });

        threeTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                newValue = newValue + "3";
                resultTextView.setText(newValue);
                Log.d("TAG", "three 버튼 눌러짐");
                Log.d("TAG", view.toString());
            }
        });

        fourTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                newValue = newValue + "4";
                resultTextView.setText(newValue);
                Log.d("TAG", "four 버튼 눌러짐");
                Log.d("TAG", view.toString());
            }
        });

        fiveTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                newValue = newValue + "5";
                resultTextView.setText(newValue);
                Log.d("TAG", "five 버튼 눌러짐");
                Log.d("TAG", view.toString());
            }
        });

        sixTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                newValue = newValue + "6";
                resultTextView.setText(newValue);
                Log.d("TAG", "six 버튼 눌러짐");
                Log.d("TAG", view.toString());
            }
        });

        sevenTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                newValue = newValue + "7";
                resultTextView.setText(newValue);
                Log.d("TAG", "seven 버튼 눌러짐");
                Log.d("TAG", view.toString());
            }
        });

        eightTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                newValue = newValue + "8";
                resultTextView.setText(newValue);
                Log.d("TAG", "eight 버튼 눌러짐");
                Log.d("TAG", view.toString());
            }
        });

        nineTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                newValue = newValue + "9";
                resultTextView.setText(newValue);
                Log.d("TAG", "nine 버튼 눌러짐");
                Log.d("TAG", view.toString());
            }
        });

        zeroTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                newValue = newValue + "0";
                resultTextView.setText(newValue);
                Log.d("TAG", "zero 버튼 눌러짐");
                Log.d("TAG", view.toString());
            }
        });

        plusTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sum = Integer.parseInt(newValue) + Integer.parseInt(oldValue);
                oldValue = String.valueOf(sum);
                newValue = "";
                resultTextView.setText(oldValue);
                Log.d("TAG", "oldValue : " + oldValue);
                Log.d("TAG", "newValue : " + newValue);
                Log.d("TAG", "plus 버튼 눌러짐");

            }
        });

        caTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                newValue = "";
                oldValue = "0";
                resultTextView.setText("0");
                Log.d("TAG", "ca 버튼 눌러짐");
                Log.d("TAG", view.toString());
            }
        });

        minusTextView.setOnClickListener(view -> {
            if (oldValue.equals("0")) {
                oldValue = newValue;
                newValue = "";
                resultTextView.setText("0");
            } else {
                int num1 = Integer.parseInt(oldValue);
                int num2 = Integer.parseInt(newValue);
                int sum = (num1 - num2);
                oldValue = String.valueOf(sum);
                newValue = "";
                resultTextView.setText(oldValue);
                Log.d("TAG", "oldValue : " + oldValue);
                Log.d("TAG", "newValue : " + newValue);
            }
        });
    }

}