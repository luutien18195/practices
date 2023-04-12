package com.designpattern.observer.weatherservice.impl;

import com.designpattern.observer.weatherservice.DisplayElement;
import com.designpattern.observer.weatherservice.DeviceObserver;
import com.designpattern.observer.weatherservice.Subject;

import java.util.ArrayList;
import java.util.List;

public class WeatherDataSubjectImpl implements Subject {
    private float temperature;
    private float humidity;
    private float pressure;

    private List<DeviceObserver> device;

    public WeatherDataSubjectImpl() {
        device = new ArrayList<>();
    }

    @Override
    public void registerObservers(DeviceObserver observer) {
        device.add(observer);
    }

    @Override
    public void removeObserver(DeviceObserver observer) {
        device.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (DeviceObserver o: device) {
            o.update(temperature, humidity, pressure);

            if (o instanceof DisplayElement) {
                ((DisplayElement) o).display();
            }
        }
    }

    public void setMeasurement(float t, float h, float p) {
        temperature = t;
        humidity = h;
        pressure = p;

        /* Measurement changed */
        notifyObserver();
    }
}
