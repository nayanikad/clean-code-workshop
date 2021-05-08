package com.thoughtworks.movierental;

public class RegularMovieType extends MovieType {
    public RegularMovieType(int priceCode) {
        super(priceCode);
    }

    @Override
    public double amountFor(int daysRented) {
        double amount;
        amount = 2;
        if (daysRented > 2)
            amount += (daysRented - 2) * 1.5;
        return amount;
    }
}
