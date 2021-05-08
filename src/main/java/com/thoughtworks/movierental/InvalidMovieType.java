package com.thoughtworks.movierental;

public class InvalidMovieType implements MovieType {
    @Override
    public double amountFor(int daysRented) {
        return 0;
    }

    @Override
    public int frequentRenterPointsFor(int daysRented) {
        return 1;
    }
}
