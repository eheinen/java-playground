package com.eheinen.strategy.transporttoairport;

public class TransportContext implements Transport {

    protected int amountPeople;

    private Transport transport;

    public void setTransportStrategy(Transport transport) {
        this.transport = transport;
    }

    @Override
    public void amountPeople(int amountPeople) {
        transport.amountPeople(amountPeople);
    }

    @Override
    public int showAmountPeople() {
        return transport.showAmountPeople();
    }
}
