package com.christopher.MagicWorld;

import java.util.Scanner;

public class Combats {

    Scanner clavier = new Scanner(System.in);

    public void Attaque(Joueur joueur1, Joueur joueur2){

        Joueur attaquant = joueur1;
        Joueur defenseur = joueur2;

        boolean j1 = true;

        do{
            System.out.printf("%s (%s vitalité) Veuillez choisir une attque (1 : attaque basique, 2 : attaque spéciale)\n", attaquant.getPlayerName(), attaquant.getClasse().vitalite);
            int choix = clavier.nextInt();

            switch (choix){
                case 1: defenseur.getClasse().vitalite =- attaquant.getClasse().AttaqueBasique();
                        System.out.printf("%s utilise %s et inflige %s dommages.\n", attaquant.getPlayerName(), attaquant.getClasse(), attaquant.getClasse().AttaqueBasique());
                        System.out.printf("%s perd %s points de vie.\n", defenseur.getPlayerName(), attaquant.getClasse().AttaqueBasique());
                break;
                case 2: classeAttaqueSpecial(attaquant, defenseur);
                        System.out.printf("");
                        System.out.printf("");
                break;
                default: System.out.print("Erreur (recommencez) : ");
                continue;
            }

            if (j1 == true) {
                attaquant = joueur2;
                defenseur = joueur1;
                j1 = false;
            } else {
                attaquant = joueur1;
                defenseur = joueur2;
                j1 = true;
            }

        } while (joueur1.getClasse().vitalite > 0 || joueur2.getClasse().vitalite > 0);

    }

    public void classeAttaqueSpecial(Joueur attaquant, Joueur defenseur){
        if (attaquant.getClasse().getType().equalsIgnoreCase("Guerrier")) {
            defenseur.getClasse().vitalite =- attaquant.getClasse().AttaqueSpecial();
        } else {
            attaquant.getClasse().AttaqueSpecial();
        }
    }
}
