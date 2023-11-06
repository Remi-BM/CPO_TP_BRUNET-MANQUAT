/*
 * Brunet-Manquat Rémi, TDC, Mini projet light off, 25/10/2023
 */
package lightoff_brunet.manquat_version_console;

import java.util.Scanner;

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
        while (this.grille.cellulesToutesEteintes()==true){
            this.grille.melangerMatriceAleatoirement(10);
        }
    }
    
    /**
     * Elle permet de jouer au jeu LightOff en affichant l'état initial de la 
     * grille, puis en entrant dans une boucle de jeu qui continue tant que 
     * toutes les cellules ne sont pas éteintes.
     */
    public void lancerPartie(){
        Scanner sc= new Scanner(System.in);
        System.out.println(this.grille.toString());
        while(this.grille.cellulesToutesEteintes()==false){
            System.out.println("\nSelectionner l'action que vous voulez faire. (0 => ligne ; 1 => colonne ; 2 => diagonnale descendante ; 3 => diagonnale montante)");
            int saisie=sc.nextInt(4);
            // Les erreurs de saisies utilisateur ne sont pas encore traitées, c'est l'une des premières amélirations qui va être mise en place.
            if (saisie==0){
                System.out.println("\nSelectionnez le numéro de la ligne à changer :");
                int num_ligne=sc.nextInt(7);
                this.grille.activerLigneDeCellules(num_ligne);
                this.nbCoups+=1;
                System.out.println("\nVotre nombre de coups joués est de : "+this.nbCoups);
                
            }else if (saisie==1){
                System.out.println("\nSelectionnez le numéro de la colonne à changer :");
                int num_colonne=sc.nextInt(7);
                this.grille.activerColonneDeCellules(num_colonne);
                this.nbCoups+=1;
                System.out.println("\nVotre nombre de coups joués est de : "+this.nbCoups);
                
            }else if (saisie==2){
                this.grille.activerDiagonaleDescendante();
                this.nbCoups+=1;
                System.out.println("\nVotre nombre de coups joués est de : "+this.nbCoups);
                
            }else{
                this.grille.activerDiagonaleMontante();
                this.nbCoups+=1;
                System.out.println("\nVotre nombre de coups joués est de : "+this.nbCoups);
                
            }
            System.out.println("\n"+this.grille.toString());
        }
        System.out.println("Vous avez réussi ! Votre nombre de coups est de : "+this.nbCoups);
    }
}
