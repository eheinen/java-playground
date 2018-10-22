package com.designpatterns.simpleobserver;

public class AgencyStation implements IAgencyObserver {

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
