package com.christopher.Joueurs;

/**
 *definie la methode des differentes attaques de la classe mage.
 */
public class Mage extends Personnage {

    public final int VITALITE = this.vitalite;

    /**
     * defini les attributs de la classe mage.
     * @param joueurName donne le nom du joueur.
     */
    public Mage(String joueurName) {
        super(joueurName);
    }

    /**
     * permet de retourne le nom de la classe mage.
     * @return le nom de la classse mage.
     */
    @Override
    public String getType() {
        return "Mage";
    }

    /**
     * definie l'attaque basique de la classe mage.
     * @param defenseur donne les attributs du defenseur.
     */
    @Override
    public void AttaqueBasique(Joueur defenseur) {

        int vitalite = defenseur.getClasse().getVitalite() - this.intelligence;
        defenseur.getClasse().setVitalite(vitalite);

        System.out.printf("%s utilise %s et inflige %s dommages\n", this.player, "boule de feu", this.intelligence);
        System.out.printf("%s perd %s points de vie\n", defenseur.getPlayerName(), this.intelligence);
    }

    /**
     * definie l'attaque speciale de la classe mage.
     * @param defenseur donne les attributs du defenseur.
     */
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