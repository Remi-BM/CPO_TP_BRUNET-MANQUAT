/*
 * Brunet-Manquat Rémi, TDC, Mini projet light off, 11/11/2023
 */
package lightoff_brunet.manquat_version_console;

import javax.swing.JFrame;

/**
 *
 * @author rembr
 */
public class FenetreDemarrer extends javax.swing.JFrame {
   
    /**
     * Creates new form FenetreDemarrer
     */
    public FenetreDemarrer() {
        initComponents();        
        
        getContentPane().add(txt_bienvenue, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 240,
                200, 40));
        this.pack();
        this.revalidate();
        
        getContentPane().add(panel_btn_diff, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 320,
                400, 80));
        this.pack();
        this.revalidate();
                
        this.setSize(1280, 720);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_btn_diff = new javax.swing.JPanel();
        btnDifficile = new javax.swing.JButton();
        btnChallenge = new javax.swing.JButton();
        btnCauchemar = new javax.swing.JButton();
        btnMoyen = new javax.swing.JButton();
        btnFacile = new javax.swing.JButton();
        btnSpeedrun = new javax.swing.JButton();
        txt_btn_difficulte = new javax.swing.JLabel();
        btnQuitter = new javax.swing.JButton();
        txt_bienvenue = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_btn_diff.setBackground(new java.awt.Color(153, 153, 153));

        btnDifficile.setText("Difficile");
        btnDifficile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDifficileActionPerformed(evt);
            }
        });

        btnChallenge.setText("Challenge");
        btnChallenge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChallengeActionPerformed(evt);
            }
        });

        btnCauchemar.setText("Chauchemar");
        btnCauchemar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCauchemarActionPerformed(evt);
            }
        });

        btnMoyen.setText("Moyen");
        btnMoyen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoyenActionPerformed(evt);
            }
        });

        btnFacile.setText("Facile");
        btnFacile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacileActionPerformed(evt);
            }
        });

        btnSpeedrun.setText("SpeedRun");
        btnSpeedrun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpeedrunActionPerformed(evt);
            }
        });

        txt_btn_difficulte.setText("Selectionnez le mode de jeu souhaité :");

        btnQuitter.setText("Quitter");
        btnQuitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_btn_diffLayout = new javax.swing.GroupLayout(panel_btn_diff);
        panel_btn_diff.setLayout(panel_btn_diffLayout);
        panel_btn_diffLayout.setHorizontalGroup(
            panel_btn_diffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_btn_diffLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_btn_diffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_btn_diffLayout.createSequentialGroup()
                        .addComponent(txt_btn_difficulte, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))
                    .addGroup(panel_btn_diffLayout.createSequentialGroup()
                        .addComponent(btnFacile)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMoyen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDifficile)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_btn_diffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnQuitter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnChallenge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(btnCauchemar)
                .addGap(18, 18, 18)
                .addComponent(btnSpeedrun)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        panel_btn_diffLayout.setVerticalGroup(
            panel_btn_diffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_btn_diffLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(txt_btn_difficulte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_btn_diffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDifficile)
                    .addComponent(btnChallenge)
                    .addComponent(btnCauchemar)
                    .addComponent(btnMoyen)
                    .addComponent(btnFacile)
                    .addComponent(btnSpeedrun))
                .addGap(18, 18, 18)
                .addComponent(btnQuitter)
                .addGap(35, 35, 35))
        );

        txt_bienvenue.setText("Bienvenue sur LightOff  !");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(panel_btn_diff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txt_bienvenue, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(261, 261, 261))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(txt_bienvenue)
                .addGap(44, 44, 44)
                .addComponent(panel_btn_diff, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFacileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacileActionPerformed
        // Fermer la fenêtre de démarrage
        this.dispose();

        // Ouvrir la fenêtre principale avec le niveau de difficulté sélectionné
        FenetrePrincipale fenetrePrincipale = new FenetrePrincipale(0);
        fenetrePrincipale.setVisible(true);
        
        // Permet de centrer la fenetre et d'avoir certaines dimensions
        fenetrePrincipale.setSize(1280, 720);
        fenetrePrincipale.setLocationRelativeTo(null);        
    }//GEN-LAST:event_btnFacileActionPerformed

    private void btnDifficileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDifficileActionPerformed
        // Fermer la fenêtre de démarrage
        this.dispose();

        // Ouvrir la fenêtre principale avec le niveau de difficulté sélectionné
        FenetrePrincipale fenetrePrincipale = new FenetrePrincipale(2);
        fenetrePrincipale.setVisible(true);
        
        // Permet de centrer la fenetre et d'avoir certaines dimensions
        fenetrePrincipale.setSize(1280, 720);
        fenetrePrincipale.setLocationRelativeTo(null); 
    }//GEN-LAST:event_btnDifficileActionPerformed

    private void btnChallengeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChallengeActionPerformed
        // Fermer la fenêtre de démarrage
        this.dispose();

        // Ouvrir la fenêtre principale avec le niveau de difficulté sélectionné
        FenetrePrincipale fenetrePrincipale = new FenetrePrincipale(3);
        fenetrePrincipale.setVisible(true);
        
        // Permet de centrer la fenetre et d'avoir certaines dimensions
        fenetrePrincipale.setSize(1280, 720);
        fenetrePrincipale.setLocationRelativeTo(null); 
    }//GEN-LAST:event_btnChallengeActionPerformed

    private void btnCauchemarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCauchemarActionPerformed
        // Fermer la fenêtre de démarrage
        this.dispose();

        // Ouvrir la fenêtre principale avec le niveau de difficulté sélectionné
        FenetrePrincipale fenetrePrincipale = new FenetrePrincipale(4);
        fenetrePrincipale.setVisible(true);
        
        // Permet de centrer la fenetre et d'avoir certaines dimensions
        fenetrePrincipale.setSize(1280, 720);
        fenetrePrincipale.setLocationRelativeTo(null); 
    }//GEN-LAST:event_btnCauchemarActionPerformed

    private void btnMoyenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoyenActionPerformed
        // Fermer la fenêtre de démarrage
        this.dispose();

        // Ouvrir la fenêtre principale avec le niveau de difficulté sélectionné
        FenetrePrincipale fenetrePrincipale = new FenetrePrincipale(1);
        fenetrePrincipale.setVisible(true);
        
        // Permet de centrer la fenetre et d'avoir certaines dimensions
        fenetrePrincipale.setSize(1280, 720);
        fenetrePrincipale.setLocationRelativeTo(null); 
    }//GEN-LAST:event_btnMoyenActionPerformed

    private void btnSpeedrunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpeedrunActionPerformed
        // Fermer la fenêtre de démarrage
        this.dispose();

        // Ouvrir la fenêtre principale avec le niveau de difficulté sélectionné
        FenetrePrincipale fenetrePrincipale = new FenetrePrincipale(5);
        fenetrePrincipale.setVisible(true);
        
        // Permet de centrer la fenetre et d'avoir certaines dimensions
        fenetrePrincipale.setSize(1280, 720);
        fenetrePrincipale.setLocationRelativeTo(null); 
    }//GEN-LAST:event_btnSpeedrunActionPerformed

    private void btnQuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitterActionPerformed
        System.exit(0);        
    }//GEN-LAST:event_btnQuitterActionPerformed

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
            java.util.logging.Logger.getLogger(FenetreDemarrer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenetreDemarrer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenetreDemarrer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenetreDemarrer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenetreDemarrer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCauchemar;
    private javax.swing.JButton btnChallenge;
    private javax.swing.JButton btnDifficile;
    private javax.swing.JButton btnFacile;
    private javax.swing.JButton btnMoyen;
    private javax.swing.JButton btnQuitter;
    private javax.swing.JButton btnSpeedrun;
    private javax.swing.JPanel panel_btn_diff;
    private javax.swing.JLabel txt_bienvenue;
    private javax.swing.JLabel txt_btn_difficulte;
    // End of variables declaration//GEN-END:variables
}
