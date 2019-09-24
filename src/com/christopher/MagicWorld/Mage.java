package com.christopher.MagicWorld;

public class Mage extends Personnage implements Attaque{


    public Mage(String player) {
        super(player);
    }

    @Override
    public String getType() {
        return "Mage";
    }

    @Override
    public void attaqueBase(int force, int niveau, int agilite, int intelligence, int vitalite) {

    }

    @Override
    public void attaqueSpecial(int force, int niveau, int agilite, int intelligence, int vitalite) {

    }
}
