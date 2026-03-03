package org.design_patterns.bridge.abstraction;

import org.design_patterns.bridge.implementation.Color;

public class Circle extends Form{
    public Circle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Circle "+color.apply());
    }
}
