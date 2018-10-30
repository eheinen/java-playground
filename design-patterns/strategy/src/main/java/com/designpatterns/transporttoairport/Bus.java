package com.designpatterns.transporttoairport;

public class Bus implements Transport {

    private int amountPeople;

    @Override
    public void amountPeople(int amountPeople) {
        this.amountPeople = amountPeople;
    }

    @Override
    public int showAmountPeople() {
        return amountPeople;
    }
}
