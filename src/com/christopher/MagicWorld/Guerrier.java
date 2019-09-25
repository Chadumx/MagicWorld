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

       Joueur1.vitalite() = Joueur1.vitalite()  - Joueur2.force();
    }

    @Override
    public void attaqueSpecial() {
        Joueur1.vitalite() = joueur1.vitalite() - (joueur2.force() * 2);
        Joueur2.vitalite() = joueur2.vitalite() - (joueur2.force() / 2);
    }


}
