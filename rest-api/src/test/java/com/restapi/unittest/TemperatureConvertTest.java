package com.restapi.unittest;

import com.restapi.api.termometer.dto.temperature.TemperatureUnit;
import com.restapi.service.termometer.service.TemperatureConverter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemperatureConvertTest {

    @Test
    public void check_convertFromCelsiusToFahrenheit() {
        double converted = TemperatureConverter.convert(TemperatureUnit.CELSIUS, TemperatureUnit.FAHRENHEIT, 100);

        assertEquals(212d, converted);
    }

    @Test
    public void check_convertFromFahrenheitToCelsius() {
        double converted = TemperatureConverter.convert(TemperatureUnit.FAHRENHEIT, TemperatureUnit.CELSIUS, 212);

        assertEquals(100d, converted);
    }

    @Test
    public void check_convertFromCelsiusToKelvin() {
        double converted = TemperatureConverter.convert(TemperatureUnit.CELSIUS, TemperatureUnit.KELVIN, 100);

        assertEquals(373.15d, converted);
    }

    @Test
    public void check_convertFromKelvinToCelsius() {
        double converted = TemperatureConverter.convert(TemperatureUnit.KELVIN, TemperatureUnit.CELSIUS, 373.15);

        assertEquals(100d, converted);
    }

    @Test
    public void check_convertFromFahrenheitToKelvin() {
        double converted = TemperatureConverter.convert(TemperatureUnit.FAHRENHEIT, TemperatureUnit.KELVIN, 100);

        assertEquals(310.93d, converted);
    }

    @Test
    public void check_convertFromKelvinToFahrenheit() {
        double converted = TemperatureConverter.convert(TemperatureUnit.KELVIN, TemperatureUnit.FAHRENHEIT, 310.93);

        assertEquals(100d, converted);
    }



}
