package com.designpatterns.gadgets;

public class IronMan {

    Gadget gadget = new Suit();

    public void addGadget(String newGadget) {
        if (newGadget.equalsIgnoreCase("flight")) {
            this.gadget = new FlightGadget(gadget);
        } else {
            this.gadget = new ShoulderWeaponGadget(gadget);
        }
    }

    public void showGadgets() {
        System.out.println("IronMan Gadgets:");
        gadget.showGadget();
    }

}
