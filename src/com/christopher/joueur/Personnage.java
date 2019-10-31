package com.christopher.joueur;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * definie la valeur des attributs des differentes classes.
 */
public abstract class Personnage {

    public abstract String getType();
    public abstract void attaqueBasique(Joueur defenseur);
    public abstract void attaqueSpecial(Joueur defenseur);

    protected String player;

    protected int niveau, force, agilite, intelligence, vitalite;

    /**
     *constructeur de la classe Personnage.
     * @param joueurName donne le nom du joueur.
     */
    public Personnage(String joueurName, Scanner clavier) {

        this.player = joueurName;

        do {
            try {
                do {
                    System.out.println("Niveau du personnage ?");
                    this.niveau = clavier.nextInt();
                    if (niveau < 1 || niveau > 100) {
                        System.out.printf("Le niveau du personnage est au minimum de 1 et au maximum de 100 !\n");
                    }
                } while (this.niveau < 1 || this.niveau > 100);
                System.out.println("Force du personnage ?");
                this.force = clavier.nextInt();
                System.out.println("agilité du personnage ?");
                this.agilite = clavier.nextInt();
                System.out.println("Intelligence du personnage ?");
                this.intelligence = clavier.nextInt();
                if (niveau != force + agilite + intelligence) {
                    System.out.println("La somme total de la Force, de l'Agilité et de l'Intellignace doit être égal au niveau !\nRecommencez :");
                }
            } catch (InputMismatchException e) {
                System.out.printf("Erreur de frappe, seul les nombres entiers sont accepté !\nRecommencez :\n");
                clavier.nextLine();
                continue;
            }
        } while (niveau != force + agilite + intelligence);

        this.vitalite = niveau * 5;

        System.out.printf("%s je suis le %s du %s je possede %s de vitalité, %s de Force, %s d'agilité et %s d'intelligence !\n", this.crieGuerre(), this.getType() , player, vitalite, force, agilite, intelligence);
    }

    /**
     * transmet la valeur de la vitalite du joueur.
     * @return la valeur de la vitalite.
     */
    public int getVitalite() {
        return vitalite;
    }

    /**
     * permet de redefinie la vitalite du joueur.
     * @param vitalite definie la vitalite du joueur
     * @return la valeur modifier de la vitalite
     */
    public Personnage setVitalite(int vitalite) {
        this.vitalite = vitalite;
        return this;
    }

    public int getForce() {
        return force;
    }

    public int getAgilite() {
        return agilite;
    }

    public int getNiveau() {
        return niveau;
    }

    public int getIntelligence() {
        return intelligence;
    }

    /**
     * definie le crie de guerre du personnage.
     * @return le crie du personnage.
     */
    public String crieGuerre(){

        if (player.equalsIgnoreCase("joueur 1")){
            return "Woarg";
        } else {
            return "Abracadabra";
        }
    }
}