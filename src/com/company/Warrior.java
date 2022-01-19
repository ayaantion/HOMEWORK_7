package com.company;

public class Warrior extends Hero {
    public Warrior(int health, int damage, String superAbilityType) {
        super(health, damage, superAbilityType);
    }

    @Override
    public String applySuperAbility(String superAbilityType) {
        return ("Warrior применил суперспособность " + superAbilityType);
    }
}
