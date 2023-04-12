package com.designpattern.observer.groupchatservice.impl;

import com.designpattern.observer.groupchatservice.ChatObserver;
import com.designpattern.observer.groupchatservice.Group;

import java.time.LocalTime;

public class User implements ChatObserver {
    private final String name;

    public User(Group group, String userName) {
        group.addNewMember(this);
        this.name = userName;
    }

    @Override
    public void update(String groupId, String notifyContent) {
        System.out.println(LocalTime.now() + " Group ["+groupId+"] Hey " + name + "!, you have new message:");
        System.out.println(notifyContent);
    }
}
