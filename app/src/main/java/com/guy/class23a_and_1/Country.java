package com.guy.class23a_and_1;

public class Country {

    private int imageRes;
    private String name;
    private boolean nato;
    private int score;

    public Country() {}

    public Country(int score) {
        this.score = score;
    }

    public int getImageRes() {
        return imageRes;
    }

    public void setImageRes(int imageRes) {
        this.imageRes = imageRes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isNato() {
        return nato;
    }

    public void setNato(boolean nato) {
        this.nato = nato;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
