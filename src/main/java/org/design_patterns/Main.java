package org.design_patterns;

import org.design_patterns.bridge.abstraction.Circle;
import org.design_patterns.bridge.abstraction.Form;
import org.design_patterns.bridge.abstraction.Square;
import org.design_patterns.bridge.implementation.Blue;
import org.design_patterns.bridge.implementation.Red;
import org.design_patterns.composite.DeliveryService;
import org.design_patterns.composite.composite.CompositeBox;
import org.design_patterns.composite.leaf.Book;
import org.design_patterns.composite.leaf.VideoGame;



public class Main {

    public static void bridge() {
        Form c1= new Circle(new Red());
        Form c2= new Circle(new Blue());
        Form c3= new Square(new Red());

        c1.draw();
        c2.draw();
        c3.draw();
    }

    public static void composite() {
        DeliveryService ds = new DeliveryService();
        ds.setupOrder(
                new CompositeBox(
                        new VideoGame("1",100)
                ),
                new CompositeBox(
                        new CompositeBox(
                                new Book("2", 200),
                                new Book("3", 300)
                        ) ,
                        new VideoGame("4", 400),
                        new VideoGame("5", 500)
                )

        );
        System.out.println(ds.calculateOrderPrice());
    }

    public static void main(String[] args) {
//        bridge();
        composite();
    }
}