package com.christopher.Partie;

import com.christopher.Combat.Combats;
import com.christopher.Joueur.Joueur;

/**
 * Classe qui lance la partie et la gere.
 */
public class Partie {

    /**
     *Constructeur de la classe Partie.
     */
    public static void start(){

        Joueur joueur1 = new Joueur();
        Joueur joueur2 = new Joueur();
        Joueur attaquant = joueur1;
        Joueur defenseur = joueur2;

        joueur1.choix();
        joueur2.choix();

        do{

            Combats attaque = new Combats();
            attaque.attaque(attaquant, defenseur);

            Joueur temp = attaquant;
            attaquant = defenseur;
            defenseur = temp;

        } while (joueur1.getClasse().getVitalite() > 0 && joueur2.getClasse().getVitalite() > 0);

        fin(joueur1, joueur2);
    }

    /**
     * Methode qui gére la fin de partie en déterminant le perdant.
     * @param joueur1 données lier au joueur N°1.
     * @param joueur2 données lier au joueur N°2.
     */
    public static void fin(Joueur joueur1, Joueur joueur2){

        if (joueur1.getClasse().getVitalite() <= 0) {
            System.out.println("Joueur 1 a perdu !");
        } else {
            System.out.println("Joueur 2 a perdu !");
        }
    }
}