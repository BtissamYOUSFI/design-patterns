package org.design_patterns.composite.leaf;

public class Book extends Product{
    public Book(String title, double price) {
        super(title, price);
    }

    @Override
    public double calculatePrice() {
        return getPrice();
    }
}
