package org.design_patterns.composite.leaf;

public class VideoGame extends Product{
    public VideoGame(String title, double price) {
        super(title, price);
    }

    @Override
    public double calculatePrice() {
        return getPrice();
    }
}
