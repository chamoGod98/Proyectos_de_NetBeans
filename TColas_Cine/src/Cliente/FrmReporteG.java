/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Cliente;

import Datos.*;
import TListas.*;
import Lógica.*;
import javax.swing.JOptionPane;

public class FrmReporteG extends javax.swing.JInternalFrame {

    public FrmReporteG() {
        initComponents();
        btnCalcular.setEnabled(false);
    }
    
    public void habilitarBtnCalcular(){
        if (txtCliente.getText().length()>=3) {
            btnCalcular.setEnabled(true);
        } else {
            btnCalcular.setEnabled(false);
        }
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
        btnCalcular = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblNumVeces = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblPromedio = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();

        setBackground(new java.awt.Color(153, 0, 0));
        setClosable(true);
        setTitle("Número de veces que ha ido al cine un cliente, incluido promedio");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cliente:");

        btnCalcular.setBackground(new java.awt.Color(0, 0, 0));
        btnCalcular.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnCalcular.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("N° veces que ha ido al cine:");

        lblNumVeces.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblNumVeces.setForeground(new java.awt.Color(255, 255, 255));
        lblNumVeces.setText("??");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Promedio:");

        lblPromedio.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblPromedio.setForeground(new java.awt.Color(255, 255, 255));
        lblPromedio.setText("???????");

        txtCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtClienteKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtClienteKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(lblNumVeces)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(lblPromedio))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtCliente)
                        .addGap(18, 18, 18)
                        .addComponent(btnCalcular)))
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnCalcular)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblNumVeces)
                    .addComponent(jLabel3)
                    .addComponent(lblPromedio))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        String nombre = txtCliente.getText();
        float valor[]=Cliente.reporteG(nombre);
        lblNumVeces.setText(String.valueOf(valor[0]));
        lblPromedio.setText(String.valueOf(valor[1]));
        btnCalcular.setEnabled(false);
        if (lblNumVeces.getText().equalsIgnoreCase("0.0")) {
            JOptionPane.showMessageDialog(rootPane, "No se encontró el cliente");
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void txtClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClienteKeyTyped
        char c = evt.getKeyChar();
        
        if (((c<'a' | c>'z')&&(c<'A' | c>'Z'))&&c!=' ') {
            evt.consume();
        }
    }//GEN-LAST:event_txtClienteKeyTyped

    private void txtClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClienteKeyReleased
        habilitarBtnCalcular();
    }//GEN-LAST:event_txtClienteKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblNumVeces;
    private javax.swing.JLabel lblPromedio;
    private javax.swing.JTextField txtCliente;
    // End of variables declaration//GEN-END:variables
}
