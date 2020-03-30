/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.judge;

//import javax.swing.ImageIcon;

import java.awt.Color;
import javax.swing.ImageIcon;


/**
 *
 * @author Sunil
 */
public class Login_form extends javax.swing.JFrame {

    /**
     * Creates new form Login_form
     */
    private int xpos;
    private int ypos;
    public Login_form() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exiticn = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        passinp = new javax.swing.JPasswordField();
        emailinp = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(exiticn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gmail_logo(half).png"))); // NOI18N
        jLabel3.setText(" ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 220, 180));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Assignment Judge");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 60, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 380, 10));

        passinp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        passinp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passinp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passinpActionPerformed(evt);
            }
        });
        getContentPane().add(passinp, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 240, 40));

        emailinp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        emailinp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        emailinp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailinpActionPerformed(evt);
            }
        });
        getContentPane().add(emailinp, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 240, 40));

        jButton1.setBackground(new java.awt.Color(184, 42, 96));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Login ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, 170, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/background(bg).png"))); // NOI18N
        jLabel5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel5MouseDragged(evt);
            }
        });
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
        });
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 380, 570));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void emailinpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailinpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailinpActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String email = emailinp.getText();
        String password = new String(passinp.getPassword());
        new HomePage(email, password).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void exiticnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exiticnMouseClicked
        this.dispose();
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

    private void jLabel5MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xpos, y - ypos);
        //System.out.println(x+","+y);
    }//GEN-LAST:event_jLabel5MouseDragged

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
        xpos = evt.getX();
        ypos = evt.getY();
    }//GEN-LAST:event_jLabel5MousePressed

    private void passinpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passinpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passinpActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
       
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emailinp;
    private javax.swing.JLabel exiticn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPasswordField passinp;
    // End of variables declaration//GEN-END:variables

}


