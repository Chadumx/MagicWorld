package com.christopher.MagicWorld;

import java.util.Scanner;

public class Joueur {

    Scanner clavier = new Scanner(System.in);
    int choix;
    String type;

    public void choix(String player){

        System.out.printf("choix du ppersonnage %s\n", player);

        do{

            System.out.println("1: Guerrier\n2: Rôdeur\n3: Mage\n");
            choix = clavier.nextInt();

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

        System.out.printf("%s, vous avez choisie le personnage de type %s\n\n", player, type);
     }
}
