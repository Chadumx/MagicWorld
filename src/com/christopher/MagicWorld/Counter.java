package com.christopher.MagicWorld;

// Counter est singleton, c'est à dire une classe qui est instanciée une seule fois dans tout mon code.
// En mettant private Counter, on crée une sorte de classe static accessible de partout avec les mêmes attributs dans
// toute l'application.
public class Counter
{
    // implémenté sous forme de singleton //
    private static Counter singleton = new Counter();

    // Le nombre du compteur
    private int number =  1;

    // On empêche l'instanciation de la classe pour éviter d'avoir de multiple "Counter / Compteur"
    private Counter()
    {
        // protection
    }

    // Etant static on accède de partout au même Objet Counter qui se contient lui même (donc une seule fois)
    public static Counter getInstance()
    {
        return singleton;
    }

    public int getCounter()
    {
        return number;
    }

    public void increment()
    {
       number += 1;
    }
}

