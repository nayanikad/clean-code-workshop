package com.thoughtworks.movierental;

public class Rental {

    private int daysRented;
    private Movie movie;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    double amount() {
        return movie.amountFor(this.daysRented);
    }

    int frequentRenterPoints() {
        int frequentRenterPoints = 0;
        frequentRenterPoints++;
        // add bonus for a two day new release rental
        if ((movie.getPriceCode() == Movie.NEW_RELEASE)
                &&
                daysRented > 1) frequentRenterPoints++;
        return frequentRenterPoints;
    }
}