package com.example.mycar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Middle extends AppCompatActivity {
    private Button cal1,cal2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_middle);
        //Button to go 1st CALCULATION
        cal1=(Button)findViewById(R.id.button3);
        cal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(".cal1");
                startActivity(intent);
            }
        });
        //Button to go 2nd CALCULATION
        cal2=(Button)findViewById(R.id.button5);
        cal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(".cal2");
                startActivity(intent);
            }
        });
    }
}
