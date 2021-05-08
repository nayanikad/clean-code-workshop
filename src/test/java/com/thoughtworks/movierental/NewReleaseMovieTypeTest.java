package com.thoughtworks.movierental;

import org.junit.Assert;
import org.junit.Test;

public class NewReleaseMovieTypeTest {
    @Test
    public void shouldReturnAmount() {
        double actualAmount = new NewReleaseMovieType().amountFor(2);

        Assert.assertEquals(6.0, actualAmount, 0.0);
    }

    @Test
    public void shouldReturnFrequentRenterPoints() {
        int actualFrequentRenterPoints = new NewReleaseMovieType().frequentRenterPointsFor(2);

        Assert.assertEquals(2, actualFrequentRenterPoints);
    }
}