package com.example.exam;

import android.app.Activity;
        import android.content.Intent;
        import android.media.MediaPlayer;
        import android.os.Bundle;
        import android.os.Handler;

public class SplashAct extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashlayout);
        MediaPlayer appIntro;
        appIntro = MediaPlayer.create(SplashAct.this,R.raw.intropharm);
        appIntro.start();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                // This method will be executed once the timer is over
                Intent i = new Intent(SplashAct.this, main.class);
                startActivity(i);
                appIntro.stop();
                finish();
            }
        }, 5000);
    }
}
