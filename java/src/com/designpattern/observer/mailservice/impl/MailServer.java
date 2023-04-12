package com.designpattern.observer.mailservice.impl;

import com.designpattern.observer.mailservice.Subject;
import com.designpattern.observer.mailservice.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class MailServer implements Subject {
    private String news;
    private List<Subscriber> subscribers;

    public MailServer() {
        subscribers = new ArrayList<>();
    }

    public void setNews(String n) {
        news = n;
    }

    @Override
    public void subscribe(Subscriber sb) {
        subscribers.add(sb);
    }

    @Override
    public void unSubscribe(Subscriber sb) {
        subscribers.remove(sb);
    }

    @Override
    public void sendAll() {
        subscribers.forEach(subscriber -> subscriber.update(news));
    }
}
