package com.christopher.MagicWorld;

public class Guerrier extends Personnage {

    public Guerrier() {
        super();
    }

    @Override
    public String getType() {
        return "Guerrier";
    }

    @Override
    public int AttaqueBasique() {
        return this.force;
    }

    @Override
    public int AttaqueSpecial() {
        return this.force * 2;
    }

}
