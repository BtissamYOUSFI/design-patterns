package org.design_patterns.bridge.abstraction;

import org.design_patterns.bridge.implementation.Color;

public abstract class Form {
    protected Color color;
    public Form(Color color) {
        this.color = color;
    }

    public abstract void draw();
}
