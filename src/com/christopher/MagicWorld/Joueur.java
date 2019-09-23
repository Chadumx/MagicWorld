package com.christopher.MagicWorld;

import java.util.Scanner;

/**
 * @author christopher
 */
public class Joueur {

    Scanner clavier = new Scanner(System.in);

    private Personnage classe;

    /**
     * Choix du personnage
     *
     * @param player String
     */
    public void choix(String player){

        System.out.printf("Création du personnage du %s\n", player);
        System.out.print("Veuillez choisir la classe de votre personnage ");
        int choix;

        do{

            System.out.println("(1: Guerrier 2: Rôdeur 3: Mage)");
            choix = clavier.nextInt();

            switch (choix){
                case 1 : classe = new Guerrier(player);
                break;
                case 2 : classe = new Rodeur(player);
                break;
                case 3 : classe = new Mage(player);
                break;
                default : System.out.print("Erreur, veuillez choisir parmi les propositions donner ! ");
            }

        } while ( choix <= 0 || choix >= 4);
     }
}
