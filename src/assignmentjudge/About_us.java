/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentjudge;

import java.awt.Color;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author Sunil
 */
public class About_us extends javax.swing.JFrame {

    /**
     * Creates new form About_us
     */
    public About_us() {
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

        nimish_linkedin = new javax.swing.JButton();
        bharat_linkedin = new javax.swing.JButton();
        exiticn = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nimish_linkedin.setBorderPainted(false);
        nimish_linkedin.setContentAreaFilled(false);
        nimish_linkedin.setFocusPainted(false);
        nimish_linkedin.setName(""); // NOI18N
        nimish_linkedin.setOpaque(false);
        nimish_linkedin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nimish_linkedinActionPerformed(evt);
            }
        });
        getContentPane().add(nimish_linkedin, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 50, 50));

        bharat_linkedin.setBorderPainted(false);
        bharat_linkedin.setContentAreaFilled(false);
        bharat_linkedin.setFocusPainted(false);
        bharat_linkedin.setOpaque(false);
        bharat_linkedin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bharat_linkedinActionPerformed(evt);
            }
        });
        getContentPane().add(bharat_linkedin, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 50, 50));

        exiticn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/close_1.png"))); // NOI18N
        exiticn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exiticnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exiticnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exiticnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exiticnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                exiticnMouseReleased(evt);
            }
        });
        getContentPane().add(exiticn, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/about_us(v2).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exiticnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exiticnMouseClicked
        this.dispose();
        new Menu().setVisible(true);
    }//GEN-LAST:event_exiticnMouseClicked

    private void exiticnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exiticnMouseEntered
        ImageIcon icn = new ImageIcon(getClass().getResource("/resources/closeho.png"));
        exiticn.setIcon(icn);
    }//GEN-LAST:event_exiticnMouseEntered

    private void exiticnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exiticnMouseExited
        ImageIcon icn = new ImageIcon(getClass().getResource("/resources/close_1.png"));
        exiticn.setIcon(icn);
    }//GEN-LAST:event_exiticnMouseExited

    private void exiticnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exiticnMousePressed
        ImageIcon icn = new ImageIcon(getClass().getResource("/resources/closec.png"));
        exiticn.setIcon(icn);
    }//GEN-LAST:event_exiticnMousePressed

    private void exiticnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exiticnMouseReleased

    }//GEN-LAST:event_exiticnMouseReleased

    private void nimish_linkedinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nimish_linkedinActionPerformed
        URL url = null;
        try {
            url = new URL("https://www.linkedin.com/in/nimish-mishra-2ab313106");
        } catch (MalformedURLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        Browse.openWebpage(url);
    }//GEN-LAST:event_nimish_linkedinActionPerformed

    private void bharat_linkedinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bharat_linkedinActionPerformed
        URL url = null;
        try {
            url = new URL("https://www.linkedin.com/in/bharat-keswani-62158a179");
        } catch (MalformedURLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        Browse.openWebpage(url);
    }//GEN-LAST:event_bharat_linkedinActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        /*try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(About_us.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(About_us.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(About_us.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(About_us.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        */
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new About_us().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bharat_linkedin;
    private javax.swing.JLabel exiticn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton nimish_linkedin;
    // End of variables declaration//GEN-END:variables
}
