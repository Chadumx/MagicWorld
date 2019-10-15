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
        this.vitalite -= (this.force / 2);
        return this.force * 2;
    }

    @Override
    public String NomAttaqueBasique() {
        return "coup d'épée";
    }

    @Override
    public String NomAttaqueSpecial() {
        return "coup de rage";
    }
}
