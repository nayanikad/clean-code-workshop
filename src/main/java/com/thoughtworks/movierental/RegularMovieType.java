package com.thoughtworks.movierental;

public class RegularMovieType implements MovieType {
    @Override
    public double amountFor(int daysRented) {
        double amount;
        amount = 2;
        if (daysRented > 2)
            amount += (daysRented - 2) * 1.5;
        return amount;
    }
}
