package com.christopher.MagicWorld;

public class Guerrier extends Personnage implements Attaque{


    public Guerrier(String player) {
        super(player);
    }

    @Override
    public String getType() {
        return "Guerrier";
    }

    @Override
    public void attaqueBase(int force, int niveau, int agilite, int intelligence, int vitalite) {

    }

    @Override
    public void attaqueSpecial(int force, int niveau, int agilite, int intelligence, int vitalite) {

    }
}
