package com.christopher.Joueur;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class JoueurTest {

    /*
     * joueur test a pour but de tester la creation du personnage et l'entrée des valeurs dans les differents attributs.
     */
    @Test
    public void testGuerrier() {

        // Initialise les futurs entrees claviers.
        System.setIn(new ByteArrayInputStream("1 100 100 0 0".getBytes()));

        Joueur joueur = (new Joueur())
                .setClavier(new Scanner(System.in))
                .choix()
                ;

        // Verifie que l on a bien le guerrier niveau 100, avec les bonnes caracteristiques.
        assertTrue(joueur.getClasse() instanceof Guerrier);
        assertEquals(joueur.getClasse().getNiveau(), 100);
        assertEquals(joueur.getClasse().getForce(), 100);
        assertEquals(joueur.getVitalite(), 500);
    }

    @Test
    public void testRodeur() {

        // Initialise les futurs entrees claviers.
        System.setIn(new ByteArrayInputStream("2 100 0 100 0".getBytes()));

        Joueur joueur = (new Joueur())
                .setClavier(new Scanner(System.in))
                .choix()
                ;

        // Verifie que l on a bien le rodeur niveau 100, avec les bonnes caracteristiques.
        assertTrue(joueur.getClasse() instanceof Rodeur);
        assertEquals(joueur.getClasse().getNiveau(), 100);
        assertEquals(joueur.getClasse().getAgilite(), 100);
        assertEquals(joueur.getVitalite(), 500);
    }

    @Test
    public void testMage() {

        // Initialise les futurs entrees claviers.
        System.setIn(new ByteArrayInputStream("3 100 0 0 100".getBytes()));

        Joueur joueur = (new Joueur())
                .setClavier(new Scanner(System.in))
                .choix()
                ;

        // Verifie que l on a bien le mage niveau 100, avec les bonnes caracteristiques.
        assertTrue(joueur.getClasse() instanceof Mage);
        assertEquals(joueur.getClasse().getNiveau(), 100);
        assertEquals(joueur.getClasse().getIntelligence(), 100);
        assertEquals(joueur.getVitalite(), 500);
    }
}