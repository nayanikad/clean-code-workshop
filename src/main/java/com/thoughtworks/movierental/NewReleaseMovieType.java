package com.thoughtworks.movierental;

public class NewReleaseMovieType implements MovieType{
    public double amountFor(int daysRented) {
        double amount;
        amount = daysRented * 3;
        return amount;
    }
}
