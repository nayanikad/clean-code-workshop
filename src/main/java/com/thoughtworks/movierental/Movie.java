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
        MovieType movieType;
        switch (priceCode) {
            case REGULAR:
                movieType = new RegularMovieType();
                break;
            case NEW_RELEASE:
                movieType = new NewReleaseMovieType();
                break;
            case CHILDRENS:
                movieType = new ChildrenMovieType();
                break;
            default:
                movieType = new InvalidMovieType();
                break;
        }
        return movieType.amountFor(daysRented);
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