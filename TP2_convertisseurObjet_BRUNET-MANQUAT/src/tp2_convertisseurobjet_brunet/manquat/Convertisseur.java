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
    
    @Override
    public String toString () {
        return "nb de conversions"+nbConversions;
    }
}
