package org.design_patterns.composite;

import org.design_patterns.composite.component.Box;
import org.design_patterns.composite.composite.CompositeBox;


public class DeliveryService {
    private Box box;

    public DeliveryService() {}

    public void setupOrder(Box... boxes) {
        this.box = new CompositeBox(boxes);
    }

    public double calculateOrderPrice() {
        return box.calculatePrice();
    }
}
