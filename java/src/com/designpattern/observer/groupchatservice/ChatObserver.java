package com.designpattern.observer.groupchatservice;

public interface ChatObserver {
    void update(String groupId, String notifyContent);
}
