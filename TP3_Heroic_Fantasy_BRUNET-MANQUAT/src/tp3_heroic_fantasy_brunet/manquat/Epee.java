/*
 * Brunet-Manquat Rémi, TDC, TP3, 18/10/2023
 */
package tp3_heroic_fantasy_brunet.manquat;

/**
 *
 * @author rembr
 */
public class Epee extends Arme {
    int finesse;
    
    public Epee(String nom, int nivAttaque, int finesse){
        super(nom,nivAttaque);
        if (finesse<100){
            this.finesse=finesse;
        }
        else{
            this.finesse=0;
        }              
    }
    
    
}
