package com.restapi.api.termometer.dto.temperature;

public class ConvertTemperatureDto {

    private TemperatureUnit fromUnity;

    private TemperatureUnit toUnity;

    private double degree;

    public TemperatureUnit getFromUnity() {
        return fromUnity;
    }

    public void setFromUnity(TemperatureUnit fromUnity) {
        this.fromUnity = fromUnity;
    }

    public TemperatureUnit getToUnity() {
        return toUnity;
    }

    public void setToUnity(TemperatureUnit toUnity) {
        this.toUnity = toUnity;
    }

    public double getDegree() {
        return degree;
    }

    public void setDegree(double degree) {
        this.degree = degree;
    }
}
