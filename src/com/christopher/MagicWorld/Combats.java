package com.christopher.MagicWorld;

import java.util.Scanner;

public class Combats {

    Scanner clavier = new Scanner(System.in);

    public void Attaque(Joueur joueur1, Joueur joueur2){

        Joueur actuel = joueur1;
        Joueur ennemi = joueur2;

        boolean j1 = true;

        do{
            System.out.println(actuel.getPlayerName() + "( " + actuel.getVitalite() + " ) Veuillez choisir une attque (1 : attaque basique 2 : attaque spéciale)");
            int choix = clavier.nextInt();

            switch (choix){
                case 1: ennemi.getClasse().vitalite =- actuel.getClasse().AttaqueBasique();
                break;
                case 2: ennemi.getClasse().vitalite = actuel.getClasse().AttaqueSpecial();
                break;
                default: System.out.print("Erreur (recommencez) : ");
                continue;
            }

            if (j1 == true) {
                actuel = joueur2;
                ennemi = joueur1;
                j1 = false;
            } else {
                actuel = joueur1;
                ennemi = joueur2;
                j1 = true;
            }

        } while (joueur1.getVitalite() > 0 || joueur2.getVitalite() > 0);

    }

}
