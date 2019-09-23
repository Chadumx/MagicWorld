package com.christopher.MagicWorld;

import java.util.Scanner;

public abstract class Personnage {

    public abstract String getType();

    Scanner clavier = new Scanner(System.in);

    private int niveau, force, agilite, intelligence;
    private int nbr;

    private String temp = null;

    public void personnage (int niveau, int force, int agilite, int intelligence) {
        this.niveau = niveau;
        this.force = force;
        this.agilite = agilite;
        this.intelligence = intelligence;
    }

    public Personnage remplir (String player) {
        do {

            System.out.println("Niveau du personnage ?");
                this.niveau = clavier.nextInt();

            System.out.println("Force du personnage ?");
                this.force = clavier.nextInt();

            System.out.println("agilité du personnage ?");
                this.agilite = clavier.nextInt();

            System.out.println("Intelligence du personnage ?");
                this.intelligence = clavier.nextInt();

            if (niveau != force + agilite + intelligence){
                System.out.println("La somme total de la Force, de l'Agilité et de l'Intellignace doit être égal au niveau : \nRecommencez :");
            }

        } while (niveau != force + agilite + intelligence);


        if (player == "joueur n°1"){
            temp = "Woarg";
        } else {
            temp = "Abracadabra";
        }

        System.out.printf("%s je suis le %s du %s\n", temp, this.getType() , player);

        return this;

    }
}
