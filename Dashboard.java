/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package penjualanmobil;

/**
 *
 * @author USER
 */

import javax.swing.JFrame;

public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        menuDataMaster = new javax.swing.JMenu();
        menuAdmin = new javax.swing.JMenuItem();
        menuMobil = new javax.swing.JMenuItem();
        menuTipe = new javax.swing.JMenuItem();
        menuTransaksi = new javax.swing.JMenu();
        menuLaporan = new javax.swing.JMenu();
        menuAboutUs = new javax.swing.JMenu();
        menuLogout = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuDataMaster.setText("Data Master");
        menuDataMaster.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuDataMasterMouseClicked(evt);
            }
        });

        menuAdmin.setText("Admin");
        menuAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuAdminMouseClicked(evt);
            }
        });
        menuAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAdminActionPerformed(evt);
            }
        });
        menuDataMaster.add(menuAdmin);

        menuMobil.setText("Mobil");
        menuMobil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuMobilMouseClicked(evt);
            }
        });
        menuMobil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMobilActionPerformed(evt);
            }
        });
        menuDataMaster.add(menuMobil);

        menuTipe.setText("Tipe");
        menuTipe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuTipeMouseClicked(evt);
            }
        });
        menuTipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTipeActionPerformed(evt);
            }
        });
        menuDataMaster.add(menuTipe);

        jMenuBar1.add(menuDataMaster);

        menuTransaksi.setText("Transaksi");
        menuTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuTransaksiMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuTransaksi);

        menuLaporan.setText("Laporan");
        menuLaporan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuLaporanMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuLaporan);

        menuAboutUs.setText("About Us");
        menuAboutUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAboutUsActionPerformed(evt);
            }
        });
        jMenuBar1.add(menuAboutUs);

        menuLogout.setText("Logout");
        menuLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuLogoutMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuLogout);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuDataMasterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuDataMasterMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_menuDataMasterMouseClicked

    private void menuTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuTransaksiMouseClicked
        // TODO add your handling code here:
        FormTransaksi trans = new FormTransaksi();
        trans.setVisible(true);
    }//GEN-LAST:event_menuTransaksiMouseClicked

    private void menuLaporanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuLaporanMouseClicked
        // TODO add your handling code here:
        FormLaporan laporan = new FormLaporan();
        laporan.setVisible(true);
    }//GEN-LAST:event_menuLaporanMouseClicked

    private void menuLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuLogoutMouseClicked
        // TODO add your handling code here:
        FormLogin masuk = new FormLogin();
        masuk.setVisible(true);
    }//GEN-LAST:event_menuLogoutMouseClicked

    private void menuAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAdminMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_menuAdminMouseClicked

    private void menuMobilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMobilMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_menuMobilMouseClicked

    private void menuTipeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuTipeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_menuTipeMouseClicked

    private void menuAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAdminActionPerformed
        // TODO add your handling code here:
        FormAdmin adm = new FormAdmin();
        adm.setVisible(true);
    }//GEN-LAST:event_menuAdminActionPerformed

    private void menuMobilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMobilActionPerformed
        // TODO add your handling code here:
        FormMobil mob = new FormMobil();
        mob.setVisible(true);
    }//GEN-LAST:event_menuMobilActionPerformed

    private void menuTipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTipeActionPerformed
        // TODO add your handling code here:
        FormTipe tip = new FormTipe();
        tip.setVisible(true);
    }//GEN-LAST:event_menuTipeActionPerformed

    private void menuAboutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAboutUsActionPerformed
        // TODO add your handling code here:
        FormAboutUs au = new FormAboutUs();
        au.setVisible(true);
    }//GEN-LAST:event_menuAboutUsActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuAboutUs;
    private javax.swing.JMenuItem menuAdmin;
    private javax.swing.JMenu menuDataMaster;
    private javax.swing.JMenu menuLaporan;
    private javax.swing.JMenu menuLogout;
    private javax.swing.JMenuItem menuMobil;
    private javax.swing.JMenuItem menuTipe;
    private javax.swing.JMenu menuTransaksi;
    // End of variables declaration//GEN-END:variables
}
