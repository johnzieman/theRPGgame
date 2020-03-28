package com.main.heroes;

import com.main.characters.AttackType;
import com.main.characters.CharaterClass;

public class Gnome extends CharaterClass {
    public Gnome(int attackAmount, int healthPoints, int maxHealthPoints, int manaPoints, int maxManaPoints, int level, String name) {
        this.setAttackAmount(attackAmount);
        this.setMaxManaPoints(maxManaPoints);
        this.setMaxHealthPoints(maxHealthPoints);
        this.setHealthPoints(healthPoints);
        this.setManaPoints(manaPoints);
        this.setLevel(level);
        this.setName(name);
        this.setAttackType(AttackType.PHYSICAL);
    }
}
