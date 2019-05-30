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
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
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
                        case 11:
                            sorNumView.setText("ঔ");
                            sorNumTextView.setText("ঔষধ");
                            indicator=10;
                            mplr = MediaPlayer.create(this,R.raw.ban_one_hundred);
                            mplr.start();
                            break;
                        case 10:
                            sorNumView.setText("ও");
                            sorNumTextView.setText("ওয়াদা");
                            indicator=9;
                            mplr = MediaPlayer.create(this,R.raw.ban_ninety_nine);
                            mplr.start();
                            break;
                        case 9:
                            sorNumView.setText("ঐ");
                            sorNumTextView.setText("ঐরাবত");
                            indicator=8;
                            mplr = MediaPlayer.create(this,R.raw.ban_eighty_eight);
                            mplr.start();
                            break;
                        case 8:
                            sorNumView.setText("এ");
                            sorNumTextView.setText("একতারা");
                            indicator=7;
                            mplr = MediaPlayer.create(this,R.raw.ban_seventy_seven);
                            mplr.start();
                            break;
                        case 7:
                            sorNumView.setText("ঋ");
                            sorNumTextView.setText("ঋষি");
                            indicator=6;
                            mplr = MediaPlayer.create(this,R.raw.ban_sixty_six);
                            mplr.start();
                            break;
                        case 6:
                            sorNumView.setText("ঊ");
                            sorNumTextView.setText("ঊষা");
                            indicator=5;
                            mplr = MediaPlayer.create(this,R.raw.ban_fifty_five);
                            mplr.start();
                            break;
                        case 5:
                            sorNumView.setText("উ");
                            sorNumTextView.setText("উত্তর");
                            indicator=4;
                            mplr = MediaPlayer.create(this,R.raw.ban_fourty_four);
                            mplr.start();
                            break;
                        case 4:
                            sorNumView.setText("ঈ");
                            sorNumTextView.setText("ঈদ");
                            indicator=3;
                            mplr = MediaPlayer.create(this,R.raw.ban_thirty_three);
                            mplr.start();
                        case 3:
                            sorNumView.setText("ই");
                            sorNumTextView.setText("ইঁদুর");
                            indicator=2;
                            mplr = MediaPlayer.create(this,R.raw.ban_twenty_two);
                            mplr.start();
                            break;
                        case 2:
                            sorNumView.setText("আ");
                            sorNumTextView.setText("আম");
                            indicator=1;
                            mplr = MediaPlayer.create(this,R.raw.ban_twenty);
                            mplr.start();
                            break;
                        case 1:
                            sorNumView.setText("অ");
                            sorNumTextView.setText("অজগর");
                            indicator=0;
                            mplr = MediaPlayer.create(this,R.raw.ban_nineteen);
                            mplr.start();
                            break;
                    }
                }
                break;
            case R.id.sorNxtBtn:
                if(indicator==11)
                    Toast.makeText(getApplicationContext(),"This is the last one!",Toast.LENGTH_SHORT).show();
                else {
                    switch (indicator) {
                        case 0:
                            sorNumView.setText("অ");
                            sorNumTextView.setText("অজগর");
                            indicator=1;
                            mplr = MediaPlayer.create(this,R.raw.ban_one);
                            mplr.start();
                            break;
                        case 1:
                            sorNumView.setText("আ");
                            sorNumTextView.setText("আম");
                            indicator=2;
                            mplr = MediaPlayer.create(this,R.raw.ban_two);
                            mplr.start();
                            break;
                        case 2:
                            sorNumView.setText("ই");
                            sorNumTextView.setText("ইঁদুর");
                            indicator=3;
                            mplr = MediaPlayer.create(this,R.raw.ban_three);
                            mplr.start();
                            break;
                        case 3:
                            sorNumView.setText("ঈ");
                            sorNumTextView.setText("ঈদ");
                            indicator=4;
                            mplr = MediaPlayer.create(this,R.raw.ban_four);
                            mplr.start();
                            break;
                        case 4:
                            sorNumView.setText("উ");
                            sorNumTextView.setText("উত্তর");
                            indicator=5;
                            mplr = MediaPlayer.create(this,R.raw.ban_five);
                            mplr.start();
                            break;
                        case 5:
                            sorNumView.setText("ঊ");
                            sorNumTextView.setText("ঊষা");
                            indicator=6;
                            mplr = MediaPlayer.create(this,R.raw.ban_six);
                            mplr.start();
                            break;
                        case 6:
                            sorNumView.setText("ঋ");
                            sorNumTextView.setText("ঋষি");
                            indicator=7;
                            mplr = MediaPlayer.create(this,R.raw.ban_seven);
                            mplr.start();
                            break;
                        case 7:
                            sorNumView.setText("এ");
                            sorNumTextView.setText("একতারা");
                            indicator=8;
                            mplr = MediaPlayer.create(this,R.raw.ban_eight);
                            mplr.start();
                            break;
                        case 8:
                            sorNumView.setText("ঐ");
                            sorNumTextView.setText("ঐরাবত");
                            indicator=9;
                            mplr = MediaPlayer.create(this,R.raw.ban_nine);
                            mplr.start();
                            break;
                        case 9:
                            sorNumView.setText("ও");
                            sorNumTextView.setText("ওয়াদা");
                            indicator=10;
                            mplr = MediaPlayer.create(this,R.raw.ban_ten);
                            mplr.start();
                            break;
                        case 10:
                            sorNumView.setText("ঔ");
                            sorNumTextView.setText("ঔষধ");
                            indicator=11;
                            mplr = MediaPlayer.create(this,R.raw.ban_eleven);
                            mplr.start();
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
