package com.deskconn.splashscreenapiandroid12;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.splashscreen.SplashScreen;

import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    private boolean keep = true;
    private final int DELAY = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SplashScreen splashScreen = SplashScreen.installSplashScreen(this);
        setContentView(R.layout.activity_main);

        splashScreen.setKeepOnScreenCondition(() -> keep);
        Handler handler = new Handler();
        handler.postDelayed(() -> keep = false, DELAY);;

    }
}