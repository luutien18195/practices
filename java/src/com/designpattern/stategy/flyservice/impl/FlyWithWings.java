package com.designpattern.stategy.flyservice.impl;

import com.designpattern.stategy.flyservice.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can fly normal");
    }
}
