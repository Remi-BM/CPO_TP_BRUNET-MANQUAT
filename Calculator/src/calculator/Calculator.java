/*
 * Rémi Brunet-Manquat; TDC;TP0 EX1 Calculator; 25/09/2023
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author rembr
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Recup de l'opérateur
        System.out.println("Please enter the operator : \n 1) add \n 2) substract \n 3) multiply \n 4) divide \n 5) modulo");
        int operateur;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Entrer le nombre entier (entre 1 et 5) :");
        operateur = sc.nextInt();

        if (operateur > 0 && operateur < 6) {
            // Recup 1eme nombre
            System.out.println("\n Rentrez la première valeure de l'opération :");
            double operande1;
            operande1 = sc.nextDouble();

            // Recup 2eme nombre
            System.out.println("\n Rentrez la deuxième valeure de l'opération :");
            double operande2;
            operande2 = sc.nextDouble();

            double calcul = 0;
            if (operateur == 1) {
                calcul = operande1 + operande2;
            } else if (operateur == 2) {
                calcul = operande1 - operande2;
            } else if (operateur == 3) {
                calcul = operande1 * operande2;
            } else if (operateur == 4) {
                if (operande2 == 0) {
                    System.out.println("Vous ne pouvez pas divisez par 0. Veuillez recommencer.");
                } else {
                    calcul = operande1 / operande2;
                }
            } else if (operateur == 5) {
                if (operande2==0){
                    System.out.println("Vous ne pouvez pas faire modulo par 0. Recommencer.");
                }
                else{
                    calcul = operande1 % operande2;                    
                }
            }
            System.out.println("Le résultat est " + calcul);
        }
        else{
            System.out.println("Il faut rentrer un chiffre entier entre 1 et 5 compris.");
        }

    }

}
