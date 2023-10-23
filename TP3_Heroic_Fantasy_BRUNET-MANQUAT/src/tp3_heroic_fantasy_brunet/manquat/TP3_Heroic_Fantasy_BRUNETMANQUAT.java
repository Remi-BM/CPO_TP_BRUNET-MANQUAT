/*
 * Brunet-Manquat Rémi, TDC, TP3, 18/10/2023
 */
package tp3_heroic_fantasy_brunet.manquat;

import Personnages.Personnage;
import Personnages.Magicien;
import Personnages.Guerrier;
import Armes.Baton;
import Armes.Arme;
import Armes.Epee;
import java.util.ArrayList;

/**
 *
 * @author rembr
 */
public class TP3_Heroic_Fantasy_BRUNETMANQUAT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Epee epee1=new Epee("Excalibur", 7,5);
        Epee epee2=new Epee("Durandal",4,7);
        Baton baton1=new Baton("Chêne",4,5);
        Baton baton2=new Baton("Charme",5,6);
        
        ArrayList<Arme> tabArme=new ArrayList<Arme>();
        tabArme.add(epee1);
        tabArme.add(epee2);
        tabArme.add(baton1);
        tabArme.add(baton2);
        
        for (int i=0;i<tabArme.size();i++){
            System.out.println(tabArme.get(i).toString());
        }
        
        Magicien mage1=new Magicien("Gandalf",65, true);
        Magicien mage2=new Magicien("Garcimore",44, false);
        Guerrier hero1=new Guerrier("Conan",78,false);
        Guerrier hero2=new Guerrier("Lannister",45,true);
        
        ArrayList<Personnage> tabperso=new ArrayList<Personnage>();
        tabperso.add(mage1);
        tabperso.add(mage2);
        tabperso.add(hero1);
        tabperso.add(hero2);
        
        for (int i=0;i<tabperso.size();i++){
            System.out.println(tabperso.get(i).toString());
        }
    }
    
}
