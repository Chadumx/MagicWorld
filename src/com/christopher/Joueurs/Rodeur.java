package com.christopher.Joueurs;

import com.christopher.Joueurs.Personnage;

public class Rodeur extends Personnage {

    public Rodeur(String joueurName) {
        super(joueurName);
    }

    @Override
    public String getType() {
        return "Rôdeur";
    }

    @Override
    public void AttaqueBasique(Joueur defenseur) {

        int vitalite = defenseur.getClasse().getVitalite() - this.agilite;
        defenseur.getClasse().setVitalite(vitalite);

        System.out.printf("%s utilise %s et inflige %s dommages\n", this.player, "tire à l'arc", this.agilite);
        System.out.printf("%s perd %s points de vie\n", defenseur.getPlayerName(), this.agilite);
    }

    @Override
    public void AttaqueSpecial(Joueur defenseur) {

        int temp = this.agilite;
        this.agilite += this.niveau / 2;
        int gainAgilite = this.agilite - temp;

        System.out.printf("%s utilise %s et gagne %s en agilité\n", this.player, "concentration", gainAgilite);
    }
}