package com.example.moreooneactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView textShowView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textShowView=findViewById(R.id.tectShowMessge);
        Intent intent=getIntent();
        String msg=intent.getStringExtra("data");
        textShowView.setText(msg);

    }
}