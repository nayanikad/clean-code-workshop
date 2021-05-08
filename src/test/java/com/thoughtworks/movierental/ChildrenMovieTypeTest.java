package com.thoughtworks.movierental;

import org.junit.Assert;
import org.junit.Test;

public class ChildrenMovieTypeTest {
    @Test
    public void shouldReturnAmount() {
        double actualAmount = new ChildrenMovieType().amountFor(2);

        Assert.assertEquals(1.5, actualAmount, 0.0);
    }
}