package org.design_patterns;

import org.design_patterns.bridge.abstraction.Circle;
import org.design_patterns.bridge.abstraction.Form;
import org.design_patterns.bridge.abstraction.Square;
import org.design_patterns.bridge.implementation.Blue;
import org.design_patterns.bridge.implementation.Red;

public class Main {

    public static void bridge() {
        Form c1= new Circle(new Red());
        Form c2= new Circle(new Blue());
        Form c3= new Square(new Red());

        c1.draw();
        c2.draw();
        c3.draw();
    }

    public static void main(String[] args) {
        bridge();
    }
}