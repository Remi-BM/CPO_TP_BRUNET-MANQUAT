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
        GrilleDeJeu GrilleDeCellules=new GrilleDeJeu(5,5);
        System.out.println(GrilleDeCellules.toString());
        
        
        
        
        GrilleDeCellules.activerDiagonaleMontante();
        GrilleDeCellules.activerDiagonaleDescendante();
        GrilleDeCellules.activerLigneDeCellules(0);
        GrilleDeCellules.activerColonneDeCellules(0);
        System.out.println("\n"+GrilleDeCellules.toString());
        
        
        System.out.println(GrilleDeCellules.cellulesToutesEteintes());
        
        GrilleDeCellules.eteindreToutesLesCellules();
        System.out.println("\n"+GrilleDeCellules.toString());
        System.out.println(GrilleDeCellules.cellulesToutesEteintes());
        
        GrilleDeCellules.melangerMatriceAleatoirement(10);
        System.out.println("\n"+GrilleDeCellules.toString());
    }
    
}
