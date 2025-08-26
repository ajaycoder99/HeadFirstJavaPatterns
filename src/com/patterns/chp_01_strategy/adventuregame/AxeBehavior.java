package com.patterns.chp_01_strategy.adventuregame;

public class AxeBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("Chopping with Axe");
    }
}
