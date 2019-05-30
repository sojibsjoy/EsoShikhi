package org.kpsoftwaresolutions.esoshikhi;

import android.content.pm.ActivityInfo;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class BenjonbornoActivity extends AppCompatActivity implements View.OnClickListener {

    private MediaPlayer mplr;
    private Button prvsBtn,nxtBtn;
    private TextView benNumView,benNumTextView;
    private int indicator = 0;
    private Typeface typeface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_benjonborno);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        initializeAll();

        benNumView.setTypeface(typeface);
        benNumTextView.setTypeface(typeface);


        benNumView.setText("ক");
        benNumTextView.setText("কাঠাল");
        mplr = MediaPlayer.create(this,R.raw.ban_one);
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
        prvsBtn = findViewById(R.id.benPrvsBtn);
        nxtBtn = findViewById(R.id.benNxtBtn);
        benNumView = findViewById(R.id.benNumView);
        benNumTextView = findViewById(R.id.benNumTextView);
        typeface = Typeface.createFromAsset(getAssets(),"font/ban_font.ttf");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.benPrvsBtn:
                if(indicator==0)
                    Toast.makeText(getApplicationContext(),"This is the first one!",Toast.LENGTH_SHORT).show();
                else {
                    switch (indicator) {
                        case 1000:
                            benNumView.setText("১০০");
                            benNumTextView.setText("একশ");
                            indicator=100;
                            mplr = MediaPlayer.create(this,R.raw.ban_one_hundred);
                            mplr.start();
                            break;
                        case 100:
                            benNumView.setText("৯৯");
                            benNumTextView.setText("নিরানব্বই");
                            indicator=99;
                            mplr = MediaPlayer.create(this,R.raw.ban_ninety_nine);
                            mplr.start();
                            break;
                        case 99:
                            benNumView.setText("৮৮");
                            benNumTextView.setText("অষ্টআশি");
                            indicator=88;
                            mplr = MediaPlayer.create(this,R.raw.ban_eighty_eight);
                            mplr.start();
                            break;
                        case 88:
                            benNumView.setText("৭৭");
                            benNumTextView.setText("সাতাত্তর");
                            indicator=77;
                            mplr = MediaPlayer.create(this,R.raw.ban_seventy_seven);
                            mplr.start();
                            break;
                        case 77:
                            benNumView.setText("৬৬");
                            benNumTextView.setText("ছেষট্টি");
                            indicator=66;
                            mplr = MediaPlayer.create(this,R.raw.ban_sixty_six);
                            mplr.start();
                            break;
                        case 66:
                            benNumView.setText("৫৫");
                            benNumTextView.setText("পঞ্চান্ন");
                            indicator=55;
                            mplr = MediaPlayer.create(this,R.raw.ban_fifty_five);
                            mplr.start();
                            break;
                        case 55:
                            benNumView.setText("৪৪");
                            benNumTextView.setText("চুয়াল্লিশ");
                            indicator=44;
                            mplr = MediaPlayer.create(this,R.raw.ban_fourty_four);
                            mplr.start();
                            break;
                        case 44:
                            benNumView.setText("৩৩");
                            benNumTextView.setText("তেত্রিশ");
                            indicator=33;
                            mplr = MediaPlayer.create(this,R.raw.ban_thirty_three);
                            mplr.start();
                        case 33:
                            benNumView.setText("২২");
                            benNumTextView.setText("বাইশ");
                            indicator=22;
                            mplr = MediaPlayer.create(this,R.raw.ban_twenty_two);
                            mplr.start();
                            break;
                        case 22:
                            benNumView.setText("২০");
                            benNumTextView.setText("কুড়ি/বিশ");
                            indicator=20;
                            mplr = MediaPlayer.create(this,R.raw.ban_twenty);
                            mplr.start();
                            break;
                        case 20:
                            benNumView.setText("১৯");
                            benNumTextView.setText("উনিশ");
                            indicator=19;
                            mplr = MediaPlayer.create(this,R.raw.ban_nineteen);
                            mplr.start();
                            break;
                        case 19:
                            benNumView.setText("১৮");
                            benNumTextView.setText("আঠারো");
                            indicator=18;
                            mplr = MediaPlayer.create(this,R.raw.ban_eighteen);
                            mplr.start();
                            break;
                        case 18:
                            benNumView.setText("১৭");
                            benNumTextView.setText("সতেরো");
                            indicator=17;
                            mplr = MediaPlayer.create(this,R.raw.ban_seventeen);
                            mplr.start();
                            break;
                        case 17:
                            benNumView.setText("১৬");
                            benNumTextView.setText("ষোল");
                            indicator=16;
                            mplr = MediaPlayer.create(this,R.raw.ban_sixteen);
                            mplr.start();
                            break;
                        case 16:
                            benNumView.setText("১৫");
                            benNumTextView.setText("পনের");
                            indicator=15;
                            mplr = MediaPlayer.create(this,R.raw.ban_fifteen);
                            mplr.start();
                            break;
                        case 15:
                            benNumView.setText("১৪");
                            benNumTextView.setText("চৌদ্দ");
                            indicator=14;
                            mplr = MediaPlayer.create(this,R.raw.ban_fourteen);
                            mplr.start();
                            break;
                        case 14:
                            benNumView.setText("১৩");
                            benNumTextView.setText("তের");
                            indicator=13;
                            mplr = MediaPlayer.create(this,R.raw.ban_thirteen);
                            mplr.start();
                            break;
                        case 13:
                            benNumView.setText("১২");
                            benNumTextView.setText("বার");
                            indicator=12;
                            mplr = MediaPlayer.create(this,R.raw.ban_twelve);
                            mplr.start();
                            break;
                        case 12:
                            benNumView.setText("১১");
                            benNumTextView.setText("এগারো");
                            indicator=11;
                            mplr = MediaPlayer.create(this,R.raw.ban_eleven);
                            mplr.start();
                            break;
                        case 11:
                            benNumView.setText("১০");
                            benNumTextView.setText("দশ");
                            indicator=10;
                            mplr = MediaPlayer.create(this,R.raw.ban_ten);
                            mplr.start();
                            break;
                        case 10:
                            benNumView.setText("৯");
                            benNumTextView.setText("নয়");
                            indicator=9;
                            mplr = MediaPlayer.create(this,R.raw.ban_nine);
                            mplr.start();
                            break;
                        case 9:
                            benNumView.setText("৮");
                            benNumTextView.setText("আট");
                            indicator=8;
                            mplr = MediaPlayer.create(this,R.raw.ban_eight);
                            mplr.start();
                            break;
                        case 8:
                            benNumView.setText("৭");
                            benNumTextView.setText("সাত");
                            indicator=7;
                            mplr = MediaPlayer.create(this,R.raw.ban_seven);
                            mplr.start();
                            break;
                        case 7:
                            benNumView.setText("৬");
                            benNumTextView.setText("ছয়");
                            indicator=6;
                            mplr = MediaPlayer.create(this,R.raw.ban_six);
                            mplr.start();
                            break;
                        case 6:
                            benNumView.setText("৫");
                            benNumTextView.setText("পাঁচ");
                            indicator=5;
                            mplr = MediaPlayer.create(this,R.raw.ban_five);
                            mplr.start();
                            break;
                        case 5:
                            benNumView.setText("৪");
                            benNumTextView.setText("চার");
                            indicator=4;
                            mplr = MediaPlayer.create(this,R.raw.ban_four);
                            mplr.start();
                            break;
                        case 4:
                            benNumView.setText("৩");
                            benNumTextView.setText("তিন");
                            indicator=3;
                            mplr = MediaPlayer.create(this,R.raw.ban_three);
                            mplr.start();
                            break;
                        case 3:
                            benNumView.setText("২");
                            benNumTextView.setText("দুই");
                            indicator=2;
                            mplr = MediaPlayer.create(this,R.raw.ban_two);
                            mplr.start();
                            break;
                        case 2:
                            benNumView.setText("১");
                            benNumTextView.setText("এক");
                            indicator=1;
                            mplr = MediaPlayer.create(this,R.raw.ban_one);
                            mplr.start();
                            break;
                        case 1:
                            benNumView.setText("০");
                            benNumTextView.setText("শূন্য");
                            indicator=0;
                            break;
                    }
                }
                break;
            case R.id.benNxtBtn:
                if(indicator==1000)
                    Toast.makeText(getApplicationContext(),"This is the last one!",Toast.LENGTH_SHORT).show();
                else {
                    switch (indicator) {
                        case 0:
                            benNumView.setText("১");
                            benNumTextView.setText("এক");
                            indicator=1;
                            mplr = MediaPlayer.create(this,R.raw.ban_one);
                            mplr.start();
                            break;
                        case 1:
                            benNumView.setText("২");
                            benNumTextView.setText("দুই");
                            indicator=2;
                            mplr = MediaPlayer.create(this,R.raw.ban_two);
                            mplr.start();
                            break;
                        case 2:
                            benNumView.setText("৩");
                            benNumTextView.setText("তিন");
                            indicator=3;
                            mplr = MediaPlayer.create(this,R.raw.ban_three);
                            mplr.start();
                            break;
                        case 3:
                            benNumView.setText("৪");
                            benNumTextView.setText("চার");
                            indicator=4;
                            mplr = MediaPlayer.create(this,R.raw.ban_four);
                            mplr.start();
                            break;
                        case 4:
                            benNumView.setText("৫");
                            benNumTextView.setText("পাঁচ");
                            indicator=5;
                            mplr = MediaPlayer.create(this,R.raw.ban_five);
                            mplr.start();
                            break;
                        case 5:
                            benNumView.setText("৬");
                            benNumTextView.setText("ছয়");
                            indicator=6;
                            mplr = MediaPlayer.create(this,R.raw.ban_six);
                            mplr.start();
                            break;
                        case 6:
                            benNumView.setText("৭");
                            benNumTextView.setText("সাত");
                            indicator=7;
                            mplr = MediaPlayer.create(this,R.raw.ban_seven);
                            mplr.start();
                            break;
                        case 7:
                            benNumView.setText("৮");
                            benNumTextView.setText("আট");
                            indicator=8;
                            mplr = MediaPlayer.create(this,R.raw.ban_eight);
                            mplr.start();
                            break;
                        case 8:
                            benNumView.setText("৯");
                            benNumTextView.setText("নয়");
                            indicator=9;
                            mplr = MediaPlayer.create(this,R.raw.ban_nine);
                            mplr.start();
                            break;
                        case 9:
                            benNumView.setText("১০");
                            benNumTextView.setText("দশ");
                            indicator=10;
                            mplr = MediaPlayer.create(this,R.raw.ban_ten);
                            mplr.start();
                            break;
                        case 10:
                            benNumView.setText("১১");
                            benNumTextView.setText("এগারো");
                            indicator=11;
                            mplr = MediaPlayer.create(this,R.raw.ban_eleven);
                            mplr.start();
                            break;
                        case 11:
                            benNumView.setText("১২");
                            benNumTextView.setText("বারো");
                            indicator=12;
                            mplr = MediaPlayer.create(this,R.raw.ban_twelve);
                            mplr.start();
                            break;
                        case 12:
                            benNumView.setText("১৩");
                            benNumTextView.setText("তেরো");
                            indicator=13;
                            mplr = MediaPlayer.create(this,R.raw.ban_thirteen);
                            mplr.start();
                            break;
                        case 13:
                            benNumView.setText("১৪");
                            benNumTextView.setText("চোদ্দ");
                            indicator=14;
                            mplr = MediaPlayer.create(this,R.raw.ban_fourteen);
                            mplr.start();
                            break;
                        case 14:
                            benNumView.setText("১৫");
                            benNumTextView.setText("পনেরো");
                            indicator=15;
                            mplr = MediaPlayer.create(this,R.raw.ban_fifteen);
                            mplr.start();
                            break;
                        case 15:
                            benNumView.setText("১৬");
                            benNumTextView.setText("ষোল");
                            indicator=16;
                            mplr = MediaPlayer.create(this,R.raw.ban_sixteen);
                            mplr.start();
                            break;
                        case 16:
                            benNumView.setText("১৭");
                            benNumTextView.setText("সতেরো");
                            indicator=17;
                            mplr = MediaPlayer.create(this,R.raw.ban_seventeen);
                            mplr.start();
                            break;
                        case 17:
                            benNumView.setText("১৮");
                            benNumTextView.setText("আঠারো");
                            indicator=18;
                            mplr = MediaPlayer.create(this,R.raw.ban_eighteen);
                            mplr.start();
                            break;
                        case 18:
                            benNumView.setText("১৯");
                            benNumTextView.setText("উনিশ");
                            indicator=19;
                            mplr = MediaPlayer.create(this,R.raw.ban_nineteen);
                            mplr.start();
                            break;
                        case 19:
                            benNumView.setText("২০");
                            benNumTextView.setText("কুড়ি/বিশ");
                            indicator=20;
                            mplr = MediaPlayer.create(this,R.raw.ban_twenty);
                            mplr.start();
                            break;
                        case 20:
                            benNumView.setText("২২");
                            benNumTextView.setText("বাইশ");
                            indicator=22;
                            mplr = MediaPlayer.create(this,R.raw.ban_twenty_two);
                            mplr.start();
                            break;
                        case 22:
                            benNumView.setText("৩৩");
                            benNumTextView.setText("তেত্রিশ");
                            indicator=33;
                            mplr = MediaPlayer.create(this,R.raw.ban_thirty_three);
                            mplr.start();
                            break;
                        case 33:
                            benNumView.setText("৪৪");
                            benNumTextView.setText("চুয়াল্লিশ");
                            indicator=44;
                            mplr = MediaPlayer.create(this,R.raw.ban_fourty_four);
                            mplr.start();
                            break;
                        case 44:
                            benNumView.setText("৫৫");
                            benNumTextView.setText("পঞ্চান্ন");
                            indicator=55;
                            mplr = MediaPlayer.create(this,R.raw.ban_fifty_five);
                            mplr.start();
                            break;
                        case 55:
                            benNumView.setText("৬৬");
                            benNumTextView.setText("ছেষট্টি");
                            indicator=66;
                            mplr = MediaPlayer.create(this,R.raw.ban_sixty_six);
                            mplr.start();
                            break;
                        case 66:
                            benNumView.setText("৭৭");
                            benNumTextView.setText("সাতাত্তর");
                            indicator=77;
                            mplr = MediaPlayer.create(this,R.raw.ban_seventy_seven);
                            mplr.start();
                            break;
                        case 77:
                            benNumView.setText("৮৮");
                            benNumTextView.setText("অষ্টআশি");
                            indicator=88;
                            mplr = MediaPlayer.create(this,R.raw.ban_eighty_eight);
                            mplr.start();
                            break;
                        case 88:
                            benNumView.setText("৯৯");
                            benNumTextView.setText("নিরানব্বই");
                            indicator=99;
                            mplr = MediaPlayer.create(this,R.raw.ban_ninety_nine);
                            mplr.start();
                            break;
                        case 99:
                            benNumView.setText("১০০");
                            benNumTextView.setText("একশ");
                            indicator=100;
                            mplr = MediaPlayer.create(this,R.raw.ban_one_hundred);
                            mplr.start();
                            break;
                        case 100:
                            benNumView.setText("১০০০");
                            benNumTextView.setText("এক হাজার");
                            indicator=1000;
                            break;
                    }
                }
                break;
        }
    }
    public void benPlayAudio1(View view) {
        mplr.start();
    }
    public void benPlayAudio2(View view) {
        mplr.start();
    }
}
