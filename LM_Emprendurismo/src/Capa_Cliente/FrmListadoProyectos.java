/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Capa_Cliente;

import Capa_Datos.Lista_Proyectos;
import Capa_Logica.Proyecto;
import javax.swing.table.DefaultTableModel;
import TListas.*;

/**
 *
 * @author jefer
 */
public class FrmListadoProyectos extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmListadoProyectos
     */
    public FrmListadoProyectos() {
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
        tblProyectos = new javax.swing.JTable();
        btnListarP = new javax.swing.JButton();

        setClosable(true);
        setTitle("Lista de proyectos");

        tblProyectos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblProyectos);

        btnListarP.setText("Listar");
        btnListarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 867, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnListarP)
                .addGap(377, 377, 377))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnListarP)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarPActionPerformed
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("Código de proyecto");
        modelo.addColumn("Nombre");
        modelo.addColumn("País");
        modelo.addColumn("Fecha de inicio");
        modelo.addColumn("Duración");
        modelo.addColumn("Costo");
        modelo.addColumn("Tipo de proyecto");
        modelo.addColumn("Empresa subvencionadora");
        
        TLista LP = Lista_Proyectos.consultar();
        
        Object datos[] = new Object[8];
        
        for (int i = 0; i < LP.Cantidad(); i++) {
            Proyecto objP = (Proyecto)LP.Obtener(i);
            datos[0]=objP.getCodigo();
            datos[1]=objP.getNombre();
            datos[2]=objP.getPais();
            datos[3]=objP.getFechaInicio();
            datos[4]=objP.getDuracionMeses();
            datos[5]=objP.getCosto();
            datos[6]=objP.getTipo();
            datos[7]=objP.getCodEmpresa();
            modelo.addRow(datos);
        }
        tblProyectos.setModel(modelo);
    }//GEN-LAST:event_btnListarPActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnListarP;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProyectos;
    // End of variables declaration//GEN-END:variables
}
