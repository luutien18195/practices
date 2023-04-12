package com.designpattern.stategy.quackservice;

public interface QuackBehavior {
    static void description() {
        System.out.println("This is the quack behavior");
    };

    void quack();
}
