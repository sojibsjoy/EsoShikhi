package org.kpsoftwaresolutions.esoshikhi;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class NumberActivity extends AppCompatActivity {
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }
    public void englishNum(View view) {
        intent = new Intent(getApplicationContext(),EnglishNumberActivity.class);
        startActivity(intent);
    }
    public void banglaNum(View view) {
        intent = new Intent(getApplicationContext(),BanglaNumberActivity.class);
        startActivity(intent);
    }
}
