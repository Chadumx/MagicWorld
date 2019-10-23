package com.christopher.Joueurs;

public class Guerrier extends Personnage {

    public Guerrier(String joueurName) {
        super(joueurName);
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
        System.out.println( this.vitalite);
        this.vitalite -= (this.force / 2);

        System.out.println( this.vitalite);
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
