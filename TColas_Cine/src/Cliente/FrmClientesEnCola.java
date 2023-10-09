/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Cliente;

import Datos.*;
import Lógica.Cliente;
import javax.swing.table.DefaultTableModel;
import TColas.*;
import TListas.*;
import javax.swing.JOptionPane;

/**
 *
 * @author jefer
 */
public class FrmClientesEnCola extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmClientesEnCola
     */
    public FrmClientesEnCola() {
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
        CboTipoCola = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPorAtender = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAtendidos = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        btnMostrar = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 0, 0));
        setClosable(true);
        setForeground(new java.awt.Color(255, 255, 255));
        setTitle("Clientes en cola");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Elegir cola:");

        CboTipoCola.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cola de clientes (normal)", "Cola de clientes con tarjeta" }));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Por atender");

        tblPorAtender.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblPorAtender);

        tblAtendidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblAtendidos);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Atendidos");

        btnMostrar.setBackground(new java.awt.Color(0, 0, 0));
        btnMostrar.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnMostrar.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrar.setText("MOSTRAR");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jLabel1)
                        .addGap(46, 46, 46)
                        .addComponent(CboTipoCola, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addComponent(jLabel2)
                                .addGap(243, 243, 243)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(249, 249, 249)
                                .addComponent(btnMostrar)))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(CboTipoCola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnMostrar)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        DefaultTableModel modeloA = new DefaultTableModel();
        DefaultTableModel modeloB = new DefaultTableModel();

        modeloA.addColumn("Nombre");
        modeloA.addColumn("Edad");
        modeloA.addColumn("Tipo de tarjeta");

        modeloB.addColumn("Nombre");
        modeloB.addColumn("N° entradas");
        modeloB.addColumn("Tipo de tarjeta");
        modeloB.addColumn("Total pagado");

        Cliente obj;

        String cola = CboTipoCola.getSelectedItem().toString();

        if (cola.equalsIgnoreCase("Cola de clientes (normal)")) {
            TCola CCST = ColaClientesST.consultar();
            TLista LCSTA = ListaClientesST_Atendidos.consultar();

            Object datosA[] = new Object[3];
            for (int i = 0; i < CCST.Cantidad(); i++) {
                obj = (Cliente) CCST.Obtener(i);
                datosA[0] = obj.getNombre();
                datosA[1] = obj.getEdad();
                datosA[2] = obj.getTipoTarjeta();
                modeloA.addRow(datosA);
            }
            tblPorAtender.setModel(modeloA);

            Object datosB[] = new Object[4];
            for (int i = 0; i < LCSTA.Cantidad(); i++) {
                obj = (Cliente) LCSTA.Obtener(i);
                datosB[0] = obj.getNombre();
                datosB[1] = obj.getNumeroEntradas();
                datosB[2] = obj.getTipoTarjeta();
                datosB[3] = obj.getTotalPagado();
                modeloB.addRow(datosB);
            }
            tblAtendidos.setModel(modeloB);
            if (CCST.Vacia()) {
                JOptionPane.showMessageDialog(rootPane, "No hay clientes por atender");
            } else if (LCSTA.Vacia()) {
                JOptionPane.showMessageDialog(rootPane, "Aún no se ha atendido a ningún cliente");
            }
        } else {
            TCola CCCT = ColaClientesCT.consultar();
            TLista LCCTA = ListaClientesCT_Atendidos.consultar();

            Object datosA[] = new Object[3];
            for (int i = 0; i < CCCT.Cantidad(); i++) {
                obj = (Cliente) CCCT.Obtener(i);
                datosA[0] = obj.getNombre();
                datosA[1] = obj.getEdad();
                datosA[2] = obj.getTipoTarjeta();
                modeloA.addRow(datosA);
            }
            tblPorAtender.setModel(modeloA);

            Object datosB[] = new Object[3];
            for (int i = 0; i < LCCTA.Cantidad(); i++) {
                obj = (Cliente) LCCTA.Obtener(i);
                datosB[0] = obj.getNombre();
                datosB[1] = obj.getNumeroEntradas();
                datosB[2] = obj.getTotalPagado();
                modeloB.addRow(datosB);
            }
            tblAtendidos.setModel(modeloB);
            if (CCCT.Vacia()) {
                JOptionPane.showMessageDialog(rootPane, "No hay clientes por atender");
            } else if (LCCTA.Vacia()) {
                JOptionPane.showMessageDialog(rootPane, "Aún no se ha atendido a ningún cliente");
            }
        }

    }//GEN-LAST:event_btnMostrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CboTipoCola;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblAtendidos;
    private javax.swing.JTable tblPorAtender;
    // End of variables declaration//GEN-END:variables
}
