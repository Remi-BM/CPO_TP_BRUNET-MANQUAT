/*
 * Brunet-Manquat Rémi, TDC, Mini projet light off, 25/10/2023
 */
package lightoff_brunet.manquat_version_console;

import java.util.Random;

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

    /**
     * Ce constructeur permet de créer une nouvelle grille de cellules
     * lumineuses avec un nombre spécifié de lignes et de colonnes.
     *
     * @param p_nbLignes est le nombre de lignes que l'on souhaite pour notre
     * grille
     * @param p_nbColonnes est le nombre de colonnes que l'on souhaite pour
     * notre grille
     */
    public GrilleDeJeu(int p_nbLignes, int p_nbColonnes) {
        this.nbLignes = p_nbLignes;
        this.nbColonnes = p_nbColonnes;
        this.matriceCellule = new CelluleLumineuse[p_nbLignes][p_nbColonnes];

        for (int i = 0; i < p_nbLignes; i++) {
            for (int j = 0; j < p_nbColonnes; j++) {
                this.matriceCellule[i][j] = new CelluleLumineuse();
            }
        }
    }

    /**
     * Permet d'éteindre toutes les cellules de la grille en passant chaque
     * cellule en état "éteint".
     */
    public void eteindreToutesLesCellules() {
        for (int i = 0; i < this.nbLignes; i++) {
            for (int j = 0; j < this.nbColonnes; j++) {
                this.matriceCellule[i][j].eteindreCellule();
            }
        }
    }

    /**
     * Permet d'activer de manière aléatoire soit une ligne, soit une colonne,
     * soit une diagonale de cellules dans la grille.
     */
    public void activerLigneColonneOuDiagonaleAleatoire() {
        int nb_alea;
        int ligne_choisie;
        int colonne_choisie;
        int diagonnale_choisie;
        Random generateurAleat = new Random();
        nb_alea = generateurAleat.nextInt(3);

        if (nb_alea == 0) {
            ligne_choisie = generateurAleat.nextInt(this.nbLignes);
            for (int colonne = 0; colonne < this.nbColonnes; colonne++) {
                this.matriceCellule[ligne_choisie][colonne].activerCellule();
            }
        } else if (nb_alea == 1) {
            colonne_choisie = generateurAleat.nextInt(this.nbColonnes);
            for (int ligne = 0; ligne < this.nbLignes; ligne++) {
                this.matriceCellule[ligne][colonne_choisie].activerCellule();
            }
        } else {
            int cellule_a_parcourir = Math.min(this.nbLignes, this.nbColonnes);
            diagonnale_choisie = generateurAleat.nextInt(2);
            if (diagonnale_choisie == 0) {
                for (int i = 0; i < cellule_a_parcourir; i++) {
                    this.matriceCellule[i][i].activerCellule();
                }
            } else {
                for (int i = 0; i < cellule_a_parcourir; i++) {
                    for (int j = 0; j < cellule_a_parcourir; j++) {
                        if (cellule_a_parcourir - i - 1 == j) {
                            this.matriceCellule[i][j].activerCellule();
                        }
                    }
                }
            }
        }
    }

    /**
     * Permet de générer un plateau de cellules lumineuses de manière aléatoire
     * à partir d’un nombre spécifié de tours.
     *
     * @param nbTours correspond au nombre de changement aléatoire effectué
     */
    public void melangerMatriceAleatoirement(int nbTours) {
        eteindreToutesLesCellules();
        for (int i = 0; i < nbTours; i++) {
            activerLigneColonneOuDiagonaleAleatoire();
        }
    }

    /**
     * Permet d'activer toutes les cellules d'une ligne
     *
     * @param idLigne correspond à la ligne choisie
     */
    public void activerLigneDeCellules(int idLigne) {
        for (int i = 0; i < this.nbColonnes; i++) {
            this.matriceCellule[idLigne][i].activerCellule();
        }
    }

    /**
     * Permet d'activer toutes les cellules d'une colonne
     *
     * @param idColonne correspond à la colonne choisie
     */
    public void activerColonneDeCellules(int idColonne) {
        for (int i = 0; i < this.nbLignes; i++) {
            this.matriceCellule[i][idColonne].activerCellule();
        }
    }

    /**
     * Permet d'activer la diagonale descendante en allumant les cellules
     * correspondantes.
     */
    public void activerDiagonaleDescendante() {
        int cellule_a_parcourir = Math.min(this.nbLignes, this.nbColonnes);
        for (int i = 0; i < cellule_a_parcourir; i++) {
            this.matriceCellule[i][i].activerCellule();
        }
    }

    /**
     * Permet d'activer la diagonale montante en allumant les cellules
     * correspondantes.
     */
    public void activerDiagonaleMontante() {
        int cellule_a_parcourir = Math.min(this.nbLignes, this.nbColonnes);
        for (int i = 0; i < cellule_a_parcourir; i++) {
            for (int j = 0; j < cellule_a_parcourir; j++) {
                if (cellule_a_parcourir - i - 1 == j) {
                    this.matriceCellule[i][j].activerCellule();
                }
            }
        }
    }

    /**
     * Permet de vérifier si toutes les cellules de la grille sont éteintes.
     * Elle retourne true si toutes les cellules sont éteintes, et false sinon.
     */
    public boolean cellulesToutesEteintes() {
        int verif = 0;
        for (int i = 0; i < this.nbLignes; i++) {
            for (int j = 0; j < this.nbColonnes; j++) {
                if (this.matriceCellule[i][j].estEteint() == false) {
                    verif += 1;
                }
            }
        }
        if (verif != 0) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * Permer d'afficher l'état de la grille sous forme d'une représentation
     * visuelle organisée. Elle crée une chaîne de caractères avec des indices
     * pour les lignes et les colonnes, ainsi que des caractères "X" et "O" pour
     * représenter l'état des cellules.
     *
     * @return correspond à la grille de jeu à afficher
     */
    @Override
    public String toString() {
        String grille = "   |"; // initialistaion de la première ligne
        for (int i = 0; i < this.nbColonnes; i++) {
            grille += " " + i + " |";
        }

        grille += "\n";
        for (int i = 0; i < this.nbColonnes + 1; i++) {
            grille += "----";
        }

        for (int i = 0; i < this.nbLignes * 2; i++) {
            grille += "\n";
            if (i % 2 == 0) {
                for (int j = 0; j < this.nbColonnes + 1; j++) {
                    if (j == 0) {
                        grille += " " + i / 2 + " |";
                    } else {
                        grille += " " + this.matriceCellule[i / 2][j - 1].toString() + " |";
                    }
                }
            } else {
                for (int j = 0; j < this.nbColonnes + 1; j++) {
                    grille += "----";
                }
            }
        }
        return grille;
    }
}
