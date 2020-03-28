package com.main;

import com.main.heroes.Gnome;
import com.main.heroes.Mage;
import com.main.heroes.Warrior;

public class Main {
    public static void main(String[] args) {
        Party party = new Party(new Mage(1200, 2000, 2000, 2000, 2000, 100, "Gendalf"),
                new Warrior(120, 100, 100, 100, 100, 57, "Aragorn"),
                new Gnome(100, 150, 150, 90, 90, 40, "Keelee"));
        party.info();
    }
}
//for seeing what in heroes are
//int attackAmount, int healthPoints, int maxHealthPoints, int manaPoints, int maxManaPoints, int level, String name