/*
 * Brunet-Manquat Rémi, TDC, TP1, EX1 convertisseur, 26/09/2023
 */
package tp1_convertisseur_brunet.manquat;

import java.util.Scanner;

/**
 *
 * @author rembr
 */
public class TP1_convertisseur_BrunetManquat {

    public static double CelciusVersKelvin (double tCelcius) {
        double tKelvin;
        tKelvin=tCelcius+273.15;
        return tKelvin;
    }
    
    public static double KelvinVersCelcius(double tKelvin){
        double tCelcius;
        tCelcius=tKelvin-273.15;
        return tCelcius;
    }
    
    public static double FarenheitVersCelcius(double tFarenheit){
        double tCelcius;
        tCelcius=(tFarenheit-32)*5/9;
        return tCelcius;
    }
    
    public static double CelciusVersFarenheit(double tCelcius){
        double tFarenheit;
        tFarenheit=(tCelcius*9/5)+32;
        return tFarenheit;
    }
    
    public static double KelvinVersFarenheit(double tKelvin){
        double tFarenheit;
        tFarenheit=(KelvinVersCelcius(tKelvin)*9/5)+32;
        return tFarenheit;
    }
    
    public static double FarenheitVersKelvin(double tFarenheit){
        double tKelvin;
        tKelvin=CelciusVersKelvin(FarenheitVersCelcius(tFarenheit));
        return tKelvin;
    }
    
    public static void main(String[] args) {
        // Saisis de la valeur
        double valeur;
        Scanner sc= new Scanner(System.in);
        System.out.println("Bonjour, saisissez une valeure réelle :");
        valeur=sc.nextDouble();
        
        // Affichage de la selection
        System.out.println("\nSaisissez la conversion que vous souhaiter effectuer :\n1) De Celcius vers Kelvin\n2) De Kelvin vers Celcius\n3) De Farenheit vers Celcius\n4) De Celcius vers Farenheit\n5) De Kelvin vers Farenheit\n6) De Farenheit vers Kelvin");
        int selection;
        selection=sc.nextInt();
        
        // Calcul conversion
        double resultat;
        if (selection==1){
            resultat=CelciusVersKelvin(valeur);
            System.out.println(valeur+"°C est égal à "+resultat+"K");
        }
        else if (selection==2){
            resultat=KelvinVersCelcius(valeur);
            System.out.println(valeur+"K est égal à "+resultat+"°C");
        }
        else if (selection==3){
            resultat=FarenheitVersCelcius(valeur);
            System.out.println(valeur+"°F est égal à "+resultat+"°C");
        }
        else if (selection==4){
            resultat=CelciusVersFarenheit(valeur);
            System.out.println(valeur+"°C est égal à "+resultat+"°F");
        }
        else if (selection==5){
            resultat=KelvinVersFarenheit(valeur);
            System.out.println(valeur+"K est égal à "+resultat+"°F");
        }
        else if (selection==6){
            resultat=FarenheitVersKelvin(valeur);
            System.out.println(valeur+"°F est égal à "+resultat+"K");
        }  
        
    }
    
}
