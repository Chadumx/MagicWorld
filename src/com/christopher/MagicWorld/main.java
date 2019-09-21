package com.christopher.MagicWorld;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);
        int choix;

        Joueur joueur1 = new Joueur();
        Joueur joueur2 = new Joueur();

                joueur1.choix(choix = clavier.nextInt());
                    System.out.printf("Joueur 1, vous avez choisie le ");

                joueur2.choix(choix = clavier.nextInt());
                    System.out.printf("Joueur 2, vous avez choisie le ");
    }
}
