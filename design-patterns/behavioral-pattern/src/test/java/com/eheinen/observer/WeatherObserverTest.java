package com.eheinen.observer;

import com.eheinen.decorator.weatherobserver.AgencyStation;
import com.eheinen.decorator.weatherobserver.WeatherStation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeatherObserverTest {

    @Test
    public void assertCurrentTemperatureState() {
        WeatherStation weatherStation = new WeatherStation();
        AgencyStation agencyStation = new AgencyStation(weatherStation);
        weatherStation.add(agencyStation);

        assertEquals(agencyStation.getTemperature(), 0f);
    }

    @Test
    public void assertTemperatureStateChanged() {
        WeatherStation weatherStation = new WeatherStation();
        AgencyStation agencyStation = new AgencyStation(weatherStation);
        weatherStation.add(agencyStation);
        weatherStation.notify(22.5f, 0f);

        assertEquals(agencyStation.getTemperature(), 22.5f);
        assertEquals(agencyStation.getHumidity(), 0f);
    }

    @Test
    public void assertCurrentHumidityState() {
        WeatherStation weatherStation = new WeatherStation();
        AgencyStation agencyStation = new AgencyStation(weatherStation);
        weatherStation.add(agencyStation);

        assertEquals(agencyStation.getHumidity(), 0f);
    }

    @Test
    public void assertHumidityStateChanged() {
        WeatherStation weatherStation = new WeatherStation();
        AgencyStation agencyStation = new AgencyStation(weatherStation);
        weatherStation.add(agencyStation);
        weatherStation.notify(0f, 60f);

        assertEquals(agencyStation.getTemperature(), 0f);
        assertEquals(agencyStation.getHumidity(), 60f);
    }

}
