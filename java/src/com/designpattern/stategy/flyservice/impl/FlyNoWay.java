package com.designpattern.stategy.flyservice.impl;

import com.designpattern.stategy.flyservice.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't flyyyyyyy");
    }
}
