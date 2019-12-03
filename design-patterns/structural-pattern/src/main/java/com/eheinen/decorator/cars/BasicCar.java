package com.eheinen.decorator.cars;

public class BasicCar implements Car {

    @Override
    public void assemble() {
        System.out.println("Basic car assembled!");
    }

}
