package com.company;

public class Main {

    public static void main(String[] args) {
        Magic m = new Magic();
        Medic c = new Medic();
        Warrior w = new Warrior();
        ApplySuperAbility[] abilities = {Magic(), Medic(), Warrior()};
        for (int i = 0; i < abilities.length; i++) {
            abilities[i].ApplySuperAbility();

        }

    }
}
