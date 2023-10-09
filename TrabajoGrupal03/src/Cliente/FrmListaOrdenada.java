/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Cliente;

import Logica.Auto;
import TDAColas.Cola;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jefer
 */
public class FrmListaOrdenada extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmListaOrdenada
     */
    public FrmListaOrdenada() {
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
        tbl = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Lista de salida de autos");

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbl);

        jButton1.setText("LISTAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(312, 312, 312))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("N° de placa");
        modelo.addColumn("Propietario");
        modelo.addColumn("Marca");
        modelo.addColumn("Modelo");
        modelo.addColumn("Hora de salida (horas)");
        modelo.addColumn("Hora de salida (minutos)");
        
        Auto obj;
        
        Cola colaOrdenada = Auto.ListaAutosOrdenados();
        if (!colaOrdenada.esVacia()) {
            Object datos[] = new Object[6];
            for (int i = 0; i < colaOrdenada.tamanio(); i++) {
                obj = (Auto)colaOrdenada.recuperar(i);
                datos[0]=obj.getNumPlaca();
                datos[1]=obj.getPropietario();
                datos[2]=obj.getMarca();
                datos[3]=obj.getModelo();
                datos[4]=obj.getHoraSalida();
                datos[5]=obj.getMinutosSalida();
                modelo.addRow(datos);
            }
            tbl.setModel(modelo);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Error. Lista vacía");
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl;
    // End of variables declaration//GEN-END:variables
}