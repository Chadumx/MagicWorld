package com.christopher.partie;

import com.christopher.combat.Combats;
import com.christopher.joueur.Joueur;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

/**
 * test le resultat de la methode fin().
 */
class PartieTest {

    @Test
    void testFin() {

        // Initialise les futurs entrees claviers.
        System.setIn(new ByteArrayInputStream("1 100 100 0 0".getBytes()));

        Joueur attaquant = (new Joueur())
                .setClavier(new Scanner(System.in))
                .choix();

        // Initialise les futurs entrees claviers.
        System.setIn(new ByteArrayInputStream("3 1 0 0 1".getBytes()));

        Joueur defenseur = (new Joueur())
                .setClavier(new Scanner(System.in))
                .choix();

        System.setIn(new ByteArrayInputStream("1".getBytes()));

        Combats combat1 = new Combats();

        combat1.setClavier(new Scanner(System.in))
                .attaque(attaquant, defenseur)
        ;

        assertEquals(Partie.fin(attaquant, defenseur), "Joueur 2 a perdu !");
    }
}