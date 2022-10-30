package com.guy.class23a_and_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

public class MainActivity extends AppCompatActivity {

    private MaterialTextView main_LBL_score;
    private MaterialButton main_BTN_yes;
    private MaterialButton main_BTN_no;

    private int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_LBL_score = findViewById(R.id.main_LBL_score);
        main_BTN_yes = findViewById(R.id.main_BTN_yes);
        main_BTN_no = findViewById(R.id.main_BTN_no);

        main_LBL_score.setText("1000");

        main_BTN_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                increase();
            }
        });

        main_BTN_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decrease();
            }
        });
    }

    private void decrease() {
        score -= 10;
        main_LBL_score.setText("" + score);
    }

    private void increase() {
        score += 10;
        main_LBL_score.setText("" + score);
    }
}