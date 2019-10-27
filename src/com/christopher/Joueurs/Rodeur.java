package com.christopher.Joueurs;

/**
 *definie la methode des differentes attaques de la classe rodeur.
 */
public class Rodeur extends Personnage {
    /**
     *permet de definir les attributs de la classe rodeur.
     * @param joueurName donne le nom du joueur.
     */
    public Rodeur(String joueurName)  {
        super(joueurName);
    }

    /**
     *permet de retourner le nom de la classe rodeur.
     * @return le nom de la classe rodeur.
     */
    @Override
    public String getType() {
        return "Rôdeur";
    }

    /**
     *definie l'attause basique de la classe rodeur.
     * @param defenseur donne les attributs du defenseur.
     */
    @Override
    public void AttaqueBasique(Joueur defenseur) {

        int vitalite = defenseur.getClasse().getVitalite() - this.agilite;
        defenseur.getClasse().setVitalite(vitalite);

        System.out.printf("%s utilise %s et inflige %s dommages\n", this.player, "tire à l'arc", this.agilite);
        System.out.printf("%s perd %s points de vie\n", defenseur.getPlayerName(), this.agilite);
    }

    /**
     * defini l'attaque speciale de la classe rodeur.
     * @param defenseur donne les attributs du defenseur.
     */
    @Override
    public void AttaqueSpecial(Joueur defenseur) {

        int temp = this.agilite;
        this.agilite += this.niveau / 2;
        int gainAgilite = this.agilite - temp;

        System.out.printf("%s utilise %s et gagne %s en agilité\n", this.player, "concentration", gainAgilite);
    }
}