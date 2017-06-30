package com.example.peen.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    protected void calculate(View v){
        EditText num1 = (EditText)findViewById(R.id.num1);
        EditText num2 = (EditText)findViewById(R.id.num2);
        TextView sum = (TextView) findViewById(R.id.sum);

        Integer firstnum,secondnumber,result;
        firstnum = Integer.parseInt(num1.getText().toString());
        secondnumber = Integer.parseInt(num2.getText().toString());

        result = firstnum+secondnumber;
        sum.setText(""+result);

    }

}
