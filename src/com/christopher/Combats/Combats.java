package com.christopher.Combats;

import com.christopher.Joueurs.Joueur;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Combats {

    Scanner clavier = new Scanner(System.in);

    public void Attaque(Joueur attaquant, Joueur defenseur){

        int choix = 0;
        System.out.printf("%s (%s vitalité) veuillez choisir une attaque ", attaquant.getPlayerName(), attaquant.getClasse().getVitalite());

        do  {
            try {
                System.out.printf("(1 : attaque basique, 2 : attaque spéciale)\n");
                choix = clavier.nextInt();
            } catch (InputMismatchException e) {
                clavier.nextLine();
            }
                    switch (choix) {
                        case 1:
                            attaquant.getClasse().AttaqueBasique(defenseur);
                            break;
                        case 2:
                            attaquant.getClasse().AttaqueSpecial(defenseur);
                            break;
                        default:
                            System.out.print("Erreur, veuillez choisir parmi les propositions donner ! ");
                            continue;
                    }
            } while (choix < 1 || choix > 2);
        }
    }