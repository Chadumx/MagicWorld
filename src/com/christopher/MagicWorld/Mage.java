package com.christopher.MagicWorld;

public class Mage extends Personnage {

    public final int VITALITE = this.vitalite;

    public Mage() {
        super();
    }

    @Override
    public String getType() {
        return "Mage";
    }

    @Override
    public int AttaqueBasique() {
        return this.intelligence;
    }

    @Override
    public int AttaqueSpecial() {

        vitalite += intelligence * 2;

        if (vitalite > VITALITE){
            vitalite = VITALITE;
        }
        return vitalite;
    }

    @Override
    public String NomAttaqueBasique() {
        return "boule de feu";
    }

    @Override
    public String NomAttaqueSpecial() {
        return "soin";
    }
}
