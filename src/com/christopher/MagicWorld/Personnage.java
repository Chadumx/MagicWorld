package com.christopher.MagicWorld;

import java.util.Scanner;

public abstract class Personnage<AttaqueInterface> {

    public abstract String getType();

    private int niveau, force, agilite, intelligence, vitalite;
    public AttaqueInterface AttaqueBasique;
    public AttaqueInterface AttaqueSpecial;

    public Personnage (String player) {
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

        System.out.printf("%s je suis le %s du %s je possede %s de vitalité, %s de Force, %s d'agilité et %s d'intelligence !\n", this.crieGuerre(player), this.getType() , player, vitalite, force, agilite, intelligence);

}

    public String crieGuerre(String player){
        String temp = null;
        if (player.equalsIgnoreCase("joueur n°1")){
            temp = "Woarg";
        } else {
            temp = "Abracadabra";
        }
        return temp;
    }

    public AttaqueInterface getAttaqueBasique() {
        return AttaqueBasique;
    }

    public AttaqueInterface getAttaqueSpecial(){
        return AttaqueSpecial;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getAgilite() {
        return agilite;
    }

    public void setAgilite(int agilite) {
        this.agilite = agilite;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getVitalite() {
        return vitalite;
    }

    public void setVitalite(int vitalite) {
        this.vitalite = vitalite;
    }
}
