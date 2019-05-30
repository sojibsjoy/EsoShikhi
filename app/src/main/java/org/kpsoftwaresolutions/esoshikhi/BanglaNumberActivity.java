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

public class BanglaNumberActivity extends AppCompatActivity implements View.OnClickListener {

    private MediaPlayer mplr;
    private Button prvsBtn,nxtBtn;
    private TextView banNumView,banNumTextView;
    private int indicator = 0;
    private Typeface typeface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangla_number);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        initializeAll();

        banNumView.setTypeface(typeface);
        banNumTextView.setTypeface(typeface);


        banNumView.setText("০");
        banNumTextView.setText("শূন্য");
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
        prvsBtn = findViewById(R.id.banPrvsBtn);
        nxtBtn = findViewById(R.id.banNxtBtn);
        banNumView = findViewById(R.id.banNumView);
        banNumTextView = findViewById(R.id.banNumTextView);
        typeface = Typeface.createFromAsset(getAssets(),"font/ban_font.ttf");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.banPrvsBtn:
                if(indicator==0)
                    Toast.makeText(getApplicationContext(),"This is the first one!",Toast.LENGTH_SHORT).show();
                else {
                    switch (indicator) {
                        case 1000:
                            banNumView.setText("১০০");
                            banNumTextView.setText("একশ");
                            indicator=100;
                            mplr = MediaPlayer.create(this,R.raw.ban_one_hundred);
                            mplr.start();
                            break;
                        case 100:
                            banNumView.setText("৯৯");
                            banNumTextView.setText("নিরানব্বই");
                            indicator=99;
                            mplr = MediaPlayer.create(this,R.raw.ban_ninety_nine);
                            mplr.start();
                            break;
                        case 99:
                            banNumView.setText("৮৮");
                            banNumTextView.setText("অষ্টআশি");
                            indicator=88;
                            mplr = MediaPlayer.create(this,R.raw.ban_eighty_eight);
                            mplr.start();
                            break;
                        case 88:
                            banNumView.setText("৭৭");
                            banNumTextView.setText("সাতাত্তর");
                            indicator=77;
                            mplr = MediaPlayer.create(this,R.raw.ban_seventy_seven);
                            mplr.start();
                            break;
                        case 77:
                            banNumView.setText("৬৬");
                            banNumTextView.setText("ছেষট্টি");
                            indicator=66;
                            mplr = MediaPlayer.create(this,R.raw.ban_sixty_six);
                            mplr.start();
                            break;
                        case 66:
                            banNumView.setText("৫৫");
                            banNumTextView.setText("পঞ্চান্ন");
                            indicator=55;
                            mplr = MediaPlayer.create(this,R.raw.ban_fifty_five);
                            mplr.start();
                            break;
                        case 55:
                            banNumView.setText("৪৪");
                            banNumTextView.setText("চুয়াল্লিশ");
                            indicator=44;
                            mplr = MediaPlayer.create(this,R.raw.ban_fourty_four);
                            mplr.start();
                            break;
                        case 44:
                            banNumView.setText("৩৩");
                            banNumTextView.setText("তেত্রিশ");
                            indicator=33;
                            mplr = MediaPlayer.create(this,R.raw.ban_thirty_three);
                            mplr.start();
                        case 33:
                            banNumView.setText("২২");
                            banNumTextView.setText("বাইশ");
                            indicator=22;
                            mplr = MediaPlayer.create(this,R.raw.ban_twenty_two);
                            mplr.start();
                            break;
                        case 22:
                            banNumView.setText("২০");
                            banNumTextView.setText("কুড়ি/বিশ");
                            indicator=20;
                            mplr = MediaPlayer.create(this,R.raw.ban_twenty);
                            mplr.start();
                            break;
                        case 20:
                            banNumView.setText("১৯");
                            banNumTextView.setText("উনিশ");
                            indicator=19;
                            mplr = MediaPlayer.create(this,R.raw.ban_nineteen);
                            mplr.start();
                            break;
                        case 19:
                            banNumView.setText("১৮");
                            banNumTextView.setText("আঠারো");
                            indicator=18;
                            mplr = MediaPlayer.create(this,R.raw.ban_eighteen);
                            mplr.start();
                            break;
                        case 18:
                            banNumView.setText("১৭");
                            banNumTextView.setText("সতেরো");
                            indicator=17;
                            mplr = MediaPlayer.create(this,R.raw.ban_seventeen);
                            mplr.start();
                            break;
                        case 17:
                            banNumView.setText("১৬");
                            banNumTextView.setText("ষোল");
                            indicator=16;
                            mplr = MediaPlayer.create(this,R.raw.ban_sixteen);
                            mplr.start();
                            break;
                        case 16:
                            banNumView.setText("১৫");
                            banNumTextView.setText("পনের");
                            indicator=15;
                            mplr = MediaPlayer.create(this,R.raw.ban_fifteen);
                            mplr.start();
                            break;
                        case 15:
                            banNumView.setText("১৪");
                            banNumTextView.setText("চৌদ্দ");
                            indicator=14;
                            mplr = MediaPlayer.create(this,R.raw.ban_fourteen);
                            mplr.start();
                            break;
                        case 14:
                            banNumView.setText("১৩");
                            banNumTextView.setText("তের");
                            indicator=13;
                            mplr = MediaPlayer.create(this,R.raw.ban_thirteen);
                            mplr.start();
                            break;
                        case 13:
                            banNumView.setText("১২");
                            banNumTextView.setText("বার");
                            indicator=12;
                            mplr = MediaPlayer.create(this,R.raw.ban_twelve);
                            mplr.start();
                            break;
                        case 12:
                            banNumView.setText("১১");
                            banNumTextView.setText("এগারো");
                            indicator=11;
                            mplr = MediaPlayer.create(this,R.raw.ban_eleven);
                            mplr.start();
                            break;
                        case 11:
                            banNumView.setText("১০");
                            banNumTextView.setText("দশ");
                            indicator=10;
                            mplr = MediaPlayer.create(this,R.raw.ban_ten);
                            mplr.start();
                            break;
                        case 10:
                            banNumView.setText("৯");
                            banNumTextView.setText("নয়");
                            indicator=9;
                            mplr = MediaPlayer.create(this,R.raw.ban_nine);
                            mplr.start();
                            break;
                        case 9:
                            banNumView.setText("৮");
                            banNumTextView.setText("আট");
                            indicator=8;
                            mplr = MediaPlayer.create(this,R.raw.ban_eight);
                            mplr.start();
                            break;
                        case 8:
                            banNumView.setText("৭");
                            banNumTextView.setText("সাত");
                            indicator=7;
                            mplr = MediaPlayer.create(this,R.raw.ban_seven);
                            mplr.start();
                            break;
                        case 7:
                            banNumView.setText("৬");
                            banNumTextView.setText("ছয়");
                            indicator=6;
                            mplr = MediaPlayer.create(this,R.raw.ban_six);
                            mplr.start();
                            break;
                        case 6:
                            banNumView.setText("৫");
                            banNumTextView.setText("পাঁচ");
                            indicator=5;
                            mplr = MediaPlayer.create(this,R.raw.ban_five);
                            mplr.start();
                            break;
                        case 5:
                            banNumView.setText("৪");
                            banNumTextView.setText("চার");
                            indicator=4;
                            mplr = MediaPlayer.create(this,R.raw.ban_four);
                            mplr.start();
                            break;
                        case 4:
                            banNumView.setText("৩");
                            banNumTextView.setText("তিন");
                            indicator=3;
                            mplr = MediaPlayer.create(this,R.raw.ban_three);
                            mplr.start();
                            break;
                        case 3:
                            banNumView.setText("২");
                            banNumTextView.setText("দুই");
                            indicator=2;
                            mplr = MediaPlayer.create(this,R.raw.ban_two);
                            mplr.start();
                            break;
                        case 2:
                            banNumView.setText("১");
                            banNumTextView.setText("এক");
                            indicator=1;
                            mplr = MediaPlayer.create(this,R.raw.ban_one);
                            mplr.start();
                            break;
                        case 1:
                            banNumView.setText("০");
                            banNumTextView.setText("শূন্য");
                            indicator=0;
                            break;
                    }
                }
                break;
            case R.id.banNxtBtn:
                if(indicator==1000)
                    Toast.makeText(getApplicationContext(),"This is the last one!",Toast.LENGTH_SHORT).show();
                else {
                    switch (indicator) {
                        case 0:
                            banNumView.setText("১");
                            banNumTextView.setText("এক");
                            indicator=1;
                            mplr = MediaPlayer.create(this,R.raw.ban_one);
                            mplr.start();
                            break;
                        case 1:
                            banNumView.setText("২");
                            banNumTextView.setText("দুই");
                            indicator=2;
                            mplr = MediaPlayer.create(this,R.raw.ban_two);
                            mplr.start();
                            break;
                        case 2:
                            banNumView.setText("৩");
                            banNumTextView.setText("তিন");
                            indicator=3;
                            mplr = MediaPlayer.create(this,R.raw.ban_three);
                            mplr.start();
                            break;
                        case 3:
                            banNumView.setText("৪");
                            banNumTextView.setText("চার");
                            indicator=4;
                            mplr = MediaPlayer.create(this,R.raw.ban_four);
                            mplr.start();
                            break;
                        case 4:
                            banNumView.setText("৫");
                            banNumTextView.setText("পাঁচ");
                            indicator=5;
                            mplr = MediaPlayer.create(this,R.raw.ban_five);
                            mplr.start();
                            break;
                        case 5:
                            banNumView.setText("৬");
                            banNumTextView.setText("ছয়");
                            indicator=6;
                            mplr = MediaPlayer.create(this,R.raw.ban_six);
                            mplr.start();
                            break;
                        case 6:
                            banNumView.setText("৭");
                            banNumTextView.setText("সাত");
                            indicator=7;
                            mplr = MediaPlayer.create(this,R.raw.ban_seven);
                            mplr.start();
                            break;
                        case 7:
                            banNumView.setText("৮");
                            banNumTextView.setText("আট");
                            indicator=8;
                            mplr = MediaPlayer.create(this,R.raw.ban_eight);
                            mplr.start();
                            break;
                        case 8:
                            banNumView.setText("৯");
                            banNumTextView.setText("নয়");
                            indicator=9;
                            mplr = MediaPlayer.create(this,R.raw.ban_nine);
                            mplr.start();
                            break;
                        case 9:
                            banNumView.setText("১০");
                            banNumTextView.setText("দশ");
                            indicator=10;
                            mplr = MediaPlayer.create(this,R.raw.ban_ten);
                            mplr.start();
                            break;
                        case 10:
                            banNumView.setText("১১");
                            banNumTextView.setText("এগারো");
                            indicator=11;
                            mplr = MediaPlayer.create(this,R.raw.ban_eleven);
                            mplr.start();
                            break;
                        case 11:
                            banNumView.setText("১২");
                            banNumTextView.setText("বারো");
                            indicator=12;
                            mplr = MediaPlayer.create(this,R.raw.ban_twelve);
                            mplr.start();
                            break;
                        case 12:
                            banNumView.setText("১৩");
                            banNumTextView.setText("তেরো");
                            indicator=13;
                            mplr = MediaPlayer.create(this,R.raw.ban_thirteen);
                            mplr.start();
                            break;
                        case 13:
                            banNumView.setText("১৪");
                            banNumTextView.setText("চোদ্দ");
                            indicator=14;
                            mplr = MediaPlayer.create(this,R.raw.ban_fourteen);
                            mplr.start();
                            break;
                        case 14:
                            banNumView.setText("১৫");
                            banNumTextView.setText("পনেরো");
                            indicator=15;
                            mplr = MediaPlayer.create(this,R.raw.ban_fifteen);
                            mplr.start();
                            break;
                        case 15:
                            banNumView.setText("১৬");
                            banNumTextView.setText("ষোল");
                            indicator=16;
                            mplr = MediaPlayer.create(this,R.raw.ban_sixteen);
                            mplr.start();
                            break;
                        case 16:
                            banNumView.setText("১৭");
                            banNumTextView.setText("সতেরো");
                            indicator=17;
                            mplr = MediaPlayer.create(this,R.raw.ban_seventeen);
                            mplr.start();
                            break;
                        case 17:
                            banNumView.setText("১৮");
                            banNumTextView.setText("আঠারো");
                            indicator=18;
                            mplr = MediaPlayer.create(this,R.raw.ban_eighteen);
                            mplr.start();
                            break;
                        case 18:
                            banNumView.setText("১৯");
                            banNumTextView.setText("উনিশ");
                            indicator=19;
                            mplr = MediaPlayer.create(this,R.raw.ban_nineteen);
                            mplr.start();
                            break;
                        case 19:
                            banNumView.setText("২০");
                            banNumTextView.setText("কুড়ি/বিশ");
                            indicator=20;
                            mplr = MediaPlayer.create(this,R.raw.ban_twenty);
                            mplr.start();
                            break;
                        case 20:
                            banNumView.setText("২২");
                            banNumTextView.setText("বাইশ");
                            indicator=22;
                            mplr = MediaPlayer.create(this,R.raw.ban_twenty_two);
                            mplr.start();
                            break;
                        case 22:
                            banNumView.setText("৩৩");
                            banNumTextView.setText("তেত্রিশ");
                            indicator=33;
                            mplr = MediaPlayer.create(this,R.raw.ban_thirty_three);
                            mplr.start();
                            break;
                        case 33:
                            banNumView.setText("৪৪");
                            banNumTextView.setText("চুয়াল্লিশ");
                            indicator=44;
                            mplr = MediaPlayer.create(this,R.raw.ban_fourty_four);
                            mplr.start();
                            break;
                        case 44:
                            banNumView.setText("৫৫");
                            banNumTextView.setText("পঞ্চান্ন");
                            indicator=55;
                            mplr = MediaPlayer.create(this,R.raw.ban_fifty_five);
                            mplr.start();
                            break;
                        case 55:
                            banNumView.setText("৬৬");
                            banNumTextView.setText("ছেষট্টি");
                            indicator=66;
                            mplr = MediaPlayer.create(this,R.raw.ban_sixty_six);
                            mplr.start();
                            break;
                        case 66:
                            banNumView.setText("৭৭");
                            banNumTextView.setText("সাতাত্তর");
                            indicator=77;
                            mplr = MediaPlayer.create(this,R.raw.ban_seventy_seven);
                            mplr.start();
                            break;
                        case 77:
                            banNumView.setText("৮৮");
                            banNumTextView.setText("অষ্টআশি");
                            indicator=88;
                            mplr = MediaPlayer.create(this,R.raw.ban_eighty_eight);
                            mplr.start();
                            break;
                        case 88:
                            banNumView.setText("৯৯");
                            banNumTextView.setText("নিরানব্বই");
                            indicator=99;
                            mplr = MediaPlayer.create(this,R.raw.ban_ninety_nine);
                            mplr.start();
                            break;
                        case 99:
                            banNumView.setText("১০০");
                            banNumTextView.setText("একশ");
                            indicator=100;
                            mplr = MediaPlayer.create(this,R.raw.ban_one_hundred);
                            mplr.start();
                            break;
                        case 100:
                            banNumView.setText("১০০০");
                            banNumTextView.setText("এক হাজার");
                            indicator=1000;
                            break;
                    }
                }
                break;
        }
    }
    public void banPlayAudio1(View view) {
        mplr.start();
    }
    public void banPlayAudio2(View view) {
        mplr.start();
    }
}
