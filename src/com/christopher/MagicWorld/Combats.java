package com.christopher.MagicWorld;

import java.util.Scanner;

public class Combats {

    Scanner clavier = new Scanner(System.in);

    private int attaque;

    public Combats() {

        int choix;

       do {

           System.out.println("(1: Guerrier 2: Rôdeur 3: Mage)");
           choix = clavier.nextInt();

           switch (attaque){
               case 1 : attaque = new classe.attaqueBase();
               break;
               case 2 : attaque = new classe.attaqueSpecial();
               break;
               default :
                   System.out.println("Erreur : veuillez selectionnez une des proposition donné.\nRecommencez :");
           }
       } while (attaque <= 0 || attaque >= 3);
    }
    
}
