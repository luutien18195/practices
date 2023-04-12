package com.designpattern.decorator.condiments;

import com.designpattern.decorator.beverages.Beverage;

public class Whip extends CondimentDecorator{
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.35;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", whip";
    }
}
