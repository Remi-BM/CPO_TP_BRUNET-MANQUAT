/*
 * Brunet-Manquat Rémi, TDC, TP3, 18/10/2023
 */
package Personnages;

import Armes.Arme;
import java.util.ArrayList;

/**
 *
 * @author rembr
 */
public abstract class Personnage {
    private String nom;
    private int nivVie;
    private ArrayList<Arme> Inventaire=new ArrayList<Arme>(5);
    private Arme Arme_en_Main=null;
        
    public Personnage(String nom, int nivVie){
        this.nom=nom;
        this.nivVie=nivVie;
    }

    public int getNivVie() {
        return nivVie;
    }

    public String getNom() {
        return nom;
    }

    public void Ajout_arme(Arme arme_ajout) {
        if (this.Inventaire.size()!=5){
            this.Inventaire.add(arme_ajout);
        }        
    } 

    public Arme getArme_en_Main() {
        return Arme_en_Main;
    }

    public void Equipe_arme (String arme_equipe){
        boolean arme_affecte=false;
        for (int i=0; i<this.Inventaire.size();i++){
            if (this.Inventaire.get(i).getNom()==arme_equipe){
                this.Arme_en_Main=this.Inventaire.get(i);
                System.out.println("L'arme a été équipée !");
                arme_affecte=true;
            }
        }
        if (arme_affecte==false){
            System.out.println("L'arme n'est pas dans votre inventaire. Elle n'a pas été équipée !");
        }
    }    
       
    @Override
    public String toString() {
        if (this.Arme_en_Main==null){
            return "Personnage{" + "Nom =" + nom + ", Niveau =" + nivVie + '}';
        }
        else{
            return "Personnage{" + "Nom =" + nom + ", Niveau =" + nivVie + ", Arme équipé =" +this.Arme_en_Main.getNom()+'}';
        }
    }  
    
}

