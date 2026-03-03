package org.design_patterns.bridge.abstraction;

import org.design_patterns.bridge.implementation.Color;

public class Square extends Form{
    public Square(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Square "+color.apply());
    }
}
