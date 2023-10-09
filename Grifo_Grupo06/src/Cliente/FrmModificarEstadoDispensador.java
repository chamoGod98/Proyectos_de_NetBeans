/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Cliente;

import Datos.Lista_Dispensadores;
import Logica.Dispensador;
import TListas.TLista;
import javax.swing.JOptionPane;

/**
 *
 * @author jefer
 */
public class FrmModificarEstadoDispensador extends javax.swing.JInternalFrame {

    TLista LD = Lista_Dispensadores.consultar();

    public FrmModificarEstadoDispensador() {
        initComponents();
        for (int i = 0; i < LD.Cantidad(); i++) {
            Dispensador obj = (Dispensador) LD.Obtener(i);
            cboDisp.addItem(String.valueOf(obj.getNumero()));
        }
        if (LD.Vacia()) {
            JOptionPane.showMessageDialog(rootPane, "No hay ning�n dispensador registrado", "AVISO", 2);
        }
        btnModificar.setEnabled(false);
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
        cboDisp = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cboNvoEstado = new javax.swing.JComboBox<>();
        txtEstado = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Modificar estado de dispensador");

        jLabel1.setText("N� dispensador:");

        cboDisp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboDispActionPerformed(evt);
            }
        });

        jLabel2.setText("Estado actual:");

        cboNvoEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "H�BIL", "NO H�BIL", "EN MANTENIMIENTO" }));

        txtEstado.setEnabled(false);

        jLabel3.setText("Cambiar a:");

        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEstado)
                            .addComponent(cboDisp, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboNvoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnModificar)
                .addGap(66, 66, 66))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cboDisp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cboNvoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(btnModificar)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboDispActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboDispActionPerformed

        int pos = Integer.parseInt(cboDisp.getSelectedItem().toString());
        Dispensador obj = (Dispensador) LD.Obtener(pos);

        txtEstado.setText(obj.getEstado());
    }//GEN-LAST:event_cboDispActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if (txtEstado.getText().equalsIgnoreCase(cboNvoEstado.getSelectedItem().toString())) {
            JOptionPane.showMessageDialog(rootPane, "Seleccione un estado diferente");
        } else {
            int rpta = JOptionPane.showConfirmDialog(rootPane, "�Modificar estado?", "Confirmar", 0, 3);
            if (rpta == 0) {
                int pos = Integer.parseInt(cboDisp.getSelectedItem().toString());
                Dispensador obj = (Dispensador) LD.Obtener(pos);
                obj.setEstado(cboNvoEstado.getSelectedItem().toString());
                txtEstado.setText("");
                btnModificar.setEnabled(false);
            }
        }
    }//GEN-LAST:event_btnModificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cboDisp;
    private javax.swing.JComboBox<String> cboNvoEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtEstado;
    // End of variables declaration//GEN-END:variables
}