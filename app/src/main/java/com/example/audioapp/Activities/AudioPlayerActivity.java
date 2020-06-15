package com.example.audioapp.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.audioapp.R;
import com.r0adkll.slidr.Slidr;
import com.r0adkll.slidr.model.SlidrInterface;


public class AudioPlayerActivity extends AppCompatActivity {

    SlidrInterface slidr ;

    private ImageButton pausebtn, playbtn;
    private static MediaPlayer mPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        slidr = Slidr.attach(this);

        playbtn = findViewById(R.id.btnPlay);
        pausebtn = findViewById(R.id.btnPause);
        mPlayer = MediaPlayer.create(this, R.raw.summer);

        if (!mPlayer.isPlaying()){
            mPlayer.start();
            pausebtn.setEnabled(true);

        }else{
            pausebtn.setEnabled(false);
        }


        playbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mPlayer.isPlaying()){
                mPlayer.start();
                pausebtn.setEnabled(true);
                playbtn.setEnabled(false);
            }}
        });
        pausebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mPlayer.isPlaying()) {
                    mPlayer.pause();
                    pausebtn.setEnabled(false);
                    playbtn.setEnabled(true);
                }
            }
        });

    }

    @Override
    protected void onPause() {
        super.onPause();
        mPlayer.stop();
    }
}
