package com.thoughtworks.movierental;

import java.util.List;

class HtmlStatement {

    private final String customerName;
    private final Rentals rentals;

    public HtmlStatement(String customerName, Rentals rentals) {
        this.customerName = customerName;
        this.rentals = rentals;
    }

    public String html() {
        String result = "<h3>Rental Record for " + customerName + "</h3><br/>";
        result += "<p>";

        for (Rental rental : rentals) {
            //show figures for this rental
            result += rental.getMovie().getTitle() + ": <b>" +
                    rental.amount() + "</b><br/>";
        }

        result += "</p>";
        //add footer lines result
        result += "<p>Amount owed is <b>" + rentals.totalAmount() + "</b></p>";
        result += "<p>You earned <b>" + rentals.totalFrequentRenterPoints()
                + "</b> frequent renter points</p>";
        return result;
    }
}
