/*
 * Brunet-Manquat Rémi, TDC, TP2, EX2 Convertisseur objet, 06/10/2023
 */
package tp2_convertisseurobjet_brunet.manquat;

import java.util.Scanner;

/**
 *
 * @author rembr
 */
public class TP2_convertisseurObjet_BRUNETMANQUAT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Test de la classe convertisseur en créant 2 objets (quest 4)
        Convertisseur convTemp = new Convertisseur();
        double val1 = convTemp.CelciusVersFarenheit(30);
        double val2 = convTemp.KelvinVersFarenheit(30);
        System.out.println(val1 + " ; " + val2);
        System.out.println(convTemp);
        Convertisseur convTempbis = new Convertisseur();
        double val3 = convTempbis.KelvinVersCelcius(40);
        double val4 = convTempbis.CelciusVersKelvin(45);
        System.out.println(val3 + " ; " + val4 + " ; " + convTempbis);

        // Quest 5 : création d'un menu de sélection
        System.out.println("\n"); // permet de sauter des lignes entre la q4 et q5
        Convertisseur convTempSelec=new Convertisseur();
        
        // Saisis de la valeur
        double valeur;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bonjour, saisissez une valeure réelle :");
        valeur = sc.nextDouble();

        // Affichage de la selection
        System.out.println("\nSaisissez la conversion que vous souhaiter effectuer :\n1) De Celcius vers Kelvin\n2) De Kelvin vers Celcius\n3) De Farenheit vers Celcius\n4) De Celcius vers Farenheit\n5) De Kelvin vers Farenheit\n6) De Farenheit vers Kelvin");
        int selection;
        selection = sc.nextInt();

        // Calcul conversion
        double resultat;
        if (selection == 1) {
            resultat = convTempSelec.CelciusVersKelvin(valeur);
            System.out.println(valeur + "°C est égal à " + resultat + "K");
        } else if (selection == 2) {
            resultat = convTempSelec.KelvinVersCelcius(valeur);
            System.out.println(valeur + "K est égal à " + resultat + "°C");
        } else if (selection == 3) {
            resultat = convTempSelec.FarenheitVersCelcius(valeur);
            System.out.println(valeur + "°F est égal à " + resultat + "°C");
        } else if (selection == 4) {
            resultat = convTempSelec.CelciusVersFarenheit(valeur);
            System.out.println(valeur + "°C est égal à " + resultat + "°F");
        } else if (selection == 5) {
            resultat = convTempSelec.KelvinVersFarenheit(valeur);
            System.out.println(valeur + "K est égal à " + resultat + "°F");
        } else if (selection == 6) {
            resultat = convTempSelec.FarenheitVersKelvin(valeur);
            System.out.println(valeur + "°F est égal à " + resultat + "K");
        }
    }

}
