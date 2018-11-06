package com.restapi.api.termometer.dto.temperature;

public abstract class AbstractTemperatureDto {

    private TemperatureUnit unity;

    private double degree;

    public AbstractTemperatureDto(TemperatureUnit unity) {
        this.unity = unity;
    }

    public TemperatureUnit getUnity() {
        return unity;
    }

    public void setUnity(TemperatureUnit unity) {
        this.unity = unity;
    }

    public double getDegree() {
        return degree;
    }

    public void setDegree(double degree) {
        this.degree = degree;
    }
}
