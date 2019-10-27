package com.christopher.Partie;

/** Counter est un singleton, permet d'attribuer un numero unique à chaque joueur.
 */
public class Counter
{
    // creation du singleton
    private static Counter singleton = new Counter();

    // initialisation de la variable number
    private int number =  1;

    // Empêche l'instanciation de plusieur Counter
    private Counter()
    {
    }

    /**
     * Etant static on accède de partout au même
     * Objet Counter qui se contient lui même (donc une seule fois).
     * @return retourne la valeur de singleton
     */
    public static Counter getInstance()
    {
        return singleton;
    }

    /**
     * permet d'interoger la valeur de number.
     * @return retourne la valeur de number.
     */
    public int getCounter()
    {
        return number;
    }

    // incremente number de +1 a chaque appele de l'instance
    public void increment()
    {
       number += 1;
    }
}

