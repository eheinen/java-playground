package com.designpatterns.simpleobserver;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements IWeatherStationObservable {

    private float temperature;
    private float humidity;

    private List<IAgencyObserver> observers = new ArrayList<>();

    @Override
    public void add(IAgencyObserver observer) {
        observers.add(observer);
    }

    @Override
    public void remove(IAgencyObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notify(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;

        for (IAgencyObserver observer : observers) {
            observer.update();
        }
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }
}
