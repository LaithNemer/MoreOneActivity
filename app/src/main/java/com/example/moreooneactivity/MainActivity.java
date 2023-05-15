package com.example.moreooneactivity;

import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
ImageView image;

    EditText massge;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        massge=findViewById(R.id.EditMessage);
        image=findViewById(R.id.ImageView2);
        txt=findViewById(R.id.alNakbeh);


        Animation animation= AnimationUtils.loadAnimation(MainActivity.this,R.anim.fade);
    image.startAnimation(animation);

        Handler hr=new Handler();
        hr.postDelayed(new Runnable() {
            @Override
            public void run() {
                image.setVisibility(View.GONE);
                txt.setText("we will be back ");
            }
        },4000);

    }





    public void OnClickSend(View view) {
        String msg=massge.getText().toString();
        Intent intent=new Intent(this,MainActivity2.class);
        intent.putExtra("data",msg);
        startActivity(intent);
    }

    public void btnSend2(View view){
        Intent intent2=new Intent(Intent.ACTION_SEND);
        intent2.putExtra(Intent.EXTRA_TEXT,"This is a simple message");
        intent2.putExtra(Intent.EXTRA_SUBJECT,"Hello There ");
        intent2.setType("text/plain");

        Intent chooser =Intent.createChooser(intent2,null);
        startActivity(chooser);

    }

}