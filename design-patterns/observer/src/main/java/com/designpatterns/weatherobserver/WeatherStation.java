package com.designpatterns.weatherobserver;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements WeatherStationObservable {

    private float temperature;
    private float humidity;

    private List<AgencyObserver> observers = new ArrayList<>();

    @Override
    public void add(AgencyObserver observer) {
        observers.add(observer);
    }

    @Override
    public void remove(AgencyObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notify(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;

        for (AgencyObserver observer : observers) {
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
