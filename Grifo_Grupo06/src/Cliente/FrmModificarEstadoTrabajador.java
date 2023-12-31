/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Cliente;

import Datos.Lista_Trabajadores;
import Logica.Trabajador;
import TListas.TLista;
import javax.swing.JOptionPane;

/**
 *
 * @author jefer
 */
public class FrmModificarEstadoTrabajador extends javax.swing.JInternalFrame {

    TLista LT = Lista_Trabajadores.consultar();
    
    public FrmModificarEstadoTrabajador() {
        initComponents();
        for (int i = 0; i < LT.Cantidad(); i++) {
            Trabajador obj = (Trabajador) LT.Obtener(i);
            cboCodigo.addItem(String.valueOf(obj.getCodigo()));
        }
        if (LT.Vacia()) {
            JOptionPane.showMessageDialog(rootPane, "No hay ning�n trabajador registrado", "AVISO", 2);
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
        cboCodigo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cboNvoEstado = new javax.swing.JComboBox<>();
        btnModificar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Modificar estado de trabajador");

        jLabel1.setText("C�digo de trabajador:");

        cboCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCodigoActionPerformed(evt);
            }
        });

        jLabel2.setText("Estado actual:");

        txtEstado.setEnabled(false);

        jLabel3.setText("Cambiar a:");

        cboNvoEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ACTIVO", "INACTIVO" }));

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cboCodigo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtEstado)
                    .addComponent(cboNvoEstado, 0, 105, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnModificar)
                .addGap(101, 101, 101))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cboCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cboNvoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(btnModificar)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCodigoActionPerformed
        int pos = Integer.parseInt(cboCodigo.getSelectedItem().toString());
        Trabajador obj = (Trabajador) LT.Obtener(pos);

        txtEstado.setText(obj.getEstado());
    }//GEN-LAST:event_cboCodigoActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if (txtEstado.getText().equalsIgnoreCase(cboNvoEstado.getSelectedItem().toString())) {
            JOptionPane.showMessageDialog(rootPane, "Seleccione un estado diferente");
        } else {
            int rpta = JOptionPane.showConfirmDialog(rootPane, "�Modificar estado?", "Confirmar", 0, 3);
            if (rpta == 0) {
                int pos = Integer.parseInt(cboCodigo.getSelectedItem().toString());
                Trabajador obj = (Trabajador) LT.Obtener(pos);
                obj.setEstado(cboNvoEstado.getSelectedItem().toString());
                txtEstado.setText("");
                btnModificar.setEnabled(false);
            }
        }
    }//GEN-LAST:event_btnModificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cboCodigo;
    private javax.swing.JComboBox<String> cboNvoEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtEstado;
    // End of variables declaration//GEN-END:variables
}
