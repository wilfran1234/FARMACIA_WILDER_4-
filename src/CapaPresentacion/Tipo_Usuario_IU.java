/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package CapaPresentacion;

import CapaDatos.Tipo_Usuario;
import CapaNegocio.Tipo_UsuarioBD;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author labor
 */
public class Tipo_Usuario_IU extends javax.swing.JInternalFrame {

    
    
    public Tipo_Usuario_IU() {
        initComponents();
        limpiar();
        reportar();
        
        
        
    }
        private void limpiar() {
        txtCodigo.setText("");
        txtNombre.setText("");
        txtNombre.requestFocus();
       
     }
    private void exito (String mensaje){
        JOptionPane.showConfirmDialog(this, mensaje, "Mensaje",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE);
    }
     
    private void error (String mensaje){
        JOptionPane.showConfirmDialog(this, mensaje, "Error",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
    }
     
       private void advertencia (String mensaje){
        JOptionPane.showConfirmDialog(this, mensaje, "Abvertencia",JOptionPane.DEFAULT_OPTION,JOptionPane.WARNING_MESSAGE);
    }
     
     public void  reportar (){
      
         try {
             
             setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR)); 
             DefaultTableModel tabla_temporal;
             Tipo_UsuarioBD oTipo_UsuarioBD = new Tipo_UsuarioBD();
             tabla_temporal = oTipo_UsuarioBD.reportarTipoUsuarios();
             tabla_reporte_Tipo_Usuario.setModel(tabla_temporal);
             
             int cantidad = tabla_temporal.getRowCount();
             txtCantidad.setText("" + cantidad);
             setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
             
            
         } catch (Exception e) {
             
             e.printStackTrace();
         }
          } 
       
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_reporte_Tipo_Usuario = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnRegistrar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("TIPO DE USUARIO");

        jPanel2.setBackground(new java.awt.Color(255, 204, 51));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CODIGO:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NOMBRE:");

        txtCodigo.setEnabled(false);

        txtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreFocusLost(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreKeyPressed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CANTIDAD:");

        txtCantidad.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNombre))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(85, 85, 85))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        tabla_reporte_Tipo_Usuario.setBackground(new java.awt.Color(102, 102, 102));
        tabla_reporte_Tipo_Usuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        tabla_reporte_Tipo_Usuario.setForeground(new java.awt.Color(255, 255, 255));
        tabla_reporte_Tipo_Usuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabla_reporte_Tipo_Usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabla_reporte_Tipo_UsuarioMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_reporte_Tipo_Usuario);

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        btnRegistrar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_IU/formulario-de-consentimiento-del-donante.png"))); // NOI18N
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegistrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_IU/noticias-falsas.png"))); // NOI18N
        btnModificar.setText("MODIFICAR");
        btnModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnModificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        BtnEliminar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BtnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_IU/cero-desperdicio.png"))); // NOI18N
        BtnEliminar.setText("ELIMINAR");
        BtnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_IU/limpieza-de-datos (1).png"))); // NOI18N
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLimpiar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnLimpiar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnCerrar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_IU/cancelacion.png"))); // NOI18N
        btnCerrar.setText("CERRAR");
        btnCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCerrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRegistrar)
                .addGap(18, 18, 18)
                .addComponent(btnModificar)
                .addGap(18, 18, 18)
                .addComponent(BtnEliminar)
                .addGap(18, 18, 18)
                .addComponent(btnLimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCerrar)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnEliminar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        if (txtNombre.getText().length()>0) {
            if (txtCodigo.getText().length()==0) {
                //PASOS PARA CREAR UN OBJETO DE TIPO USUARIO
                Tipo_Usuario oTipoUsuario = new Tipo_Usuario();
                //PASOS PARA CREAR UN OBJETO DE TIPO USUARIO
                Tipo_UsuarioBD oTipo_UsuarioBD = new Tipo_UsuarioBD();

                oTipoUsuario.setTuNombre(txtNombre.getText().trim().toUpperCase());
                boolean respuesta =oTipo_UsuarioBD.registrarTipoUsuario(oTipoUsuario);
                
                if (respuesta) {
                    exito("SE REGISTRO CORRECTAMENTE");
                    reportar();
                    limpiar();
                    
                } else {
                    
                    error("TIENES PROBLEMAS AL REGISTRAR");
                }
            } else {
                 error("NO PUEDES REGISTRAR PORQUE A EXISTE");
            }

        } else {
            error("INGRESA EL NOMBRE");
            txtNombre.requestFocus();
        }

    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

          if (txtCodigo.getText().length()>0) {
            if (txtNombre.getText().length()>0) {
                //PASOS PARA CREAR UN OBJETO DE TIPO USUARIO
                Tipo_Usuario oTipoUsuario = new Tipo_Usuario();
                //PASOS PARA CREAR UN OBJETO DE TIPO USUARIO
                Tipo_UsuarioBD oTipo_UsuarioBD = new Tipo_UsuarioBD();

                oTipoUsuario.setIdtipousuario(Integer.parseInt(txtCodigo.getText().trim()));
                oTipoUsuario.setTuNombre(txtNombre.getText().trim().toUpperCase());
                
                
                boolean respuesta =oTipo_UsuarioBD.modificarTipoUsuario(oTipoUsuario);
                
                if (respuesta) {
                    exito("SE MODIFICO CORRECTAMENTE");
                    reportar();
                    limpiar();
                    
                } else {
                    error("TIENES PROBLEMAS AL MODIFICAR");
                }
            } else {
                 error("INGRESA EL NOMBRE");
                 txtNombre.requestFocus();    
            }

        } else {
            error("INO EXISTE EL CODIGO MODIFICADO");
        }
        
        
    }//GEN-LAST:event_btnModificarActionPerformed

    private void tabla_reporte_Tipo_UsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_reporte_Tipo_UsuarioMousePressed
        
        if (evt.getClickCount()==2) {
            
            int fila_seleccionada = tabla_reporte_Tipo_Usuario.getSelectedRow();
            txtCodigo.setText(tabla_reporte_Tipo_Usuario.getValueAt(fila_seleccionada, 0).toString());
             txtNombre.setText(tabla_reporte_Tipo_Usuario.getValueAt(fila_seleccionada, 1).toString());
        }
        
    }//GEN-LAST:event_tabla_reporte_Tipo_UsuarioMousePressed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
       
        if (txtCodigo.getText().length()>0) {
            int aviso = JOptionPane.showConfirmDialog(rootPane, "ESTAS SEGURO DE ELIMINAR");
            if (aviso == 0) {
                int codigo =Integer.parseInt(txtCodigo.getText().trim());
                Tipo_UsuarioBD oTipo_UsuarioBD= new Tipo_UsuarioBD();
                Tipo_Usuario oTipo_Usuario = new Tipo_Usuario();
                
                oTipo_Usuario.setIdtipousuario(codigo);
                boolean respuesta= oTipo_UsuarioBD.eliminarTipoUsuario(oTipo_Usuario);
                
                if (respuesta) {
                    exito("SE ELIMINO CORRECTAMENTE");
                    reportar();
                    limpiar();
                    
                } else {
                    error("HAY PROBLEMAS..");
                }
            }
        } else {
            error("FALTA CODIGO");
        }
        
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        
        dispose();
        
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void txtNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusGained
       
        txtNombre.setBackground(Color.yellow);
        
    }//GEN-LAST:event_txtNombreFocusGained

    private void txtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusLost
      
        txtNombre.setBackground(Color.white);
    }//GEN-LAST:event_txtNombreFocusLost

    private void txtNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyPressed
       
        
        
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnRegistrar.requestFocus();
            btnRegistrar.doClick();
        }
        
        
    }//GEN-LAST:event_txtNombreKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_reporte_Tipo_Usuario;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
