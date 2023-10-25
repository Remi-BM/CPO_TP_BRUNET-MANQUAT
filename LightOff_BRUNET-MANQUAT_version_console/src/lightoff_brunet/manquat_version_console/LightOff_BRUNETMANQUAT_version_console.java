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
        CelluleLumineuse ampoule1=new CelluleLumineuse();
        
        ampoule1.activerCellule();
        System.out.println(ampoule1);
        
        ampoule1.eteindreCellule();
        System.out.println(ampoule1);
        
        System.out.println(ampoule1.estEteint());
        boolean etat=ampoule1.getEtat();
        System.out.println(etat);
    }
    
}
