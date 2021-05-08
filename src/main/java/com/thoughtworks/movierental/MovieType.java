package com.thoughtworks.movierental;

public abstract class MovieType {
    protected int priceCode;

    public MovieType(int priceCode) {
        this.priceCode = priceCode;
    }

    public abstract double amountFor(int daysRented);
    public int frequentRenterPointsFor(int daysRented) {
        return 1;
    }

    public int priceCode() {
        return priceCode;
    }
}
