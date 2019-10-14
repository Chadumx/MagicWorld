package com.christopher.MagicWorld;

import java.util.Scanner;

/**
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

    String getPlayerName() {
        return player;
    }

    /**
     * Choix du personnage
     *
     */
    // public Joueur() {
    public void choix() {

        System.out.printf("Création du personnage du %s\n", player);
        System.out.print("Veuillez choisir la classe de votre personnage ");
        int choix;

        do{

            System.out.println("(1: Guerrier 2: Rôdeur 3: Mage)");
            choix = clavier.nextInt();

            switch (choix){
                case 1 : this.classe = new Guerrier();
                break;
                case 2 : this.classe = new Rodeur();
                break;
                case 3 : this.classe = new Mage();
                break;
                default : System.out.print("Erreur, veuillez choisir parmi les propositions donner ! ");
            }

        } while ( choix <= 0 || choix >= 4);
    }

    public Personnage getClasse() {
        return classe;
    }

    public int getVitalite() {
        return this.classe.getVitalite();
    }

    public int getForce(){
        return this.classe.getForce();
    }

}
