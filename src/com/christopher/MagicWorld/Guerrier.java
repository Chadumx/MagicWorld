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
    public void attaqueBase() {


    }

    @Override
    public void attaqueSpecial() {

    }
}
