package com.christopher.Combat;

import com.christopher.Joueur.Joueur;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * definie la methode de combats entre les differents joueurs.
 */
public class Combats {

    Scanner clavier = new Scanner(System.in);

    /**
     *
     * @param attaquant donne les attributs de l'attaquant.
     * @param defenseur donne les attributs du defenseur.
     */
    public void attaque(Joueur attaquant, Joueur defenseur){

        int choix = 0;
        System.out.printf("%s (%s vitalité) veuillez choisir une attaque ", attaquant.getPlayerName(), attaquant.getVitalite());

        do  {

            try {
                System.out.println("(1 : attaque basique, 2 : attaque spéciale)");
                choix = clavier.nextInt();
            } catch (InputMismatchException e) {
                clavier.nextLine();
            }

            switch (choix) {
                case 1:
                    attaquant.setAttaqueBasique(defenseur);
                    break;
                case 2:
                    attaquant.setAttaqueSpecial(defenseur);
                    break;
                default:
                    System.out.print("Erreur, veuillez choisir parmi les propositions donner ! ");
            }

        } while (choix < 1 || choix > 2);
    }
}