package com.thoughtworks.movierental;

import java.util.List;

class TextStatement {

    private final String customerName;
    private final List<Rental> rentals;
    private final double totalAmount;
    private final int totalFrequentRenterPoints;

    public TextStatement(String customerName, List<Rental> rentals, double totalAmount, int totalFrequentRenterPoints) {
        this.customerName = customerName;
        this.rentals = rentals;
        this.totalAmount = totalAmount;
        this.totalFrequentRenterPoints = totalFrequentRenterPoints;
    }

    public String text() {
        String result = "Rental Record for " + customerName + "\n";
        for (Rental rental : rentals) {
            //show figures for this rental
            result += "\t" + rental.getMovie().getTitle() + "\t" +
                    rental.amount() + "\n";
        }
        //add footer lines result
        result += "Amount owed is " + totalAmount + "\n";
        result += "You earned " + totalFrequentRenterPoints
                + " frequent renter points";
        return result;
    }
}
