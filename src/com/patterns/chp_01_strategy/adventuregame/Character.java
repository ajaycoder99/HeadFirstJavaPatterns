package com.patterns.chp_01_strategy.adventuregame;

public abstract class Character {

    WeaponBehavior weaponBehavior;

    public abstract void fight();

    public void setWeapon(WeaponBehavior w) {
        weaponBehavior = w;
    }

    public void useWeapon() {
        weaponBehavior.useWeapon();
    }

}
