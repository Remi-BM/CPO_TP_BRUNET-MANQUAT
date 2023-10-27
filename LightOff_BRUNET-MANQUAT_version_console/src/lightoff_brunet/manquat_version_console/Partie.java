/*
 * Brunet-Manquat Rémi, TDC, Mini projet light off, 25/10/2023
 */
package lightoff_brunet.manquat_version_console;

/**
 * Cette classe permet la création d'une partie de jeu LightOff en utilisant une
 * grille de cellules. Elle permet de jouer au jeu.
 * @author rembr
 */
public class Partie {
    GrilleDeJeu grille;
    int nbCoups;

    /**
     * Ce constructeur permet de créé une nouvelle instance de la grille de 
     * cellules lumineuses et initialise le compteur nbCoups à zéro.
     */
    public Partie() {
        this.grille = new GrilleDeJeu(7,7);
        this.nbCoups = 0;
    }
    
    /**
     * Cette méthode permet d’initialiser la partie ; Elle s’assure que la 
     * grille de jeu est bien mélangée.
     */
    public void initialiserPartie(){
        while (this.grille.cellulesToutesEteintes()==false){
            this.grille.melangerMatriceAleatoirement(10);
        }
    }
    
    public void lancerPartie(){
        System.out.println(this.grille.toString());
        while(this.grille.cellulesToutesEteintes()==false){
            
        }
    }
}
