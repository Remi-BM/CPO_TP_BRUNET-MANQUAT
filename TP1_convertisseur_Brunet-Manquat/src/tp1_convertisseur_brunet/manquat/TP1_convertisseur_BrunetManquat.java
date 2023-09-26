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
        tKelvin=()
    }
    
    public static void main(String[] args) {
        // Saisis de la valeur
        double valeur;
        Scanner sc= new Scanner(System.in);
        System.out.println("Saisissez une valeure réelle :");
        valeur=sc.nextDouble();
        
        // Affichage de la valeur en kelvin
        double valeurK=CelciusVersKelvin(valeur);
        System.out.println("\nLa valeur en Kelvin est : "+valeurK+" K");
        
    }
    
}
