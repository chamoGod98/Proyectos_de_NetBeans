/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Cliente;

import Capa_Datos.PilaCiudad;
import Capa_Logica.Ciudad;

/**
 *
 * @author Franko
 */
public class FrmApilarCiudades extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmRegistrarCiudades
     */
    public FrmApilarCiudades() {
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

        txtTiempo = new javax.swing.JTextField();
        cmdCerrar = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        cmdRegistrar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        lblTiempo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Registrar Ciudades");
        setToolTipText("");

        cmdCerrar.setText("Cerrar");
        cmdCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCerrarActionPerformed(evt);
            }
        });

        lblNombre.setText("Nombre de la Ciudad: ");

        cmdRegistrar.setText("Registrar");
        cmdRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdRegistrarActionPerformed(evt);
            }
        });

        lblTiempo.setText("Tiempo de permanencia: ");

        jLabel1.setText("Minutos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(cmdRegistrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmdCerrar)
                .addGap(143, 143, 143))
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTiempo)
                    .addComponent(lblNombre))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTiempo)
                    .addComponent(txtTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdRegistrar)
                    .addComponent(cmdCerrar))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void registrar() {
        String nombre = txtNombre.getText();
        int tiempo = Integer.parseInt(txtTiempo.getText());

        Ciudad objProceso = new Ciudad();

        objProceso.setNombre(nombre);
        objProceso.setTiempoPermanencia(tiempo);

        PilaCiudad.Adicionar(objProceso);

        txtNombre.setText("");
        txtTiempo.setText("");

    }

    private void cmdCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCerrarActionPerformed
        dispose();
    }//GEN-LAST:event_cmdCerrarActionPerformed

    private void cmdRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdRegistrarActionPerformed
        registrar();
    }//GEN-LAST:event_cmdRegistrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdCerrar;
    private javax.swing.JButton cmdRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTiempo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTiempo;
    // End of variables declaration//GEN-END:variables
}
