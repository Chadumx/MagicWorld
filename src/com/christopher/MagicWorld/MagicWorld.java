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

        Combats combats = new Combats(joueur1);

    }
}
