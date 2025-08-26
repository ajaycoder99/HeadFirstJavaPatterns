package com.patterns.chp_01_strategy.duck;

public class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("I am flying !!!");
    }
}
