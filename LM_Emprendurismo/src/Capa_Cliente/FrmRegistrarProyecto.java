/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Capa_Cliente;

import Capa_Datos.Lista_Empresas;
import Capa_Datos.Lista_Proyectos;
import Capa_Logica.Empresa;
import Capa_Logica.Proyecto;
import TListas.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author jefer
 */
public class FrmRegistrarProyecto extends javax.swing.JInternalFrame {
    
    public FrmRegistrarProyecto() {
        initComponents();
        TLista empresas = new TListaDin();
        empresas=Lista_Empresas.consultar();
        for (int i = 0; i < empresas.Cantidad(); i++) {
            Empresa objD = (Empresa) empresas.Obtener(i);
            cboEmpresaProyecto.addItem(objD.getCodigo() + " - " + objD.getNombre());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCodigoProyecto = new javax.swing.JTextField();
        txtNombreProyecto = new javax.swing.JTextField();
        cboPaisProyecto = new javax.swing.JComboBox<>();
        txtDuracionProyecto = new javax.swing.JTextField();
        txtCostoProyecto = new javax.swing.JTextField();
        cboTipoProyecto = new javax.swing.JComboBox<>();
        btnRegistrar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        cboEmpresaProyecto = new javax.swing.JComboBox<>();
        calendar = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Registrar proyecto");

        jLabel1.setText("Código:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("País:");

        jLabel4.setText("Fecha de inicio:");

        jLabel5.setText("Duración:");

        jLabel6.setText("Costo:");

        jLabel7.setText("Tipo de proyecto:");

        txtCodigoProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoProyectoActionPerformed(evt);
            }
        });

        cboPaisProyecto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "España", "México", "EEUU", "Puerto Rico", "Colombia" }));

        cboTipoProyecto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ambiental", "Social", "Tecnológica" }));

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        jLabel8.setText("Código de empresa:");

        cboEmpresaProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboEmpresaProyectoActionPerformed(evt);
            }
        });

        jLabel9.setText("mes (es)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cboEmpresaProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCostoProyecto)
                                    .addComponent(txtCodigoProyecto)
                                    .addComponent(txtNombreProyecto)
                                    .addComponent(cboPaisProyecto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(calendar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtDuracionProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel9))
                                    .addComponent(cboTipoProyecto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(34, 34, 34))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegistrar)
                .addGap(113, 113, 113))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigoProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombreProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cboPaisProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(calendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDuracionProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCostoProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cboTipoProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cboEmpresaProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(btnRegistrar)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoProyectoActionPerformed
        
    }//GEN-LAST:event_txtCodigoProyectoActionPerformed
    //a) Ingresar un nuevo Proyecto.
    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        Proyecto objProyecto = new Proyecto();
        int posCodE=cboEmpresaProyecto.getSelectedIndex();
        
        String codigoP, nombre, pais,  tipo, codE;
        String fechaInicio;
        int duracionMeses, año, mes, dia;
        float costo;
        
        codigoP = txtCodigoProyecto.getText();
        nombre = txtNombreProyecto.getText();
        pais = cboPaisProyecto.getSelectedItem().toString();
        fechaInicio = calendar.getDate().toString();
        tipo = cboTipoProyecto.getSelectedItem().toString();
        duracionMeses = Integer.parseInt(txtDuracionProyecto.getText());
        costo = Float.parseFloat(txtCostoProyecto.getText());
        codE = cboEmpresaProyecto.getItemAt(posCodE);
        
        objProyecto.setCodigo(codigoP);
        objProyecto.setNombre(nombre);
        objProyecto.setPais(pais);
        objProyecto.setFechaInicio(fechaInicio);
        objProyecto.setTipo(tipo);
        objProyecto.setDuracionMeses(duracionMeses);
        objProyecto.setCosto(costo);
        objProyecto.setCodEmpresa(codE);
        
        Lista_Proyectos.adicionar(objProyecto);
        
        txtCodigoProyecto.setText("");
        txtNombreProyecto.setText("");
        cboPaisProyecto.setSelectedIndex(0);
        cboTipoProyecto.setSelectedIndex(0);
        txtDuracionProyecto.setText("");
        txtCostoProyecto.setText("");
        cboEmpresaProyecto.setSelectedIndex(0);
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void cboEmpresaProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboEmpresaProyectoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboEmpresaProyectoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private com.toedter.calendar.JDateChooser calendar;
    private javax.swing.JComboBox<String> cboEmpresaProyecto;
    private javax.swing.JComboBox<String> cboPaisProyecto;
    private javax.swing.JComboBox<String> cboTipoProyecto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtCodigoProyecto;
    private javax.swing.JTextField txtCostoProyecto;
    private javax.swing.JTextField txtDuracionProyecto;
    private javax.swing.JTextField txtNombreProyecto;
    // End of variables declaration//GEN-END:variables
}
