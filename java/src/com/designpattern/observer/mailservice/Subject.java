package com.designpattern.observer.mailservice;

public interface Subject {
    void subscribe(Subscriber sb);
    void unSubscribe(Subscriber sb);
    void sendAll();
}
