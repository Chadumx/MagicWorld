package com.christopher.Joueurs;

import com.christopher.Partie.Counter;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Determine la classe du personnage.
 * @author christopher
 */
public class Joueur {

    Scanner clavier = new Scanner(System.in);

    private Personnage classe;

    String player;

    public Joueur() {
        Counter counter =  Counter.getInstance();
        player = "joueur " + counter.getCounter();
        counter.increment();
    }

    /**
     *permet de savoir le nom du joueur.
     * @return le nom du joueur.
     */
    public String getPlayerName() {
        return player;
    }

    /**
     *Permet de choisir la classe du personange.
     */
    public void choix() {

        System.out.printf("Création du personnage du %s\n", player);
        System.out.print("Veuillez choisir la classe de votre personnage ");
        int choix = 0;

        do{

            try {
                System.out.println("(1: Guerrier 2: Rôdeur 3: Mage)");
                choix = clavier.nextInt();
            } catch (InputMismatchException e) {
                clavier.nextLine();
            }

            switch (choix){
                case 1 : this.classe = new Guerrier(player);
                break;
                case 2 : this.classe = new Rodeur(player);
                break;
                case 3 : this.classe = new Mage(player);
                break;
                default : System.out.print("Erreur, veuillez choisir parmi les propositions donner ! ");
            }

        } while (choix <= 0 || choix >= 4);
    }

    /**
     * permet de retourne la classe du personnage.
     * @return retourne la classe du personnage.
     */
    public Personnage getClasse() {
        return classe;
    }
}
