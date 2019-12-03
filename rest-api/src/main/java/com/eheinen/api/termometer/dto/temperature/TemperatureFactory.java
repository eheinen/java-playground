package com.eheinen.api.termometer.dto.temperature;

public class TemperatureFactory {

    public AbstractTemperatureDto getTemperature(String unit) {
        if (unit == null || unit.isEmpty()) {
            throw new IllegalStateException("Temperature unit must not be null or empty");
        }

        switch (unit.toUpperCase()) {
            case "CELSIUS":
                return new CelsiusTemperature();
            case "FAHRENHEIT":
                return new FahrenheitTemperature();
            case "KELVIN":
                return new KelvinTemperature();
            default:
                throw new IllegalStateException("Temperature unit not recognized");
        }
    }

}
