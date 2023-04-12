package com.designpattern.stategy.flyservice.impl;

import com.designpattern.stategy.flyservice.FlyBehavior;

public class FlyLikeRocketPower implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly normally but i have a rocket engine, so i can fly");
    }
}
