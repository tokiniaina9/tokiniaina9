/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sma;

import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import sma.AgentRecepteur;

/**
 *
 * @author Toky
 */
public class FenetreControle extends javax.swing.JFrame {

    private AgentRecepteur recepteur;

    public AgentRecepteur getRecepteur() {
        return recepteur;
    }

    public void setRecepteur(AgentRecepteur recepteur) {
        this.recepteur = recepteur;
    }

    public JTextField getD_arriere() {
        return d_arriere;
    }

    public void setD_arriere(JTextField d_arriere) {
        this.d_arriere = d_arriere;
    }

    public JTextField getD_avant() {
        return d_avant;
    }

    public void setD_avant(JTextField d_avant) {
        this.d_avant = d_avant;
    }

    public JTextField getD_droite() {
        return d_droite;
    }

    public void setD_droite(JTextField d_droite) {
        this.d_droite = d_droite;
    }

    public JTextField getD_gauche() {
        return d_gauche;
    }

    public void setD_gauche(JTextField d_gauche) {
        this.d_gauche = d_gauche;
    }

    public JLabel getLab_message() {
        return lab_message;
    }

    public void setLab_message(JLabel lab_message) {
        this.lab_message = lab_message;
    }

    public JTextField getR_droite() {
        return r_droite;
    }

    public void setR_droite(JTextField r_droite) {
        this.r_droite = r_droite;
    }

    public JTextField getR_gauche() {
        return r_gauche;
    }

    public void setR_gauche(JTextField r_gauche) {
        this.r_gauche = r_gauche;
    }

    public JSlider getSlide_angle() {
        return slide_angle;
    }

    public void setSlide_angle(JSlider slide_angle) {
        this.slide_angle = slide_angle;
    }

   
    
    public FenetreControle() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        d_avant = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        r_gauche = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        r_droite = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        d_arriere = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        d_gauche = new javax.swing.JTextField();
        d_droite = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        slide_angle = new javax.swing.JSlider();
        jPanel3 = new javax.swing.JPanel();
        lab_message = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Contrôle"));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setOpaque(false);
        jPanel4.setLayout(new java.awt.GridLayout(3, 3, 20, 20));
        jPanel4.add(jLabel2);

        d_avant.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d_avant.setText("Avant");
        jPanel4.add(d_avant);
        jPanel4.add(jLabel3);

        r_gauche.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        r_gauche.setText("Gauche");
        jPanel4.add(r_gauche);
        jPanel4.add(jLabel4);

        r_droite.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        r_droite.setText("Droite");
        jPanel4.add(r_droite);
        jPanel4.add(jLabel5);

        d_arriere.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d_arriere.setText("Arriere");
        jPanel4.add(d_arriere);
        jPanel4.add(jLabel6);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setOpaque(false);
        jPanel5.setLayout(new java.awt.GridLayout(1, 0, 25, 10));

        d_gauche.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d_gauche.setText("Gauche");
        jPanel5.add(d_gauche);

        d_droite.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d_droite.setText("Gauche");
        jPanel5.add(d_droite);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Angle de rotation horizontal"));
        jPanel2.setOpaque(false);

        slide_angle.setForeground(new java.awt.Color(0, 204, 0));
        slide_angle.setMajorTickSpacing(5);
        slide_angle.setMaximum(90);
        slide_angle.setMinorTickSpacing(5);
        slide_angle.setPaintLabels(true);
        slide_angle.setPaintTicks(true);
        slide_angle.setSnapToTicks(true);
        slide_angle.setValue(15);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(slide_angle, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(slide_angle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Message"));
        jPanel3.setOpaque(false);

        lab_message.setBackground(new java.awt.Color(102, 102, 102));
        lab_message.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lab_message.setForeground(new java.awt.Color(0, 204, 0));
        lab_message.setOpaque(true);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lab_message, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lab_message, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FenetreControle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenetreControle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenetreControle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenetreControle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenetreControle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField d_arriere;
    private javax.swing.JTextField d_avant;
    private javax.swing.JTextField d_droite;
    private javax.swing.JTextField d_gauche;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lab_message;
    private javax.swing.JTextField r_droite;
    private javax.swing.JTextField r_gauche;
    private javax.swing.JSlider slide_angle;
    // End of variables declaration//GEN-END:variables
}
