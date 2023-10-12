/*
 * Brunet-Manquat Rémi, TDC, TP2, EX4 relation 1, 12/10/2023
 */
package tp2_relation_1_brunet.manquat;

/**
 *
 * @author rembr
 */
public class Voiture {
    String Modele;
    String Marque;
    int PuissanceCV;
    
    public String Voiture(String unModele, String uneMarque, int puissance){
    Modele=unModele;
    Marque=uneMarque;
    PuissanceCV=puissance;
    String chainecara=Modele+" "+Marque+" "+PuissanceCV+" CV";
    return chainecara;
    }
    
    @Override
    public String toString(){
        String Chainearetourner;
        Chainearetourner=Modele+" "+Marque+" "+PuissanceCV+" CV";
        return Chainearetourner;
    }
    
}
