package com.company;

public class Magic extends Hero{

    public Magic(int health, int damage, String superAbilityType) {
        super(health, damage, superAbilityType);
    }

    @Override
    public String applySuperAbility(String superAbilityType) {
        return "Magic применил способность " + superAbilityType;
    }
}
