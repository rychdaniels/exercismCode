package com.exercismcode.exercismcode.wizardsandwarriors;

public class Wizard extends Fighter{
    boolean isVulnerable = true;

    @Override
    public boolean isVulnerable() {
        return isVulnerable;
    }

    @Override
    public int getDamagePoints(Fighter fighter) {
        return isVulnerable ? 3 : 12;
    }

    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }

    public void prepareSpell() {
        this.isVulnerable = false;
    }
}
