package com.eheinen.decorator.cars;

import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    public void assembleSportCar() {
        Car sportCar = new SportCar(new BasicCar());
        sportCar.assemble();
    }

    @Test
    public void assembleLuxuryCar() {
        Car luxuryCar = new LuxuryCar(new BasicCar());
        luxuryCar.assemble();
    }

}
