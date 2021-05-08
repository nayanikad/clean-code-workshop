package com.thoughtworks.movierental;

public class InvalidMovieType implements MovieType {
    private int priceCode;

    public InvalidMovieType(int priceCode) {

        this.priceCode = priceCode;
    }

    @Override
    public double amountFor(int daysRented) {
        return 0;
    }

    @Override
    public int frequentRenterPointsFor(int daysRented) {
        return 1;
    }

    @Override
    public int priceCode() {
        return priceCode;
    }
}
