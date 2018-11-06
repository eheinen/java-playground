package com.restapi.service.termometer.resource;

import com.restapi.api.termometer.dto.temperature.AbstractTemperatureDto;
import com.restapi.api.termometer.dto.temperature.ConvertTemperatureDto;
import com.restapi.api.termometer.resource.TemperatureResource;
import com.restapi.service.termometer.service.TemperatureService;

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
