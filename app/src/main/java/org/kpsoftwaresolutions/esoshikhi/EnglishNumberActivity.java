package org.kpsoftwaresolutions.esoshikhi;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class EnglishNumberActivity extends AppCompatActivity implements View.OnClickListener{



    private MediaPlayer mplr;
    private Button prvsBtn,nxtBtn;
    private TextView engNumView,engNumTextView;
    private int indicator = 0;
    private Typeface typeface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_number);
        initializeAll();

        engNumView.setTypeface(typeface);
        engNumTextView.setTypeface(typeface);

        engNumView.setText("0");
        engNumTextView.setText("Zero");
        mplr = MediaPlayer.create(this,R.raw.eng_one);
        mplr.start();

        prvsBtn.setOnClickListener(this);
        nxtBtn.setOnClickListener(this);

    }

    @Override
    public void onBackPressed() {
        mplr.stop();
        super.onBackPressed();
    }

    private void initializeAll() {
        prvsBtn = findViewById(R.id.engPrvsBtn);
        nxtBtn = findViewById(R.id.engNxtBtn);
        engNumView = findViewById(R.id.engNumView);
        engNumTextView = findViewById(R.id.engNumTextView);
        typeface = Typeface.createFromAsset(getAssets(), "font/eng_font.ttf");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.engPrvsBtn:
                onSwipeLeft();
                break;
            case R.id.engNxtBtn:
                onSwipeRight();
                break;
        }
    }
    private void onSwipeLeft() {
        if(indicator==0)
            Toast.makeText(getApplicationContext(),"This is the first one!",Toast.LENGTH_SHORT).show();
        else {
            switch (indicator) {
                case 1000:
                    engNumView.setText("100");
                    engNumTextView.setText("One Hundred");
                    indicator=100;
                    mplr = MediaPlayer.create(this,R.raw.eng_one_hundred);
                    mplr.start();
                    break;
                case 100:
                    engNumView.setText("99");
                    engNumTextView.setText("Ninety Nine");
                    indicator=99;
                    mplr = MediaPlayer.create(this,R.raw.eng_ninety_nine);
                    mplr.start();
                    break;
                case 99:
                    engNumView.setText("88");
                    engNumTextView.setText("Eighty Eight");
                    indicator=88;
                    break;
                case 88:
                    engNumView.setText("77");
                    engNumTextView.setText("Seventy Seven");
                    indicator=77;
                    break;
                case 77:
                    engNumView.setText("66");
                    engNumTextView.setText("Sixty Six");
                    indicator=66;
                    break;
                case 66:
                    engNumView.setText("55");
                    engNumTextView.setText("Fifty Five");
                    indicator=55;
                    break;
                case 55:
                    engNumView.setText("44");
                    engNumTextView.setText("Forty Four");
                    indicator=44;
                    break;
                case 44:
                    engNumView.setText("33");
                    engNumTextView.setText("Thirty Three");
                    indicator=33;
                case 33:
                    engNumView.setText("22");
                    engNumTextView.setText("Twenty Two");
                    indicator=22;
                    break;
                case 22:
                    engNumView.setText("20");
                    engNumTextView.setText("Twenty");
                    indicator=20;
                    mplr = MediaPlayer.create(this,R.raw.eng_twenty);
                    mplr.start();
                    break;
                case 20:
                    engNumView.setText("19");
                    engNumTextView.setText("Nineteen");
                    indicator=19;
                    mplr = MediaPlayer.create(this,R.raw.eng_nineteen);
                    mplr.start();
                    break;
                case 19:
                    engNumView.setText("18");
                    engNumTextView.setText("Eighteen");
                    indicator=18;
                    mplr = MediaPlayer.create(this,R.raw.eng_eighteen);
                    mplr.start();
                    break;
                case 18:
                    engNumView.setText("17");
                    engNumTextView.setText("Seventeen");
                    indicator=17;
                    mplr = MediaPlayer.create(this,R.raw.eng_seventeen);
                    mplr.start();
                    break;
                case 17:
                    engNumView.setText("16");
                    engNumTextView.setText("Sixteen");
                    indicator=16;
                    mplr = MediaPlayer.create(this,R.raw.eng_sixteen);
                    mplr.start();
                    break;
                case 16:
                    engNumView.setText("15");
                    engNumTextView.setText("Fifteen");
                    indicator=15;
                    mplr = MediaPlayer.create(this,R.raw.eng_fifteen);
                    mplr.start();
                    break;
                case 15:
                    engNumView.setText("14");
                    engNumTextView.setText("Fourteen");
                    indicator=14;
                    mplr = MediaPlayer.create(this,R.raw.eng_fourteen);
                    mplr.start();
                    break;
                case 14:
                    engNumView.setText("13");
                    engNumTextView.setText("Thirteen");
                    indicator=13;
                    mplr = MediaPlayer.create(this,R.raw.eng_thirteen);
                    mplr.start();
                    break;
                case 13:
                    engNumView.setText("12");
                    engNumTextView.setText("Twelve");
                    indicator=12;
                    mplr = MediaPlayer.create(this,R.raw.eng_twelve);
                    mplr.start();
                    break;
                case 12:
                    engNumView.setText("11");
                    engNumTextView.setText("Eleven");
                    indicator=11;
                    mplr = MediaPlayer.create(this,R.raw.eng_eleven);
                    mplr.start();
                    break;
                case 11:
                    engNumView.setText("10");
                    engNumTextView.setText("Ten");
                    indicator=10;
                    mplr = MediaPlayer.create(this,R.raw.eng_ten);
                    mplr.start();
                    break;
                case 10:
                    engNumView.setText("9");
                    engNumTextView.setText("Nine");
                    indicator=9;
                    mplr = MediaPlayer.create(this,R.raw.eng_nine);
                    mplr.start();
                    break;
                case 9:
                    engNumView.setText("8");
                    engNumTextView.setText("Eight");
                    indicator=8;
                    mplr = MediaPlayer.create(this,R.raw.eng_eight);
                    mplr.start();
                    break;
                case 8:
                    engNumView.setText("7");
                    engNumTextView.setText("Seven");
                    indicator=7;
                    mplr = MediaPlayer.create(this,R.raw.eng_seven);
                    mplr.start();
                    break;
                case 7:
                    engNumView.setText("6");
                    engNumTextView.setText("Six");
                    indicator=6;
                    mplr = MediaPlayer.create(this,R.raw.eng_six);
                    mplr.start();
                    break;
                case 6:
                    engNumView.setText("5");
                    engNumTextView.setText("Five");
                    indicator=5;
                    mplr = MediaPlayer.create(this,R.raw.eng_five);
                    mplr.start();
                    break;
                case 5:
                    engNumView.setText("4");
                    engNumTextView.setText("Four");
                    indicator=4;
                    mplr = MediaPlayer.create(this,R.raw.eng_four);
                    mplr.start();
                    break;
                case 4:
                    engNumView.setText("3");
                    engNumTextView.setText("Three");
                    indicator=3;
                    mplr = MediaPlayer.create(this,R.raw.eng_three);
                    mplr.start();
                    break;
                case 3:
                    engNumView.setText("2");
                    engNumTextView.setText("Two");
                    indicator=2;
                    mplr = MediaPlayer.create(this,R.raw.eng_two);
                    mplr.start();
                    break;
                case 2:
                    engNumView.setText("1");
                    engNumTextView.setText("One");
                    indicator=1;
                    mplr = MediaPlayer.create(this,R.raw.eng_one);
                    mplr.start();
                    break;
                case 1:
                    engNumView.setText("0");
                    engNumTextView.setText("Zero");
                    indicator=0;
                    break;
            }
        }
    }

    private void onSwipeRight() {
        if(indicator==1000)
            Toast.makeText(getApplicationContext(),"This is the last one!",Toast.LENGTH_SHORT).show();
        else {
            switch (indicator) {
                case 0:
                    engNumView.setText("1");
                    engNumTextView.setText("One");
                    indicator=1;
                    mplr = MediaPlayer.create(this,R.raw.eng_one);
                    mplr.start();
                    break;
                case 1:
                    engNumView.setText("2");
                    engNumTextView.setText("Two");
                    indicator=2;
                    mplr = MediaPlayer.create(this,R.raw.eng_two);
                    mplr.start();
                    break;
                case 2:
                    engNumView.setText("3");
                    engNumTextView.setText("Three");
                    indicator=3;
                    mplr = MediaPlayer.create(this,R.raw.eng_three);
                    mplr.start();
                    break;
                case 3:
                    engNumView.setText("4");
                    engNumTextView.setText("Four");
                    indicator=4;
                    mplr = MediaPlayer.create(this,R.raw.eng_four);
                    mplr.start();
                    break;
                case 4:
                    engNumView.setText("5");
                    engNumTextView.setText("Five");
                    indicator=5;
                    mplr = MediaPlayer.create(this,R.raw.eng_five);
                    mplr.start();
                    break;
                case 5:
                    engNumView.setText("6");
                    engNumTextView.setText("Six");
                    indicator=6;
                    mplr = MediaPlayer.create(this,R.raw.eng_six);
                    mplr.start();
                    break;
                case 6:
                    engNumView.setText("7");
                    engNumTextView.setText("Seven");
                    indicator=7;
                    mplr = MediaPlayer.create(this,R.raw.eng_seven);
                    mplr.start();
                    break;
                case 7:
                    engNumView.setText("8");
                    engNumTextView.setText("Eight");
                    indicator=8;
                    mplr = MediaPlayer.create(this,R.raw.eng_eight);
                    mplr.start();
                    break;
                case 8:
                    engNumView.setText("9");
                    engNumTextView.setText("Nine");
                    indicator=9;
                    mplr = MediaPlayer.create(this,R.raw.eng_nine);
                    mplr.start();
                    break;
                case 9:
                    engNumView.setText("10");
                    engNumTextView.setText("Ten");
                    indicator=10;
                    mplr = MediaPlayer.create(this,R.raw.eng_ten);
                    mplr.start();
                    break;
                case 10:
                    engNumView.setText("11");
                    engNumTextView.setText("Eleven");
                    indicator=11;
                    mplr = MediaPlayer.create(this,R.raw.eng_eleven);
                    mplr.start();
                    break;
                case 11:
                    engNumView.setText("12");
                    engNumTextView.setText("Twelve");
                    indicator=12;
                    mplr = MediaPlayer.create(this,R.raw.eng_twelve);
                    mplr.start();
                    break;
                case 12:
                    engNumView.setText("13");
                    engNumTextView.setText("Thirteen");
                    indicator=13;
                    mplr = MediaPlayer.create(this,R.raw.eng_thirteen);
                    mplr.start();
                    break;
                case 13:
                    engNumView.setText("14");
                    engNumTextView.setText("Fourteen");
                    indicator=14;
                    mplr = MediaPlayer.create(this,R.raw.eng_fourteen);
                    mplr.start();
                    break;
                case 14:
                    engNumView.setText("15");
                    engNumTextView.setText("Fifteen");
                    indicator=15;
                    mplr = MediaPlayer.create(this,R.raw.eng_fifteen);
                    mplr.start();
                    break;
                case 15:
                    engNumView.setText("16");
                    engNumTextView.setText("Sixteen");
                    indicator=16;
                    mplr = MediaPlayer.create(this,R.raw.eng_sixteen);
                    mplr.start();
                    break;
                case 16:
                    engNumView.setText("17");
                    engNumTextView.setText("Seventeen");
                    indicator=17;
                    mplr = MediaPlayer.create(this,R.raw.eng_seventeen);
                    mplr.start();
                    break;
                case 17:
                    engNumView.setText("18");
                    engNumTextView.setText("Eighteen");
                    indicator=18;
                    mplr = MediaPlayer.create(this,R.raw.eng_eighteen);
                    mplr.start();
                    break;
                case 18:
                    engNumView.setText("19");
                    engNumTextView.setText("Nineteen");
                    indicator=19;
                    mplr = MediaPlayer.create(this,R.raw.eng_nineteen);
                    mplr.start();
                    break;
                case 19:
                    engNumView.setText("20");
                    engNumTextView.setText("Twenty");
                    indicator=20;
                    mplr = MediaPlayer.create(this,R.raw.eng_twenty);
                    mplr.start();
                    break;
                case 20:
                    engNumView.setText("22");
                    engNumTextView.setText("Twenty Two");
                    indicator=22;
                    break;
                case 22:
                    engNumView.setText("33");
                    engNumTextView.setText("Thirty Three");
                    indicator=33;
                    break;
                case 33:
                    engNumView.setText("44");
                    engNumTextView.setText("Forty Four");
                    indicator=44;
                    break;
                case 44:
                    engNumView.setText("55");
                    engNumTextView.setText("Fifty Five");
                    indicator=55;
                    break;
                case 55:
                    engNumView.setText("66");
                    engNumTextView.setText("Sixty Six");
                    indicator=66;
                    break;
                case 66:
                    engNumView.setText("77");
                    engNumTextView.setText("Seventy Seven");
                    indicator=77;
                    break;
                case 77:
                    engNumView.setText("88");
                    engNumTextView.setText("Eighty Eight");
                    indicator=88;
                    break;
                case 88:
                    engNumView.setText("99");
                    engNumTextView.setText("Ninety Nine");
                    indicator=99;
                    mplr = MediaPlayer.create(this,R.raw.eng_ninety_nine);
                    mplr.start();
                    break;
                case 99:
                    engNumView.setText("100");
                    engNumTextView.setText("One Hundred");
                    indicator=100;
                    mplr = MediaPlayer.create(this,R.raw.eng_one_hundred);
                    mplr.start();
                    break;
                case 100:
                    engNumView.setText("1000");
                    engNumTextView.setText("One Thousand");
                    indicator=1000;
                    break;
            }
        }
    }
    public void engPlayAudio1(View view) {
        mplr.start();
    }
    public void engPlayAudio2(View view) {
        mplr.start();
    }
}
