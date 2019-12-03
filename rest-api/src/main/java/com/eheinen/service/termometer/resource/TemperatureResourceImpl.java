package com.eheinen.service.termometer.resource;

import com.eheinen.api.termometer.dto.temperature.AbstractTemperatureDto;
import com.eheinen.api.termometer.dto.temperature.ConvertTemperatureDto;
import com.eheinen.api.termometer.resource.TemperatureResource;
import com.eheinen.service.termometer.service.TemperatureService;

import javax.ws.rs.Path;

@Path("/temperature")
public class TemperatureResourceImpl implements TemperatureResource {

    private TemperatureService temperatureService;

    public TemperatureResourceImpl() {
        this.temperatureService = new TemperatureService();
    }

    @Override
    public AbstractTemperatureDto getCurrentTemperature(String temperatureUnity) {
        return temperatureService.getCurrentTemperature(temperatureUnity);
    }

    @Override
    public AbstractTemperatureDto convertTemperature(ConvertTemperatureDto convertTemperatureDto) {
        return temperatureService.convertTemperature(convertTemperatureDto);
    }
}
