package com.company;

public abstract class Hero implements HavingSuperAbility{
    public int health;
    public int damage;
    public String superAbilityType;

    public Hero(int health, int damage, String superAbilityType) {
        this.health = health;
        this.damage = damage;
        this.superAbilityType = superAbilityType;
    }

    public abstract String applySuperAbility(String superAbilityType);
}
