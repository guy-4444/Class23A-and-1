package com.guy.class23a_and_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

public class Activity_Game extends AppCompatActivity {

    private MaterialTextView game_LBL_score;
    private MaterialTextView game_LBL_name;
    private ShapeableImageView game_IMG_flag;
    private MaterialButton game_BTN_yes;
    private MaterialButton game_BTN_no;
    private ShapeableImageView[] game_IMG_hearts;


    GameManager gameManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        findViews();
        initViews();
        gameManager = new GameManager(game_IMG_hearts.length);
        refreshUI();
    }

    private void clicked(boolean answer) {
        gameManager.checkAnswer(answer);
        refreshUI();
    }

    private void refreshUI() {
        if (gameManager.isLose()) {
            openScorePage("Game Over", gameManager.getScore());
        } else if (gameManager.isEndGame()) {
            openScorePage("Winner", gameManager.getScore());
        } else {
            game_IMG_flag.setImageResource(gameManager.getCurrentFlag());
            game_LBL_name.setText(gameManager.getCurrentName());

            game_LBL_score.setText("" + gameManager.getScore());

            for (int i = 0; i < gameManager.getWrong(); i++) {
                game_IMG_hearts[i].setVisibility(View.INVISIBLE);
            }
        }
    }

    private void openScorePage(String status, int score) {
        Intent intent = new Intent(this, Activity_Score.class);
        intent.putExtra(Activity_Score.KEY_STATUS,status);
        intent.putExtra(Activity_Score.KEY_SCORE,score);
        startActivity(intent);
        finish();
    }

    private void findViews() {
        game_LBL_score = findViewById(R.id.game_LBL_score);
        game_LBL_name = findViewById(R.id.game_LBL_name);
        game_IMG_flag = findViewById(R.id.game_IMG_flag);
        game_BTN_yes = findViewById(R.id.game_BTN_yes);
        game_BTN_no = findViewById(R.id.game_BTN_no);

        game_IMG_hearts = new ShapeableImageView[]{
                findViewById(R.id.game_IMG_heart4),
                findViewById(R.id.game_IMG_heart3),
                findViewById(R.id.game_IMG_heart2),
                findViewById(R.id.game_IMG_heart1),
        };
    }

    private void initViews() {
        game_BTN_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked(true);
            }
        });

        game_BTN_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked(false);
            }
        });
    }

}