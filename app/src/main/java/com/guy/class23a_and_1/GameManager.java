package com.guy.class23a_and_1;

import android.view.View;

import java.util.ArrayList;

public class GameManager {

    private int[] scores = new int[]{
            10,
            20,
            10,
            10,
            10,
            10,
            10,
            20,
            20,
            10,
            20,
            10,
    };

    private String[] names = new String[]{
            "australia",
            "belarus",
            "china",
            "cuba",
            "european_union",
            "iraq",
            "israel",
            "new_zealand",
            "kazakhstan",
            "north_korea",
            "southkorea",
            "uk",
    };
    private int[] flags = new int[]{
            R.drawable.img_australia,
            R.drawable.img_belarus,
            R.drawable.img_china,
            R.drawable.img_cuba,
            R.drawable.img_european_union,
            R.drawable.img_iraq,
            R.drawable.img_israel,
            R.drawable.img_new_zealand,
            R.drawable.img_kazakhstan,
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
            true,
            false,
            false,
            true,
            true,
    };

    private int score = 0;
    private int index = 0;
    private int wrong = 0;
    private int life;


    private ArrayList<Country> countries;

    public GameManager(int life) {
        this.life = life;
        countries = new ArrayList<>();

        Country c1 = new Country();
        c1.setName("australia");
        c1.setImageRes(R.drawable.img_australia);
        c1.setNato(true);
        c1.setScore(10);
        countries.add(c1);
    }

    public int getScore() {
        return score;
    }

    public int getWrong() {
        return wrong;
    }

    public void checkAnswer(boolean answer) {
        if (answers[index] == answer) {
            score += scores[index];
        } else {
            wrong++;
        }

        // next country
        index++;
    }

    public boolean isEndGame() {
        return index == flags.length - 1;
    }

    public boolean isLose() {
        return wrong == life;
    }

    public int getCurrentFlag() {
        return flags[index];
    }
    public String getCurrentName() {
        return names[index];
    }
}
