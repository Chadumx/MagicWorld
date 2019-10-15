package com.christopher.MagicWorld;

import java.util.Scanner;

public abstract class Personnage {

    public abstract String getType();
    public abstract int AttaqueBasique();
    public abstract int AttaqueSpecial();

    protected int niveau, force, agilite, intelligence, vitalite;

    public Personnage () {
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

        System.out.printf("%s je suis le %s du %s je possede %s de vitalité, %s de Force, %s d'agilité et %s d'intelligence !\n", this.crieGuerre(), this.getType() , 12, vitalite, force, agilite, intelligence);
    }

    public String crieGuerre(){
        String temp = null;
        if (true){//getClass()..equalsIgnoreCase("joueur 1")){
            temp = "Woarg";
        } else {
            temp = "Abracadabra";
        }
        return temp;
    }

    public int getVitalite() {
        return this.vitalite;
    }

    public int getForce() {
        return force;
    }

    public int getAgilite() {
        return agilite;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getNiveau() {
        return niveau;
    }
}
