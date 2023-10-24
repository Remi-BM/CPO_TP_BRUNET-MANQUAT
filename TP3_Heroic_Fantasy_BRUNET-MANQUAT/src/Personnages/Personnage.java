/*
 * Brunet-Manquat Rémi, TDC, TP3, 18/10/2023
 */
package Personnages;

import Armes.Arme;
import Armes.Baton;
import Armes.Epee;
import java.util.ArrayList;
import tp3_heroic_fantasy_brunet.manquat.etreVivant;

/**
 *
 * @author rembr
 */
public abstract class Personnage implements etreVivant{
    private String nom;
    private int nivVie;
    private ArrayList<Arme> Inventaire=new ArrayList<Arme>(5);
    private Arme Arme_en_Main=null;
    static int nb_perso_cree=0;
        
    public Personnage(String nom, int nivVie){
        this.nom=nom;
        this.nivVie=nivVie;
        this.nb_perso_cree+=1;
    }
    
    public void finalize(){
        this.nb_perso_cree-=1;
    }

    public int getNivVie() {
        return nivVie;
    }

    public String getNom() {
        return nom;
    }

    public ArrayList<Arme> getInventaire() {
        return Inventaire;
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
    
    public void seFatiguer(){
        this.nivVie-=10;
    }
    
    public boolean estVivant(){
        if (this.nivVie>0){
            return true;
        }
        else{
        return false;
        }
    }
    
    public void estAttaque(int points){
        this.nivVie-=points;
    }
    
    public void attaquer(Personnage perso_attaque){
        if (this instanceof Magicien){
            perso_attaque.estAttaque(20);
        }
        else{
            perso_attaque.estAttaque(30);
        }
    }
}

