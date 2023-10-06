/*
 ** Brunet-Manquat Rémi, TDC, TP2, EX1 Bieres, 06/10/2023
 */
package tp2_bieres_brunet.manquat;

/**
 *
 * @author rembr
 */
public class BouteilleBiere {
    String nom;
    double degreAlcool;
    String brasserie;
    boolean ouverte;
    
    public void lireEtiquette(){
        System.out.println("Bouteille de "+nom+" ("+degreAlcool+" degres) \nBrasserie : "+brasserie);
    }
    
    public BouteilleBiere(String unNom, double unDegre, String uneBrasserie){
        nom=unNom;
        degreAlcool= unDegre;
        brasserie=uneBrasserie;
        ouverte=false;
    }
    
    public boolean Decapsuler(){
        if (ouverte==false){
            ouverte=true;
            return ouverte;
        }
        else{
            System.out.println("erreur : biere déjà ouverte");
            return false;
        }
    }
    
    @Override
    public String toString(){
        String chaine_a_retourner;
        chaine_a_retourner = nom+" ("+degreAlcool+" degrés) Ouverte ? ";
        if (ouverte == true) chaine_a_retourner +="oui";
        else chaine_a_retourner +="non";
        return chaine_a_retourner;
    }
}
