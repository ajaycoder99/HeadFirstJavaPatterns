package com.patterns.chp_01_strategy.adventuregame;

public class GameSimulator {

    public static void main(String[] args) {
        Character c = new Queen();
        c.setWeapon(new AxeBehavior());
        c.useWeapon();
    }
}
