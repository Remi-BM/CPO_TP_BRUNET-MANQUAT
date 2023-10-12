/*
 *Brunet-Manquat Rémi, TDC, TP2, EX2 convertisseur objet, 06/10/2023
 */
package tp2_convertisseurobjet_brunet.manquat;

/**
 *
 * @author rembr
 */
public class Convertisseur {
    private int nbConversions;
    
    public Convertisseur(){
        nbConversions=0;
    }
    
    public double CelciusVersKelvin (double tCelcius) {
        double tKelvin;
        tKelvin=tCelcius+273.15;
        nbConversions+=1;
        return tKelvin;
    }
    
    public double KelvinVersCelcius(double tKelvin){
        double tCelcius;
        tCelcius=tKelvin-273.15;
        nbConversions+=1;
        return tCelcius;
    }
    
    public double FarenheitVersCelcius(double tFarenheit){
        double tCelcius;
        tCelcius=(tFarenheit-32)*5/9;
        nbConversions+=1;
        return tCelcius;
    }
    
    public double CelciusVersFarenheit(double tCelcius){
        double tFarenheit;
        tFarenheit=(tCelcius*9/5)+32;
        nbConversions+=1;
        return tFarenheit;
    }
    
    public double KelvinVersFarenheit(double tKelvin){
        double tFarenheit;
        tFarenheit=(KelvinVersCelcius(tKelvin)*9/5)+32;
        nbConversions+=1;
        return tFarenheit;
    }
    
    public double FarenheitVersKelvin(double tFarenheit){
        double tKelvin;
        tKelvin=CelciusVersKelvin(FarenheitVersCelcius(tFarenheit));
        nbConversions+=1;
        return tKelvin;
    }
    
    @Override
    public String toString () {
        return "nb de conversions : "+nbConversions;
    }
}
