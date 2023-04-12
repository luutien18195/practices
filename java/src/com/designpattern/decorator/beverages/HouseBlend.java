package com.designpattern.decorator.beverages;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend coffe!";
    }
    @Override
    public double cost() {
        return 0.98;
    }
}
