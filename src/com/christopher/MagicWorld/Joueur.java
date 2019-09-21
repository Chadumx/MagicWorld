package com.christopher.MagicWorld;

public class Joueur {

    int choix;
    String type;

    public void choix(int choix){

        System.out.println("choix du ppersonnage :\n");

        do{
            System.out.println("1: Guerrier\n2: Rôdeur\n3: Mage\n");

            if ( choix == 1){
                type = "Guerrier";
            } else if ( choix == 2){
                type = "Rôdeur";
            } else if ( choix == 3) {
                type = "Mage";
            }else {
                System.out.println("Veuillez choisir parmie les propositions donner !\n");
            }
        } while ( choix <= 0 || choix >= 4);

     }
}
