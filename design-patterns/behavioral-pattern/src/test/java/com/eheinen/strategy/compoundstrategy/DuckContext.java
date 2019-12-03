package com.eheinen.strategy.compoundstrategy;

public class DuckContext implements IQuackStrategy, IFlyStrategy {

    private IQuackStrategy iQuackStrategy;
    private IFlyStrategy iFlyStrategy;

    public DuckContext(IQuackStrategy iQuackStrategy, IFlyStrategy iFlyStrategy) {
        this.iQuackStrategy = iQuackStrategy;
        this.iFlyStrategy = iFlyStrategy;
    }

    public boolean fly() {
        return iFlyStrategy.fly();
    }

    public boolean quack() {
        return iQuackStrategy.quack();
    }
}
