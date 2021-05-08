package com.thoughtworks.movierental;

import org.junit.Assert;
import org.junit.Test;

public class RegularMovieTypeTest {
    @Test
    public void shouldReturnAmount() {
        double actualAmount = new RegularMovieType().amountFor(2);

        Assert.assertEquals(2.0, actualAmount, 0.0);
    }
}