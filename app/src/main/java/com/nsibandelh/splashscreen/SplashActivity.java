package com.nsibandelh.splashscreen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.annotation.Nullable;

public class SplashActivity extends Activity
{
    //Duration of Splash
    private final int SPLASH_DURATION = 5000;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //Handler to start Menu activity,
        //and close Splash screen
        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                //Start Menu Activity
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
                SplashActivity.this.finish();
            }
        }, SPLASH_DURATION);
    }
}
