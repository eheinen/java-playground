package com.designpatterns.gadgets;

public class Suit implements Gadget {

    @Override
    public Gadget addGadget() {
        return this;
    }

    @Override
    public void showGadget() {
        System.out.println("Iron man suit...");
    }
}
