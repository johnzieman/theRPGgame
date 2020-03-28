package com.main.characters;

public interface General {
    void attack();
    void restoreHealth(int amount);
    void loseHealth(int amount);
    void restoreMana(int amount);
    void loseMana(int amount);
    void levelUp();
    void info();
}
