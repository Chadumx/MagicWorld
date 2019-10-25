package com.christopher.Joueurs;

public class Guerrier extends Personnage {

    public Guerrier(String joueurName) {
        super(joueurName);
    }

    @Override
    public String getType() {
        return "Guerrier";
    }

    @Override
    public void AttaqueBasique(Joueur defenseur) {

        int vitalite = defenseur.getClasse().getVitalite() - this.force;
        defenseur.getClasse().setVitalite(vitalite);

        System.out.printf("%s utilise %s et inflige %s dommages\n", this.player, "coup d'épée", this.force);
        System.out.printf("%s perd %s points de vie\n", defenseur.getPlayerName(), this.force);
    }

    @Override
    public void AttaqueSpecial(Joueur defenseur) {

        int vitalite = defenseur.getClasse().getVitalite() - (this.force * 2);
        defenseur.getClasse().setVitalite(vitalite);

        this.vitalite -= (this.force / 2);

        System.out.printf("%s utilise %s et inflige %s de dommages\n", this.player, "coup de rage", (this.force * 2));
        System.out.printf("%s perd %s point de vie\n", defenseur.getPlayerName(), (this.force * 2));
        System.out.printf("%s perd %s points de vie\n", this.player, (this.force / 2));
    }
}
