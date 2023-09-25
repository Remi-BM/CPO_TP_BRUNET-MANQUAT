/*
 * Rémi Brunet-Manquat; TDC;TP0 EX1 Calculette; 18/09/2023
 */
package exo1;

import java.util.Scanner;

/**
 *
 * @author rembr
 */
public class Exo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String prenom;
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Bonjour, quel est votre prénom ?");
        prenom=sc.nextLine ();
        System.out.println("Au revoir "+prenom);
    }
    
}
