package com.eheinen.service.termometer.service;

import com.eheinen.api.termometer.dto.temperature.AbstractTemperatureDto;
import com.eheinen.api.termometer.dto.temperature.ConvertTemperatureDto;
import com.eheinen.api.termometer.dto.temperature.TemperatureFactory;

public class TemperatureService {

    private TemperatureFactory temperatureFactory;

    public TemperatureService() {
        this.temperatureFactory = new TemperatureFactory();
    }

    public AbstractTemperatureDto getCurrentTemperature(String unit) {
        AbstractTemperatureDto temperatureDto = temperatureFactory.getTemperature(unit);
        temperatureDto.setDegree(22.5);

        return temperatureDto;
    }

    public AbstractTemperatureDto convertTemperature(ConvertTemperatureDto convertTemperatureDto) {
        if (convertTemperatureDto == null) {
            throw new IllegalStateException("ConvertTemperatureDto is null");
        }

        AbstractTemperatureDto temperatureDto = temperatureFactory.getTemperature(convertTemperatureDto.getToUnity().name());
        double converted = TemperatureConverter.convert(convertTemperatureDto.getFromUnity(), convertTemperatureDto.getToUnity(),
                convertTemperatureDto.getDegree());
        temperatureDto.setDegree(converted);

        return temperatureDto;
    }

}
