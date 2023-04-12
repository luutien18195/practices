package com.designpattern.stategy.quackservice.impl;

import com.designpattern.stategy.quackservice.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack quack");
    }
}
