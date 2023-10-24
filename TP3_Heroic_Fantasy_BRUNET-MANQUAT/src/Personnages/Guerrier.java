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
public class Guerrier extends Personnage {
    private boolean Cheval;
    static int nb_guerrier=0;
    
    public Guerrier (String nom, int nivVie, boolean Cheval){
        super(nom,nivVie);
        this.Cheval=Cheval;
        this.nb_guerrier+=1;
    }
    
    public void finalize(){
        this.nb_guerrier-=1;
    }

    public void setCheval(boolean Cheval) {
        this.Cheval = Cheval;
    }  
    
    public int Arme_predilection (){
        int nb_epee=0;
        ArrayList<Arme> Inventaire= getInventaire();
        for (int i=0;i<Inventaire.size();i++){
            if (Inventaire.get(i) instanceof Baton){
                nb_epee+=1;
            }
        }
        return nb_epee;        
    }     
}
