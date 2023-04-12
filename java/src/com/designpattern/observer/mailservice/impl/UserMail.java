package com.designpattern.observer.mailservice.impl;

import com.designpattern.observer.mailservice.Subscriber;

public class UserMail implements Subscriber {
    private String name;

    public UserMail(String n) {
        name = n;
    }

    @Override
    public void update(String mailContent) {
        System.out.println("========");
        System.out.println("Dear Mr/Mrs " + name + ", you have a new mail");
        System.out.println(mailContent);
    }
}
