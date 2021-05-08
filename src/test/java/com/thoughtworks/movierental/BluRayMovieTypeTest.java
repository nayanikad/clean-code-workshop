package com.thoughtworks.movierental;

import org.junit.Assert;
import org.junit.Test;

public class BluRayMovieTypeTest {
    @Test
    public void shouldReturnAmount() {
        double actualAmount = new BluRayMovieType(Movie.BLU_RAY).amountFor(2);

        Assert.assertEquals(8.0, actualAmount, 0.0);
    }

    @Test
    public void shouldReturnFrequentRenterPoints() {
        int actualFrequentRenterPoints = new BluRayMovieType(Movie.BLU_RAY).frequentRenterPointsFor(2);

        Assert.assertEquals(3, actualFrequentRenterPoints);
    }
}