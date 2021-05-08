package com.thoughtworks.movierental;

public class BluRayMovieType extends MovieType {

    public BluRayMovieType(int priceCode) {
        super(priceCode);
    }

    @Override
    public double amountFor(int daysRented) {
        return daysRented * 4;
    }

    @Override
    public int frequentRenterPointsFor(int daysRented) {
        return 3;
    }

}
