package com.christopher.joueur;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class JoueurTest {

    /**
     * test la creation d'un personnage de classe guerrier.
     */
    @Test
    public void testCreationGuerrier() {

        // Initialise les futurs entrees claviers.
        System.setIn(new ByteArrayInputStream("1 100 100 0 0".getBytes()));

        // Simule les entrees claviers.
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

    /**
     * test la creation d'un personnage de classe rodeur.
     */
    @Test
    public void testCreationRodeur() {

        // Initialise les futurs entrees claviers.
        System.setIn(new ByteArrayInputStream("2 100 0 100 0".getBytes()));

        // Simule les entrees claviers.
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

    /**
     * test la creation d'un personnage de classe mage.
     */
    @Test
    public void testCreationMage() {

        // Initialise les futurs entrees claviers.
        System.setIn(new ByteArrayInputStream("3 100 0 0 100".getBytes()));

        // Simule les entrees claviers.
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