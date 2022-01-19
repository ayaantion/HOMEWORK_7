package com.company;

public class Main {

        public static void main(String[] args) {

            Hero heroes[] = {new Warrior(200, 20, "Rage"),
                    new Magic(150, 25, "Invisibility"),
                    new Medic(130, 5, "Splash heal")};
            for (int i = 0; i < heroes.length; i++) {
                System.out.println(heroes[i].applySuperAbility(heroes[i].superAbilityType));
            }
        }
    }

