package org.kpsoftwaresolutions.esoshikhi;

import android.content.Intent;
import android.graphics.Path;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class OptionActivity extends AppCompatActivity implements View.OnClickListener {

    Intent intent;
    String value;
    TextView shikhi,practice,quiz,exam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_option);
        shikhi = findViewById(R.id.shikhi);
        practice = findViewById(R.id.practice);
        quiz = findViewById(R.id.quiz);
        exam = findViewById(R.id.exit);

        shikhi.setOnClickListener(this);
        practice.setOnClickListener(this);
        quiz.setOnClickListener(this);
        exam.setOnClickListener(this);



        Bundle bundle = getIntent().getExtras();

        if(bundle != null) {
            value = bundle.getString("key");
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.shikhi:
                switch (value) {
                    case "0":
                        intent = new Intent(OptionActivity.this,BornomalaActivity.class);
                        startActivity(intent);
                        break;
                    case "1":
                        intent = new Intent(OptionActivity.this,AlphabetActivity.class);
                        startActivity(intent);
                        break;
                    case "2":
                        intent = new Intent(OptionActivity.this,ArabicActivity.class);
                        startActivity(intent);
                        break;
                    case "3":
                        intent = new Intent(OptionActivity.this,NumberActivity.class);
                        startActivity(intent);
                        break;
                    case "4":
                        intent = new Intent(OptionActivity.this,UnitsActivity.class);
                        startActivity(intent);
                        break;
                }
                break;
            case R.id.practice:
                break;
            case R.id.quiz:
                break;
            case R.id.exam:
                break;
        }
    }
}
