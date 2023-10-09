/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion;

import Logica.Pedido;
import javax.swing.JOptionPane;

/**
 *
 * @author jefer
 */
public class FrmPedido extends javax.swing.JFrame {

    /**
     * Creates new form FrmPedido
     */
    public FrmPedido() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbop1 = new javax.swing.JComboBox<>();
        cbop2 = new javax.swing.JComboBox<>();
        cboBebida = new javax.swing.JComboBox<>();
        cboPostre = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        lblpp1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblpp2 = new javax.swing.JLabel();
        lblpBebida = new javax.swing.JLabel();
        lblpPostre = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pedido");
        setResizable(false);

        jLabel1.setText("Primer plato:");

        jLabel2.setText("Segundo plato:");

        jLabel3.setText("Bebida:");

        jLabel4.setText("Postre:");

        cbop1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arroz con pollo", "Arroz con pato", "Lomo saltado", "Tallarines rojos", "Bonito frito", "Mollejitas fritas", "Seco de carne", "Seco de pollo" }));
        cbop1.setSelectedIndex(-1);
        cbop1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbop1ActionPerformed(evt);
            }
        });

        cbop2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arroz con pollo", "Arroz con pato", "Lomo saltado", "Tallarines rojos", "Bonito frito", "Mollejitas fritas", "Seco de carne", "Seco de pollo" }));
        cbop2.setSelectedIndex(-1);
        cbop2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbop2ActionPerformed(evt);
            }
        });

        cboBebida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jugo de piña", "Jugo surtido", "Chicha morada", "Gaseosa" }));
        cboBebida.setSelectedIndex(-1);
        cboBebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboBebidaActionPerformed(evt);
            }
        });

        cboPostre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selva negra", "Tres leches", "Torta helada", "Mazamorra", "Arroz con leche", "Helado" }));
        cboPostre.setSelectedIndex(-1);
        cboPostre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboPostreActionPerformed(evt);
            }
        });

        jLabel5.setText("Precio (S/.):");

        lblpp1.setText("0");

        jLabel6.setText("Precio (S/.):");

        jLabel7.setText("Precio (S/.):");

        jLabel8.setText("Precio (S/.):");

        lblpp2.setText("0");

        lblpBebida.setText("0");

        lblpPostre.setText("0");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("TOTAL (S/.) :");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("CALCULAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblTotal.setText("--------------------------------");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbop1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbop2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboBebida, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboPostre, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblpp2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblpp1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblpBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblpPostre, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbop1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(lblpp1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbop2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(lblpp2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboBebida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(lblpBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cboPostre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(lblpPostre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jButton1)
                    .addComponent(lblTotal))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbop1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbop1ActionPerformed
        switch (cbop1.getSelectedIndex()) {
            case 0:
                lblpp1.setText("7.00");
                break;
            case 1:
                lblpp1.setText("12.00");
                break;
            case 2:
                lblpp1.setText("12.00");
                break;
            case 3:
                lblpp1.setText("7.00");
                break;
            case 4:
                lblpp1.setText("7.00");
                break;
            case 5:
                lblpp1.setText("8.00");
                break;
            case 6:
                lblpp1.setText("8.00");
                break;
            case 7:
                lblpp1.setText("8.00");
                break;
            default:
                break;
        }
    }//GEN-LAST:event_cbop1ActionPerformed

    private void cbop2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbop2ActionPerformed
        switch (cbop2.getSelectedIndex()) {
            case 0:
                lblpp2.setText("7.00");
                break;
            case 1:
                lblpp2.setText("12.00");
                break;
            case 2:
                lblpp2.setText("12.00");
                break;
            case 3:
                lblpp2.setText("7.00");
                break;
            case 4:
                lblpp2.setText("7.00");
                break;
            case 5:
                lblpp2.setText("8.00");
                break;
            case 6:
                lblpp2.setText("8.00");
                break;
            case 7:
                lblpp2.setText("8.00");
                break;
            default:
                break;
        }
    }//GEN-LAST:event_cbop2ActionPerformed

    private void cboBebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboBebidaActionPerformed
        //Jugo de piña, Jugo surtido, Chicha morada, Gaseosa
        switch (cboBebida.getSelectedIndex()) {
            case 0:
                lblpBebida.setText("3.50");
                break;
            case 1:
                lblpBebida.setText("5.00");
                break;
            case 2:
                lblpBebida.setText("2.50");
                break;
            case 3:
                lblpBebida.setText("3.00");
                break;
            default:
                break;
        }
    }//GEN-LAST:event_cboBebidaActionPerformed

    private void cboPostreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboPostreActionPerformed
        // Selva negra, Tres leches, Torta helada, Mazamorra, Arroz con leche, Helado
        switch (cboPostre.getSelectedIndex()) {
            case 0:
                lblpPostre.setText("5.00");
                break;
            case 1:
                lblpPostre.setText("5.00");
                break;
            case 2:
                lblpPostre.setText("5.00");
                break;
            case 3:
                lblpPostre.setText("4.00");
                break;
            case 4:
                lblpPostre.setText("4.00");
                break;
            case 5:
                lblpPostre.setText("3.00");
            default:
                break;
        }
    }//GEN-LAST:event_cboPostreActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        Pedido obj = new Pedido();
        
        float pp1 = Float.parseFloat(lblpp1.getText());
        float pp2 = Float.parseFloat(lblpp2.getText());
        float pBebida = Float.parseFloat(lblpBebida.getText());
        float pPostre = Float.parseFloat(lblpPostre.getText());
        
        obj.setPp1(pp1);
        obj.setPp2(pp2);
        obj.setpB(pBebida);
        obj.setpP(pPostre);
        
        float precio;
        
        if (pp1 != 0 && pBebida != 0 && pp2==0 && pPostre==0) {
            precio = obj.pedido1();
            lblTotal.setText(String.format("%.2f",precio));
        } else if (pp1 != 0 && pBebida != 0 && pp2!=0 && pPostre==0) {
            precio = obj.pedido2();
            lblTotal.setText(String.format("%.2f",precio));
        } else if (pp1 != 0 && pp2 != 0 && pBebida != 0 && pPostre!=0) {
            precio = obj.pedido3();
            lblTotal.setText(String.format("%.2f",precio));
        } else {
            JOptionPane.showMessageDialog(rootPane, "Opción no válida. Intente nuevamente");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboBebida;
    private javax.swing.JComboBox<String> cboPostre;
    private javax.swing.JComboBox<String> cbop1;
    private javax.swing.JComboBox<String> cbop2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblpBebida;
    private javax.swing.JLabel lblpPostre;
    private javax.swing.JLabel lblpp1;
    private javax.swing.JLabel lblpp2;
    // End of variables declaration//GEN-END:variables
}
