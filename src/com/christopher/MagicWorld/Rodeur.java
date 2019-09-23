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

    }

    @Override
    public void attaqueSpecial() {

    }
}
