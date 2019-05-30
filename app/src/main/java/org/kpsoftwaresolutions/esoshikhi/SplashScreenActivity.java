package org.kpsoftwaresolutions.esoshikhi;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                doWork();
                Intent intent = new Intent(SplashScreenActivity.this,HomeActivity.class);
                startActivity(intent);
                finish();
            }
        });
        thread.start();
    }
    public void doWork() {
        for(int i=10; i<=30; i+=10) {
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                Toast.makeText(getApplicationContext(),"Application Error!",Toast.LENGTH_SHORT).show();
            }
        }
    }
}
