package com.example.mycar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class cal2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal2);
    }
    public void onClick(View v){
        EditText obj1 = (EditText)findViewById(R.id.num1);
        EditText obj2 = (EditText)findViewById(R.id.num2);
        EditText obj3 = (EditText)findViewById(R.id.num3);
        TextView rest= (TextView)findViewById(R.id.Result1);
        TextView rest2= (TextView)findViewById(R.id.Result2);
        int num1 = Integer.parseInt(obj1.getText().toString());
        int num2 = Integer.parseInt(obj2.getText().toString());
        int num3 = Integer.parseInt(obj3.getText().toString());
        int res = (num1*num2)/100;
        int res2 = res*num3;
        rest.setText(Integer.toString(res));
        rest2.setText(Integer.toString(res2));
    }
}
