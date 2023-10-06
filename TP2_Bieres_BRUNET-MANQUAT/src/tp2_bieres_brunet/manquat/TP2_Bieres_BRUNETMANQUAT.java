/*
 * Brunet-Manquat Rémi, TDC, TP2, EX1 Bieres, 06/10/2023
 */
package tp2_bieres_brunet.manquat;

/**
 *
 * @author rembr
 */
public class TP2_Bieres_BRUNETMANQUAT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Première bière
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 7.0, "Dubuisson");
        uneBiere.lireEtiquette();

        // Deuxième Bière
        BouteilleBiere autreBiere = new BouteilleBiere("Leffe", 6.6, "Abbaye de Leffe");
        autreBiere.lireEtiquette();

        // Troisième bière
        BouteilleBiere encoreBiere = new BouteilleBiere("8.6", 8.6, "Swinkels Family Brewers");
        encoreBiere.lireEtiquette();

        encoreBiere.Decapsuler();
        System.out.println(encoreBiere.ouverte);
        encoreBiere.Decapsuler(); // on tente de redécapsuler une bière
        System.out.println(encoreBiere.ouverte);
        autreBiere.Decapsuler();
        System.out.println(uneBiere);
        System.out.println(autreBiere);
        System.out.println(encoreBiere);
    }

}
