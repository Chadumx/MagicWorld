package com.christopher.MagicWorld;

import java.util.Scanner;

public class Combats {

    Scanner clavier = new Scanner(System.in);

    public Combats(Object Joueur, String player) {

        int choix1;
        String attaque;

        System.out.print("%s (%s de vitalite) veuillez choisir votre action ",);

        do {

            System.out.println("(1: Attaque de base 2: Attaque Special)");
            choix1 = clavier.nextInt();

            switch (choix1){

                case 1 : attaque = (String) new Joueur().getClasse().getAttaqueBasique(Object Joueur);
                break;
                case 2 : attaque = (String) new Joueur().getClasse().getAttaqueSpecial();
                break;
                default : System.out.println("Erreur, veuillez choisir parmi les propositions donner !");

            }

        } while ( choix1 <= 0 || choix1 >= 3);
    }

}
