package com.thoughtworks.movierental;

public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String title;
    private int priceCode;

    public Movie(String title, int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }

    public int getPriceCode() {
        return priceCode;
    }

    public void setPriceCode(int arg) {
        priceCode = arg;
    }

    public String getTitle() {
        return title;
    }

    double amountFor(int daysRented) {
        double amount = 0;
        switch (priceCode) {
            case REGULAR:
                return regularMovieAmountFor(daysRented);
            case NEW_RELEASE:
                return newReleaseMovieAmountFor(daysRented);
            case CHILDRENS:
                return childrenMovieAmountFor(daysRented);
        }
        return amount;
    }

    private double childrenMovieAmountFor(int daysRented) {
        double amount;
        amount = 1.5;
        if (daysRented > 3)
            amount += (daysRented - 3) * 1.5;
        return amount;
    }

    private double newReleaseMovieAmountFor(int daysRented) {
        double amount;
        amount = daysRented * 3;
        return amount;
    }

    private double regularMovieAmountFor(int daysRented) {
        double amount;
        amount = 2;
        if (daysRented > 2)
            amount += (daysRented - 2) * 1.5;
        return amount;
    }

    int frequentRenterPointsFor(int daysRented) {
        int frequentRenterPoints = 0;
        frequentRenterPoints++;
        // add bonus for a two day new release rental
        if ((priceCode == NEW_RELEASE)
                &&
                daysRented > 1) frequentRenterPoints++;
        return frequentRenterPoints;
    }
}