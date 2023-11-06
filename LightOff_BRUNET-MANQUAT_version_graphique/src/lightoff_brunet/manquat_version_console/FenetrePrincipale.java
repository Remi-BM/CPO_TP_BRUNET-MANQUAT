/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lightoff_brunet.manquat_version_console;

import java.awt.GridLayout;
import javax.swing.JButton;

/**
 *
 * @author rembr
 */
public class FenetrePrincipale extends javax.swing.JFrame {

    GrilleDeJeu grille;
    int nbCoups;

    /**
     * Creates new form FenetrePrincipale
     */
    public FenetrePrincipale() {
        initComponents();
        int nbLignes = 10;
        int nbColonnes = 10;
        this.grille = new GrilleDeJeu(nbLignes, nbColonnes);
        initialiserPartie();
        PanneauGrille.setLayout(new GridLayout(nbLignes, nbColonnes));
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                CelluleGraphique bouton_cellule = new CelluleGraphique( grille.matriceCellule[i][j], 36,36);
                PanneauGrille.add(bouton_cellule); // ajout au Jpanel PanneauGrille
            }
        }        
    }

    public void initialiserPartie() {
        grille.eteindreToutesLesCellules();
        grille.melangerMatriceAleatoirement(10);
    }
    
    public void FinPartie(){
        if (this.grille.cellulesToutesEteintes()==true){
            btnLigne0.setEnabled(false);
            btnLigne1.setEnabled(false);
            btnLigne2.setEnabled(false);
            btnLigne3.setEnabled(false);
            btnLigne4.setEnabled(false);
            btnLigne5.setEnabled(false);
            btnLigne6.setEnabled(false);
            btnLigne7.setEnabled(false);
            btnLigne8.setEnabled(false);
            btnLigne9.setEnabled(false);
            btnCol0.setEnabled(false);
            btnCol1.setEnabled(false);
            btnCol2.setEnabled(false);
            btnCol3.setEnabled(false);
            btnCol4.setEnabled(false);
            btnCol5.setEnabled(false);
            btnCol6.setEnabled(false);
            btnCol7.setEnabled(false);
            btnCol8.setEnabled(false);
            btnCol9.setEnabled(false);
            btnDiagMont.setEnabled(false);
            btnDiagDesc.setEnabled(false);
            System.out.println("Vous avez gagné !");
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
        btnLigne0 = new javax.swing.JButton();
        btnLigne1 = new javax.swing.JButton();
        btnLigne2 = new javax.swing.JButton();
        btnLigne3 = new javax.swing.JButton();
        btnLigne4 = new javax.swing.JButton();
        btnLigne5 = new javax.swing.JButton();
        btnLigne6 = new javax.swing.JButton();
        btnLigne7 = new javax.swing.JButton();
        btnLigne8 = new javax.swing.JButton();
        btnLigne9 = new javax.swing.JButton();
        btnDiagMont = new javax.swing.JButton();
        btnCol0 = new javax.swing.JButton();
        btnCol1 = new javax.swing.JButton();
        btnCol2 = new javax.swing.JButton();
        btnCol3 = new javax.swing.JButton();
        btnCol4 = new javax.swing.JButton();
        btnCol5 = new javax.swing.JButton();
        btnCol6 = new javax.swing.JButton();
        btnCol7 = new javax.swing.JButton();
        btnCol8 = new javax.swing.JButton();
        btnCol9 = new javax.swing.JButton();
        btnDiagDesc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 400));
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

        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 360, 360));

        btnLigne0.setText("...");
        btnLigne0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigne0ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLigne0, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, -1, -1));

        btnLigne1.setText("...");
        btnLigne1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigne1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLigne1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, -1, -1));

        btnLigne2.setText("...");
        btnLigne2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigne2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLigne2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, -1, -1));

        btnLigne3.setText("...");
        btnLigne3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigne3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLigne3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, -1, -1));

        btnLigne4.setText("...");
        btnLigne4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigne4ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLigne4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, -1, -1));

        btnLigne5.setText("...");
        btnLigne5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigne5ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLigne5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, -1, -1));

        btnLigne6.setText("...");
        btnLigne6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigne6ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLigne6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, -1, -1));

        btnLigne7.setText("...");
        btnLigne7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigne7ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLigne7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, -1, -1));

        btnLigne8.setText("...");
        btnLigne8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigne8ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLigne8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, -1, -1));

        btnLigne9.setText("...");
        btnLigne9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigne9ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLigne9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, -1, -1));

        btnDiagMont.setText("...");
        btnDiagMont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagMontActionPerformed(evt);
            }
        });
        getContentPane().add(btnDiagMont, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, -1, -1));

        btnCol0.setText("...");
        btnCol0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCol0ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCol0, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, -1, -1));

        btnCol1.setText("...");
        btnCol1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCol1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCol1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, -1, -1));

        btnCol2.setText("...");
        btnCol2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCol2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCol2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, -1, -1));

        btnCol3.setText("...");
        btnCol3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCol3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCol3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, -1, -1));

        btnCol4.setText("...");
        btnCol4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCol4ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCol4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, -1, -1));

        btnCol5.setText("...");
        btnCol5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCol5ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCol5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, -1, -1));

        btnCol6.setText("...");
        btnCol6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCol6ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCol6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, -1, -1));

        btnCol7.setText("...");
        btnCol7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCol7ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCol7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, -1, -1));

        btnCol8.setText("...");
        btnCol8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCol8ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCol8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, -1, -1));

        btnCol9.setText("...");
        btnCol9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCol9ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCol9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, -1, -1));

        btnDiagDesc.setText("...");
        btnDiagDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagDescActionPerformed(evt);
            }
        });
        getContentPane().add(btnDiagDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLigne0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigne0ActionPerformed
        // TODO add your handling code here:
        this.grille.activerLigneDeCellules(0);
        repaint();
        FinPartie();
    }//GEN-LAST:event_btnLigne0ActionPerformed

    private void btnLigne1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigne1ActionPerformed
        // TODO add your handling code here:
        this.grille.activerLigneDeCellules(1);
        repaint();
        FinPartie();
    }//GEN-LAST:event_btnLigne1ActionPerformed

    private void btnLigne2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigne2ActionPerformed
        // TODO add your handling code here:
        this.grille.activerLigneDeCellules(2);
        repaint();
        FinPartie();
    }//GEN-LAST:event_btnLigne2ActionPerformed

    private void btnLigne3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigne3ActionPerformed
        // TODO add your handling code here:
        this.grille.activerLigneDeCellules(3);
        repaint();
        FinPartie();
    }//GEN-LAST:event_btnLigne3ActionPerformed

    private void btnLigne4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigne4ActionPerformed
        // TODO add your handling code here:
        this.grille.activerLigneDeCellules(4);
        repaint();
        FinPartie();
    }//GEN-LAST:event_btnLigne4ActionPerformed

    private void btnLigne5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigne5ActionPerformed
        // TODO add your handling code here:
        this.grille.activerLigneDeCellules(5);
        repaint();
        FinPartie();
    }//GEN-LAST:event_btnLigne5ActionPerformed

    private void btnLigne6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigne6ActionPerformed
        // TODO add your handling code here:
        this.grille.activerLigneDeCellules(6);
        repaint();
        FinPartie();
    }//GEN-LAST:event_btnLigne6ActionPerformed

    private void btnLigne7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigne7ActionPerformed
        // TODO add your handling code here:
        this.grille.activerLigneDeCellules(7);
        repaint();
        FinPartie();
    }//GEN-LAST:event_btnLigne7ActionPerformed

    private void btnLigne8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigne8ActionPerformed
        // TODO add your handling code here:
        this.grille.activerLigneDeCellules(8);
        repaint();
        FinPartie();
    }//GEN-LAST:event_btnLigne8ActionPerformed

    private void btnLigne9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigne9ActionPerformed
        // TODO add your handling code here:
        this.grille.activerLigneDeCellules(9);
        repaint();
        FinPartie();
    }//GEN-LAST:event_btnLigne9ActionPerformed

    private void btnDiagMontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagMontActionPerformed
        // TODO add your handling code here:
        this.grille.activerDiagonaleMontante();
        repaint();
        FinPartie();
    }//GEN-LAST:event_btnDiagMontActionPerformed

    private void btnCol0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCol0ActionPerformed
        // TODO add your handling code here:
        this.grille.activerColonneDeCellules(0);
        repaint();
        FinPartie();
    }//GEN-LAST:event_btnCol0ActionPerformed

    private void btnCol1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCol1ActionPerformed
        // TODO add your handling code here:
        this.grille.activerColonneDeCellules(1);
        repaint();
        FinPartie();
    }//GEN-LAST:event_btnCol1ActionPerformed

    private void btnCol2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCol2ActionPerformed
        // TODO add your handling code here:
        this.grille.activerColonneDeCellules(2);
        repaint();
        FinPartie();
    }//GEN-LAST:event_btnCol2ActionPerformed

    private void btnCol3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCol3ActionPerformed
        // TODO add your handling code here:
        this.grille.activerColonneDeCellules(3);
        repaint();
        FinPartie();
    }//GEN-LAST:event_btnCol3ActionPerformed

    private void btnCol4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCol4ActionPerformed
        // TODO add your handling code here:
        this.grille.activerColonneDeCellules(4);
        repaint();
        FinPartie();
    }//GEN-LAST:event_btnCol4ActionPerformed

    private void btnCol5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCol5ActionPerformed
        // TODO add your handling code here:
        this.grille.activerColonneDeCellules(5);
        repaint();
        FinPartie();
    }//GEN-LAST:event_btnCol5ActionPerformed

    private void btnCol6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCol6ActionPerformed
        // TODO add your handling code here:
        this.grille.activerColonneDeCellules(6);
        repaint();
        FinPartie();
    }//GEN-LAST:event_btnCol6ActionPerformed

    private void btnCol7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCol7ActionPerformed
        // TODO add your handling code here:
        this.grille.activerColonneDeCellules(7);
        repaint();
        FinPartie();
    }//GEN-LAST:event_btnCol7ActionPerformed

    private void btnCol8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCol8ActionPerformed
        // TODO add your handling code here:
        this.grille.activerColonneDeCellules(8);
        repaint();
        FinPartie();
    }//GEN-LAST:event_btnCol8ActionPerformed

    private void btnCol9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCol9ActionPerformed
        // TODO add your handling code here:
        this.grille.activerColonneDeCellules(9);
        repaint();
        FinPartie();
    }//GEN-LAST:event_btnCol9ActionPerformed

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
                new FenetrePrincipale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanneauGrille;
    private javax.swing.JButton btnCol0;
    private javax.swing.JButton btnCol1;
    private javax.swing.JButton btnCol2;
    private javax.swing.JButton btnCol3;
    private javax.swing.JButton btnCol4;
    private javax.swing.JButton btnCol5;
    private javax.swing.JButton btnCol6;
    private javax.swing.JButton btnCol7;
    private javax.swing.JButton btnCol8;
    private javax.swing.JButton btnCol9;
    private javax.swing.JButton btnDiagDesc;
    private javax.swing.JButton btnDiagMont;
    private javax.swing.JButton btnLigne0;
    private javax.swing.JButton btnLigne1;
    private javax.swing.JButton btnLigne2;
    private javax.swing.JButton btnLigne3;
    private javax.swing.JButton btnLigne4;
    private javax.swing.JButton btnLigne5;
    private javax.swing.JButton btnLigne6;
    private javax.swing.JButton btnLigne7;
    private javax.swing.JButton btnLigne8;
    private javax.swing.JButton btnLigne9;
    // End of variables declaration//GEN-END:variables
}
