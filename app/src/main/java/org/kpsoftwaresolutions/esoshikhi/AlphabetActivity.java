package org.kpsoftwaresolutions.esoshikhi;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AlphabetActivity extends AppCompatActivity {

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }

    public void vowel(View view) {
        intent = new Intent(getApplicationContext(), VowelActivity.class);
        startActivity(intent);

    }
    public void consonant(View view) {
        intent = new Intent(getApplicationContext(),ConsonantActivity.class);
        startActivity(intent);
    }
}
