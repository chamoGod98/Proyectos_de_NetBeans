/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Cliente;

import Logica.Cliente;
import javax.swing.JOptionPane;

/**
 *
 * @author jefer
 */
public class FrmMontoRecaudado extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmMontoRecaudado
     */
    public FrmMontoRecaudado() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtGeneral = new javax.swing.JTextField();
        txtNi�o = new javax.swing.JTextField();
        txtAdultoMayor = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Montos recaudados por tipo de entrada");

        jLabel1.setText("General:");

        jLabel2.setText("Ni�o:");

        jLabel3.setText("Adulto mayor:");

        txtGeneral.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtGeneralKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtGeneralKeyTyped(evt);
            }
        });

        txtNi�o.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNi�oKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNi�oKeyTyped(evt);
            }
        });

        txtAdultoMayor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAdultoMayorKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAdultoMayorKeyTyped(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jButton1.setText("CONTABILIZAR");
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
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAdultoMayor))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                                    .addComponent(txtNi�o)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jButton1)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNi�o, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAdultoMayor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jButton1)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        double resultado[]= new double[3];
        resultado=Cliente.montoRecaudado();
        if (resultado[0]==0 && resultado[1]==0 && resultado[2]==0) {
            JOptionPane.showMessageDialog(rootPane, "No hay datos");
        } else {
            txtGeneral.setText(String.valueOf(resultado[0]));
            txtNi�o.setText(String.valueOf(resultado[1]));
            txtAdultoMayor.setText(String.valueOf(resultado[2]));
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtGeneralKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGeneralKeyPressed
        evt.consume();
    }//GEN-LAST:event_txtGeneralKeyPressed

    private void txtGeneralKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGeneralKeyTyped
        evt.consume();
    }//GEN-LAST:event_txtGeneralKeyTyped

    private void txtNi�oKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNi�oKeyPressed
        evt.consume();
    }//GEN-LAST:event_txtNi�oKeyPressed

    private void txtNi�oKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNi�oKeyTyped
        evt.consume();
    }//GEN-LAST:event_txtNi�oKeyTyped

    private void txtAdultoMayorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAdultoMayorKeyPressed
        evt.consume();
    }//GEN-LAST:event_txtAdultoMayorKeyPressed

    private void txtAdultoMayorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAdultoMayorKeyTyped
        evt.consume();
    }//GEN-LAST:event_txtAdultoMayorKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtAdultoMayor;
    private javax.swing.JTextField txtGeneral;
    private javax.swing.JTextField txtNi�o;
    // End of variables declaration//GEN-END:variables
}