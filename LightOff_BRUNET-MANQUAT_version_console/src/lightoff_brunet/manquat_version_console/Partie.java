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
    int nbCoupsMax; // Definit le nb de coup max selon le mode de difficulté (permet egalement de savoir le difficulté)
    int taille; // Taille de la grille créée
    Scanner sc= new Scanner(System.in);
    

    /**
     * Ce constructeur permet d'initialiser le compteur nbCoups à zéro.
     */
    public Partie() {        
        this.nbCoups = 0;
    }
    
    /**
     * Cette méthode permet d’initialiser la partie avec la configuration 
     * correspondante au niveau de difficulte choisie. De plus elle s’assure que 
     * la grille de jeu est bien mélangée.
     * 
     * @param NivDifficulte est le niveau de difficulte choisi par le joueur 
     * (entier compris entre 0 et 5)
     */
    public void initialiserPartie(int NivDifficulte){
        if (NivDifficulte==0){ 
          // niv facile
          this.grille = new GrilleDeJeu(5,5);
          this.taille=5;
          this.nbCoupsMax=-1; // permet de savoir qu'on n'a pas de coups max
        }else if (NivDifficulte==1){ 
            // niv moyen
            this.grille = new GrilleDeJeu(7,7);
            this.taille=7;
          this.nbCoupsMax=-1; // permet de savoir qu'on n'a pas de coups max
        }else if (NivDifficulte==2){ 
            // niv diff
            this.grille = new GrilleDeJeu(9,9);
            this.taille=9;
            this.nbCoupsMax=-1; // permet de savoir qu'on n'a pas de coups max
        }else if (NivDifficulte==3){ 
            // niv challenge
            this.grille = new GrilleDeJeu(7,7);
            this.taille=7;
            this.nbCoupsMax=15;
        }else if (NivDifficulte==4){ 
            // niv cauchemar
            this.grille = new GrilleDeJeu(9,9);
            this.taille=9;
            this.nbCoupsMax=10;
        }else{ 
            // niv speedrun
            this.grille = new GrilleDeJeu(7,7);
            this.taille=7;
            this.nbCoupsMax=-2; // permet de savoir qu'on n'a pas de coups max et qu'on est en speedrun (donc chrono)
        }
        while (this.grille.cellulesToutesEteintes()==true){
            // permet de ne pas avoir de grille déjà toute éteinte
            this.grille.melangerMatriceAleatoirement(10);
        }
    }
    
    /**
     * Cette méthode permet de demander au joueur à qu'elle mode de jeu il 
     * souhaite jouer. Puis elle renvoie un entier correspondant au niv de 
     * difficulté choisi.
     * 
     * @return entier correspondant au niv de difficulte
     */
    public int selectionDifficulte(){
        System.out.println("Selectionner la difficulté. (0 => Facile ; 1 => Moyenne ; 2 => Difficile ; 3 => Challenge ; 4 => Cauchemar ; 5 => Speedrun)");
        int difficulte=sc.nextInt(6);
        return difficulte;
    }
    
    /**
     * Cette méthode permet de jouer au jeu LightOff en affichant l'état initial
     * de la grille, puis en entrant dans une boucle de jeu correspond à la 
     * difficulté choisie et qui continue tant que toutes les cellules ne sont 
     * pas éteintes.
     */
    public void deroulerPartie(){
        int coupRest=this.nbCoupsMax; // ne sert que pour les modes de jeu qui ont un nb de coups limités
        boolean modeSpeedrun;
        long debut=System.currentTimeMillis(); // on initialise le debut du temps du timer pour pas avoir d'erreur de syntaxe
        
        System.out.println("\n"+this.grille.toString()); // permier affichage de grille
        
        // On teste si la difficulté choisie est speedrun et si oui on initialise le timer et le mode de jeu
        if (this.nbCoupsMax==-2){            
            modeSpeedrun=true;
            debut = System.currentTimeMillis();
        }
        else{
            modeSpeedrun=false;
        }
        
        
        // boucle déroulé jeu
        // Dans la boucle on fait un double test pour savoir si le joueur a gagné ou s'il a perdu et donc nb coups=0
        // C'est pour ça que pour les modes de jeu sans limite de coups le nbcoupsmax <0
        while(this.grille.cellulesToutesEteintes()==false && this.nbCoupsMax!=0){
            System.out.println("\nSelectionner l'action que vous voulez faire. (0 => ligne ; 1 => colonne ; 2 => diagonnale descendante ; 3 => diagonnale montante)");
            int saisie=sc.nextInt(4);
            
            // Ligne selectionnée
            if (saisie==0){
                System.out.println("\nSelectionnez le numéro de la ligne à changer :");
                int num_ligne=sc.nextInt(this.taille);
                this.grille.activerLigneDeCellules(num_ligne);
                this.nbCoups+=1;
                this.nbCoupsMax-=1;
                if (this.nbCoupsMax>0){ // test qui ne s'effectue que si le mode de jeu a un nb de coup limité
                    coupRest-=1;
                    System.out.println("\nIl vous reste : "+coupRest+" coups à jouer !");
                }
                System.out.println("\nVotre nombre de coups joués est de : "+this.nbCoups);
            
            // Colonne selectionnée    
            }else if (saisie==1){
                System.out.println("\nSelectionnez le numéro de la colonne à changer :");
                int num_colonne=sc.nextInt(this.taille);
                this.grille.activerColonneDeCellules(num_colonne);
                this.nbCoups+=1;
                this.nbCoupsMax-=1;
                if (this.nbCoupsMax>0){ // test qui ne s'effectue que si le mode de jeu a un nb de coup limité
                    coupRest-=1;
                    System.out.println("\nIl vous reste : "+coupRest+" coups à jouer !");
                }
                System.out.println("\nVotre nombre de coups joués est de : "+this.nbCoups);
            
            // Diag descendante selectionnée    
            }else if (saisie==2){
                this.grille.activerDiagonaleDescendante();
                this.nbCoups+=1;
                this.nbCoupsMax-=1;
                if (this.nbCoupsMax>0){ // test qui ne s'effectue que si le mode de jeu a un nb de coup limité
                    coupRest-=1;
                    System.out.println("\nIl vous reste : "+coupRest+" coups à jouer !");
                }
                System.out.println("\nVotre nombre de coups joués est de : "+this.nbCoups);
            
            // Diag montante selectionnée    
            }else{
                this.grille.activerDiagonaleMontante();
                this.nbCoups+=1;
                this.nbCoupsMax-=1;
                if (this.nbCoupsMax>0){ // test qui ne s'effectue que si le mode de jeu a un nb de coup limité
                    coupRest-=1;
                    System.out.println("\nIl vous reste : "+coupRest+" coups à jouer !");
                }
                System.out.println("\nVotre nombre de coups joués est de : "+this.nbCoups);
                
            }
            System.out.println("\n"+this.grille.toString());
        }
        
        // Gestion fin de partie
        // premier test pour le cas du speedrun
        if (modeSpeedrun==true){
            long fin = System.currentTimeMillis(); // permet d'avoir le temps d'arret du timer
            long tempsEcoule = fin - debut; // permet d'avoir le temps de jeu
            
            // permet de convertir le temps en ms pour  un affichage jolie
            long minutes = tempsEcoule / (60 * 1000);
            long secondes = (tempsEcoule % (60 * 1000)) / 1000;                    
            long millisecondes = tempsEcoule % 1000;
            
            // format d'affichage du temps
            String tempsFormate = String.format("%02dmin %02ds %03dms", minutes, secondes, millisecondes);
            
            // Affichage victoire + temps
            System.out.println("\nVous avez réussi ! Votre nombre de coups est de : "+this.nbCoups);
            System.out.println("\nVotre temps est de : "+tempsFormate);
        }
        // fin partie pour mode de jeu autre que speedrun
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
     * Elle permet de jouer au jeu en lançant toutes les méthodes permettant 
     * de jouer.
     */
    public void lancerPartie(){        
        int ChoixDifficulte=selectionDifficulte();
        initialiserPartie(ChoixDifficulte);
        deroulerPartie();        
    }
}
