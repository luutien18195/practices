package com.designpattern.observer.weatherservice.impl;

import com.designpattern.observer.weatherservice.DisplayElement;
import com.designpattern.observer.weatherservice.DeviceObserver;

public class ConditionDisplay implements DeviceObserver, DisplayElement {
    private float humidity;
    private float pressure;

    public ConditionDisplay(WeatherDataSubjectImpl w) {
        w.registerObservers(this);
    }

    @Override
    public void display() {
        System.out.println("ConditionDisplay\nhumidity: " + humidity + "\npressure: " + pressure);
    }

    @Override
    public void update(float t, float h, float p) {
        humidity = h;
        pressure = p;
    }
}
