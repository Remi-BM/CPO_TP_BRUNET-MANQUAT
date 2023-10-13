/*
 * Brunet-Manquat Rémi, TDC, TP2, EX4 relation 1, 12/10/2023
 */
package tp2_relation_1_brunet.manquat;

import static java.lang.constant.ConstantDescs.NULL;

/**
 *
 * @author rembr
 */
public class Voiture {
    String Modele;
    String Marque;
    int PuissanceCV;
    Personne proprietaire;
    
    public Voiture(String unModele, String uneMarque, int puissance){
    Modele=unModele;
    Marque=uneMarque;
    PuissanceCV=puissance;
    }
    
    @Override
    public String toString(){
        String Chainearetourner;
        Chainearetourner=Modele+" "+Marque+" "+PuissanceCV+" CV";
        return Chainearetourner;
    }
    
}
