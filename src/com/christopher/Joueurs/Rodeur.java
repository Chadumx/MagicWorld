package com.christopher.Joueurs;

import com.christopher.Joueurs.Personnage;

public class Rodeur extends Personnage {

    public Rodeur(String joueurName) {
        super(joueurName);
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
