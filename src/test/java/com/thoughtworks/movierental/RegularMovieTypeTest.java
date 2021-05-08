package com.thoughtworks.movierental;

import org.junit.Assert;
import org.junit.Test;

public class RegularMovieTypeTest {
    @Test
    public void shouldReturnAmount() {
        double actualAmount = new RegularMovieType(Movie.REGULAR).amountFor(2);

        Assert.assertEquals(2.0, actualAmount, 0.0);
    }

    @Test
    public void shouldReturnFrequentRenterPoints() {
        int actualFrequentRenterPoints = new RegularMovieType(Movie.REGULAR).frequentRenterPointsFor(2);

        Assert.assertEquals(1, actualFrequentRenterPoints);
    }
}