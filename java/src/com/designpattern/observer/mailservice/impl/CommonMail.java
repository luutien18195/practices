package com.designpattern.observer.mailservice.impl;

import com.designpattern.observer.mailservice.Subscriber;

public class CommonMail implements Subscriber {
    private String groupName;
    public CommonMail(String gn) {
        groupName = gn;
    }

    @Override
    public void update(String mailContent) {
        System.out.println("========");
        System.out.println("Hi everybody, we have a notification for all of you: ");
        System.out.println(mailContent);
    }
}
