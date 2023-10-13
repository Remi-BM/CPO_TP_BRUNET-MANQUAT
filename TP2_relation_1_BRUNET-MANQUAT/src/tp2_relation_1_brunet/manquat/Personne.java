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
    Voiture liste_voitures []=new Voiture[3];
    int nbVoitures=0;
    
    public Personne(String unnom, String unprenom){
        nom=unnom;
        prenom=unprenom;
    }
    
    //public boolean ajouter_voiture ()
    
    @Override
    public String toString(){
        String chainearetourner=nom+" "+prenom;
        return chainearetourner;
    }
}
