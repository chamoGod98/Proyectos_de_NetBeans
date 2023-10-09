/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Cliente;

import Data.Departamento;
import Negocio.ArregloDeDepartamento;
import javax.swing.JOptionPane;

/**
 *
 * @author jefer
 */
public class FrmNvoDepartamento extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmNvoDepartamento
     */
    public FrmNvoDepartamento() {
        initComponents();
    }
    
    public void habilitarBtnRegistrar(){
        if (txtCodigo.getText().length()==4 && txtNumHab.getText().length()>=1 &&
                txtAncho.getText().length()>=2 && txtLargo.getText().length()>=2 &&
                lblArea.getText()!="???????" && txtPrecio.getText().length()>=4 &&
                txtNumPisos.getText().length()>=1) {
            btnRegistrar.setEnabled(true);
        } else {
            btnRegistrar.setEnabled(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPrecio = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        lblArea = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtNumHab = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtAncho = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtLargo = new javax.swing.JTextField();
        txtNumPisos = new javax.swing.JTextField();

        setClosable(true);
        setResizable(true);
        setTitle("Registrar un nuevo departamento");

        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPrecioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });

        jLabel9.setText("metros");

        lblArea.setText("???????");
        lblArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lblAreaKeyReleased(evt);
            }
        });

        jLabel3.setText("Número de habitaciones:");

        jLabel22.setText("Número de pisos:");

        txtNumHab.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNumHabKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumHabKeyTyped(evt);
            }
        });

        jLabel7.setText("Área:");

        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        jButton2.setText("...");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel10.setText("m2");

        jLabel4.setText("Ancho:");

        txtAncho.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAnchoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAnchoKeyTyped(evt);
            }
        });

        jLabel8.setText("metros");

        jLabel2.setText("Código:");

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoKeyTyped(evt);
            }
        });

        jLabel5.setText("Largo:");

        jLabel6.setText("Precio (S/).:");

        txtLargo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLargoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLargoKeyTyped(evt);
            }
        });

        txtNumPisos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNumPisosKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumPisosKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPrecio))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblArea)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtAncho, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel8))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel22)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtNumPisos, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtNumHab, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtLargo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(btnRegistrar)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtNumHab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAncho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel5)
                    .addComponent(txtLargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblArea)
                    .addComponent(jLabel10)
                    .addComponent(jButton2)
                    .addComponent(jLabel22)
                    .addComponent(txtNumPisos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(btnRegistrar)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        char c = evt.getKeyChar();

        if (((c < '0' | c > '9') && c != '.') | txtPrecio.getText().length() >= 8) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void txtNumHabKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumHabKeyTyped
        char c = evt.getKeyChar();

        if ((c < '0' | c > '9') | txtNumHab.getText().length() >= 2) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNumHabKeyTyped

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        Departamento obj = new Departamento();

        if (obj.getCodigo().equalsIgnoreCase(txtCodigo.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Este departamento ya se encuentra registrado");
        } else {
            obj.setCodigo(txtCodigo.getText());
            obj.setPrecio(Double.parseDouble(txtPrecio.getText()));
            obj.setNumHab(Integer.parseInt(txtNumHab.getText()));
            obj.setAncho(Double.parseDouble(txtAncho.getText()));
            obj.setLargo(Double.parseDouble(txtLargo.getText()));
            obj.setArea(lblArea.getText());
            obj.setNumPisos(Integer.parseInt(txtNumPisos.getText()));

            ArregloDeDepartamento.agregar(obj);

            txtCodigo.setText("");
            txtPrecio.setText("");
            txtNumHab.setText("");
            txtAncho.setText("");
            txtLargo.setText("");
            lblArea.setText("");
            txtNumPisos.setText("");

            JOptionPane.showMessageDialog(rootPane, "Departamento registrado con éxito");
        }

    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String area = String.valueOf(Double.parseDouble(txtLargo.getText()) * Double.parseDouble(txtAncho.getText())) + " m2";
        lblArea.setText(area);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped
        char c = evt.getKeyChar();

        if ((c < '0' | c > '9') | txtCodigo.getText().length() >= 4) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCodigoKeyTyped

    private void txtNumPisosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumPisosKeyTyped
        char c = evt.getKeyChar();

        if ((c < '0' | c > '9') | txtNumPisos.getText().length() >= 2) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNumPisosKeyTyped

    private void txtAnchoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnchoKeyTyped
        char c = evt.getKeyChar();

        if (((c < '0' | c > '9') && c != '.') | txtAncho.getText().length() >= 6) {
            evt.consume();
        }
    }//GEN-LAST:event_txtAnchoKeyTyped

    private void txtLargoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLargoKeyTyped
        char c = evt.getKeyChar();

        if (((c < '0' | c > '9') && c != '.') | txtLargo.getText().length() >= 6) {
            evt.consume();
        }
    }//GEN-LAST:event_txtLargoKeyTyped

    private void txtCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyReleased
        habilitarBtnRegistrar();
    }//GEN-LAST:event_txtCodigoKeyReleased

    private void txtNumHabKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumHabKeyReleased
        habilitarBtnRegistrar();
    }//GEN-LAST:event_txtNumHabKeyReleased

    private void txtAnchoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnchoKeyReleased
        habilitarBtnRegistrar();
    }//GEN-LAST:event_txtAnchoKeyReleased

    private void txtLargoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLargoKeyReleased
        habilitarBtnRegistrar();
    }//GEN-LAST:event_txtLargoKeyReleased

    private void lblAreaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblAreaKeyReleased
        habilitarBtnRegistrar();
    }//GEN-LAST:event_lblAreaKeyReleased

    private void txtNumPisosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumPisosKeyReleased
        habilitarBtnRegistrar();
    }//GEN-LAST:event_txtNumPisosKeyReleased

    private void txtPrecioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyReleased
        habilitarBtnRegistrar();
    }//GEN-LAST:event_txtPrecioKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblArea;
    private javax.swing.JTextField txtAncho;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtLargo;
    private javax.swing.JTextField txtNumHab;
    private javax.swing.JTextField txtNumPisos;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
