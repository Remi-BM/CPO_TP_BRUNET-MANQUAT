/*
 * Brunet-Manquat Rémi, TDC, Mini projet light off, 25/10/2023
 */
package lightoff_brunet.manquat_version_console;

/**
 * Cette classe représente une cellule lumineuse qui peut être
 * dans l'état "allumée" ou "éteint".
 * 
 * Elle utilise un attribut booléen nommé "etat" qui indique si la cellule
 * est allumée ou non
 * @author rembr
 */
public class CelluleLumineuse {
    private boolean etat;

    /**
     * Cette méthode est un constructeur qui permet de créer une nouvelle 
     * cellule automatiquement éteinte.
     */
    public CelluleLumineuse() {
        this.etat = false;
    }
    
    /**
     * Permet de basculer l'état de la cellule
     * 
     * Cette méthode permet d'éteindre la cellule lumineuse en inversant son état
     * actuel. Si la cellule est allumée, elle devient éteinte et inversemment.
     */
    public void activerCellule(){
        if (this.etat==true){
            this.etat=false;
        }
        else{
            this.etat=true;
        }
    }
    
    /**
     * Cette méthode permet d'éteindre la cellule en la mettant dans l'état
     * éteint ("false"). Si la cellule était djà éteinte, la méthode ne fait
     * rien.
     */
    public void eteindreCellule(){
        if (this.etat==true){
            this.etat=false;
        }
    }
    
    /**
     * Cette methode vérifie si la cellule est actuellement éteinte. Elle
     * renvoie true si la cellule est éteinte et inversement.
     * 
     * @return renvoie true si eteinte ou false si allumée.
     */
    public boolean estEteint(){
        if (this.etat==true){
            return false;
        }
        else{
            return true;
        }
    }

    /**
     * Cette méthode renvoie l'état actuel de la cellule.
     * 
     * @return renvoie true si la cellule est allumée ou false si éteinte.
     */
    public boolean getEtat() {
        return etat;
    }

    /**
     *Cette methode permet d'afficher X si la cellule est éteinte et O si 
     * allumée.
     * 
     * @return "X" si éteinte et "O" si allumée
     */
    @Override
    public String toString() {
        if (this.etat==true){
            return "X";
        }
        else{
            return "O";
        }
    }        
}
