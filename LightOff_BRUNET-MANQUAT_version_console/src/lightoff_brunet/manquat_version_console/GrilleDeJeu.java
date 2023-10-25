/*
 * Brunet-Manquat Rémi, TDC, Mini projet light off, 25/10/2023
 */
package lightoff_brunet.manquat_version_console;

/**
 * Cette classe représente une grille de cellules lumineuses. Cette grille est
 * organisée en lignes et en colonnes.
 * 
 * @author rembr
 */
public class GrilleDeJeu {
    CelluleLumineuse[][] matriceCellule;
    int nbLignes;
    int nbColonnes;

    public GrilleDeJeu(int nbLignes, int nbColonnes) {
        this.nbLignes = nbLignes;
        this.nbColonnes = nbColonnes;
    }
    
    
}
