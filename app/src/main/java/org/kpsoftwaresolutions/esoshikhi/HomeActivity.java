package org.kpsoftwaresolutions.esoshikhi;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    Intent intent;
    TextView ban,eng,pp,au,ex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loadLocale();
        setContentView(R.layout.activity_home);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(getResources().getString(R.string.app_name));

        ban = findViewById(R.id.ban);
        eng = findViewById(R.id.eng);
        pp = findViewById(R.id.privacyPolicy);
        au = findViewById(R.id.aboutUs);
        ex = findViewById(R.id.exit);

        ban.setOnClickListener(this);
        eng.setOnClickListener(this);
        pp.setOnClickListener(this);
        au.setOnClickListener(this);
        ex.setOnClickListener(this);
    }



    @Override
    public void onBackPressed() {
        AlertDialog.Builder alb = new AlertDialog.Builder(HomeActivity.this);
        alb.setTitle("Exit");
        alb.setIcon(R.drawable.question);
        alb.setMessage("Are you sure?");
        alb.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
                Toast.makeText(getApplicationContext(),"Application Closed",Toast.LENGTH_SHORT).show();
            }
        });
        alb.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog ald = alb.create();
        ald.show();
    }

    public void setLocale(String lang) {
        Locale locale = new Locale(lang);
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
        SharedPreferences.Editor editor = getSharedPreferences("Settings",MODE_PRIVATE).edit();
        editor.putString("My_Lang", lang);
        editor.apply();
    }
    public void loadLocale() {
        SharedPreferences prefs = getSharedPreferences("Settings", Activity.MODE_PRIVATE);
        String language = prefs.getString("My_Lang","");
        setLocale(language);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ban:
                setLocale("bn");
                recreate();
                intent = new Intent(HomeActivity.this,MainActivity.class);
                startActivity(intent);
                break;
            case R.id.eng:
                setLocale("en");
                recreate();
                intent = new Intent(HomeActivity.this,MainActivity.class);
                startActivity(intent);
                break;
            case R.id.privacyPolicy:
                intent = new Intent(HomeActivity.this,PrivacyPolicyActivity.class);
                startActivity(intent);
                break;
            case R.id.aboutUs:
                intent = new Intent(HomeActivity.this,CompanyActivity.class);
                startActivity(intent);
                break;
            case R.id.exit:
                onBackPressed();
                break;
        }
    }
}
