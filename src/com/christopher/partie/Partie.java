package com.christopher.partie;

import com.christopher.combat.Combats;
import com.christopher.joueur.Joueur;

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
    public static String fin(Joueur joueur1, Joueur joueur2){

        String fin = null;

        if (joueur1.getVitalite() <= 0) {
            fin = "Joueur 1 a perdu !";
            System.out.println(fin);
        } else {
            fin = "Joueur 2 a perdu !";
            System.out.println(fin);
        }

        return fin;
    }
}