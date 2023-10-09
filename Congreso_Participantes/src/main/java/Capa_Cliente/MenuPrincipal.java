/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Cliente;

import javax.swing.JFrame;

/**
 *
 * @author jefer
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        setTitle("Menú principal");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuRegistrarParticipante = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        mnuConsultarParticipantesInscritos = new javax.swing.JMenuItem();
        mnuConsultarPorSexo = new javax.swing.JMenuItem();
        mnuConsultarCostoAlumnosUSAT = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        jMenu1.setText("Registrar");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        mnuRegistrarParticipante.setText("Registrar Participante");
        mnuRegistrarParticipante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuRegistrarParticipanteActionPerformed(evt);
            }
        });
        jMenu1.add(mnuRegistrarParticipante);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Reportes");

        jMenuItem1.setText("Lista de participantes inscritos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        mnuConsultarParticipantesInscritos.setText("Lista de alumnos por universidad de procedencia y tipo de participante");
        mnuConsultarParticipantesInscritos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuConsultarParticipantesInscritosActionPerformed(evt);
            }
        });
        jMenu2.add(mnuConsultarParticipantesInscritos);

        mnuConsultarPorSexo.setText("Consultar número de participantes de pregrado y posgrado por sexo");
        mnuConsultarPorSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuConsultarPorSexoActionPerformed(evt);
            }
        });
        jMenu2.add(mnuConsultarPorSexo);

        mnuConsultarCostoAlumnosUSAT.setText("Consultar costos de alumnos USAT");
        mnuConsultarCostoAlumnosUSAT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuConsultarCostoAlumnosUSATActionPerformed(evt);
            }
        });
        jMenu2.add(mnuConsultarCostoAlumnosUSAT);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuConsultarParticipantesInscritosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuConsultarParticipantesInscritosActionPerformed
        FrmListaPorUniversidadYTipoDeAlumno objFrm = new FrmListaPorUniversidadYTipoDeAlumno();
        panel.add(objFrm);
        objFrm.setVisible(true);
    }//GEN-LAST:event_mnuConsultarParticipantesInscritosActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void mnuRegistrarParticipanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuRegistrarParticipanteActionPerformed
        FrmAñadirParticipante objFrm = new FrmAñadirParticipante();
        panel.add(objFrm);
        objFrm.setVisible(true);
    }//GEN-LAST:event_mnuRegistrarParticipanteActionPerformed

    private void mnuConsultarPorSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuConsultarPorSexoActionPerformed
        // TODO add your handling code here:
        FrmNumeroParticipantesPregradoyPosgrado objFrm = new FrmNumeroParticipantesPregradoyPosgrado();
        panel.add(objFrm);
        objFrm.setVisible(true);
    }//GEN-LAST:event_mnuConsultarPorSexoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        FrmListadoGeneral objFrm = new FrmListadoGeneral();
        panel.add(objFrm);
        objFrm.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void mnuConsultarCostoAlumnosUSATActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuConsultarCostoAlumnosUSATActionPerformed
        FrmCostoAlumnosUSAT objFrm = new FrmCostoAlumnosUSAT();
        panel.add(objFrm);
        objFrm.setVisible(true);
    }//GEN-LAST:event_mnuConsultarCostoAlumnosUSATActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem mnuConsultarCostoAlumnosUSAT;
    private javax.swing.JMenuItem mnuConsultarParticipantesInscritos;
    private javax.swing.JMenuItem mnuConsultarPorSexo;
    private javax.swing.JMenuItem mnuRegistrarParticipante;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
