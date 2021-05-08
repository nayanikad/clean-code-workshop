package com.thoughtworks.movierental;

public class ChildrenMovieType implements MovieType{
    public double amountFor(int daysRented) {
        double amount;
        amount = 1.5;
        if (daysRented > 3)
            amount += (daysRented - 3) * 1.5;
        return amount;
    }

    @Override
    public int frequentRenterPointsFor(int daysRented) {
        return 1;
    }
}
