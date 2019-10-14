package com.christopher.MagicWorld;

public class Mage extends Personnage {

    public Mage() {
        super();
    }

    @Override
    public String getType() {
        return "Mage";
    }

    @Override
    public int AttaqueBasique() {
        return this.intelligence;
    }

    @Override
    public int AttaqueSpecial() {

        return AttaqueSpecial();
    }
}
