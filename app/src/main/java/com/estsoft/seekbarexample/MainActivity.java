package com.estsoft.seekbarexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.DatePicker;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView( R.layout.activity_main );

        SeekBar seekBar = (SeekBar)findViewById(R.id.seekBar);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Log.d("-------------------->", progress + " : " + fromUser);
                ((TextView)findViewById(R.id.textView)).setText("Current Volume : " + progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Log.d("-------------------->", "onStartTrackingTouch called");
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Log.d("-------------------->", "onStopTrackingTouch called");
            }
        });
    }
}
