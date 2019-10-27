package com.christopher.Partie;

import com.christopher.Combats.Combats;
import com.christopher.Joueurs.Joueur;

/**
 * Classe qui lance la partie et la gere.
 */
public class Partie {

    Joueur joueur1 = new Joueur();
    Joueur joueur2 = new Joueur();
    Joueur attaquant;
    Joueur defenseur;

    /**
     *Constructeur de la classe Partie.
     */
    public Partie(){

        joueur1.choix();
        joueur2.choix();
        attaquant = joueur1;
        defenseur = joueur2;

        do{

            Combats attaque = new Combats();
            attaque.Attaque(attaquant, defenseur);
            Joueur temp = attaquant;
            attaquant = defenseur;
            defenseur = temp;

        } while (joueur1.getClasse().getVitalite() > 0 || joueur2.getClasse().getVitalite() > 0);

        fin(joueur1, joueur2);
    }

    /**
     * Methode qui gére la fin de partie en déterminant le perdant.
     * @param joueur1 données lier au joueur N°1.
     * @param joueur2 données lier au joueur N°2.
     */
    public void fin(Joueur joueur1, Joueur joueur2){

        if (joueur1.getClasse().getVitalite() <= 0) {
            System.out.println("Joueur 1 a perdu !");
        } else {
            System.out.println("Joueur 2 a perdu !");
        }
    }
}