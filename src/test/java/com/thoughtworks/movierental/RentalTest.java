package com.thoughtworks.movierental;

import org.junit.Assert;
import org.junit.Test;

public class RentalTest {
    @Test
    public void shouldReturnAmountForChildrenMovie() {
        Rental rental = new Rental(new Movie("Harry Potter", Movie.CHILDRENS), 2);

        double actualAmount = rental.amount();

        Assert.assertEquals(1.5, actualAmount, 0.0);
    }

    @Test
    public void shouldReturnAmountForRegularMovie() {
        Rental rental = new Rental(new Movie("Home Alone", Movie.REGULAR), 3);

        double actualAmount = rental.amount();

        Assert.assertEquals(3.5, actualAmount, 0.0);
    }

    @Test
    public void shouldReturnAmountForNewReleaseMovie() {
        Rental rental = new Rental(new Movie("Home Alone", Movie.NEW_RELEASE), 4);

        double actualAmount = rental.amount();

        Assert.assertEquals(12.0, actualAmount, 0.0);
    }

    @Test
    public void shouldReturnAmountForAnyOtherMovie() {
        Rental rental = new Rental(new Movie("Home Alone", 7), 4);

        double actualAmount = rental.amount();

        Assert.assertEquals(0.0, actualAmount, 0.0);
    }

    @Test
    public void shouldReturnFrequentRenterPointsForChildrenMovie() {
        Rental rental = new Rental(new Movie("Harry Potter", Movie.CHILDRENS), 2);

        int frequentRenterPoints = rental.frequentRenterPoints();

        Assert.assertEquals(1, frequentRenterPoints);
    }

    @Test
    public void shouldReturnFrequentRenterPointsForRegularMovie() {
        Rental rental = new Rental(new Movie("Harry Potter", Movie.REGULAR), 2);

        int frequentRenterPoints = rental.frequentRenterPoints();

        Assert.assertEquals(1, frequentRenterPoints);
    }

    @Test
    public void shouldReturnFrequentRenterPointsForNewReleaseMovie() {
        Rental rental = new Rental(new Movie("Harry Potter", Movie.NEW_RELEASE), 3);

        int frequentRenterPoints = rental.frequentRenterPoints();

        Assert.assertEquals(2, frequentRenterPoints);
    }

    @Test
    public void shouldReturnFrequentRenterPointsForAnyOtherMovie() {
        Rental rental = new Rental(new Movie("Harry Potter", 7), 3);

        int frequentRenterPoints = rental.frequentRenterPoints();

        Assert.assertEquals(1, frequentRenterPoints);
    }
}