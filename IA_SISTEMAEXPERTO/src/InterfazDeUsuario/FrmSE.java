
package InterfazDeUsuario;

import BaseDeConocimientos.ArrayList_DiscoDuro;
import BaseDeConocimientos.ArrayList_SistemaOperativo;
import BaseDeConocimientos.ArrayList_Ventilador;
import BaseDeHechos.Hechos;
import MotorDeInferencia.Deductivo;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author GRUPO_06_IA_B
 */

public class FrmSE extends javax.swing.JFrame {

    public FrmSE() {
        initComponents();
        setTitle("Sistema Experto de Fallas en Computadora");
        setResizable(false);
        this.setLocationRelativeTo(null);
        texto.setEditable(false);
    }

    ArrayList respuestas = Hechos.consultarsignosDD();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        texto = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        s3 = new javax.swing.JCheckBox();
        s15 = new javax.swing.JCheckBox();
        s4 = new javax.swing.JCheckBox();
        s11 = new javax.swing.JCheckBox();
        s5 = new javax.swing.JCheckBox();
        s12 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        s9 = new javax.swing.JCheckBox();
        s10 = new javax.swing.JCheckBox();
        s1 = new javax.swing.JCheckBox();
        s6 = new javax.swing.JCheckBox();
        s2 = new javax.swing.JCheckBox();
        s7 = new javax.swing.JCheckBox();
        s13 = new javax.swing.JCheckBox();
        btn = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfazDeUsuario/img/soporte-tecnico (1).png"))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel14.setText("Sistema Experto");

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel15.setText("Diagnostico de Fallas");

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel16.setText("Ventilador - Disco Duro - SO");

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel21.setText("en Computadora");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16))
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        texto.setColumns(20);
        texto.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        texto.setRows(5);
        texto.setText("\nPara comenzar el examen diagnóstico seleccione las fallas que presenta su\ncomputadora, haga click en \"Obtener diagnóstico\" y el resultado se\nmostrará inmediatamente.");
        jScrollPane1.setViewportView(texto);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        s3.setText("Mi equipo presenta lentitud para escribir, leer y guardar archivos");

        s15.setText("Mi equipo se muestra con el sistema bloqueado");

        s4.setText("Mi equipo tiene dificultad para acceder a las unidades C, D u otras creadas");

        s11.setText("La pantalla es de color azul");

        s5.setText("Mi equipo presenta sonidos extraños como pitidos");

        s12.setText("Mi equipo tiene dificultad para habilitar el audio o la cámara");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("           SELECCIONE LAS FALLAS QUE PRESENTA SU COMPUTADORA");

        s9.setText("Mi equipo no enciende");

        s10.setText("Mi equipo se reinicia inesperadamente");

        s1.setText("Mi equipo presenta sobrecalentamiento");

        s6.setText("Mi equipo se apaga inesperadamente");
        s6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s6ActionPerformed(evt);
            }
        });

        s2.setText("Al abrir archivos en mi equipo, aparecen dañados");

        s7.setText("Mi equipo emite un ruido fuerte al encender y ese sonido se mantiene");

        s13.setText("Mis aplicaciones recién intaladas o actualizadas se cierran inesperadamente");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(s3)
                    .addComponent(s11)
                    .addComponent(s12)
                    .addComponent(s13)
                    .addComponent(s15)
                    .addComponent(s1)
                    .addComponent(s2)
                    .addComponent(s4)
                    .addComponent(s5)
                    .addComponent(s6)
                    .addComponent(s7)
                    .addComponent(s10)
                    .addComponent(s9))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(21, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(s1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(s2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(s4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(s5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(s6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(s7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(s9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(s10)
                .addGap(3, 3, 3)
                .addComponent(s3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(s11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(s12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(s13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(s15)
                .addGap(25, 25, 25))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(48, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(406, 406, 406)))
        );

        btn.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btn.setText("OBTENER DIAGNÓSTICO");
        btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(contenedorLayout.createSequentialGroup()
                .addGap(275, 275, 275)
                .addComponent(btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLimpiar)
                .addGap(25, 25, 25))
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn)
                    .addComponent(btnLimpiar))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionPerformed
        diagnostico();
    }//GEN-LAST:event_btnActionPerformed

    private void s6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s6ActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        respuestas.clear();
        texto.setText("Para comenzar el examen diagnóstico seleccione las fallas que presenta su\n"
                + "computadora, haga click en \"Obtener diagnóstico\" y el resultado se\n"
                + "mostrará inmediatamente.");
        s1.setSelected(false);
        s2.setSelected(false);
        s3.setSelected(false);
        s4.setSelected(false);
        s5.setSelected(false);
        s6.setSelected(false);
        s7.setSelected(false);
        s9.setSelected(false);
        s10.setSelected(false);
        s11.setSelected(false);
        s12.setSelected(false);
        s13.setSelected(false);
        s15.setSelected(false);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void diagnostico() {

        if (s1.isSelected() == true) {
            respuestas.add("Sobrecalentamiento general");
        }

        if (s2.isSelected() == true) {
            respuestas.add("Al abrir archivos o carpetas muestra mensaje que está dañado");
        }

        if (s3.isSelected() == true) {
            respuestas.add("Lentitud para abrir,leer,escribir y guardar archivos");
        }
        if (s4.isSelected() == true) {
            respuestas.add("Dificultad para acceder a las unidades(C,D, u otra creada)");
        }

        if (s5.isSelected() == true) {
            respuestas.add("Sonidos extraños como pítidos");
        }

        if (s6.isSelected() == true) {
            respuestas.add("Se apaga inesperadamente");
        }
        if (s7.isSelected() == true) {
            respuestas.add("Ruido fuerte al encender y se mantiene");
        }

        if (s9.isSelected() == true) {
            respuestas.add("No enciende");
        }

        if (s10.isSelected() == true) {
            respuestas.add("Se reinicia inesperadamente");
        }

        if (s11.isSelected() == true) {
            respuestas.add("Pantalla Azul");
        }

        if (s12.isSelected() == true) {
            respuestas.add("Dificultad para habilitar audio y cámara");
        }

        if (s13.isSelected() == true) {
            respuestas.add("Cierre inesperado de aplicaciones recién instaladas o actualizadas");
        }

        if (s15.isSelected() == true) {
            respuestas.add("Sistema bloqueado");
        }

        Deductivo.verificar(respuestas);

        JOptionPane.showMessageDialog(rootPane, "A continuación verá su resultado");
        texto.setText("");
        String rpta = (String) respuestas.get(respuestas.size() - 1);

        String dg = "                           DIAGNÓSTICO                               \n"
                + "----------------------------------------------------------------------- \n"
                + "   Lo que presenta su computadora es FALLA DE " + rpta.toUpperCase() + "\n"
                + "--------------------------------------------------------------------------";

        texto.append(dg + "\n");
        for (Object secuencia : respuestas) {
            String d1 = ArrayList_DiscoDuro.obtenerDescripcionConsultarnombre(secuencia.toString());
            String d2 = ArrayList_Ventilador.obtenerDescripcionConsultarnombre(secuencia.toString());
            String d3 = ArrayList_SistemaOperativo.obtenerDescripcionConsultarnombre(secuencia.toString());

            if (d1 == null) {
                d1 = "";
            }
            if (d2 == null) {
                d2 = "";
            }
            if (d3 == null) {
                d3 = "";
            }
            texto.append("P" + (respuestas.indexOf(secuencia) + 1) + " -" + secuencia + " - " + d1 + " " + d2 + " " + d3 + "\n");
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JPanel contenedor;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox s1;
    private javax.swing.JCheckBox s10;
    private javax.swing.JCheckBox s11;
    private javax.swing.JCheckBox s12;
    private javax.swing.JCheckBox s13;
    private javax.swing.JCheckBox s15;
    private javax.swing.JCheckBox s2;
    private javax.swing.JCheckBox s3;
    private javax.swing.JCheckBox s4;
    private javax.swing.JCheckBox s5;
    private javax.swing.JCheckBox s6;
    private javax.swing.JCheckBox s7;
    private javax.swing.JCheckBox s9;
    private javax.swing.JTextArea texto;
    // End of variables declaration//GEN-END:variables
}
