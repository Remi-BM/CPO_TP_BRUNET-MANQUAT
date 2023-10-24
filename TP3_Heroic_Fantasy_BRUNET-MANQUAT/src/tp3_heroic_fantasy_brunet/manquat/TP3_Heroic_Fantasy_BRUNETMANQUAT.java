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
        // question 10
        Epee epee1=new Epee("Excalibur", 7,5);
        Epee epee2=new Epee("Durandal",4,7);
        Epee epee3=new Epee("Nemesis",8,9);
        Baton baton1=new Baton("Chêne",4,5);
        Baton baton2=new Baton("Charme",5,6);
        Baton baton3=new Baton("Acajou",2,25);
        
        ArrayList<Arme> tabArme=new ArrayList<Arme>();
        tabArme.add(epee1);
        tabArme.add(epee2);
        tabArme.add(epee3);
        tabArme.add(baton1);
        tabArme.add(baton2);
        tabArme.add(baton3);
        
        for (int i=0;i<tabArme.size();i++){
            System.out.println(tabArme.get(i).toString());
        }
        
        // Question26
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
        
        //Question38
        hero1.Ajout_arme(baton1);
        hero1.Ajout_arme(epee1);
        hero1.Ajout_arme(epee2);
        hero1.Equipe_arme("Excalibur");
        mage1.Ajout_arme(baton1);
        mage1.Ajout_arme(baton3);
        mage1.Ajout_arme(epee3);
        
        System.out.println("\nNombre d'armes de predilection du magicien est de : "+mage1.Arme_predilection());
        System.out.println("\n"+hero1.toString());
        System.out.println("\n"+mage1.toString());
        
        // Question 54
        
    }
    
}
