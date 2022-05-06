/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recipy.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
public class ForgetPassword extends javax.swing.JFrame {

    /**
     * Creates new form ForgetPassword
     */
    public ForgetPassword() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        L_Email = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        L_Password = new javax.swing.JPasswordField();
        jButton3 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1050, 600));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMinimumSize(new java.awt.Dimension(1050, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(1050, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255,80));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 102, 0), 2));
        jPanel2.setMinimumSize(new java.awt.Dimension(400, 800));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 800));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Back.setBackground(new java.awt.Color(153,102, 0,80));
        Back.setFont(new java.awt.Font("Bradley Hand ITC", 3, 24)); // NOI18N
        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon2.png"))); // NOI18N
        Back.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 102, 0), 3));
        Back.setMaximumSize(new java.awt.Dimension(1009, 1009));
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel2.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 40, 30));

        jLabel2.setFont(new java.awt.Font("Harrington", 3, 36)); // NOI18N
        jLabel2.setText("Email :");
        jLabel2.setMaximumSize(new java.awt.Dimension(108, 46));
        jLabel2.setMinimumSize(new java.awt.Dimension(108, 46));
        jLabel2.setPreferredSize(new java.awt.Dimension(108, 46));
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 150, 50));

        L_Email.setBackground(new java.awt.Color(153,102, 0,80));
        L_Email.setFont(new java.awt.Font("Bradley Hand ITC", 3, 30)); // NOI18N
        L_Email.setForeground(new java.awt.Color(255, 255, 255));
        L_Email.setToolTipText("Enter Your Email");
        L_Email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 102, 0)));
        jPanel2.add(L_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 330, 50));

        jLabel3.setFont(new java.awt.Font("Harrington", 3, 36)); // NOI18N
        jLabel3.setText("Password:");
        jLabel3.setMaximumSize(new java.awt.Dimension(157, 46));
        jLabel3.setMinimumSize(new java.awt.Dimension(157, 46));
        jLabel3.setPreferredSize(new java.awt.Dimension(157, 46));
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 180, -1));

        L_Password.setBackground(new java.awt.Color(153,102, 0,80));
        L_Password.setFont(new java.awt.Font("Bradley Hand ITC", 3, 30)); // NOI18N
        L_Password.setForeground(new java.awt.Color(255, 255, 255));
        L_Password.setToolTipText("Enter Password");
        L_Password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 102, 0)));
        L_Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L_PasswordActionPerformed(evt);
            }
        });
        jPanel2.add(L_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 330, 50));

        jButton3.setBackground(new java.awt.Color(153, 102, 0,80));
        jButton3.setFont(new java.awt.Font("Harrington", 3, 24)); // NOI18N
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 102, 0), 3));
        jButton3.setLabel("Set Password");
        jButton3.setMaximumSize(new java.awt.Dimension(133, 31));
        jButton3.setMinimumSize(new java.awt.Dimension(133, 31));
        jButton3.setPreferredSize(new java.awt.Dimension(133, 31));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 170, 60));

        jCheckBox1.setBackground(new java.awt.Color(153,102,0,80));
        jCheckBox1.setFont(new java.awt.Font("Harrington", 3, 14)); // NOI18N
        jCheckBox1.setLabel("Show");
        jCheckBox1.setMaximumSize(new java.awt.Dimension(51, 23));
        jCheckBox1.setMinimumSize(new java.awt.Dimension(51, 23));
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, 60, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 610, 440));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/V4_1 (1).gif"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1050, 600));
        jLabel1.setMinimumSize(new java.awt.Dimension(1050, 600));
        jLabel1.setPreferredSize(new java.awt.Dimension(1050, 600));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:\
        Login log = new Login();
        log.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BackActionPerformed

    private void L_PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_L_PasswordActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            String ural ="jdbc:oracle:thin:@localhost:1521:xe";
            Connection con =  DriverManager.getConnection(ural," C##hoom","20202020");
            PreparedStatement ps= con.prepareStatement(" UPDATE us SET passwords = ? WHERE EMAIL=? ");
            //ResultSet rs;
            ps.setString(1, String.valueOf(L_Password.getPassword()));
            ps.setString(2, L_Email.getText());
            //rs = ps.executeQuery();
            int i= ps.executeUpdate();

            if(i>0){
                JOptionPane.showMessageDialog(null, "Data update sucessful");
                con.setAutoCommit(false);
                con.commit();
                con.close();
                Login log = new Login();
                log.setVisible(true);
                this.setVisible(false);

            }
            else {
                JOptionPane.showMessageDialog(null, "Error");
            }

        } catch (Exception ex) {

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        if(jCheckBox1.isSelected()){
            L_Password.setEchoChar((char)0);
        }
        else{
            L_Password.setEchoChar(('*'));
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(ForgetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgetPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JTextField L_Email;
    private javax.swing.JPasswordField L_Password;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}