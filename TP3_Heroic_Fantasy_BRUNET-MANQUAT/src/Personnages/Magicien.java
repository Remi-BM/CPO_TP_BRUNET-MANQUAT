/*
 * Brunet-Manquat Rémi, TDC, TP3, 18/10/2023
 */
package Personnages;

import Armes.Arme;
import Armes.Baton;
import java.util.ArrayList;

/**
 *
 * @author rembr
 */
public class Magicien extends Personnage {
    private boolean Confirme;
    static int nb_magicien=0;
    
    public Magicien (String nom, int nivVie, boolean Confirme){
        super(nom,nivVie);
        this.Confirme=Confirme;
        this.nb_magicien+=1;
    }
    
    public void finalize(){
        this.nb_magicien-=1;
    }

    public void setConfirme(boolean Confirme) {
        this.Confirme = Confirme;
    }
    
    public int Arme_predilection (){
        int nb_baton=0;
        ArrayList<Arme> Inventaire= getInventaire();
        for (int i=0;i<Inventaire.size();i++){
            if (Inventaire.get(i) instanceof Baton){
                nb_baton+=1;
            }
        }
        return nb_baton;        
    }    
}
