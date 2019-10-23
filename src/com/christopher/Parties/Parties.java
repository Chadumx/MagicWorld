package com.christopher.Parties;

import com.christopher.Combats.Combats;
import com.christopher.Joueurs.Joueur;

public class Parties {

    public Parties(){

        Joueur joueur1 = new Joueur();
        joueur1.choix();

        Joueur joueur2 = new Joueur();
        joueur2.choix();

        do{

            Combats attaque = new Combats();
            attaque.Attaque(joueur1, joueur2);

        } while (joueur1.getClasse().getVitalite() > 0 || joueur2.getClasse().getVitalite() > 0);

        fin(joueur1, joueur2);
    }

    public void fin(Joueur joueur1, Joueur joueur2){

        if (joueur1.getClasse().getVitalite() <= 0) {
            System.out.println("Joueur 1 a perdu !");
        } else {
            System.out.println("Joueur 2 a perdu !");
        }
    }
}
