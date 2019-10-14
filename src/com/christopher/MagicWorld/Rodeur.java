package com.christopher.MagicWorld;

public class Rodeur extends Personnage {

    public Rodeur() {
        super();
    }

    @Override
    public String getType() {
        return "Rôdeur";
    }

    @Override
    public int AttaqueBasique() {
        return this.agilite;
    }

    @Override
    public int AttaqueSpecial() {
        return AttaqueSpecial();
    }
}
