package com.eheinen.decorator.cars;

public class SportCar extends CarDecorator {

    public SportCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Added Turbo");
    }
}
