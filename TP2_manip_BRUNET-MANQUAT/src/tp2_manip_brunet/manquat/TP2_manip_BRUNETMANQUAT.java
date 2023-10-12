/*
 *  Brunet-Manquat Rémi, TDC, TP2, EX3 Manipulation des objets, 12/10/2023
 */
package tp2_manip_brunet.manquat;

/**
 *
 * @author rembr
 */
public class TP2_manip_BRUNETMANQUAT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tartiflette assiette1=new Tartiflette(500);
        Tartiflette assiette2=new Tartiflette(600);
        Tartiflette assiette3=assiette2; // Seulement 2 assiettes créées car seulemetn 2 new donc 2 objets
        System.out.println(assiette1+" ; "+assiette2+" ; "+assiette3);
        // assiette 2 et assiette 3 ont la même référence objet
        
        // Verif
        System.out.println("nb de calories de Assiette 2 : "+assiette2.nbCalories);
        System.out.println("nb de calories de Assiette 3 : "+assiette3.nbCalories);
        
        // Interversion des assiettes
        assiette2=assiette1;
        assiette1=assiette3;
        System.out.println(assiette1+" ; "+assiette2+" ; "+assiette3);
        System.out.println("nb de calories de Assiette 1 : "+assiette1.nbCalories);
        System.out.println("nb de calories de Assiette 2 : "+assiette2.nbCalories);
        System.out.println("nb de calories de Assiette 3 : "+assiette3.nbCalories);
        
        // Q6
        // Moussaka assiette666=assiette1; erreur
        // Moussaka assiette667=new Tartiflette(); erreur
        // Les deux lignes sont incorrecte => une référence obj ne peut pas ref un autre obj qui n'a aucun rapport
        
        // Q7
        Moussaka [] tabMouss=new Moussaka [10];
        for (int i=0; i<tabMouss.length;i++){
            tabMouss[i]=new Moussaka(100);
        }
        System.out.println(tabMouss[2]+" ; "+tabMouss[5]); //verif qu'on a bien des objets différents
        
        // On pourrait avoir un obj avec sa ref qui est un attribut d'un autre obj
        // oui c'est une façon de modéliser une relation entre 2obj
    }
    
}
