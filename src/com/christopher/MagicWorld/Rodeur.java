package com.christopher.MagicWorld;

public class Rodeur extends Personnage implements Attaque{


    public Rodeur(String player) {
        super(player);
    }

    @Override
    public String getType() {
        return "Rôdeur";
    }

    @Override
    public void attaqueBase() {
        joueur1.vitalite = joueur1.vitalite - joueur2agilite;
    }

    @Override
    public void attaqueSpecial() {
        joueur2.agilite = joueur2.agilite + (joueur2.agilite / 2);
    }
}
