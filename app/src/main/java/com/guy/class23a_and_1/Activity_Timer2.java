package com.guy.class23a_and_1;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.textview.MaterialTextView;

import java.util.Timer;
import java.util.TimerTask;

public class Activity_Timer2 extends AppCompatActivity {

    private MaterialTextView timer_LBL_info;
    private ExtendedFloatingActionButton timer_FAB_play;
    private ExtendedFloatingActionButton timer_FAB_stop;

    final int DELAY = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);

        timer_LBL_info = findViewById(R.id.timer_LBL_info);
        timer_FAB_play = findViewById(R.id.timer_FAB_play);
        timer_FAB_stop = findViewById(R.id.timer_FAB_stop);
        timer_FAB_play.setOnClickListener(v -> startTimer());
        timer_FAB_stop.setOnClickListener(v -> stopTimer());
    }

    private void updateTimeUI() {
        timer_LBL_info.setText("" + System.currentTimeMillis());
    }

    private Timer timer = new Timer();

    private void startTimer() {
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                Log.d("pttt", "A: " + Thread.currentThread().getName() + " - " + System.currentTimeMillis());
                runOnUiThread(new Runnable() {
                    public void run() {
                        Log.d("pttt", "B: " + Thread.currentThread().getName() + " - " + System.currentTimeMillis());
                        updateTimeUI();
                    }
                });
            }
        }, DELAY, DELAY);
    }

    private void stopTimer() {
        timer.cancel();
    }



}