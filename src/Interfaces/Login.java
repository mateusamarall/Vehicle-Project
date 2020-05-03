/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import javax.swing.JOptionPane;
import Controller.UserController;
import Models.UserModel;

/**
 *
 * @author mateus
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        jLabel1 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        btnlogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(400, 400));
        setMinimumSize(new java.awt.Dimension(400, 400));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("SENHA:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 130, 70, 22);

        txtPassword.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(txtPassword);
        txtPassword.setBounds(130, 120, 180, 40);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("LOGIN: ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 60, 70, 22);

        txtLogin.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(txtLogin);
        txtLogin.setBounds(130, 50, 180, 40);

        btnlogin.setBackground(new java.awt.Color(255, 255, 255));
        btnlogin.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnlogin.setText("LOG IN");
        btnlogin.setBorder(null);
        btnlogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        getContentPane().add(btnlogin);
        btnlogin.setBounds(150, 210, 120, 40);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        // TODO add your handling code here:
        if(txtLogin.getText().equals("") || txtLogin == null || txtPassword.getText().equals("") || txtPassword== null){
            
            txtLogin.setText("");
            txtPassword.setText("");
            txtLogin.requestFocus();
            
            JOptionPane.showMessageDialog(null, "Usuário não encontrado digite novamente");
            
        }else{
            UserModel um = new UserModel(txtLogin.getText(), "", Integer.parseInt(txtPassword.getText()));
            UserController uc = new UserController();
            boolean Session = uc.Show(um);
            if(!Session){
                JOptionPane.showMessageDialog(null, "Credencias de login errada, tente novamente ");
            }else{
                TelaPrincipal telap = new TelaPrincipal();
                this.dispose();
                telap.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnloginActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtPassword;
    // End of variables declaration//GEN-END:variables
}
