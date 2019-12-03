package com.eheinen.decorator.gadgets;

public class GadgetDecorator implements Gadget {

    protected Gadget nextGadget;

    public GadgetDecorator(Gadget nextGadget) {
        this.nextGadget = nextGadget;
    }

    @Override
    public Gadget addGadget() {
        return this;
    }

    @Override
    public void showGadget() {
        nextGadget.showGadget();
    }
}
