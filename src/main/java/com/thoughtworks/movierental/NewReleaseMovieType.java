package com.thoughtworks.movierental;

public class NewReleaseMovieType implements MovieType{
    public double amountFor(int daysRented) {
        double amount;
        amount = daysRented * 3;
        return amount;
    }

    @Override
    public int frequentRenterPointsFor(int daysRented) {
        return daysRented > 1 ? 2 : 1;
    }
}
