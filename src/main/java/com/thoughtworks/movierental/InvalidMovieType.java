package com.thoughtworks.movierental;

public class InvalidMovieType extends MovieType {

    public InvalidMovieType(int priceCode) {
        super(priceCode);
    }

    @Override
    public double amountFor(int daysRented) {
        return 0;
    }
}
