package com.christopher.Joueurs;

import java.util.Scanner;

public abstract class Personnage {

    public abstract String getType();
    public abstract int AttaqueBasique();
    public abstract int AttaqueSpecial();
    public abstract String NomAttaqueBasique();
    public abstract String NomAttaqueSpecial();

    protected String player;

    protected int niveau, force, agilite, intelligence, vitalite;

    public Personnage(String joueurName) {

       this.player = joueurName;
        Scanner clavier = new Scanner(System.in);
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

        this.vitalite = niveau * 5;

        System.out.printf("%s je suis le %s du %s je possede %s de vitalité, %s de Force, %s d'agilité et %s d'intelligence !\n", this.crieGuerre(), this.getType() , player, vitalite, force, agilite, intelligence);
    }

    public int getNiveau() {
        return niveau;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getAgilite() {
        return agilite;
    }

    public int getForce() {
        return force;
    }

    public int getVitalite() {
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

    public String getPlayer() {
        return player;
    }
}
