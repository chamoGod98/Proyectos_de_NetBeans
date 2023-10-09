/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Cliente;

import Logica.Cliente;
import javax.swing.table.DefaultTableModel;
import Datos.*;
import TColas.TCola;
import TListas.*;

/**
 *
 * @author jefer
 */
public class FrmListadoClientes extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmListadoClientes
     */
    public FrmListadoClientes() {
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
        cboCola = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblA = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblB = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setClosable(true);

        jLabel1.setText("Seleccione la cola:");

        cboCola.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cola de clientes sin tarjeta", "Cola de clientes con tarjeta" }));

        tblA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblA);

        tblB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblB);

        jButton1.setText("Mostrar");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(cboCola, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(327, 327, 327)
                        .addComponent(jButton1)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cboCola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Cliente obj = new Cliente();
        
        DefaultTableModel modeloA = new DefaultTableModel();
        DefaultTableModel modeloB = new DefaultTableModel();
        
        modeloA.addColumn("Nombre");
        modeloA.addColumn("Edad");
        modeloA.addColumn("Sexo");
        
        modeloB.addColumn("Nombre");
        modeloB.addColumn("Tipo de tarjeta");
        modeloB.addColumn("N° entradas");
        modeloB.addColumn("Monto total");
        
        if (cboCola.getSelectedIndex()==0) {
            TCola colaST = ColaClientesST.consultar();
            TLista listaAtST = ListaClientesAtendidosST.consultar();
            
            Object datosA[] = new Object[3];
            
            for (int i = 0; i < colaST.Cantidad(); i++) {
                obj=(Cliente)colaST.Obtener(i);
                datosA[0]=obj.getNombre();
                datosA[1]=obj.getEdad();
                datosA[2]=obj.getSexo();
                modeloA.addRow(datosA);
            }
            tblA.setModel(modeloA);
            
            Object datosB[] = new Object[4];
            
            for (int i = 0; i < listaAtST.Cantidad(); i++) {
                obj=(Cliente)listaAtST.Obtener(i);
                datosB[0]=obj.getNombre();
                datosB[1]=obj.getTipoTarjeta();
                datosB[2]=obj.getNumEntradas();
                datosB[3]=obj.getTotalPagado();
                modeloB.addRow(datosB);
            }
            tblB.setModel(modeloB);
        } else {
            TCola colaST = ColaClientesCT.consultar();
            TLista listaAtST = ListaClientesAtendidosCT.consultar();
            
            Object datosA[] = new Object[3];
            
            for (int i = 0; i < colaST.Cantidad(); i++) {
                obj=(Cliente)colaST.Obtener(i);
                datosA[0]=obj.getNombre();
                datosA[1]=obj.getEdad();
                datosA[2]=obj.getSexo();
                modeloA.addRow(datosA);
            }
            tblA.setModel(modeloA);
            
            Object datosB[] = new Object[4];
            
            for (int i = 0; i < listaAtST.Cantidad(); i++) {
                obj=(Cliente)listaAtST.Obtener(i);
                datosB[0]=obj.getNombre();
                datosB[1]=obj.getTipoTarjeta();
                datosB[2]=obj.getNumEntradas();
                datosB[3]=obj.getTotalPagado();
                modeloB.addRow(datosB);
            }
            tblB.setModel(modeloB);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboCola;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblA;
    private javax.swing.JTable tblB;
    // End of variables declaration//GEN-END:variables
}
