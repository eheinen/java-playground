package com.eheinen.api.termometer.resource;

import com.eheinen.api.termometer.dto.temperature.AbstractTemperatureDto;
import com.eheinen.api.termometer.dto.temperature.ConvertTemperatureDto;

import javax.ws.rs.*;

public interface TemperatureResource {

    @GET
    @Produces("application/json")
    @Path("/current/{temperatureUnity}")
    AbstractTemperatureDto getCurrentTemperature(@PathParam("temperatureUnity") String temperatureUnity);

    @POST
    @Produces("application/json")
    @Consumes("application/json")
    @Path("/convert")
    AbstractTemperatureDto convertTemperature(ConvertTemperatureDto convertTemperatureDto);

}
