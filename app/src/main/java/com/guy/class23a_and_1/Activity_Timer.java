package com.guy.class23a_and_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.textview.MaterialTextView;

public class Activity_Timer extends AppCompatActivity {

    private MaterialTextView timer_LBL_info;
    private ExtendedFloatingActionButton timer_FAB_play;
    private ExtendedFloatingActionButton timer_FAB_stop;

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




    final int DELAY = 1000;
    final Handler handler = new Handler();
    Runnable runnable = new Runnable() {
        public void run() {
            handler.postDelayed(this, DELAY);
            updateTimeUI();
        }
    };

    private void startTimer() {
        handler.postDelayed(runnable, DELAY);
    }

    private void stopTimer() {
        handler.removeCallbacks(runnable);
    }
}