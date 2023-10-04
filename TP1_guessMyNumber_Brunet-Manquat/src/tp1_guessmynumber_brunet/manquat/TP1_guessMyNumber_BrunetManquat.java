/*
 * Brunet-Manquat Rémi, TDC, TP1, EX3 GuessMyNumber, 04/10/2023
 */
package tp1_guessmynumber_brunet.manquat;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author rembr
 */
public class TP1_guessMyNumber_BrunetManquat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Selection difficulté
        int difficulte;
        Scanner sc = new Scanner(System.in);
        System.out.println("Selectionnez votre difficulté :\n1) Facile\n2) Normal\n3) Difficile\n4) Cauchemar");
        difficulte = sc.nextInt();

        // Boucle jeu
        if (difficulte == 1) {
            // Génération nb à trouver
            Random generateurAleat = new Random();
            int nb_gen = generateurAleat.nextInt(50);

            //Saisis et boucle
            int valeur = 1000; // on choisit une valeure qui ne peut pas être générer
            int compteur = 0;
            while (valeur != nb_gen) {
                System.out.println("Bonjour, saisissez une valeure entière entre 0 et 50 :");
                valeur = sc.nextInt();
                compteur += 1;
                if (valeur > nb_gen) {
                    System.out.println("Trop grand");
                } else if (valeur < nb_gen) {
                    System.out.println("Trop petit");
                }
            }
            System.out.println("Gagné");
            System.out.println("Vous avez mis : " + compteur + " coups");
            
        } else if (difficulte == 2) {
            // Génération nb à trouver
            Random generateurAleat = new Random();
            int nb_gen = generateurAleat.nextInt(100);

            //Saisis et boucle
            int valeur = 1000; // on choisit une valeure qui ne peut pas être générer
            int compteur = 0;
            while (valeur != nb_gen) {
                System.out.println("Bonjour, saisissez une valeure entière entre 0 et 100 :");
                valeur = sc.nextInt();
                compteur += 1;
                if (valeur > nb_gen) {
                    System.out.println("Trop grand");
                } else if (valeur < nb_gen) {
                    System.out.println("Trop petit");
                }
            }
            System.out.println("Gagné");
            System.out.println("Vous avez mis : " + compteur + " coups");

        } else if (difficulte == 3) {
            // Génération nb à trouver
            Random generateurAleat = new Random();
            int nb_gen = generateurAleat.nextInt(100);

            //Saisis et boucle
            int valeur = 1000; // on choisit une valeure qui ne peut pas être générer
            int compteur = 0;
            while (valeur != nb_gen && compteur < 10) {
                System.out.println("Bonjour, saisissez une valeure entière entre 0 et 100 :");
                valeur = sc.nextInt();
                compteur += 1;
                if (valeur > nb_gen) {
                    System.out.println("Trop grand");
                    if (compteur==10){
                        System.out.println("Perdu vous avez mis trop de coups");
                    }
                } else if (valeur < nb_gen) {
                    System.out.println("Trop petit");
                    if (compteur==10){
                        System.out.println("Perdu vous avez mis trop de coups");
                    }
                } else if(valeur==nb_gen){
                    System.out.println("Gagné");
                    System.out.println("Vous avez mis : " + compteur + " coups");
                }                
            }            
        }       
        else if (difficulte == 4) {
            // Génération nb à trouver
            Random generateurAleat = new Random();
            int nb_gen = generateurAleat.nextInt(100);

            //Saisis et boucle
            int valeur = 1000; // on choisit une valeure qui ne peut pas être générer
            int compteur = 0;
            while (valeur != nb_gen) {
                int proba = generateurAleat.nextInt(3);                
                System.out.println("Bonjour, saisissez une valeure entière entre 0 et 100 :");
                valeur = sc.nextInt();
                compteur += 1;
                if (valeur > nb_gen && proba!=0) {
                    System.out.println("Trop grand");
                }
                else if (valeur > nb_gen && proba==0) {
                    System.out.println("Trop petit");
                }
                else if (valeur < nb_gen && proba!=0) {
                    System.out.println("Trop petit");
                }
                else if (valeur < nb_gen && proba==0){
                    System.out.println("Trop grand");
                }
            }
            System.out.println("Gagné");
            System.out.println("Vous avez mis : " + compteur + " coups");
            
        }
        
    }
}
