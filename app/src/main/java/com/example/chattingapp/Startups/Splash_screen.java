package com.example.chattingapp.Startups;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;
import com.example.chattingapp.Login_Signup.Getting_started;
import com.example.chattingapp.R;

public class Splash_screen extends AppCompatActivity {

    TextView appearance;
    LottieAnimationView lottie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        appearance = findViewById(R.id.appearance);
        lottie = findViewById(R.id.lottie);


        appearance.animate().translationY(-400).setDuration(700).setStartDelay(50);
        lottie.animate().translationX(2000).setDuration(2000).setStartDelay(2900);
        lottie.playAnimation();


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(Splash_screen.this, Getting_started.class);
                startActivity(i);
                finish();

            }
        },1500);


    }
}