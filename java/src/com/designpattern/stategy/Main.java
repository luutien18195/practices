package com.designpattern.stategy;

import com.designpattern.stategy.flyservice.impl.FlyLikeRocketPower;
import com.designpattern.stategy.model.impl.RedHeadDuck;
import com.designpattern.stategy.quackservice.impl.Squeak;

public class Main {
    public static void main(String[] args) {
        RedHeadDuck rDuck = new RedHeadDuck(new FlyLikeRocketPower(), new Squeak());
        rDuck.fly();
        rDuck.quack();
    }
}
