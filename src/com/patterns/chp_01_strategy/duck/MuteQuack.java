package com.patterns.chp_01_strategy.duck;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("Quack");
    }
}
