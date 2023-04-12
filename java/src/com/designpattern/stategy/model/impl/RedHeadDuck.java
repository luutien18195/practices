package com.designpattern.stategy.model.impl;

import com.designpattern.stategy.flyservice.FlyBehavior;
import com.designpattern.stategy.model.Duck;
import com.designpattern.stategy.quackservice.QuackBehavior;

public class RedHeadDuck extends Duck {
    public RedHeadDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);
    }
}
