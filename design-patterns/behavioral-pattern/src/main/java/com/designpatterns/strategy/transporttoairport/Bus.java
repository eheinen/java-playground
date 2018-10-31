package com.designpatterns.strategy.transporttoairport;

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
