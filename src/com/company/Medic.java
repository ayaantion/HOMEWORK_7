package com.company;

public class Medic extends Hero {
    public Medic(int health, int damage, String superAbilityType) {
        super(health, damage, superAbilityType);
    }

    @Override
    public String applySuperAbility(String superAbilityType) {
        return ("Medic применил способность " + superAbilityType);
    }
}
