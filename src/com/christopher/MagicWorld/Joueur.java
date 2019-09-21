package com.christopher.MagicWorld;

import java.util.Scanner;

public class Joueur {

    Scanner clavier = new Scanner(System.in);
    int choix;
    String type;
    String temp = null;

    public void choix(String player){

        System.out.printf("Création du personnage du %s\n", player);

        do{

            System.out.println("Veuillez choisir la classe de votre personnage (1: Guerrier 2: Rôdeur 3: Mage)\n");
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

        if (player == "joueur n°1"){
            temp = "Woarg";
        } else {
            temp = "Abracadabra";
        }

        System.out.printf("%sje suis le %s du %s\n\n", temp, type, player);
     }
}
