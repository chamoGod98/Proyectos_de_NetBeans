/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Capa_Cliente;

import Capa_Datos.Lista_Empresas;
import Capa_Logica.Empresa;
import Capa_Logica.Proyecto;
import TListas.TLista;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jefer
 */
public class FrmReporteD extends javax.swing.JInternalFrame {
    //Validamos que las empresas estèn registradas y las colocamos como opciones en el combo box del formulario
    
    TLista LEmp;
    public FrmReporteD() throws Exception {
        initComponents();
        LEmp = Empresa.consultarTodo();
        for (int i = 0; i < LEmp.Cantidad(); i++) {
            Empresa objEmpresa = (Empresa) LEmp.Obtener(i);
            cboEmpresas.addItem(objEmpresa.getCodigo()+ " - " + objEmpresa.getNombre());
        }
    }
    
    //Listamos los proyectos dada la empresa (còdigo)
    public void listarProyectosEmpresa() throws Exception
   {
        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("Nombre del proyecto");
        modelo.addColumn("País");
        modelo.addColumn("Fecha de inicio");
        modelo.addColumn("Duración");
        modelo.addColumn("Costo");
        modelo.addColumn("Tipo de proyecto");
        
        String codEmpresa = cboEmpresas.getSelectedItem().toString();
        
        TLista LProy = Proyecto.proyectos_Empresa(codEmpresa);
        
        Object datos[] = new Object[6];
        
           for (int i = 0; i < LProy.Cantidad(); i++) {
                Proyecto objProyecto = (Proyecto) LProy.Obtener(i);
                datos[0] = objProyecto.getNombre();
                datos[1] = objProyecto.getPais();
                datos[2] = objProyecto.getFechaInicio();
                datos[3] = objProyecto.getDuracionMeses();
                datos[4] = objProyecto.getCosto();
                datos[5] = objProyecto.getTipo();
                modelo.addRow(datos);
            }
        tblProyectos.setModel(modelo);
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProyectos = new javax.swing.JTable();
        btnReporteD = new javax.swing.JButton();
        cboEmpresas = new javax.swing.JComboBox<>();

        setClosable(true);
        setTitle("Lista de proyectos por empresa");

        jLabel1.setText("Código de empresa:");

        tblProyectos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblProyectos);

        btnReporteD.setText("Listar");
        btnReporteD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteDActionPerformed(evt);
            }
        });

        cboEmpresas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboEmpresasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cboEmpresas, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(207, Short.MAX_VALUE)
                .addComponent(btnReporteD)
                .addGap(183, 183, 183))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cboEmpresas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnReporteD)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReporteDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteDActionPerformed
        try {
            listarProyectosEmpresa();
        } catch (Exception ex) {
            Logger.getLogger(FrmReporteD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnReporteDActionPerformed

    private void cboEmpresasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboEmpresasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboEmpresasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReporteD;
    private javax.swing.JComboBox<String> cboEmpresas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProyectos;
    // End of variables declaration//GEN-END:variables
}
