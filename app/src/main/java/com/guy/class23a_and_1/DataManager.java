package com.guy.class23a_and_1;

import java.util.ArrayList;

public class DataManager {

    public static ArrayList<Country> getCountries() {
        ArrayList<Country> countries = new ArrayList<>();

        countries.add(new Country()
                .setName("australia")
                .setImageRes(R.drawable.img_australia)
                .setNato(true)
                .setScore(10));

        countries.add(new Country()
                .setName("belarus")
                .setImageRes(R.drawable.img_belarus)
                .setNato(false)
                .setScore(20));

        countries.add(new Country()
                .setName("china")
                .setImageRes(R.drawable.img_china)
                .setNato(false)
                .setScore(10));

        if (true) {
            return countries;
        }

        countries.add(new Country()
                .setName("cuba")
                .setImageRes(R.drawable.img_cuba)
                .setNato(false)
                .setScore(10));

        countries.add(new Country()
                .setName("european_union")
                .setImageRes(R.drawable.img_european_union)
                .setNato(true)
                .setScore(10));

        countries.add(new Country()
                .setName("iraq")
                .setImageRes(R.drawable.img_iraq)
                .setNato(false)
                .setScore(10));

        countries.add(new Country()
                .setName("israel")
                .setImageRes(R.drawable.img_israel)
                .setNato(true)
                .setScore(10));

        countries.add(new Country()
                .setName("new_zealand")
                .setImageRes(R.drawable.img_new_zealand)
                .setNato(true)
                .setScore(20));

        countries.add(new Country()
                .setName("kazakhstan")
                .setImageRes(R.drawable.img_kazakhstan)
                .setNato(false)
                .setScore(20));

        countries.add(new Country()
                .setName("north_korea")
                .setImageRes(R.drawable.img_north_korea)
                .setNato(false)
                .setScore(10));

        countries.add(new Country()
                .setName("southkorea")
                .setImageRes(R.drawable.img_southkorea)
                .setNato(true)
                .setScore(20));

        countries.add(new Country()
                .setName("uk")
                .setImageRes(R.drawable.img_uk)
                .setNato(true)
                .setScore(10));


        return countries;
    }
}
