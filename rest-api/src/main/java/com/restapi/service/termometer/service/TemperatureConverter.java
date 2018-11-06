package com.restapi.service.termometer.service;

import com.restapi.api.termometer.dto.temperature.TemperatureUnit;

import java.text.DecimalFormat;

public class TemperatureConverter {

    private static DecimalFormat roundTwoDecimals = new DecimalFormat("####0.00");

    public static double convert(TemperatureUnit from, TemperatureUnit to, double degree) {
        if (from.equals(TemperatureUnit.CELSIUS) && to.equals(TemperatureUnit.FAHRENHEIT)) {
            return convertFromCelsiusToFahrenheit(degree);
        } else if (from.equals(TemperatureUnit.FAHRENHEIT) && to.equals(TemperatureUnit.CELSIUS)) {
            return convertFromFahrenheitToCelsius(degree);
        } else if (from.equals(TemperatureUnit.CELSIUS) && to.equals(TemperatureUnit.KELVIN)) {
            return convertFromCelsiusToKelvin(degree);
        } else if (from.equals(TemperatureUnit.KELVIN) && to.equals(TemperatureUnit.CELSIUS)) {
            return convertFromKelvinToCelsius(degree);
        } else if (from.equals(TemperatureUnit.FAHRENHEIT) && to.equals(TemperatureUnit.KELVIN)) {
            return convertFromFahrenheitToKelvin(degree);
        } else if (from.equals(TemperatureUnit.KELVIN) && to.equals(TemperatureUnit.FAHRENHEIT)) {
            return convertFromKelvinToFahrenheit(degree);
        }

        throw new IllegalStateException("Conversion combination not found");
    }

    private static double convertFromCelsiusToFahrenheit(double degree) {
        return Double.valueOf(roundTwoDecimals.format(degree * 1.8 + 32));
    }

    private static double convertFromFahrenheitToCelsius(double degree) {
        return Double.valueOf(roundTwoDecimals.format((degree - 32) / 1.8));
    }

    private static double convertFromCelsiusToKelvin(double degree) {
        return Double.valueOf(roundTwoDecimals.format(degree + 273.15));
    }

    private static double convertFromKelvinToCelsius(double degree) {
        return Double.valueOf(roundTwoDecimals.format(degree - 273.15));
    }

    private static double convertFromFahrenheitToKelvin(double degree) {
        return Double.valueOf(roundTwoDecimals.format((degree + 459.67) * (5.0 / 9.0)));
    }

    private static double convertFromKelvinToFahrenheit(double degree) {
        return Double.valueOf(roundTwoDecimals.format((degree * 1.8) - 459.67));
    }

}
