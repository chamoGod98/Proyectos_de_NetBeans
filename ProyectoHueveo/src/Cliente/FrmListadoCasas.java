/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Cliente;

import Data.Casa;
import Negocio.ArregloDeCasa;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jefer
 */
public class FrmListadoCasas extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmListadoCasas
     */
    public FrmListadoCasas() {
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
        tblDatos = new javax.swing.JTable();
        jLabel23 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Lista de casas disponibles");

        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblDatos);

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setText("CASAS DISPONIBLES");

        jButton3.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jButton3.setText("Listar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton5.setText("Listar menor");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton6.setText("Listar mayor");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addGap(33, 33, 33)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jButton3)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("Código");
        modelo.addColumn("N° Hab.");
        modelo.addColumn("Ancho");
        modelo.addColumn("Largo");
        modelo.addColumn("Área");
        modelo.addColumn("Precio");
        modelo.addColumn("Jardín");
        
        Object datos[] = new Object[7];
        
        Vector <Object> lista = ArregloDeCasa.consultar();
        
        for (int i = 0; i < lista.size(); i++) {
            Casa obj = (Casa)lista.get(i);
            datos[0]=obj.getCodigo();
            datos[1]=obj.getNumHab();
            datos[2]=obj.getAncho();
            datos[3]=obj.getLargo();
            datos[4]=obj.getArea();
            datos[5]=obj.getPrecio();
            datos[6]=obj.getJardin();
            modelo.addRow(datos);
        }
        tblDatos.setModel(modelo);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("Código");
        modelo.addColumn("N° Hab.");
        modelo.addColumn("Ancho");
        modelo.addColumn("Largo");
        modelo.addColumn("Área");
        modelo.addColumn("Precio");
        modelo.addColumn("Jardín");
        
        Object datos[] = new Object[7];
        
        Vector <Object> lista = ArregloDeCasa.precioMenor();
        
        for (int i = 0; i < lista.size(); i++) {
            Casa obj = (Casa)lista.get(i);
            datos[0]=obj.getCodigo();
            datos[1]=obj.getNumHab();
            datos[2]=obj.getAncho();
            datos[3]=obj.getLargo();
            datos[4]=obj.getArea();
            datos[5]=obj.getPrecio();
            datos[6]=obj.getJardin();
            modelo.addRow(datos);
        }
        tblDatos.setModel(modelo);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("Código");
        modelo.addColumn("N° Hab.");
        modelo.addColumn("Ancho");
        modelo.addColumn("Largo");
        modelo.addColumn("Área");
        modelo.addColumn("Precio");
        modelo.addColumn("Jardín");
        
        Object datos[] = new Object[7];
        
        Vector <Object> lista = ArregloDeCasa.precioMayor();
        
        for (int i = 0; i < lista.size(); i++) {
            Casa obj = (Casa)lista.get(i);
            datos[0]=obj.getCodigo();
            datos[1]=obj.getNumHab();
            datos[2]=obj.getAncho();
            datos[3]=obj.getLargo();
            datos[4]=obj.getArea();
            datos[5]=obj.getPrecio();
            datos[6]=obj.getJardin();
            modelo.addRow(datos);
        }
        tblDatos.setModel(modelo);
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDatos;
    // End of variables declaration//GEN-END:variables
}
