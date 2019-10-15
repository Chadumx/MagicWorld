package com.christopher.MagicWorld;

import java.util.Scanner;

public class Combats {

    Scanner clavier = new Scanner(System.in);

    public void Attaque(Joueur joueur1, Joueur joueur2){

        Joueur attaquant = joueur1;
        Joueur defenseur = joueur2;
        Joueur temp;

        boolean j1 = true;

        do{
            System.out.printf("%s (%s vitalité) Veuillez choisir une attaque (1 : attaque basique, 2 : attaque spéciale)\n", attaquant.getPlayerName(), attaquant.getClasse().vitalite);
            int choix = clavier.nextInt();

            switch (choix){
                case 1: defenseur.getClasse().vitalite -= attaquant.getClasse().AttaqueBasique();
                        System.out.printf("%s utilise %s et inflige %s dommages\n", attaquant.getPlayerName(), attaquant.getClasse().NomAttaqueBasique(), attaquant.getClasse().AttaqueBasique());
                        System.out.printf("%s perd %s points de vie\n", defenseur.getPlayerName(), attaquant.getClasse().AttaqueBasique());
                break;
                case 2: classeAttaqueSpecial(attaquant, defenseur);
                break;
                default: System.out.print("Erreur (recommencez) : ");
                continue;
            }

            temp = attaquant;
            attaquant = defenseur;
            defenseur = temp;

        } while (joueur1.getClasse().vitalite > 0 || joueur2.getClasse().vitalite > 0);

    }

    public void classeAttaqueSpecial(Joueur attaquant, Joueur defenseur){

        if (attaquant.getClasse().getType().equalsIgnoreCase("Guerrier")) {

            defenseur.getClasse().vitalite -= attaquant.getClasse().AttaqueSpecial();
            System.out.printf("%s utilise %s et inflige %s de dommages\n", attaquant.getPlayerName(), attaquant.getClasse().NomAttaqueSpecial(), attaquant.getClasse().AttaqueSpecial());
            System.out.printf("%s perd %s point de vie\n", defenseur.getPlayerName(), attaquant.getClasse().AttaqueSpecial());
            System.out.printf("%s perd %s points de vie\n", attaquant.getPlayerName(), (attaquant.getClasse().getForce() / 2));

        } else if (attaquant.getClasse().getType().equalsIgnoreCase("Rôdeur")) {

            attaquant.getClasse().AttaqueSpecial();
            System.out.printf("%s gagne %s en agilité\n", attaquant.getPlayerName(), attaquant.getClasse().agilite);

        } else {

            int temp = attaquant.getClasse().vitalite;
            attaquant.getClasse().AttaqueSpecial();
            int gain = attaquant.getClasse().vitalite - temp;
            System.out.printf("%s utilise %s et gagne %s en vitalité\n", attaquant.getPlayerName(), attaquant.getClasse().NomAttaqueSpecial(), gain);
        }
    }
}
