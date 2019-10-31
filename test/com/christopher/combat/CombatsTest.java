package com.christopher.combat;

import com.christopher.joueur.Joueur;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class CombatsTest {

    @Test
    void testAttaqueBasique(){

        // Initialise les futurs entrees claviers.
        System.setIn(new ByteArrayInputStream("2 100 0 100 0".getBytes()));

        Joueur attaquant = (new Joueur())
                .setClavier(new Scanner(System.in))
                .choix()
                ;

        // Initialise les futurs entrees claviers.
        System.setIn(new ByteArrayInputStream("3 100 0 0 100".getBytes()));

        Joueur defenseur = (new Joueur())
                .setClavier(new Scanner(System.in))
                .choix()
                ;

        System.setIn(new ByteArrayInputStream("1".getBytes()));

        Combats combat1 = new Combats();

        combat1.setClavier(new Scanner(System.in))
                .attaque(attaquant, defenseur)
        ;

        assertEquals(defenseur.getClasse().getVitalite(), 400);

    }

    @Test
    void testAttaqueSpecialeGuerrier() {

        // Initialise les futurs entrees claviers.
        System.setIn(new ByteArrayInputStream("1 100 100 0 0".getBytes()));

        Joueur attaquant = (new Joueur())
                .setClavier(new Scanner(System.in))
                .choix()
                ;

        // Initialise les futurs entrees claviers.
        System.setIn(new ByteArrayInputStream("3 100 0 0 100".getBytes()));

        Joueur defenseur = (new Joueur())
                .setClavier(new Scanner(System.in))
                .choix()
                ;

        System.setIn(new ByteArrayInputStream("2".getBytes()));

        Combats combat1 = new Combats();

        combat1.setClavier(new Scanner(System.in))
                .attaque(attaquant, defenseur)
        ;

        assertEquals(attaquant.getClasse().getVitalite(), 450);
        assertEquals(defenseur.getClasse().getVitalite(), 300);

    }

    @Test
    void testAttaqueSpecialeRodeur() {

        // Initialise les futurs entrees claviers.
        System.setIn(new ByteArrayInputStream("2 100 0 100 0".getBytes()));

        Joueur attaquant = (new Joueur())
                .setClavier(new Scanner(System.in))
                .choix()
                ;

        System.setIn(new ByteArrayInputStream("2".getBytes()));

        Combats combat1 = new Combats();

        combat1.setClavier(new Scanner(System.in))
                .attaque(attaquant, null)
        ;

        assertEquals(attaquant.getClasse().getAgilite(), 150);

    }

    @Test
    void testAttaqueSpecialeMage() {

        // Initialise les futurs entrees claviers.
        System.setIn(new ByteArrayInputStream("3 100 0 0 100".getBytes()));

        Joueur attaquant = (new Joueur())
                .setClavier(new Scanner(System.in))
                .choix()
                ;

        System.setIn(new ByteArrayInputStream("2".getBytes()));

        Combats combat1 = new Combats();

        combat1.setClavier(new Scanner(System.in))
                .attaque(attaquant, null)
        ;

        assertEquals(attaquant.getClasse().getVitalite(), 500);

    }
}