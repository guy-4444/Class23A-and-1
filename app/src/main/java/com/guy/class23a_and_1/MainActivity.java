package com.guy.class23a_and_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

public class MainActivity extends AppCompatActivity {

    private MaterialTextView main_LBL_score;
    private ShapeableImageView main_IMG_flag;
    private MaterialButton main_BTN_yes;
    private MaterialButton main_BTN_no;
    private ShapeableImageView main_IMG_heart1;
    private ShapeableImageView main_IMG_heart2;
    private ShapeableImageView main_IMG_heart3;

    private int[] flags = new int[]{
            R.drawable.img_australia,
            R.drawable.img_belarus,
            R.drawable.img_china,
            R.drawable.img_cuba,
            R.drawable.img_european_union,
            R.drawable.img_iraq,
            R.drawable.img_israel,
            R.drawable.img_kazakhstan,
            R.drawable.img_new_zealand,
            R.drawable.img_north_korea,
            R.drawable.img_southkorea,
            R.drawable.img_uk,
    };
    private boolean[] answers = new boolean[]{
            true,
            false,
            false,
            false,
            true,
            false,
            true,
            false,
            true,
            false,
            true,
            true,
    };
    private int score = 0;
    private int index = -1;
    private int wrong = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_LBL_score = findViewById(R.id.main_LBL_score);
        main_IMG_flag = findViewById(R.id.main_IMG_flag);
        main_BTN_yes = findViewById(R.id.main_BTN_yes);
        main_BTN_no = findViewById(R.id.main_BTN_no);
        main_IMG_heart1 = findViewById(R.id.main_IMG_heart1);
        main_IMG_heart2 = findViewById(R.id.main_IMG_heart2);
        main_IMG_heart3 = findViewById(R.id.main_IMG_heart3);


        next();
        main_LBL_score.setText("0");

        main_BTN_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked(true);
            }
        });

        main_BTN_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked(false);
            }
        });
    }

    private void clicked(boolean answer) {
        if (answers[index] == answer) {
            score += 10;
            main_LBL_score.setText("" + score);
        } else {
            wrong++;
            if (wrong == 1) {
                main_IMG_heart3.setVisibility(View.INVISIBLE);
            } else if (wrong == 2) {
                main_IMG_heart2.setVisibility(View.INVISIBLE);
            } else if (wrong == 3) {
                main_IMG_heart1.setVisibility(View.INVISIBLE);
            }
        }

        if (wrong == 3) {
            main_LBL_score.setText("Game Over: " + score);
        } else if (index == flags.length - 1) {
            main_LBL_score.setText("Winner:" + score);
        } else {
            next();
        }
    }

    private void next() {
        index++;
        main_IMG_flag.setImageResource(flags[index]);
    }

}