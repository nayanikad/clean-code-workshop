package com.thoughtworks.movierental;

public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    public static final int BLU_RAY = 3;

    private String title;
    MovieType movieType;

    public Movie(String title, MovieType movieType) {
        this.title = title;
        this.movieType = movieType;
    }

    public Movie(String title, int priceCode) {
        this(title, movieTypeFrom(priceCode));
    }

    public int getPriceCode() {
        return movieType.priceCode();
    }

    public void setPriceCode(int arg) {
        movieType = movieTypeFrom(arg);
    }

    public String getTitle() {
        return title;
    }

    double amountFor(int daysRented) {
        return movieType.amountFor(daysRented);
    }

    private static MovieType movieTypeFrom(int priceCode) {
        MovieType movieType;
        switch (priceCode) {
            case REGULAR:
                movieType = new RegularMovieType(Movie.CHILDRENS);
                break;
            case NEW_RELEASE:
                movieType = new NewReleaseMovieType(Movie.NEW_RELEASE);
                break;
            case CHILDRENS:
                movieType = new ChildrenMovieType(Movie.CHILDRENS);
                break;
            case BLU_RAY:
                movieType = new BluRayMovieType(Movie.BLU_RAY);
                break;
            default:
                movieType = new InvalidMovieType(priceCode);
                break;
        }
        return movieType;
    }

    int frequentRenterPointsFor(int daysRented) {
        return movieType.frequentRenterPointsFor(daysRented);
    }
}