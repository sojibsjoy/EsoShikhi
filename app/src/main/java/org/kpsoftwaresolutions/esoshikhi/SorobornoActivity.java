package org.kpsoftwaresolutions.esoshikhi;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SorobornoActivity extends AppCompatActivity implements View.OnClickListener {

    private MediaPlayer mplr;
    private Button prvsBtn,nxtBtn;
    private TextView sorNumView,sorNumTextView;
    private int indicator = 0;
    private Typeface typeface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soroborno);
        initializeAll();

        sorNumView.setTypeface(typeface);
        sorNumTextView.setTypeface(typeface);


        sorNumView.setText("অ");
        sorNumTextView.setText("অজগর");
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
        prvsBtn = findViewById(R.id.sorPrvsBtn);
        nxtBtn = findViewById(R.id.sorNxtBtn);
        sorNumView = findViewById(R.id.sorNumView);
        sorNumTextView = findViewById(R.id.sorNumTextView);
        typeface = Typeface.createFromAsset(getAssets(),"font/ban_font.ttf");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.sorPrvsBtn:
                if(indicator==0)
                    Toast.makeText(getApplicationContext(),"This is the first one!",Toast.LENGTH_SHORT).show();
                else {
                    switch (indicator) {
                        case 1000:
                            sorNumView.setText("১০০");
                            sorNumTextView.setText("একশ");
                            indicator=100;
                            mplr = MediaPlayer.create(this,R.raw.ban_one_hundred);
                            mplr.start();
                            break;
                        case 100:
                            sorNumView.setText("৯৯");
                            sorNumTextView.setText("নিরানব্বই");
                            indicator=99;
                            mplr = MediaPlayer.create(this,R.raw.ban_ninety_nine);
                            mplr.start();
                            break;
                        case 99:
                            sorNumView.setText("৮৮");
                            sorNumTextView.setText("অষ্টআশি");
                            indicator=88;
                            mplr = MediaPlayer.create(this,R.raw.ban_eighty_eight);
                            mplr.start();
                            break;
                        case 88:
                            sorNumView.setText("৭৭");
                            sorNumTextView.setText("সাতাত্তর");
                            indicator=77;
                            mplr = MediaPlayer.create(this,R.raw.ban_seventy_seven);
                            mplr.start();
                            break;
                        case 77:
                            sorNumView.setText("৬৬");
                            sorNumTextView.setText("ছেষট্টি");
                            indicator=66;
                            mplr = MediaPlayer.create(this,R.raw.ban_sixty_six);
                            mplr.start();
                            break;
                        case 66:
                            sorNumView.setText("৫৫");
                            sorNumTextView.setText("পঞ্চান্ন");
                            indicator=55;
                            mplr = MediaPlayer.create(this,R.raw.ban_fifty_five);
                            mplr.start();
                            break;
                        case 55:
                            sorNumView.setText("৪৪");
                            sorNumTextView.setText("চুয়াল্লিশ");
                            indicator=44;
                            mplr = MediaPlayer.create(this,R.raw.ban_fourty_four);
                            mplr.start();
                            break;
                        case 44:
                            sorNumView.setText("৩৩");
                            sorNumTextView.setText("তেত্রিশ");
                            indicator=33;
                            mplr = MediaPlayer.create(this,R.raw.ban_thirty_three);
                            mplr.start();
                        case 33:
                            sorNumView.setText("২২");
                            sorNumTextView.setText("বাইশ");
                            indicator=22;
                            mplr = MediaPlayer.create(this,R.raw.ban_twenty_two);
                            mplr.start();
                            break;
                        case 22:
                            sorNumView.setText("২০");
                            sorNumTextView.setText("কুড়ি/বিশ");
                            indicator=20;
                            mplr = MediaPlayer.create(this,R.raw.ban_twenty);
                            mplr.start();
                            break;
                        case 20:
                            sorNumView.setText("১৯");
                            sorNumTextView.setText("উনিশ");
                            indicator=19;
                            mplr = MediaPlayer.create(this,R.raw.ban_nineteen);
                            mplr.start();
                            break;
                        case 19:
                            sorNumView.setText("১৮");
                            sorNumTextView.setText("আঠারো");
                            indicator=18;
                            mplr = MediaPlayer.create(this,R.raw.ban_eighteen);
                            mplr.start();
                            break;
                        case 18:
                            sorNumView.setText("১৭");
                            sorNumTextView.setText("সতেরো");
                            indicator=17;
                            mplr = MediaPlayer.create(this,R.raw.ban_seventeen);
                            mplr.start();
                            break;
                        case 17:
                            sorNumView.setText("১৬");
                            sorNumTextView.setText("ষোল");
                            indicator=16;
                            mplr = MediaPlayer.create(this,R.raw.ban_sixteen);
                            mplr.start();
                            break;
                        case 16:
                            sorNumView.setText("১৫");
                            sorNumTextView.setText("পনের");
                            indicator=15;
                            mplr = MediaPlayer.create(this,R.raw.ban_fifteen);
                            mplr.start();
                            break;
                        case 15:
                            sorNumView.setText("১৪");
                            sorNumTextView.setText("চৌদ্দ");
                            indicator=14;
                            mplr = MediaPlayer.create(this,R.raw.ban_fourteen);
                            mplr.start();
                            break;
                        case 14:
                            sorNumView.setText("১৩");
                            sorNumTextView.setText("তের");
                            indicator=13;
                            mplr = MediaPlayer.create(this,R.raw.ban_thirteen);
                            mplr.start();
                            break;
                        case 13:
                            sorNumView.setText("১২");
                            sorNumTextView.setText("বার");
                            indicator=12;
                            mplr = MediaPlayer.create(this,R.raw.ban_twelve);
                            mplr.start();
                            break;
                        case 12:
                            sorNumView.setText("১১");
                            sorNumTextView.setText("এগারো");
                            indicator=11;
                            mplr = MediaPlayer.create(this,R.raw.ban_eleven);
                            mplr.start();
                            break;
                        case 11:
                            sorNumView.setText("১০");
                            sorNumTextView.setText("দশ");
                            indicator=10;
                            mplr = MediaPlayer.create(this,R.raw.ban_ten);
                            mplr.start();
                            break;
                        case 10:
                            sorNumView.setText("৯");
                            sorNumTextView.setText("নয়");
                            indicator=9;
                            mplr = MediaPlayer.create(this,R.raw.ban_nine);
                            mplr.start();
                            break;
                        case 9:
                            sorNumView.setText("৮");
                            sorNumTextView.setText("আট");
                            indicator=8;
                            mplr = MediaPlayer.create(this,R.raw.ban_eight);
                            mplr.start();
                            break;
                        case 8:
                            sorNumView.setText("৭");
                            sorNumTextView.setText("সাত");
                            indicator=7;
                            mplr = MediaPlayer.create(this,R.raw.ban_seven);
                            mplr.start();
                            break;
                        case 7:
                            sorNumView.setText("৬");
                            sorNumTextView.setText("ছয়");
                            indicator=6;
                            mplr = MediaPlayer.create(this,R.raw.ban_six);
                            mplr.start();
                            break;
                        case 6:
                            sorNumView.setText("৫");
                            sorNumTextView.setText("পাঁচ");
                            indicator=5;
                            mplr = MediaPlayer.create(this,R.raw.ban_five);
                            mplr.start();
                            break;
                        case 5:
                            sorNumView.setText("৪");
                            sorNumTextView.setText("চার");
                            indicator=4;
                            mplr = MediaPlayer.create(this,R.raw.ban_four);
                            mplr.start();
                            break;
                        case 4:
                            sorNumView.setText("৩");
                            sorNumTextView.setText("তিন");
                            indicator=3;
                            mplr = MediaPlayer.create(this,R.raw.ban_three);
                            mplr.start();
                            break;
                        case 3:
                            sorNumView.setText("২");
                            sorNumTextView.setText("দুই");
                            indicator=2;
                            mplr = MediaPlayer.create(this,R.raw.ban_two);
                            mplr.start();
                            break;
                        case 2:
                            sorNumView.setText("১");
                            sorNumTextView.setText("এক");
                            indicator=1;
                            mplr = MediaPlayer.create(this,R.raw.ban_one);
                            mplr.start();
                            break;
                        case 1:
                            sorNumView.setText("০");
                            sorNumTextView.setText("শূন্য");
                            indicator=0;
                            break;
                    }
                }
                break;
            case R.id.sorNxtBtn:
                if(indicator==1000)
                    Toast.makeText(getApplicationContext(),"This is the last one!",Toast.LENGTH_SHORT).show();
                else {
                    switch (indicator) {
                        case 0:
                            sorNumView.setText("১");
                            sorNumTextView.setText("এক");
                            indicator=1;
                            mplr = MediaPlayer.create(this,R.raw.ban_one);
                            mplr.start();
                            break;
                        case 1:
                            sorNumView.setText("২");
                            sorNumTextView.setText("দুই");
                            indicator=2;
                            mplr = MediaPlayer.create(this,R.raw.ban_two);
                            mplr.start();
                            break;
                        case 2:
                            sorNumView.setText("৩");
                            sorNumTextView.setText("তিন");
                            indicator=3;
                            mplr = MediaPlayer.create(this,R.raw.ban_three);
                            mplr.start();
                            break;
                        case 3:
                            sorNumView.setText("৪");
                            sorNumTextView.setText("চার");
                            indicator=4;
                            mplr = MediaPlayer.create(this,R.raw.ban_four);
                            mplr.start();
                            break;
                        case 4:
                            sorNumView.setText("৫");
                            sorNumTextView.setText("পাঁচ");
                            indicator=5;
                            mplr = MediaPlayer.create(this,R.raw.ban_five);
                            mplr.start();
                            break;
                        case 5:
                            sorNumView.setText("৬");
                            sorNumTextView.setText("ছয়");
                            indicator=6;
                            mplr = MediaPlayer.create(this,R.raw.ban_six);
                            mplr.start();
                            break;
                        case 6:
                            sorNumView.setText("৭");
                            sorNumTextView.setText("সাত");
                            indicator=7;
                            mplr = MediaPlayer.create(this,R.raw.ban_seven);
                            mplr.start();
                            break;
                        case 7:
                            sorNumView.setText("৮");
                            sorNumTextView.setText("আট");
                            indicator=8;
                            mplr = MediaPlayer.create(this,R.raw.ban_eight);
                            mplr.start();
                            break;
                        case 8:
                            sorNumView.setText("৯");
                            sorNumTextView.setText("নয়");
                            indicator=9;
                            mplr = MediaPlayer.create(this,R.raw.ban_nine);
                            mplr.start();
                            break;
                        case 9:
                            sorNumView.setText("১০");
                            sorNumTextView.setText("দশ");
                            indicator=10;
                            mplr = MediaPlayer.create(this,R.raw.ban_ten);
                            mplr.start();
                            break;
                        case 10:
                            sorNumView.setText("১১");
                            sorNumTextView.setText("এগারো");
                            indicator=11;
                            mplr = MediaPlayer.create(this,R.raw.ban_eleven);
                            mplr.start();
                            break;
                        case 11:
                            sorNumView.setText("১২");
                            sorNumTextView.setText("বারো");
                            indicator=12;
                            mplr = MediaPlayer.create(this,R.raw.ban_twelve);
                            mplr.start();
                            break;
                        case 12:
                            sorNumView.setText("১৩");
                            sorNumTextView.setText("তেরো");
                            indicator=13;
                            mplr = MediaPlayer.create(this,R.raw.ban_thirteen);
                            mplr.start();
                            break;
                        case 13:
                            sorNumView.setText("১৪");
                            sorNumTextView.setText("চোদ্দ");
                            indicator=14;
                            mplr = MediaPlayer.create(this,R.raw.ban_fourteen);
                            mplr.start();
                            break;
                        case 14:
                            sorNumView.setText("১৫");
                            sorNumTextView.setText("পনেরো");
                            indicator=15;
                            mplr = MediaPlayer.create(this,R.raw.ban_fifteen);
                            mplr.start();
                            break;
                        case 15:
                            sorNumView.setText("১৬");
                            sorNumTextView.setText("ষোল");
                            indicator=16;
                            mplr = MediaPlayer.create(this,R.raw.ban_sixteen);
                            mplr.start();
                            break;
                        case 16:
                            sorNumView.setText("১৭");
                            sorNumTextView.setText("সতেরো");
                            indicator=17;
                            mplr = MediaPlayer.create(this,R.raw.ban_seventeen);
                            mplr.start();
                            break;
                        case 17:
                            sorNumView.setText("১৮");
                            sorNumTextView.setText("আঠারো");
                            indicator=18;
                            mplr = MediaPlayer.create(this,R.raw.ban_eighteen);
                            mplr.start();
                            break;
                        case 18:
                            sorNumView.setText("১৯");
                            sorNumTextView.setText("উনিশ");
                            indicator=19;
                            mplr = MediaPlayer.create(this,R.raw.ban_nineteen);
                            mplr.start();
                            break;
                        case 19:
                            sorNumView.setText("২০");
                            sorNumTextView.setText("কুড়ি/বিশ");
                            indicator=20;
                            mplr = MediaPlayer.create(this,R.raw.ban_twenty);
                            mplr.start();
                            break;
                        case 20:
                            sorNumView.setText("২২");
                            sorNumTextView.setText("বাইশ");
                            indicator=22;
                            mplr = MediaPlayer.create(this,R.raw.ban_twenty_two);
                            mplr.start();
                            break;
                        case 22:
                            sorNumView.setText("৩৩");
                            sorNumTextView.setText("তেত্রিশ");
                            indicator=33;
                            mplr = MediaPlayer.create(this,R.raw.ban_thirty_three);
                            mplr.start();
                            break;
                        case 33:
                            sorNumView.setText("৪৪");
                            sorNumTextView.setText("চুয়াল্লিশ");
                            indicator=44;
                            mplr = MediaPlayer.create(this,R.raw.ban_fourty_four);
                            mplr.start();
                            break;
                        case 44:
                            sorNumView.setText("৫৫");
                            sorNumTextView.setText("পঞ্চান্ন");
                            indicator=55;
                            mplr = MediaPlayer.create(this,R.raw.ban_fifty_five);
                            mplr.start();
                            break;
                        case 55:
                            sorNumView.setText("৬৬");
                            sorNumTextView.setText("ছেষট্টি");
                            indicator=66;
                            mplr = MediaPlayer.create(this,R.raw.ban_sixty_six);
                            mplr.start();
                            break;
                        case 66:
                            sorNumView.setText("৭৭");
                            sorNumTextView.setText("সাতাত্তর");
                            indicator=77;
                            mplr = MediaPlayer.create(this,R.raw.ban_seventy_seven);
                            mplr.start();
                            break;
                        case 77:
                            sorNumView.setText("৮৮");
                            sorNumTextView.setText("অষ্টআশি");
                            indicator=88;
                            mplr = MediaPlayer.create(this,R.raw.ban_eighty_eight);
                            mplr.start();
                            break;
                        case 88:
                            sorNumView.setText("৯৯");
                            sorNumTextView.setText("নিরানব্বই");
                            indicator=99;
                            mplr = MediaPlayer.create(this,R.raw.ban_ninety_nine);
                            mplr.start();
                            break;
                        case 99:
                            sorNumView.setText("১০০");
                            sorNumTextView.setText("একশ");
                            indicator=100;
                            mplr = MediaPlayer.create(this,R.raw.ban_one_hundred);
                            mplr.start();
                            break;
                        case 100:
                            sorNumView.setText("১০০০");
                            sorNumTextView.setText("এক হাজার");
                            indicator=1000;
                            break;
                    }
                }
                break;
        }
    }
    public void sorPlayAudio1(View view) {
        mplr.start();
    }
    public void sorPlayAudio2(View view) {
        mplr.start();
    }
}
