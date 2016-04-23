package com.example.wansu.seekbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.Toast;

public class SeekbarActivity extends AppCompatActivity
{
    private SeekBar seek1, seek2, seek3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seekbar);

        seek1 = (SeekBar) findViewById(R.id.seekBar1);
        seek2 = (SeekBar) findViewById(R.id.seekBar2);
        seek3 = (SeekBar) findViewById(R.id.seekBar3);

        seek1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChanged = 0;

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progressChanged = progress;
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(SeekbarActivity.this, "Media Sound is:" + progressChanged,
                        Toast.LENGTH_SHORT).show();
            }
        });

        seek2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChanged = 0;

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progressChanged = progress;
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(SeekbarActivity.this, "Alarm Sound is:" + progressChanged,
                        Toast.LENGTH_SHORT).show();
            }
        });

        seek3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChanged = 0;

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser){
                progressChanged = progress;
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(SeekbarActivity.this,"Ringtone Sound is : "+progressChanged,
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

}