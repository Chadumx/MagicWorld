package com.christopher.MagicWorld;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);
        System.out.println("choix du ppersonnage :");
        int choix;

        do {
            System.out.println("1: Guerrier\n2: Rôdeur\n3: Mage");
            choix = clavier.nextInt();

            if ( choix == 1){
                System.out.println("guerrier");
            } else if ( choix == 2){
                System.out.println("rodeur");
            } else if ( choix == 3) {
                System.out.println("mage");
            }else {
                System.out.println("Veuillez choisir parmie les proposition donner !");
            }

        } while ( choix <= 0 || choix >= 4);
    }

}
