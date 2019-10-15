package com.christopher.MagicWorld;

public class Final {

    public void Fin(Joueur joueur1, Joueur joueur2){

            if (joueur1.getClasse().vitalite <= 0) {
            System.out.println("Joueur 1 a perdu !");
        } else {
            System.out.println("Joueur 2 a perdu !");
        }
    }
}
