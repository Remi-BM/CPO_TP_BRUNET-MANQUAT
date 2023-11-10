/*
 * Brunet-Manquat Rémi, TDC, Mini projet light off, 25/10/2023
 */
package lightoff_brunet.manquat_version_console;

/**
 *
 * @author rembr
 */
public class LightOff_BRUNETMANQUAT_version_console {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long debut = System.currentTimeMillis();

        Partie Jeu=new Partie();
        Jeu.lancerPartie();

        long fin = System.currentTimeMillis();
        long tempsEcoule = fin - debut;
        
        System.out.println("Temps écoulé : " + tempsEcoule + " millisecondes");
        
    }
    
}
