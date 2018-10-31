package com.designpatterns.decorator.weatherobserver;

public class AgencyStation implements AgencyObserver {

    private WeatherStation weatherStation;

    private float temperature;
    private float humidity;

    public AgencyStation(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    @Override
    public void update() {
        this.temperature = weatherStation.getTemperature();
        this.humidity = weatherStation.getHumidity();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }
}
