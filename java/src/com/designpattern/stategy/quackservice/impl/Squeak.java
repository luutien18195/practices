package com.designpattern.stategy.quackservice.impl;

import com.designpattern.stategy.quackservice.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak!");
    }
}
