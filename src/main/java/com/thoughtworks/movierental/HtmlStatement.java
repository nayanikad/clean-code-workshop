package com.thoughtworks.movierental;

import java.util.List;

class HtmlStatement {

    private final String customerName;
    private final List<Rental> rentals;
    private final double totalAmount;
    private final int totalFrequentRenterPoints;

    public HtmlStatement(String customerName, List<Rental> rentals, double totalAmount, int totalFrequentRenterPoints) {
        this.customerName = customerName;
        this.rentals = rentals;
        this.totalAmount = totalAmount;
        this.totalFrequentRenterPoints = totalFrequentRenterPoints;
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
        result += "<p>Amount owed is <b>" + totalAmount + "</b></p>";
        result += "<p>You earned <b>" + totalFrequentRenterPoints
                + "</b> frequent renter points</p>";
        return result;
    }
}
