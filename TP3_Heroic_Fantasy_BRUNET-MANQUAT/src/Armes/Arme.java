/*
 * Brunet-Manquat Rémi, TDC, TP3, 18/10/2023
 */
package Armes;

/**
 *
 * @author rembr
 */
public abstract class Arme {
    private String nom;
    private int nivAttaque;
        
    public Arme(String nom, int nivAttaque){
        this.nom=nom;
        if (nivAttaque<=100){
            this.nivAttaque=nivAttaque;
        }
        else{
            this.nivAttaque=0;
        }
    }

    public int getNivAttaque() {
        return nivAttaque;
    }

    public String getNom() {
        return nom;
    }
    
    @Override
    public String toString() {
        return "Arme{" + "Nom =" + nom + ", Niveau =" + nivAttaque + '}';
    }  
    
}
