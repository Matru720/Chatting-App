package com.example.chattingapp.Login_Signup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;
import com.example.chattingapp.R;
import com.example.chattingapp.signup_login.Signup_page;

public class Getting_started extends AppCompatActivity {

    TextView getstarted;

    LottieAnimationView lottie;

   Button btn_getStarted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_getting_started_screen);

        getstarted = findViewById(R.id.getstarted);
        lottie = findViewById(R.id.lottie);

        lottie.playAnimation();

        btn_getStarted = findViewById(R.id.btn_get_started);

        btn_getStarted.setOnClickListener(v -> {
            startActivity(new Intent(Getting_started.this, Signup_page.class));
            finish();
        });

    }
}