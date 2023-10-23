/*
 * Brunet-Manquat Rémi, TDC, TP3, 18/10/2023
 */
package Personnages;

/**
 *
 * @author rembr
 */
public class Magicien extends Personnage {
    private boolean Confirme;
    
    public Magicien (String nom, int nivVie, boolean Confirme){
        super(nom,nivVie);
        this.Confirme=Confirme;                     
    }

    public void setConfirme(boolean Confirme) {
        this.Confirme = Confirme;
    }
    
}
