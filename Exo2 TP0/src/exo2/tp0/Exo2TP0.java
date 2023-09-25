/*
 * Rémi Brunet-Manquat; TDC;TP0 EX2 Calculette; 25/09/2023
 */
package exo2.tp0;

import java.util.Scanner;

/**
 *
 * @author rembr
 */
public class Exo2TP0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaration des variables
        int nb;
        //nb=5;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Entrer le nombre :");
        nb=sc.nextInt(); // On demande a sc de donner le prochain entier
        int result;
        int ind;
        result=0;
        
        // Addition des nb premiers entiers
        
       ind=1;
       while (ind<= nb){
           result=result+ind;
           ind+=1;
       }
       
       // Affichage du resultat
       System.out.println();
       System.out.println("La somme des "+ nb+"entiers est: "+result);
    }
    
}
