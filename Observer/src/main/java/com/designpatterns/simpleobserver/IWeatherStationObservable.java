package com.designpatterns.simpleobserver;

public interface IWeatherStationObservable {

    void add(IAgencyObserver observer);

    void remove(IAgencyObserver observer);

    void notify(float temperature, float humidity);

}
