package com.main.characters;

public abstract class CharaterClass implements General {
    private int healthPoints;
    private int manaPoints;
    private int level;
    private int attackAmount;
    private String name;
    private int maxHealthPoints;
    private int maxManaPoints;
    private AttackType attackType;
    //all public voids

    @Override
    public void attack() {
    }

    @Override
    public void restoreHealth(int amount) {
        setHealthPoints(this.healthPoints + amount);
    }

    @Override
    public void loseHealth(int amount) {
        setHealthPoints(this.healthPoints - amount);
    }

    @Override
    public void restoreMana(int amount){
        setManaPoints(this.manaPoints + amount);
    }

    @Override
    public void loseMana(int amount) {
        setManaPoints(this.manaPoints - amount);
    }

    @Override
    public void levelUp() {
    }

    @Override
    public void info() {
        System.out.println("Name: " + this.name + "\nCurrent healt points: "+ this.healthPoints+
                "\nCurrent mana points: " + this.manaPoints + "\nCurrent level:" + this.level);
    }




    //getters

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getManaPoints() {
        return manaPoints;
    }

    public int getLevel() {
        return level;
    }

    public int getAttackAmount() {
        return attackAmount;
    }

    public String getName() {
        return name;
    }

    public int getMaxHealthPoints() {
        return maxHealthPoints;
    }

    public int getMaxManaPoints() {
        return maxManaPoints;
    }

    public AttackType getAttackType() {
        return attackType;
    }

    //setters

    public void setHealthPoints(int healthPoints) {
        if (healthPoints < 0)
            this.healthPoints = 0;
        else if (healthPoints > this.maxHealthPoints)
            this.healthPoints = this.maxHealthPoints;
        else
            this.healthPoints = healthPoints;
    }

    public void setManaPoints(int manaPoints) {
        if (manaPoints < 0)
            this.manaPoints = 0;
        else if (manaPoints > this.maxManaPoints)
            this.manaPoints = this.maxManaPoints;
        else
            this.manaPoints = manaPoints;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setAttackAmount(int attackAmount) {
        this.attackAmount = attackAmount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMaxHealthPoints(int maxHealthPoints) {
        this.maxHealthPoints = maxHealthPoints;
    }

    public void setMaxManaPoints(int maxManaPoints) {
        this.maxManaPoints = maxManaPoints;
    }

    public void setAttackType(AttackType attackType) {
        this.attackType = attackType;
    }
}
