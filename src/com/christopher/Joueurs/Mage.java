package com.christopher.Joueurs;

public class Mage extends Personnage {

    public final int VITALITE = this.vitalite;

    public Mage(String joueurName) {
        super(joueurName);
    }

    @Override
    public String getType() {
        return "Mage";
    }

    @Override
    public void AttaqueBasique(Joueur defenseur) {

        int vitalite = defenseur.getClasse().getVitalite() - this.intelligence;
        defenseur.getClasse().setVitalite(vitalite);

        System.out.printf("%s utilise %s et inflige %s dommages\n", this.player, "boule de feu", this.intelligence);
        System.out.printf("%s perd %s points de vie\n", defenseur.getPlayerName(), this.intelligence);
    }

    @Override
    public void AttaqueSpecial(Joueur defenseur) {

        int temp = this.vitalite;
        this.vitalite += this.intelligence * 2;

        if (this.vitalite > VITALITE){
            this.vitalite = VITALITE;
        }

        int gainVitalite = this.vitalite - temp;

        System.out.printf("%s utilise %s et gagne %s en vitalité\n", this.player, "soin", gainVitalite);
    }
}
