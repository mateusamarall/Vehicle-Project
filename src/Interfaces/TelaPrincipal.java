/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import javax.swing.JOptionPane;


/**
 *
 * @author mateus
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
       
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

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        panelcadastro = new javax.swing.JPanel();
        btnVeiculos = new javax.swing.JButton();
        btnEstados = new javax.swing.JButton();
        btnMarcasVeiculos = new javax.swing.JButton();
        btnAjuda = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        btnAutores = new javax.swing.JButton();
        btnsair = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenuItem2.setText("jMenuItem2");

        jMenu6.setText("jMenu6");

        jMenu7.setText("jMenu7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(700, 370));
        setMinimumSize(new java.awt.Dimension(700, 370));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Bem vindo. Este é o menu de opções, o que deseja fazer?.");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 30, 470, 20);

        panelcadastro.setVisible(false);
        panelcadastro.setLayout(null);

        btnVeiculos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnVeiculos.setText("VEÍCULOS");
        btnVeiculos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnVeiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVeiculosActionPerformed(evt);
            }
        });
        panelcadastro.add(btnVeiculos);
        btnVeiculos.setBounds(90, 20, 120, 38);

        btnEstados.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEstados.setText("ESTADOS");
        btnEstados.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEstados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadosActionPerformed(evt);
            }
        });
        panelcadastro.add(btnEstados);
        btnEstados.setBounds(250, 20, 120, 38);

        btnMarcasVeiculos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnMarcasVeiculos.setText("MARCAS MODELO");
        btnMarcasVeiculos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMarcasVeiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarcasVeiculosActionPerformed(evt);
            }
        });
        panelcadastro.add(btnMarcasVeiculos);
        btnMarcasVeiculos.setBounds(400, 20, 190, 39);

        getContentPane().add(panelcadastro);
        panelcadastro.setBounds(0, 110, 800, 80);

        btnAjuda.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnAjuda.setText("AJUDA");
        btnAjuda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjudaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAjuda);
        btnAjuda.setBounds(20, 60, 190, 38);

        jToolBar1.setRollover(true);

        btnAutores.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnAutores.setText("Autores do programa");
        btnAutores.setFocusable(false);
        btnAutores.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAutores.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAutores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutoresActionPerformed(evt);
            }
        });
        jToolBar1.add(btnAutores);

        btnsair.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnsair.setText("Sair");
        btnsair.setFocusable(false);
        btnsair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnsair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsairActionPerformed(evt);
            }
        });
        jToolBar1.add(btnsair);

        getContentPane().add(jToolBar1);
        jToolBar1.setBounds(0, 0, 580, 30);

        btnConsultar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnConsultar.setText("CONSULTAR");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultar);
        btnConsultar.setBounds(470, 60, 150, 38);

        btnCadastrar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnCadastrar.setText("CADASTRO");
        btnCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar);
        btnCadastrar.setBounds(250, 60, 190, 38);

        setSize(new java.awt.Dimension(712, 232));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // TODO add your handling code here:
        
        panelcadastro.setVisible(true);
        
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnEstadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadosActionPerformed
        // TODO add your handling code here:
        
        TelaEstados viewEstado = new TelaEstados();
        viewEstado.setVisible(true);
    }//GEN-LAST:event_btnEstadosActionPerformed

    private void btnMarcasVeiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarcasVeiculosActionPerformed
        // TODO add your handling code here:
        
        TelaMarcasVeiculos telamarcas = new TelaMarcasVeiculos();
        
        telamarcas.setVisible(true);
    }//GEN-LAST:event_btnMarcasVeiculosActionPerformed

    private void btnAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjudaActionPerformed
        // TODO add your handling code here:
        
        IntegrantesGrupo groupInte = new IntegrantesGrupo();
        
        groupInte.setVisible(true);
    }//GEN-LAST:event_btnAjudaActionPerformed

    private void btnsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsairActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "O Programa será fechado.");
       System.exit(0);
    }//GEN-LAST:event_btnsairActionPerformed

    private void btnAutoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutoresActionPerformed
        // TODO add your handling code here:
        
        TelaAutoresPrograma telaAutores = new TelaAutoresPrograma();
        
        telaAutores.setVisible(true);
    }//GEN-LAST:event_btnAutoresActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // TODO add your handling code here:
        
        TelaConsultar viewconsult = new TelaConsultar();
        
        viewconsult.setVisible(true);   
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnVeiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVeiculosActionPerformed
        // TODO add your handling code here:
        TelaVeiculos viewVeiculo = new TelaVeiculos();
        viewVeiculo.setVisible(true);
    }//GEN-LAST:event_btnVeiculosActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAjuda;
    private javax.swing.JButton btnAutores;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEstados;
    private javax.swing.JButton btnMarcasVeiculos;
    private javax.swing.JButton btnVeiculos;
    private javax.swing.JButton btnsair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JPanel panelcadastro;
    // End of variables declaration//GEN-END:variables


}
