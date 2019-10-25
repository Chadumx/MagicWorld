package com.christopher.Joueurs;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Personnage {

    public abstract String getType();
    public abstract void AttaqueBasique(Joueur defenseur);
    public abstract void AttaqueSpecial(Joueur defenseur);

    protected String player;

    protected int niveau, force, agilite, intelligence, vitalite;

    public Personnage(String joueurName) {

       this.player = joueurName;
       boolean testValeur = true;
       Scanner clavier = new Scanner(System.in);

        do {
            try {
                System.out.println("Niveau du personnage ?");
                this.niveau = clavier.nextInt();
                System.out.println("Force du personnage ?");
                this.force = clavier.nextInt();
                System.out.println("agilité du personnage ?");
                this.agilite = clavier.nextInt();
                System.out.println("Intelligence du personnage ?");
                this.intelligence = clavier.nextInt();
                if (niveau != force + agilite + intelligence) {
                    System.out.println("La somme total de la Force, de l'Agilité et de l'Intellignace doit être égal au niveau !\nRecommencez :");
                }
                testValeur = true;
            } catch (InputMismatchException e) {
                System.out.printf("Erreur de frappe, seul les nombres entiers sont accepté !\nRecommencez :\n");
                clavier.nextLine();
                testValeur = false;
            }
        } while (niveau != force + agilite + intelligence || testValeur == false);

        this.vitalite = niveau * 5;

        System.out.printf("%s je suis le %s du %s je possede %s de vitalité, %s de Force, %s d'agilité et %s d'intelligence !\n", this.crieGuerre(), this.getType() , player, vitalite, force, agilite, intelligence);
    }

    public int getVitalite() {
        return vitalite;
    }

    public int setVitalite(int vitalite) {
        this.vitalite = vitalite;
        return vitalite;
    }

    public String crieGuerre(){
        String temp = null;
        if (player.equalsIgnoreCase("joueur 1")){
            temp = "Woarg";
        } else {
            temp = "Abracadabra";
        }
        return temp;
    }
}
