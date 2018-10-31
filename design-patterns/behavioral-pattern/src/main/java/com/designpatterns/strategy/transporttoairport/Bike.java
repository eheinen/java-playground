package com.designpatterns.strategy.transporttoairport;

public class Bike implements Transport {

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
