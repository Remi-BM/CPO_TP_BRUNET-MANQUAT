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
    int nbCoupsMax;
    int taille;
    Scanner sc= new Scanner(System.in);
    

    /**
     * Ce constructeur permet de créé une nouvelle instance de la grille de 
     * cellules lumineuses et initialise le compteur nbCoups à zéro.
     */
    public Partie() {        
        this.nbCoups = 0;
    }
    
    /**
     * Cette méthode permet d’initialiser la partie ; Elle s’assure que la 
     * grille de jeu est bien mélangée.
     */
    public void initialiserPartie(int NivDifficulte){
        if (NivDifficulte==0){
          this.grille = new GrilleDeJeu(5,5);
          this.taille=5;
          this.nbCoupsMax=-1;
        }else if (NivDifficulte==1){
            this.grille = new GrilleDeJeu(7,7);
            this.taille=7;
          this.nbCoupsMax=-1;
        }else if (NivDifficulte==2){
            this.grille = new GrilleDeJeu(9,9);
            this.taille=9;
            this.nbCoupsMax=-1;
        }else if (NivDifficulte==3){
            this.grille = new GrilleDeJeu(7,7);
            this.taille=7;
            this.nbCoupsMax=15;
        }else if (NivDifficulte==4){
            this.grille = new GrilleDeJeu(9,9);
            this.taille=9;
            this.nbCoupsMax=10;
        }else{
            this.grille = new GrilleDeJeu(7,7);
            this.taille=7;
            this.nbCoupsMax=-2;
        }
        while (this.grille.cellulesToutesEteintes()==true){
            this.grille.melangerMatriceAleatoirement(10);
        }
    }
    
    
    public int selectionDifficulte(){
        System.out.println("Selectionner la difficulté. (0 => Facile ; 1 => Moyenne ; 2 => Difficile ; 3 => Challenge ; 4 => Cauchemar ; 5 => Speedrun)");
        int difficulte=sc.nextInt(6);
        return difficulte;
    }
    
    public void deroulerPartie(){
        System.out.println("\n"+this.grille.toString());
        int coupRest=this.nbCoupsMax;
        boolean modeSpeedrun;
        long debut=System.currentTimeMillis(); // on l'initialise pour pas avoir d'erreur de syntaxe
        if (this.nbCoupsMax==-2){
            modeSpeedrun=true;
            debut = System.currentTimeMillis();
        }
        else{
            modeSpeedrun=false;
        }
        
        while(this.grille.cellulesToutesEteintes()==false && this.nbCoupsMax!=0){
            System.out.println("\nSelectionner l'action que vous voulez faire. (0 => ligne ; 1 => colonne ; 2 => diagonnale descendante ; 3 => diagonnale montante)");
            int saisie=sc.nextInt(4);
            if (saisie==0){
                System.out.println("\nSelectionnez le numéro de la ligne à changer :");
                int num_ligne=sc.nextInt(this.taille);
                this.grille.activerLigneDeCellules(num_ligne);
                this.nbCoups+=1;
                this.nbCoupsMax-=1;
                if (this.nbCoupsMax>0){
                    coupRest-=1;
                    System.out.println("\nIl vous reste : "+coupRest+" coups à jouer !");
                }
                System.out.println("\nVotre nombre de coups joués est de : "+this.nbCoups);
                
            }else if (saisie==1){
                System.out.println("\nSelectionnez le numéro de la colonne à changer :");
                int num_colonne=sc.nextInt(this.taille);
                this.grille.activerColonneDeCellules(num_colonne);
                this.nbCoups+=1;
                this.nbCoupsMax-=1;
                if (this.nbCoupsMax>0){
                    coupRest-=1;
                    System.out.println("\nIl vous reste : "+coupRest+" coups à jouer !");
                }
                System.out.println("\nVotre nombre de coups joués est de : "+this.nbCoups);
                
            }else if (saisie==2){
                this.grille.activerDiagonaleDescendante();
                this.nbCoups+=1;
                this.nbCoupsMax-=1;
                if (this.nbCoupsMax>0){
                    coupRest-=1;
                    System.out.println("\nIl vous reste : "+coupRest+" coups à jouer !");
                }
                System.out.println("\nVotre nombre de coups joués est de : "+this.nbCoups);
                
            }else{
                this.grille.activerDiagonaleMontante();
                this.nbCoups+=1;
                this.nbCoupsMax-=1;
                if (this.nbCoupsMax>0){
                    coupRest-=1;
                    System.out.println("\nIl vous reste : "+coupRest+" coups à jouer !");
                }
                System.out.println("\nVotre nombre de coups joués est de : "+this.nbCoups);
                
            }
            System.out.println("\n"+this.grille.toString());
        }
        
        if (modeSpeedrun==true){
            long fin = System.currentTimeMillis();
            long tempsEcoule = fin - debut;
            long minutes = tempsEcoule / (60 * 1000);
            long secondes = (tempsEcoule % (60 * 1000)) / 1000;                    
            long millisecondes = tempsEcoule % 1000;
            String tempsFormate = String.format("%02dmin %02ds %03dms", minutes, secondes, millisecondes);        
            System.out.println("\nVous avez réussi ! Votre nombre de coups est de : "+this.nbCoups);
            System.out.println("\nVotre temps est de : "+tempsFormate);
        }
        else{
            if (this.grille.cellulesToutesEteintes()==true){
               System.out.println("Vous avez réussi ! Votre nombre de coups est de : "+this.nbCoups); 
            }
            else{
               System.out.println("Vous avez perdu !"); 
            }
        }        
    }    
    
    /**
     * Elle permet de jouer au jeu LightOff en affichant l'état initial de la 
     * grille, puis en entrant dans une boucle de jeu qui continue tant que 
     * toutes les cellules ne sont pas éteintes.
     */
    public void lancerPartie(){        
        int ChoixDifficulte=selectionDifficulte();
        initialiserPartie(ChoixDifficulte);
        deroulerPartie();        
    }
}
