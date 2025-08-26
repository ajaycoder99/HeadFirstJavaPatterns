package com.patterns.chp_01_strategy.duck;

public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Quack");
    }
}
