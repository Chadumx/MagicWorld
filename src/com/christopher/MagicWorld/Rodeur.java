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
    public void attaqueBase(int force, int niveau, int agilite, int intelligence, int vitalite) {

    }

    @Override
    public void attaqueSpecial(int force, int niveau, int agilite, int intelligence, int vitalite) {

    }
}
