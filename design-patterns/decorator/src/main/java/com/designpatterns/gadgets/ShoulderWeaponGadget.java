package com.designpatterns.gadgets;

public class ShoulderWeaponGadget extends GadgetDecorator {

    public ShoulderWeaponGadget(Gadget nextGadget) {
        super(nextGadget);
    }

    @Override
    public void showGadget() {
        super.showGadget();
        System.out.println(" Shoulder weapon gadget...");
    }
}
