/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Capa_Cliente;

import Capa_Datos.Lista_Empresas;
import Capa_Logica.Empresa;
import javax.swing.table.DefaultTableModel;
import TListas.*;

/**
 *
 * @author jefer
 */
public class FrmListadoEmpresas extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmListadoEmpresas
     */
    public FrmListadoEmpresas() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpresas = new javax.swing.JTable();
        btnListarEmpresas = new javax.swing.JButton();

        setClosable(true);
        setTitle("Lista de empresas");

        tblEmpresas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblEmpresas);

        btnListarEmpresas.setText("Listar");
        btnListarEmpresas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarEmpresasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnListarEmpresas)
                        .addGap(154, 154, 154))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnListarEmpresas)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListarEmpresasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarEmpresasActionPerformed
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("Código de empresa");
        modelo.addColumn("Nombre");
        modelo.addColumn("Tipo");
        modelo.addColumn("Máxima inversión");
        
        TLista LE = Lista_Empresas.consultar();
        
        Object datos[] = new Object[4];
        
        for (int i = 0; i < LE.Cantidad(); i++) {
            Empresa objE = (Empresa)LE.Obtener(i);
            datos[0]=objE.getCodigo();
            datos[1]=objE.getNombre();
            datos[2]=objE.getTipo();
            datos[3]=objE.getInvMaxima();
            modelo.addRow(datos);
        }
        tblEmpresas.setModel(modelo);
    }//GEN-LAST:event_btnListarEmpresasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnListarEmpresas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEmpresas;
    // End of variables declaration//GEN-END:variables
}