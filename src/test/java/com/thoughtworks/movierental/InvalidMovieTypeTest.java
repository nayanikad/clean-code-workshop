package com.thoughtworks.movierental;

import org.junit.Assert;
import org.junit.Test;

public class InvalidMovieTypeTest {
    @Test
    public void shouldReturnAmount() {
        double actualAmount = new InvalidMovieType(8).amountFor(2);

        Assert.assertEquals(0.0, actualAmount, 0.0);
    }

    @Test
    public void shouldReturnFrequentRenterPoints() {
        int actualFrequentRenterPoints = new InvalidMovieType(8).frequentRenterPointsFor(2);

        Assert.assertEquals(1, actualFrequentRenterPoints);
    }
}