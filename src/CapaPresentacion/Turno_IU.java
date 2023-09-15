/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package CapaPresentacion;

import CapaDatos.Turno;
import CapaDatos.Usuario;
import CapaNegocio.TurnoBD;
import CapaNegocio.UsuarioBD;
import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.xml.bind.annotation.XmlElement;
import jdk.nashorn.internal.ir.CatchNode;

/**
 *
 * @author labor
 */
public class Turno_IU extends javax.swing.JInternalFrame {

    int fila_seleccionada = -1;

    public Turno_IU() {
        initComponents();
        reporteTurno();

    }

    private void limpiar() {

        txtDni.setText("");
        txtUsuario.setText("");
        txtHoraInicio.setText("");
        txtHoraFinal.setText("");
        cmbTurno.setSelectedIndex(0);
        fila_seleccionada = -1;

    }

    private void exito(String mensaje) {
        JOptionPane.showConfirmDialog(this, mensaje, "Mensaje", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
    }

    private void error(String mensaje) {
        JOptionPane.showConfirmDialog(this, mensaje, "Error", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
    }

    private void advertencia(String mensaje) {
        JOptionPane.showConfirmDialog(this, mensaje, "Abvertencia", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE);
    }

    private void limpiar_tabla_formulario() {

        DefaultTableModel tabla_temporal_turno = (DefaultTableModel) tabla_reporte_Turno.getModel();
        tabla_temporal_turno.setRowCount(0);
    }

    private void reporteTurno() {

        try {
            setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));

            limpiar_tabla_formulario();
            DefaultTableModel tabla_temporal_turno = (DefaultTableModel) tabla_reporte_Turno.getModel();

            DefaultTableModel tabla_temporal;
            TurnoBD oTurnoBD = new TurnoBD();
            tabla_temporal = oTurnoBD.reportarTurno();

            int cantidad = tabla_temporal.getRowCount();

            for (int i = 0; i < cantidad; i++) {
                int idturno = Integer.parseInt(tabla_temporal.getValueAt(i, 0).toString());
                String descripcion = tabla_temporal.getValueAt(i, 1).toString();
                String inicio = tabla_temporal.getValueAt(i, 2).toString();
                String fin = tabla_temporal.getValueAt(i, 3).toString();
                String uDni = tabla_temporal.getValueAt(i, 4).toString();

                Object[] data = {idturno, descripcion, inicio, fin, uDni};
                tabla_temporal_turno.addRow(data);

            }
            tabla_reporte_Turno.setModel(tabla_temporal);
            setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        } catch (Exception e) {

            setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtHoraInicio = new javax.swing.JTextField();
        txtHoraFinal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cmbTurno = new javax.swing.JComboBox<>();
        btnRegistrar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_reporte_Turno = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("TURNO");

        jPanel1.setBackground(new java.awt.Color(255, 204, 0));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS DEL USUARIO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DNI:");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("USUARIO:");

        txtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusGained(evt);
            }
        });
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyTyped(evt);
            }
        });

        txtDni.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDniFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDniFocusLost(evt);
            }
        });
        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDniKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniKeyTyped(evt);
            }
        });

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_IU/informacion.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        btnBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnBuscarKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtUsuario))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBuscar)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS DEL TURNO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("TURNO");

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("HORA DE INICIO");

        txtHoraInicio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtHoraInicioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtHoraInicioFocusLost(evt);
            }
        });
        txtHoraInicio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtHoraInicioKeyPressed(evt);
            }
        });

        txtHoraFinal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtHoraFinalFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtHoraFinalFocusLost(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("HORA FINAL:");

        cmbTurno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR TURNO", "TURNO 1", "TURNO 2", "TURNO 3", "TURNO 4" }));

        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_IU/formulario-de-consentimiento-del-donante.png"))); // NOI18N
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_IU/cero-desperdicio.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtHoraFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnRegistrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(btnEliminar)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtHoraFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cmbTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnEliminar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabla_reporte_Turno.setBackground(new java.awt.Color(102, 102, 102));
        tabla_reporte_Turno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        tabla_reporte_Turno.setForeground(new java.awt.Color(255, 255, 255));
        tabla_reporte_Turno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "DESCRIPCION", "HORA INICIO", "HORA FINAL", "USUARIO"
            }
        ));
        tabla_reporte_Turno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabla_reporte_TurnoMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_reporte_Turno);

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));

        btnCerrar.setBackground(new java.awt.Color(204, 204, 204));
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_IU/cancelacion.png"))); // NOI18N
        btnCerrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("*El formato de la hora serian: 10:00:00");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel6)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 9, Short.MAX_VALUE)
                .addComponent(jLabel6))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabla_reporte_TurnoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_reporte_TurnoMousePressed

        fila_seleccionada = tabla_reporte_Turno.getSelectedRow();


    }//GEN-LAST:event_tabla_reporte_TurnoMousePressed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        if (txtDni.getText().length() > 0) {

            DefaultTableModel tabla_temporal;
            UsuarioBD oUsuarioBD = new UsuarioBD();
            tabla_temporal = oUsuarioBD.buscarUsuarioXdni(txtDni.getText());
            int cant = tabla_temporal.getRowCount();

            if (cant > 0) {
                String nombre = tabla_temporal.getValueAt(0, 1).toString();
                String apellidos = tabla_temporal.getValueAt(0, 2).toString();
                txtUsuario.setText(apellidos + " " + nombre);

            } else {
                error("NO EXISTE ESTE USUARIO");
            }
        } else {
            advertencia("TIENE QUE INGRESAR UN DNI");
            txtDni.requestFocus();
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        try {
            if (txtDni.getText().length() > 0) {
                if (txtHoraInicio.getText().length() > 0) {
                    if (txtHoraFinal.getText().length() > 0) {
                        if (!cmbTurno.getSelectedItem().equals("SELECCIONAR TURNO")) {

                            Turno oTurno = new Turno();
                            TurnoBD oTurnoBD = new TurnoBD();

                            oTurno.setDescripcion(txtDni.getText().toUpperCase());
                            oTurno.setInicio(txtHoraInicio.getText().toUpperCase());
                            oTurno.setFin(txtHoraFinal.getText().toUpperCase());
                            oTurno.setuDni(txtDni.getText().toUpperCase());

                            boolean respuesta = oTurnoBD.registrarTurno(oTurno);
                            if (respuesta) {
                                exito("SE REGISTRO CON EXITO");
                                reporteTurno();
                                limpiar();

                            } else {
                                error("TIENES PROBLEMS AL REGISTRAR");
                            }

                        } else {
                            advertencia("INGRESA TU TURNO");
                            cmbTurno.requestFocus();
                        }

                    } else {
                        advertencia("INGRESA LA HORA FINAL");
                        txtHoraFinal.requestFocus();
                    }

                } else {
                    advertencia("INGRESA LA HORA INICIO");
                    txtHoraInicio.requestFocus();
                }

            } else {
                advertencia("INGRESA EL DNI");
                txtDni.requestFocus();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR");

        }


    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:

        if (fila_seleccionada > 0) {
            int aviso = JOptionPane.showConfirmDialog(rootPane, "ESTAS SEGURO DE ELIMINAR A LA FILA" + fila_seleccionada);
            if (aviso == 0) {
                TurnoBD oTurnoBD = new TurnoBD();
                int idturno = Integer.parseInt(tabla_reporte_Turno.getValueAt(fila_seleccionada, 0).toString());
                boolean rpta = oTurnoBD.eliminarTurno(idturno);

                if (rpta) {
                    exito("SE ELIMINO CORRECTAMENTE");
                    reporteTurno();
                    limpiar();
                } else {
                    error("TIENES PROBLEMAS AL ELIMINAR");
                }
            } else {
                advertencia("TIENE QUE SELECCIONAR UNA FILA");
            }

        }


    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtDniFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDniFocusGained
        
         txtDni.setBackground(Color.yellow);
        
        
    }//GEN-LAST:event_txtDniFocusGained

    private void txtDniFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDniFocusLost
        
         txtDni.setBackground(Color.white);
        
    }//GEN-LAST:event_txtDniFocusLost

    private void txtUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusGained
        
       
        
    }//GEN-LAST:event_txtUsuarioFocusGained

    private void txtHoraInicioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHoraInicioFocusGained
        
         txtHoraInicio.setBackground(Color.yellow);
        
    }//GEN-LAST:event_txtHoraInicioFocusGained

    private void txtHoraInicioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHoraInicioFocusLost
        
         txtHoraInicio.setBackground(Color.white);
        
    }//GEN-LAST:event_txtHoraInicioFocusLost

    private void txtHoraFinalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHoraFinalFocusGained
       
         txtHoraFinal.setBackground(Color.yellow);
        
    }//GEN-LAST:event_txtHoraFinalFocusGained

    private void txtHoraFinalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHoraFinalFocusLost
       
         txtHoraFinal.setBackground(Color.white);
        
    }//GEN-LAST:event_txtHoraFinalFocusLost

    private void txtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyTyped
        
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) || txtDni.getText().length() >= 8) {
            evt.consume();
        }
        
        
    }//GEN-LAST:event_txtDniKeyTyped

    private void txtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyTyped
       
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtUsuarioKeyTyped

    private void txtDniKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyPressed
        
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnBuscar.requestFocus();
            btnBuscar.doClick();
        }
    }//GEN-LAST:event_txtDniKeyPressed

    private void btnBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnBuscarKeyPressed
        
       if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtHoraInicio.requestFocus();
        } 
        
        
    }//GEN-LAST:event_btnBuscarKeyPressed

    private void txtHoraInicioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHoraInicioKeyPressed
        
                
       if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtHoraFinal.requestFocus();
        } 
        

        
    }//GEN-LAST:event_txtHoraInicioKeyPressed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
       
        dispose();
        
    }//GEN-LAST:event_btnCerrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cmbTurno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_reporte_Turno;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtHoraFinal;
    private javax.swing.JTextField txtHoraInicio;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
