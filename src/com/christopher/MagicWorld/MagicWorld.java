package com.christopher.MagicWorld;

import com.christopher.MagicWorld.Joueur;

public class MagicWorld {

    public static void main(String[] args) {

        Joueur joueur1 = new Joueur();
        joueur1.choix();

        Joueur joueur2 = new Joueur();
        joueur2.choix();

        Combats attaque = new Combats();
        attaque.Attaque(joueur1, joueur2);
    }
}