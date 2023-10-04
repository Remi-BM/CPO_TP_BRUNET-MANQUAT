/*
 * Brunet-Manquat Rémi, TDC, TP1, EX4 statistiques, 04/10/2023
 */
package tp1_stats_brunet.manquat;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author rembr
 */
public class TP1_stats_BrunetManquat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Initialisation des variable + import de module
        int[] tabEntier = new int[6];
        Scanner sc = new Scanner(System.in);
        Random GenerateurAleat = new Random();

        // Lancer de dés
        System.out.println("Saisissez un entier m :");
        int m = sc.nextInt();
        for (int i = 0; i <= m; i++) {
            int face_tire = GenerateurAleat.nextInt(6);
            tabEntier[face_tire] += 1;
        }

        // Affichage des résultats
        String Affichage = "Pourcentage d'apparition des faces :";
        for (int i = 0; i < tabEntier.length; i++) {
            if (i == 5) {
                double resultat_pourcentage = (tabEntier[i] * 100.0) / m;
                Affichage += " Face " + (i + 1) + " : " + resultat_pourcentage + "% .";
            } else {
                double resultat_pourcentage = (tabEntier[i] * 100.0) / m;
                Affichage += " Face " + (i + 1) + " : " + resultat_pourcentage + "% ;";
            }
        }
        System.out.println(Affichage);
    }

}
