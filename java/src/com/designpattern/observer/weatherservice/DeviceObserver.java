package com.designpattern.observer.weatherservice;

public interface DeviceObserver {
    void update(float temperature, float humidity, float pressure);
}
