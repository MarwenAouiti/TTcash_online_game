/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ttcash.en.ligne;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Bienvenue extends javax.swing.JFrame {

    public String nomj1;
    public String nomj2;

    /**
     * Creates new form Bienveneue
     */
    public Bienvenue() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelimage = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelplayer = new javax.swing.JPanel();
        paneltitre = new javax.swing.JPanel();
        Jlabeltitre = new javax.swing.JLabel();
        Jpanelnomplayer = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        NOM1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Nom2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        Commence = new javax.swing.JButton();
        Quitter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(496, 450));

        panelimage.setBackground(new java.awt.Color(255, 255, 255));
        panelimage.setPreferredSize(new java.awt.Dimension(496, 263));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/341f4a23-tt-cash-android.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setPreferredSize(new java.awt.Dimension(496, 263));

        javax.swing.GroupLayout panelimageLayout = new javax.swing.GroupLayout(panelimage);
        panelimage.setLayout(panelimageLayout);
        panelimageLayout.setHorizontalGroup(
            panelimageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 543, Short.MAX_VALUE)
            .addGroup(panelimageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelimageLayout.createSequentialGroup()
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 47, Short.MAX_VALUE)))
        );
        panelimageLayout.setVerticalGroup(
            panelimageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 285, Short.MAX_VALUE)
            .addGroup(panelimageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelimageLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jLabel1.getAccessibleContext().setAccessibleName("image");

        getContentPane().add(panelimage, java.awt.BorderLayout.NORTH);

        panelplayer.setBackground(new java.awt.Color(255, 255, 255));
        panelplayer.setPreferredSize(new java.awt.Dimension(300, 150));
        panelplayer.setLayout(new java.awt.BorderLayout());

        paneltitre.setPreferredSize(new java.awt.Dimension(496, 50));

        Jlabeltitre.setBackground(new java.awt.Color(255, 255, 255));
        Jlabeltitre.setText("Insere le nom de deux joueur");
        paneltitre.add(Jlabeltitre);

        panelplayer.add(paneltitre, java.awt.BorderLayout.NORTH);

        Jpanelnomplayer.setPreferredSize(new java.awt.Dimension(496, 150));

        jLabel2.setText("Nom joueur 1:");
        Jpanelnomplayer.add(jLabel2);

        NOM1.setColumns(12);
        NOM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NOM1ActionPerformed(evt);
            }
        });
        Jpanelnomplayer.add(NOM1);
        Jpanelnomplayer.add(jLabel4);

        jLabel3.setText("Nom joueur 2:");
        Jpanelnomplayer.add(jLabel3);

        Nom2.setColumns(12);
        Nom2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nom2ActionPerformed(evt);
            }
        });
        Jpanelnomplayer.add(Nom2);

        panelplayer.add(Jpanelnomplayer, java.awt.BorderLayout.CENTER);

        jPanel1.setPreferredSize(new java.awt.Dimension(496, 50));

        Commence.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Commence.setText("Commencer");
        Commence.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CommenceActionPerformed(evt);
            }
        });
        jPanel1.add(Commence);

        Quitter.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Quitter.setText("   Quitter");
        Quitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitterActionPerformed(evt);
            }
        });
        jPanel1.add(Quitter);

        panelplayer.add(jPanel1, java.awt.BorderLayout.SOUTH);

        getContentPane().add(panelplayer, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NOM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NOM1ActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_NOM1ActionPerformed

    private void Nom2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nom2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nom2ActionPerformed

    private void CommenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CommenceActionPerformed

        setVisible(false);
        nomj1 = NOM1.getText();
        nomj2 = Nom2.getText();
        if (nomj1.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "insere le nom de joueur 1");
            this.setVisible(true);
        } else if (nomj2.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "insere le nom de joueur 2");
            this.setVisible(true);
        } else {

            Jeux j = new Jeux();
            j.setVisible(true);
            Jeux.jnom.setText(Jeu.msgJoueur);
            System.out.println(Jeu.msgJoueur);

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_CommenceActionPerformed

    public String getNomj1() {
        return nomj1;
    }

    public void setNomj1(String nomj1) {
        this.nomj1 = nomj1;
    }

    public void setNomj2(String nomj2) {
        this.nomj2 = nomj2;
    }

    public String getNomj2() {
        return nomj2;
    }

    private void QuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitterActionPerformed

        setVisible(false);   // TODO add your handling code here:
    }//GEN-LAST:event_QuitterActionPerformed

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
            java.util.logging.Logger.getLogger(Bienvenue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bienvenue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bienvenue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bienvenue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bienvenue().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Commence;
    private javax.swing.JLabel Jlabeltitre;
    private javax.swing.JPanel Jpanelnomplayer;
    private javax.swing.JTextField NOM1;
    private javax.swing.JTextField Nom2;
    private javax.swing.JButton Quitter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelimage;
    private javax.swing.JPanel panelplayer;
    private javax.swing.JPanel paneltitre;
    // End of variables declaration//GEN-END:variables
}
