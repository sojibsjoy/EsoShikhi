package org.kpsoftwaresolutions.esoshikhi;

import android.content.Intent;
import android.graphics.Path;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BornomalaActivity extends AppCompatActivity {

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bornomala);
    }
    public void soroborno(View view) {
        intent = new Intent(getApplicationContext(), SorobornoActivity.class);
        startActivity(intent);

    }
    public void benjonborno(View view) {
        intent = new Intent(getApplicationContext(),BenjonbornoActivity.class);
        startActivity(intent);
    }
}
