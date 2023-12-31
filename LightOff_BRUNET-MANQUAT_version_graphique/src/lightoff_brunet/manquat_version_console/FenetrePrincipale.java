/*
 * Brunet-Manquat Rémi, TDC, Mini projet light off, 11/11/2023
 */
package lightoff_brunet.manquat_version_console;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author rembr
 */
public class FenetrePrincipale extends javax.swing.JFrame {

    GrilleDeJeu grille;
    int nbCoups;
    int taille;
    int difficulte;
    int nbCoupsMax;
    long debut;
    int i;

    /**
     * Creates new form FenetrePrincipale
     */
    public FenetrePrincipale(int ModeJeu) {
        initComponents();
        this.difficulte = ModeJeu;              
        initialiserPartie(ModeJeu);
        
        // On initialise les boutons
        if (this.difficulte==3 || this.difficulte==4){
           txt_nbCoups_Rest.setText("Votre nombre de coups restant est de : "+(this.nbCoupsMax-this.nbCoups)); 
        }else{
           txt_nbCoups_Rest.setVisible(false);
        }  
        txt_nbCoups.setText("Votre nombre de coups est de : "+nbCoups);
        
        PanneauGrille.setLayout(new GridLayout(this.taille, this.taille));
        for (int i = 0; i < this.taille; i++) {
            for (int j = 0; j < this.taille; j++) {
                CelluleGraphique bouton_cellule = new CelluleGraphique(grille.matriceCellule[i][j], 36, 36);
                PanneauGrille.add(bouton_cellule); // ajout au Jpanel PanneauGrille
            }
        }
        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60,
                this.taille * 40, this.taille * 40));
        this.pack();
        this.revalidate();

        PanneauBoutonsVerticaux.setLayout(new GridLayout(this.taille, 1));
        getContentPane().add(PanneauBoutonsVerticaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 1 * 40, this.taille * 40));
        this.pack();
        this.revalidate();

        // création du panneau de boutons verticaux (pour les lignes)
        for (i = 0; i < this.taille; i++) {
            JButton bouton_ligne = new JButton();
            ActionListener ecouteurClick = new ActionListener() {
                final int j = i;

                @Override
                public void actionPerformed(ActionEvent e) {
                    grille.activerLigneDeCellules(j);
                    repaint();
                    FinPartie();
                }
            };
            bouton_ligne.addActionListener(ecouteurClick);
            PanneauBoutonsVerticaux.add(bouton_ligne);

        }

        PanneauBoutonsHorizontaux.setLayout(new GridLayout(1, this.taille));
        getContentPane().add(PanneauBoutonsHorizontaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, this.taille * 40, 1 * 40));
        this.pack();
        this.revalidate();

        // création du panneau de boutons horizontaux (pour les colonnes)
        for (i = 0; i < this.taille; i++) {
            JButton bouton_colonne = new JButton();
            ActionListener ecouteurClick = new ActionListener() {
                final int j = i;

                @Override
                public void actionPerformed(ActionEvent e) {
                    grille.activerColonneDeCellules(j);
                    repaint();
                    FinPartie();
                }
            };
            bouton_colonne.addActionListener(ecouteurClick);
            PanneauBoutonsHorizontaux.add(bouton_colonne);

        }

        getContentPane().add(btnDiagDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10,
                1 * 40, 1 * 40));
        this.pack();
        this.revalidate();

        getContentPane().add(btnDiagMont, new org.netbeans.lib.awtextra.AbsoluteConstraints(120 + this.taille * 40, 10,
                1 * 40, 1 * 40));
        this.pack();
        this.revalidate();

        if (this.difficulte == 5) {
            this.debut = System.currentTimeMillis();
        }
    }

    public void initialiserPartie(int NivDifficulte) {
        this.nbCoups = 0;
        if (NivDifficulte == 0) {
            // niv facile
            this.grille = new GrilleDeJeu(5, 5);
            this.taille = 5;
            this.nbCoupsMax = -1; // permet de savoir qu'on n'a pas de coups max
        } else if (NivDifficulte == 1) {
            // niv moyen
            this.grille = new GrilleDeJeu(7, 7);
            this.taille = 7;
            this.nbCoupsMax = -1; // permet de savoir qu'on n'a pas de coups max
        } else if (NivDifficulte == 2) {
            // niv diff
            this.grille = new GrilleDeJeu(9, 9);
            this.taille = 9;
            this.nbCoupsMax = -1; // permet de savoir qu'on n'a pas de coups max
        } else if (NivDifficulte == 3) {
            // niv challenge
            this.grille = new GrilleDeJeu(7, 7);
            this.taille = 7;
            this.nbCoupsMax = 15;
        } else if (NivDifficulte == 4) {
            // niv cauchemar
            this.grille = new GrilleDeJeu(9, 9);
            this.taille = 9;
            this.nbCoupsMax = 10;
        } else {
            // niv speedrun
            this.grille = new GrilleDeJeu(7, 7);
            this.taille = 7;
            this.nbCoupsMax = -2; // permet de savoir qu'on n'a pas de coups max et qu'on est en speedrun (donc chrono)
        }
        grille.eteindreToutesLesCellules();
        while (this.grille.cellulesToutesEteintes() == true) {
            // permet de ne pas avoir de grille déjà toute éteinte
            this.grille.melangerMatriceAleatoirement(10);
        }
    }

    public void FinPartie() {
        this.nbCoups += 1;
        
        //On met à jour les boutons
        if (this.difficulte==3 || this.difficulte==4){
           txt_nbCoups_Rest.setText("Votre nombre de coups restant est de : "+(this.nbCoupsMax-this.nbCoups)); 
        }else{
           txt_nbCoups_Rest.setVisible(false);
        }  
        txt_nbCoups.setText("Votre nombre de coups est de : "+nbCoups);
        
        // On traite la fin de partie pour les différents modes de jeu
        if (this.difficulte == 3 || this.difficulte == 4) {
            if (this.grille.cellulesToutesEteintes() == true) {
                btnDiagMont.setEnabled(false);
                btnDiagDesc.setEnabled(false);

                // fermer la fenetre principale
                this.dispose();

                // ouvrir la fenetre de victoire
                FenetreVictoire f = new FenetreVictoire(this.difficulte,this.nbCoups,"");
                f.setVisible(true);
            } else if (this.nbCoups == this.nbCoupsMax) {
                btnDiagMont.setEnabled(false);
                btnDiagDesc.setEnabled(false);

                // fermer la fenetre principale
                this.dispose();

                // ouvrir la fenetre de defaite
                FenetreDefaite f = new FenetreDefaite(this.nbCoups);
                f.setVisible(true);
            }
        } else if (this.difficulte == 5) {
            if (this.grille.cellulesToutesEteintes() == true) {
                long fin = System.currentTimeMillis(); // permet d'avoir le temps d'arret du timer
                long tempsEcoule = fin - this.debut; // permet d'avoir le temps de jeu

                // permet de convertir le temps en ms pour  un affichage jolie
                long minutes = tempsEcoule / (60 * 1000);
                long secondes = (tempsEcoule % (60 * 1000)) / 1000;
                long millisecondes = tempsEcoule % 1000;

                // format d'affichage du temps
                String tempsFormate = String.format("%02dmin %02ds %03dms", minutes, secondes, millisecondes);
                btnDiagMont.setEnabled(false);
                btnDiagDesc.setEnabled(false);

                // fermer la fenetre principale
                this.dispose();

                // ouvrir la fenetre de victoire
                FenetreVictoire f = new FenetreVictoire(this.difficulte,this.nbCoups,tempsFormate);
                f.setVisible(true);
            }
        } else {
            if (this.grille.cellulesToutesEteintes() == true) {
                btnDiagMont.setEnabled(false);
                btnDiagDesc.setEnabled(false);

                // fermer la fenetre principale
                this.dispose();

                // ouvrir la fenetre de victoire
                FenetreVictoire f = new FenetreVictoire(this.difficulte,this.nbCoups,"");
                f.setVisible(true);
            }
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanneauGrille = new javax.swing.JPanel();
        btnDiagMont = new javax.swing.JButton();
        btnDiagDesc = new javax.swing.JButton();
        PanneauBoutonsVerticaux = new javax.swing.JPanel();
        PanneauBoutonsHorizontaux = new javax.swing.JPanel();
        txt_nbCoups = new javax.swing.JLabel();
        txt_nbCoups_Rest = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanneauGrille.setBackground(new java.awt.Color(0, 0, 255));

        javax.swing.GroupLayout PanneauGrilleLayout = new javax.swing.GroupLayout(PanneauGrille);
        PanneauGrille.setLayout(PanneauGrilleLayout);
        PanneauGrilleLayout.setHorizontalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        PanneauGrilleLayout.setVerticalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 360, 360));

        btnDiagMont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagMontActionPerformed(evt);
            }
        });
        getContentPane().add(btnDiagMont, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 30, 30));

        btnDiagDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagDescActionPerformed(evt);
            }
        });
        getContentPane().add(btnDiagDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 30, 30));

        PanneauBoutonsVerticaux.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout PanneauBoutonsVerticauxLayout = new javax.swing.GroupLayout(PanneauBoutonsVerticaux);
        PanneauBoutonsVerticaux.setLayout(PanneauBoutonsVerticauxLayout);
        PanneauBoutonsVerticauxLayout.setHorizontalGroup(
            PanneauBoutonsVerticauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        PanneauBoutonsVerticauxLayout.setVerticalGroup(
            PanneauBoutonsVerticauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauBoutonsVerticaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 60, 360));

        PanneauBoutonsHorizontaux.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout PanneauBoutonsHorizontauxLayout = new javax.swing.GroupLayout(PanneauBoutonsHorizontaux);
        PanneauBoutonsHorizontaux.setLayout(PanneauBoutonsHorizontauxLayout);
        PanneauBoutonsHorizontauxLayout.setHorizontalGroup(
            PanneauBoutonsHorizontauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        PanneauBoutonsHorizontauxLayout.setVerticalGroup(
            PanneauBoutonsHorizontauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauBoutonsHorizontaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 360, 40));

        txt_nbCoups.setText("Nb cps");
        getContentPane().add(txt_nbCoups, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 240, -1));

        txt_nbCoups_Rest.setText("Nb cps rest");
        getContentPane().add(txt_nbCoups_Rest, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 240, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDiagMontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagMontActionPerformed
        // TODO add your handling code here:
        this.grille.activerDiagonaleMontante();
        repaint();
        FinPartie();
    }//GEN-LAST:event_btnDiagMontActionPerformed

    private void btnDiagDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagDescActionPerformed
        // TODO add your handling code here:
        this.grille.activerDiagonaleDescendante();
        repaint();
        FinPartie();
    }//GEN-LAST:event_btnDiagDescActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanneauBoutonsHorizontaux;
    private javax.swing.JPanel PanneauBoutonsVerticaux;
    private javax.swing.JPanel PanneauGrille;
    private javax.swing.JButton btnDiagDesc;
    private javax.swing.JButton btnDiagMont;
    private javax.swing.JLabel txt_nbCoups;
    private javax.swing.JLabel txt_nbCoups_Rest;
    // End of variables declaration//GEN-END:variables
}
