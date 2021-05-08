package com.thoughtworks.movierental;

import org.junit.Assert;
import org.junit.Test;

public class CustomerTest {
    @Test
    public void shouldGenerateTextStatement() {
        Customer customer = new Customer("Lilima");
        customer.addRental(new Rental(new Movie("Iron Man", Movie.REGULAR), 4));
        customer.addRental(new Rental(new Movie("Frozen", Movie.CHILDRENS), 4));
        customer.addRental(new Rental(new Movie("Black Widow", Movie.NEW_RELEASE), 4));

        String statement = customer.statement();

        Assert.assertEquals("Rental Record for Lilima\n" +
                "\tIron Man\t5.0\n" +
                "\tFrozen\t3.0\n" +
                "\tBlack Widow\t12.0\n" +
                "Amount owed is 20.0\n" +
                "You earned 4 frequent renter points", statement);
    }


    @Test
    public void shouldGenerateHtmlStatement() {
        Customer customer = new Customer("Lilima");
        customer.addRental(new Rental(new Movie("Iron Man", Movie.REGULAR), 4));
        customer.addRental(new Rental(new Movie("Frozen", Movie.CHILDRENS), 4));
        customer.addRental(new Rental(new Movie("Black Widow", Movie.NEW_RELEASE), 4));

        String statement = customer.htmlStatement();

        Assert.assertEquals("<h3>Rental Record for Lilima</h3><br/>" +
                "<p>Iron Man: <b>5.0</b><br/>" +
                "Frozen: <b>3.0</b><br/>" +
                "Black Widow: <b>12.0</b><br/></p>" +
                "<p>Amount owed is <b>20.0</b></p>" +
                "<p>You earned <b>4</b> frequent renter points</p>", statement);
    }
}