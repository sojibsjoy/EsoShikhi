package org.kpsoftwaresolutions.esoshikhi;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater mi = new MenuInflater(getApplicationContext());
        mi.inflate(R.menu.menu_layout,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder alb = new AlertDialog.Builder(MainActivity.this);
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
            case R.id.exitItem:
                onBackPressed();
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
