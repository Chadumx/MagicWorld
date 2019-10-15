package com.christopher.MagicWorld;

public class MagicWorld {

    public static void main(String[] args) {

        Joueur joueur1 = new Joueur();
        joueur1.choix();

        Joueur joueur2 = new Joueur();
        joueur2.choix();

        Combats attaque = new Combats();
        attaque.Attaque(joueur1, joueur2);

        Final fin = new Final();
        fin.Fin(joueur1, joueur2);
    }
}