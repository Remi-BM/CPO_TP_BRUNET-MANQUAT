/*
 * Brunet-Manquat Rémi, TDC, TP3, 18/10/2023
 */
package tp3_heroic_fantasy_brunet.manquat;

/**
 *
 * @author rembr
 */
public class Baton extends Arme {
    int age;
    
    public Baton (String nom, int nivAttaque, int age){
        super(nom,nivAttaque);
        if (age<100){
            this.age=age;
        }
        else{
            this.age=0;
        }
        this.nom=nom;
        this.nivAttaque=nivAttaque;                
    }
}
