package com.designpattern.observer.weatherservice;

public interface Subject {
    void registerObservers(DeviceObserver observer);
    void removeObserver(DeviceObserver observer);
    void notifyObserver();
}
