package com.patterns.chp_01_strategy.adventuregame;

public class Queen extends Character{

    public Queen() {
        weaponBehavior = new AxeBehavior();
    }

    @Override
    public void fight() {
        System.out.println("Queen Fighting !!!");
    }
}
