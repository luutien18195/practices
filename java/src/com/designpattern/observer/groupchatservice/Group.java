package com.designpattern.observer.groupchatservice;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String groupId;
    private List<ChatObserver> obs;

    public Group(String grId) {
        groupId = grId;
        obs = new ArrayList<>();
    }

    public void addNewMember(ChatObserver cObserver) {
        if (!obs.contains(cObserver)) {
            obs.add(cObserver);
        }
    }

    public void notifyAllChange(String content) {
        obs.forEach(o -> {
            o.update(groupId, content);
        });
    }
}
