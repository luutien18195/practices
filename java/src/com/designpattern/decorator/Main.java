package com.designpattern.decorator;

import com.designpattern.decorator.beverages.Beverage;
import com.designpattern.decorator.beverages.Espresso;
import com.designpattern.decorator.beverages.HouseBlend;
import com.designpattern.decorator.condiments.Mocha;
import com.designpattern.decorator.condiments.Whip;

public class Main {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

    }
}
