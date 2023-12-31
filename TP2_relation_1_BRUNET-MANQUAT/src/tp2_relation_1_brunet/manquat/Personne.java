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
    
    public boolean ajouter_voiture (Voiture voiture_a_ajouter){
        if (nbVoitures==3){
            return false;
        }
        else if (voiture_a_ajouter.proprietaire!=null){
            return false;
        }
        else{
            liste_voitures[nbVoitures]=voiture_a_ajouter;
            voiture_a_ajouter.proprietaire=this;
            return true;
        }
    }
    
    @Override
    public String toString(){
        String chainearetourner=nom+" "+prenom;
        return chainearetourner;
    }
}
