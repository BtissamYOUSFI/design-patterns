package org.design_patterns.bridge.abstraction;

import org.design_patterns.bridge.implementation.Color;
// Elle contient une référence vers la Couleur → c'est le "bridge"
public abstract class Form {
    protected Color color;
    public Form(Color color) {
        this.color = color;
    }

    public abstract void draw();
}
