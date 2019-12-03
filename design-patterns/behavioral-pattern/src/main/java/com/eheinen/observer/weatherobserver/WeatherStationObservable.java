package com.eheinen.decorator.weatherobserver;

public interface WeatherStationObservable {

    void add(AgencyObserver observer);

    void remove(AgencyObserver observer);

    void notify(float temperature, float humidity);

}
