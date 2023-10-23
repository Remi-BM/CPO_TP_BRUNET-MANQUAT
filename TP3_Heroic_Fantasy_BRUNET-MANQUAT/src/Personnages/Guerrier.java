/*
 * Brunet-Manquat Rémi, TDC, TP3, 18/10/2023
 */
package Personnages;

/**
 *
 * @author rembr
 */
public class Guerrier extends Personnage {
    private boolean Cheval;
    
    public Guerrier (String nom, int nivVie, boolean Cheval){
        super(nom,nivVie);
        this.Cheval=Cheval;                     
    }

    public void setCheval(boolean Cheval) {
        this.Cheval = Cheval;
    }   
    
}
