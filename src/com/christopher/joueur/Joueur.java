package com.christopher.joueur;

import com.christopher.partie.Counter;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Determine la classe du personnage.
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
     * permet de faire des entrée automatiser pour les test.
     * @param clavier initialisation de données
     * @return la valeur a initialise dans Scanner
     */
    public Joueur setClavier(Scanner clavier) {
        this.clavier = clavier;

        return this;
    }

    /**
     * Permet de savoir le nom du joueur.
     * @return le nom du joueur.
     */
    public String getPlayerName() {
        return player;
    }

    /**
     * Permet de choisir la classe du personange.
     */
    public Joueur choix() {

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
                case 1 : this.classe = new Guerrier(player, this.clavier);
                    break;
                case 2 : this.classe = new Rodeur(player, this.clavier);
                    break;
                case 3 : this.classe = new Mage(player, this.clavier);
                    break;
                default : System.out.print("Erreur, veuillez choisir parmi les propositions donner ! ");
            }

        } while (choix <= 0 || choix >= 4);

        return this;
    }

    /**
     * Permet de retourne la classe du personnage.
     * @return retourne la classe du personnage.
     */
    public Personnage getClasse() {
        return classe;
    }

    public Joueur setVitalite (int val ){
        this.classe.setVitalite(val);

        return this;
    }

    public Joueur setAttaqueBasique(Joueur defenseur){
        this.classe.attaqueBasique(defenseur);

        return this;
    }

    public Joueur setAttaqueSpecial(Joueur defenseur){
        this.classe.attaqueSpecial(defenseur);

        return this;
    }

    public int getVitalite(){
        return this.classe.getVitalite();
    }

    public void setClasse(Personnage classe) {
        this.classe = classe;
    }
}