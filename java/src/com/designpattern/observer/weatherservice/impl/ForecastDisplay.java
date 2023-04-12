package com.designpattern.observer.weatherservice.impl;

import com.designpattern.observer.weatherservice.DisplayElement;
import com.designpattern.observer.weatherservice.DeviceObserver;

public class ForecastDisplay implements DeviceObserver, DisplayElement {
    private float temperature;
    private WeatherDataSubjectImpl weatherData;

    public ForecastDisplay(WeatherDataSubjectImpl w) {
        this.weatherData = w;
        weatherData.registerObservers(this);
    }

    @Override
    public void display() {
        System.out.println("ForecastDisplay\ntemperature: " + temperature);
    }

    @Override
    public void update(float t, float h, float p) {
        temperature = t;
    }
}
