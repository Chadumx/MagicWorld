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
    public void attaqueBase() {
        joueur1.vitalite = joueur1.vitalite - joueur2.intelligence;
    }

    @Override
    public void attaqueSpecial() {

        int temp;
        do{

            switch (joueur1.vitalite){
                case 1 < (joueur1.niveau * 5) : temp = joueur1.vitalite;
                    joueur1.vitalite = joueur1.vitalite + (joueur1.inteligence *2);
                    temp = joueur1.vitalite - temp;
                break;
                case 2 >= (joueur1.niveau *5) : temp = joueur1.vitalite;
                    joueur1.vitalite = joueur1.niveau * 5;
                    temp = joueur1.vitalite - temp;
                break;
                default :
                    System.out.println("Vous ne pouvez pas obtenir plus de point de vie !");
            }

        } while (joueur1.vitalite > (joueur1.niveau *5));



    }
}
