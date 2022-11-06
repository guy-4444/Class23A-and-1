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

    public Country setImageRes(int imageRes) {
        this.imageRes = imageRes;
        return this;
    }

    public Country setName(String name) {
        this.name = name;
        return this;
    }

    public Country setNato(boolean nato) {
        this.nato = nato;
        return this;
    }

    public Country setScore(int score) {
        this.score = score;
        return this;
    }

    public int getImageRes() {
        return imageRes;
    }

    public String getName() {
        return name;
    }

    public boolean isNato() {
        return nato;
    }

    public int getScore() {
        return score;
    }
}
