package org.kpsoftwaresolutions.esoshikhi;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Typeface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Intent intent;
    TextView banBor,engBor,arbBor,num,unit;
    private Typeface typeface1,typeface2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        typeface1 = Typeface.createFromAsset(getAssets(),"font/ban_font.ttf");
        typeface2 = Typeface.createFromAsset(getAssets(), "font/eng_font.ttf");
        banBor = findViewById(R.id.banBornomala);
        engBor = findViewById(R.id.engBornomala);
        arbBor = findViewById(R.id.arbBornomala);
        num = findViewById(R.id.num);
        unit = findViewById(R.id.unit);

        if(!num.getText().equals("Number")) {
            banBor.setTypeface(typeface1);
            engBor.setTypeface(typeface1);
            arbBor.setTypeface(typeface1);
            num.setTypeface(typeface1);
            unit.setTypeface(typeface1);
        }else {
            banBor.setTypeface(typeface2);
            engBor.setTypeface(typeface2);
            arbBor.setTypeface(typeface2);
            num.setTypeface(typeface2);
            unit.setTypeface(typeface2);

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater mi = new MenuInflater(getApplicationContext());
        mi.inflate(R.menu.menu_layout_all,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.aboutUsItem:
                intent = new Intent(getApplicationContext(),CompanyActivity.class);
                startActivity(intent);
                break;
            case R.id.privacyPolicyItem:
                intent = new Intent(getApplicationContext(),PrivacyPolicyActivity.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }


    public void bornomala(View view) {
        intent = new Intent(getApplicationContext(),BornomalaActivity.class);
        startActivity(intent);
    }
    public void alphabet(View view) {
        intent = new Intent(getApplicationContext(),AlphabetActivity.class);
        startActivity(intent);
    }
    public void numbers(View view) {
        intent = new Intent(getApplicationContext(),NumberActivity.class);
        startActivity(intent);

    }
}
