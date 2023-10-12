/*
 * Brunet-Manquat Rémi, TDC, TP2, EX4 relation 1, 12/10/2023
 */
package tp2_relation_1_brunet.manquat;

/**
 *
 * @author rembr
 */
public class Personne {
    String nom;
    String prenom;
    
    public String Personne(String unnom, String unprenom){
        nom=unnom;
        prenom=unprenom;
        String chainecara=nom+" "+prenom;
        return chainecara;
    }
    
    @Override
    public String toString(){
        String chainearetourner=nom+" "+prenom;
        return chainearetourner;
    }
}
