/*
 * Brunet-Manquat Rémi, TDC, TP1, EX1 manipNombresInt, 26/09/2023
 */
package tp1_manipnombresint_brunet.manquat;

import java.util.Scanner;

/**
 *
 * @author rembr
 */
public class TP1_manipNombresInt_BrunetManquat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int entier1;
        int entier2;
        Scanner sc=new Scanner(System.in);
        
        // Demande saisis des 2 entiers
        System.out.println("Saisissez un premier entier :");
        entier1=sc.nextInt();
        System.out.println("\nSaisissez un deuxième entier :");
        entier2=sc.nextInt();
        
        // Affichage de la saisis
        System.out.println("\nLe premier entier est : "+entier1+"\nLe deuxième entier est : "+entier2);
        
        // Calcul et affichage des résultats
        int resultatS=0; int resultatD=0; int resultatP=0;
        resultatS=entier1+entier2; // Resultat somme
        resultatD=entier1-entier2; // Resultat différence
        resultatP=entier1*entier2; // Resutat produit
        System.out.println("\nLa somme est : "+resultatS+"\nLa différence est : "+resultatD+"\nLe produit est : "+resultatP);
        
        // Calcul du quotient
        int resultatDiv=0; int resultatReste=0;
        resultatDiv=entier1/entier2; // Resultat division euclidienne
        resultatReste=entier1%entier2; // Reste division euclidienne
        System.out.println("\nLe résultat de la division euclidienne est : "+resultatDiv+"\nLe reste de la division euvlidienne est : "+resultatReste);
        
    }
    
}
