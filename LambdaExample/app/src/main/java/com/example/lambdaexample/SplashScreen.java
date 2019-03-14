package com.example.lambdaexample;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        // Without Lambda
//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                startActivity(new Intent(SplashScreen.this, MainActivity.class)
//            }
//        }, 2000);

        // With Lambda
       new Handler().postDelayed(() ->
               startActivity(new Intent(SplashScreen.this, MainActivity.class)),
               2000);
    }
}

