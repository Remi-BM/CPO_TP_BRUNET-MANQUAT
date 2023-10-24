/*
 * Brunet-Manquat Rémi, TDC, TP3, 18/10/2023
 */
package Armes;

import Armes.Arme;

/**
 *
 * @author rembr
 */
public class Baton extends Arme {
    private int age;
    
    public Baton (String nom, int nivAttaque, int age){
        super(nom,nivAttaque);
        if (age<100){
            this.age=age;
        }
        else{
            this.age=0;
        }
                      
    }

    public int getAge() {
        return age;
    }
}
