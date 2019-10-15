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
        this.agilite += this.niveau / 2;
        return this.agilite;
    }

    @Override
    public String NomAttaqueBasique() {
        return "tire à l'arc";
    }

    @Override
    public String NomAttaqueSpecial() {
        return "concentration";
    }
}
