package com.christopher.MagicWorld;

import com.christopher.MagicWorld.Joueur;

public class MagicWorld {

    public static void main(String[] args) {

        String player = null;


        Joueur joueur1 = new Joueur();
        player = "joueur n°1";
        joueur1.choix(player);

        Joueur joueur2 = new Joueur();
        player = "joueur n°2";
        joueur2.choix(player);

        do {
            player = "joueur n°1";
            Combats combat1 = new Combats(joueur1, player);
            player = "joueur n°2";
            Combats combat2 = new Combats(joueur2, player);
        } while (joueur1.getVitalite = 0 || joueur2.getVitalite)
    }
}
