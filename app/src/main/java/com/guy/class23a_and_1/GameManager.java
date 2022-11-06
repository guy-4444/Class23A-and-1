package com.guy.class23a_and_1;

import android.view.View;

import java.util.ArrayList;

public class GameManager {

    private int score = 0;
    private int index = 0;
    private int wrong = 0;
    private int life;


    private ArrayList<Country> countries;

    public GameManager(int life) {
        this.life = life;
        countries = DataManager.getCountries();
    }

    public int getScore() {
        return score;
    }

    public int getWrong() {
        return wrong;
    }

    private Country current() {
        return countries.get(index);
    }

    public void checkAnswer(boolean answer) {
        if (current().isNato() == answer) {
            score += current().getScore();
        } else {
            wrong++;
        }

        // next country
        index++;
    }

    public boolean isEndGame() {
        return index == countries.size();
    }

    public boolean isLose() {
        return wrong == life;
    }

    public int getCurrentFlag() {
        return current().getImageRes();
    }

    public String getCurrentName() {
        return current().getName();
    }
}
