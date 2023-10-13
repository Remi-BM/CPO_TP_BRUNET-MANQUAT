/*
 * Brunet-Manquat Rémi, TDC, TP2, EX4 relation 1, 12/10/2023
 */
package tp2_relation_1_brunet.manquat;

/**
 *
 * @author rembr
 */
public class TP2_relation_1_BRUNETMANQUAT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Voiture uneClio=new Voiture ("Clio", "Renault",5);
        Voiture uneAutreClio = new Voiture ("Clio","Renault",5);
        Voiture une2008=new Voiture ("2008","Peugeot",6);
        Voiture uneMicra=new Voiture ("Micra", "Nissan", 4);
        Voiture uneFerrari=new Voiture("Enzo", "Ferrari", 300);
        
        Personne bob =new Personne("Bobby","Sixkiller");
        Personne reno = new Personne("Reno","Raines");
        
        System.out.println("liste des voitures disponibles :\n" +uneClio+"\n"+uneAutreClio+"\n"+une2008+"\n"+uneMicra);
        
        bob.liste_voitures[0]=uneClio;
        bob.liste_voitures[1]=uneAutreClio;
        bob.nbVoitures=2;
        uneClio.proprietaire=bob;
        uneAutreClio.proprietaire=bob;
        
        reno.liste_voitures[0]=une2008;
        reno.liste_voitures[1]=uneMicra;
        reno.nbVoitures=2;
        une2008.proprietaire=reno;
        uneMicra.proprietaire=reno;  
        
        reno.ajouter_voiture(uneFerrari);
        reno.ajouter_voiture(uneAutreClio);
        bob.ajouter_voiture(uneMicra);
        
        System.out.println("la premiere voiture de Bob est "+bob.liste_voitures[0]);
        System.out.println("la deuxième voiture de Bob est "+bob.liste_voitures[1]);
        System.out.println("la premiere voiture de Reno est "+reno.liste_voitures[0]);
        System.out.println("la deuxième voiture de Reno est "+reno.liste_voitures[1]);
        System.out.println("la troisième voiture de Reno est "+reno.liste_voitures[2]);
        System.out.println("la troisieme voiture de Bob est "+bob.liste_voitures[2]);
    }
    
}
