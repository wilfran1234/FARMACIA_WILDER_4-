/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package CapaPresentacion;

import CapaDatos.Tipo_Usuario;
import CapaDatos.Usuario;
import CapaNegocio.Tipo_UsuarioBD;
import CapaNegocio.UsuarioBD;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sun.awt.resources.awt;

public class Usuario_IU extends javax.swing.JInternalFrame {

    List<Tipo_Usuario> lista_tipo_usuario;

    public Usuario_IU() {
        initComponents();
        cargarTipoUsuario();
        reportar_usuario();
    }

    private void limpiar() {
        txtDni.setText("");
        txtNombres.setText("");
        txtApellidos.setText("");
        txtDireccion.setText("");
        txtClave.setText("");
        txtBuscar_Apellidos.setText("");
        txtCelular.setText("");
        txtid_tipo_usuario.setText("");

        cmbTipo_Usuario.setSelectedIndex(0);
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

    private void cargarTipoUsuario() {
        try {

            cmbTipo_Usuario.removeAllItems();

            Tipo_UsuarioBD oMedidaBD = new Tipo_UsuarioBD();
            DefaultTableModel tabla_temporal;
            tabla_temporal = oMedidaBD.reportarTipoUsuarios();

            lista_tipo_usuario = new ArrayList<>();
            cmbTipo_Usuario.addItem("SELECCIONAR");

            for (int i = 0; i < tabla_temporal.getRowCount(); i++) {

                int idtipousuario = Integer.valueOf(tabla_temporal.getValueAt(i, 0).toString());
                String tuNombre = String.valueOf(tabla_temporal.getValueAt(i, 1));

                lista_tipo_usuario.add(new Tipo_Usuario(idtipousuario, tuNombre));
                cmbTipo_Usuario.addItem(tuNombre);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "ERROR AL CARGAR TIPO USUARIO", JOptionPane.ERROR_MESSAGE);

        }

    }

    private void reportar_usuario() {

        try {
            setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
            DefaultTableModel tabla_temporal;
            UsuarioBD oUsuarioBD = new UsuarioBD();
            tabla_temporal = oUsuarioBD.reportarUsuarios();
            tabla_reporte_Usuario.setModel(tabla_temporal);

            int canLista = tabla_temporal.getRowCount();
            txtCantidad.setText("" + canLista);

            setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        } catch (Exception e) {
            setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
            e.printStackTrace();
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        btnRegistrar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtClave = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        cmbTipo_Usuario = new javax.swing.JComboBox<>();
        cmbTienda = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_reporte_Usuario = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtBuscar_Apellidos = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtid_tipo_usuario = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("MANTENIMIENTO DE USUARIOS");

        jPanel2.setBackground(new java.awt.Color(255, 204, 0));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DNI:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NOMBRES:");

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

        txtNombres.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombresFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombresFocusLost(evt);
            }
        });
        txtNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombresKeyPressed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DIRECCION:");

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
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_IU/imprimir.png"))); // NOI18N
        btnLimpiar.setText("IMPRIMIR");
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
                .addComponent(btnRegistrar)
                .addGap(24, 24, 24)
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
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnModificar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnEliminar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnRegistrar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("APELLIDOS:");

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CLAVE:");

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("CELULAR:");

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("TIPO:");

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("TIENDA:");

        txtApellidos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtApellidosFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtApellidosFocusLost(evt);
            }
        });
        txtApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtApellidosKeyPressed(evt);
            }
        });

        txtDireccion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDireccionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDireccionFocusLost(evt);
            }
        });
        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDireccionKeyPressed(evt);
            }
        });

        txtClave.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtClaveFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtClaveFocusLost(evt);
            }
        });
        txtClave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtClaveKeyPressed(evt);
            }
        });

        txtCelular.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCelularFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCelularFocusLost(evt);
            }
        });
        txtCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCelularKeyTyped(evt);
            }
        });

        cmbTipo_Usuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "ADMINISTRADOR", "VENDEDOR", "CONTADOR", "CAJER@", "LOGISTICA" }));
        cmbTipo_Usuario.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbTipo_UsuarioItemStateChanged(evt);
            }
        });

        cmbTienda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PRINCIPAL" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(60, 60, 60)
                                .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel7))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbTipo_Usuario, javax.swing.GroupLayout.Alignment.TRAILING, 0, 406, Short.MAX_VALUE)
                                    .addComponent(txtCelular)
                                    .addComponent(cmbTienda, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator1)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(cmbTipo_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cmbTienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabla_reporte_Usuario.setBackground(new java.awt.Color(102, 102, 102));
        tabla_reporte_Usuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        tabla_reporte_Usuario.setForeground(new java.awt.Color(255, 255, 255));
        tabla_reporte_Usuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabla_reporte_Usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabla_reporte_UsuarioMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_reporte_Usuario);

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_IU/informacion.png"))); // NOI18N
        jLabel4.setText("BUSCAR:");

        txtBuscar_Apellidos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBuscar_ApellidosFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBuscar_ApellidosFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscar_Apellidos)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtBuscar_Apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(102, 102, 102));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CANTIDAD:");

        txtid_tipo_usuario.setEnabled(false);

        txtCantidad.setEnabled(false);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtid_tipo_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(29, 29, 29)
                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtid_tipo_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 837, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabla_reporte_UsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_reporte_UsuarioMousePressed

        if (evt.getClickCount() == 2) {

            int fila_seleccionada = tabla_reporte_Usuario.getSelectedRow();

            txtDni.setText(tabla_reporte_Usuario.getValueAt(fila_seleccionada, 0).toString());
            txtNombres.setText(tabla_reporte_Usuario.getValueAt(fila_seleccionada, 1).toString());
            txtApellidos.setText(tabla_reporte_Usuario.getValueAt(fila_seleccionada, 2).toString());
            txtDireccion.setText(tabla_reporte_Usuario.getValueAt(fila_seleccionada, 3).toString());
            txtClave.setText(tabla_reporte_Usuario.getValueAt(fila_seleccionada, 4).toString());
            txtCelular.setText(tabla_reporte_Usuario.getValueAt(fila_seleccionada, 5).toString());
            cmbTipo_Usuario.setSelectedItem(tabla_reporte_Usuario.getValueAt(fila_seleccionada, 6).toString());
            cmbTienda.setSelectedItem(tabla_reporte_Usuario.getValueAt(fila_seleccionada, 7).toString());

        }

    }//GEN-LAST:event_tabla_reporte_UsuarioMousePressed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        try {
            if (txtDni.getText().length() > 0) {
                if (txtNombres.getText().length() > 0) {
                    if (txtApellidos.getText().length() > 0) {
                        if (txtDireccion.getText().length() > 0) {
                            if (txtCelular.getText().length() > 0) {
                                if (txtClave.getText().length() > 0) {

                                    Usuario OUsuario = new Usuario();
                                    UsuarioBD oUsuarioBD = new UsuarioBD();

                                    OUsuario.setuDni(txtDni.getText().toUpperCase().trim());
                                    OUsuario.setuNombre(txtNombres.getText().toUpperCase().trim());
                                    OUsuario.setuApellidos(txtApellidos.getText().toUpperCase().trim());
                                    OUsuario.setuDireccion(txtDireccion.getText().toUpperCase().trim());
                                    OUsuario.setuClave(txtClave.getText().toUpperCase().trim());
                                    OUsuario.setuCelular(txtCelular.getText().toUpperCase().trim());
                                    OUsuario.setUtipo(Integer.parseInt(txtid_tipo_usuario.getText()));
                                    OUsuario.setTienda(cmbTienda.getSelectedItem().toString());

                                    boolean respuesta = oUsuarioBD.registrarUsuario(OUsuario);
                                    if (respuesta) {
                                        exito("SE REGISTRO CON EXITO");
                                        reportar_usuario();
                                        limpiar();

                                    } else {
                                        error("TIENES PROBLEMS AL REGISTRAR");
                                    }

                                } else {
                                    advertencia("INGRESA LA CLAVE");
                                    txtClave.requestFocus();
                                }

                            } else {
                                advertencia("INGRESA EL NUMERO DE CELULAR");
                                txtCelular.requestFocus();
                            }

                        } else {
                            advertencia("INGRESA LA DIRECCION");
                            txtDireccion.requestFocus();
                        }

                    } else {
                        advertencia("INGRESA LOS APELLIDOS");
                        txtApellidos.requestFocus();
                    }

                } else {
                    advertencia("INGRESA EL NOMBRE");
                    txtNombres.requestFocus();
                }

            } else {
                advertencia("INGRESA EL DNI");
                txtDni.requestFocus();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR");

        }

    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        if (txtDni.getText().length() > 0) {
            if (txtNombres.getText().length() > 0) {
                if (txtApellidos.getText().length() > 0) {
                    if (txtDireccion.getText().length() > 0) {
                        if (txtCelular.getText().length() > 0) {
                            if (txtClave.getText().length() > 0) {
                                if (txtid_tipo_usuario.getText().length()>0) {

                                    Usuario OUsuario = new Usuario();
                                    UsuarioBD oUsuarioBD = new UsuarioBD();

                                    OUsuario.setuDni(txtDni.getText().toUpperCase().trim());
                                    OUsuario.setuNombre(txtNombres.getText().toUpperCase().trim());
                                    OUsuario.setuApellidos(txtApellidos.getText().toUpperCase().trim());
                                    OUsuario.setuDireccion(txtDireccion.getText().toUpperCase().trim());
                                    OUsuario.setuClave(txtClave.getText().toUpperCase().trim());
                                    OUsuario.setuCelular(txtCelular.getText().toUpperCase().trim());
                                    OUsuario.setUtipo(Integer.parseInt(txtid_tipo_usuario.getText()));
                                    OUsuario.setTienda(cmbTienda.getSelectedItem().toString());

                                    boolean respuesta = oUsuarioBD.modificarUsuario(OUsuario);
                                    if (respuesta) {
                                        exito("SE MODIFICO CON EXITO");
                                        reportar_usuario();
                                        limpiar();

                                    } else {
                                        error("TIENES PROBLEMS AL MODIFICAR AL USUARIO");
                                    }

                                } else {
                                    error("NO HA SELECCINADO AL USUARIO A MDIFICAR");
                                }

                            } else {
                                advertencia("INGRESA LA CLAVE");
                                txtClave.requestFocus();
                            }

                        } else {
                            advertencia("INGRESA EL NUMERO DE CELULAR");
                            txtCelular.requestFocus();
                        }

                    } else {
                        advertencia("INGRESA LA DIRECCION");
                        txtDireccion.requestFocus();
                    }

                } else {
                    advertencia("INGRESA LOS APELLIDOS");
                    txtApellidos.requestFocus();
                }

            } else {
                advertencia("INGRESA EL NOMBRE");
                txtNombres.requestFocus();
            }

        } else {
            advertencia("INGRESA EL DNI");
            txtDni.requestFocus();
        }

    }//GEN-LAST:event_btnModificarActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed

        try {
            
        if (txtDni.getText().length() > 0) {
            
            int aviso = JOptionPane.showConfirmDialog(rootPane, "ESTAS SEGURO DE ELIMINAR");
            if (aviso == 0) {
                UsuarioBD oUsuarioBD= new UsuarioBD();
                
                String dni = txtDni.getText();
                boolean respuesta = oUsuarioBD.eliminarUsuario(dni);
                
                if (respuesta) {
                    exito("SE ELIMINO EL USUARIO CORRECTAMENTE");
                    reportar_usuario();
                    limpiar();
                    txtDni.requestFocus();

                } else {
                    error("TIENES PROBLEMAS PARA ELIMINAR");
                }
            }
        } else {
            error("INGRESE UN DNI PARA ELIMINAR");
            txtDni.requestFocus();
        }
        
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            
        }
        
        

    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed

        dispose();

    }//GEN-LAST:event_btnCerrarActionPerformed

    private void cmbTipo_UsuarioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbTipo_UsuarioItemStateChanged

        if (evt.getStateChange() == ItemEvent.SELECTED) {

            String textoSeleccionado = (String) cmbTipo_Usuario.getSelectedItem();

            if (textoSeleccionado.equals("SELECCIONAR")) {
                txtid_tipo_usuario.setText("");

            } else {

                int i = cmbTipo_Usuario.getSelectedIndex() - 1;
                txtid_tipo_usuario.setText("" + lista_tipo_usuario.get(i).getIdtipousuario());

            }
        }
    }//GEN-LAST:event_cmbTipo_UsuarioItemStateChanged

    private void txtDniFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDniFocusGained
        
        
         txtDni.setBackground(Color.yellow);
         
    }//GEN-LAST:event_txtDniFocusGained

    private void txtDniFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDniFocusLost
        
         txtDni.setBackground(Color.white);
        
    }//GEN-LAST:event_txtDniFocusLost

    private void txtNombresFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombresFocusGained
        
         txtNombres.setBackground(Color.yellow);
        
    }//GEN-LAST:event_txtNombresFocusGained

    private void txtNombresFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombresFocusLost

         txtNombres.setBackground(Color.white);
        
    }//GEN-LAST:event_txtNombresFocusLost

    private void txtApellidosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtApellidosFocusGained
        
         txtApellidos.setBackground(Color.yellow);
        
    }//GEN-LAST:event_txtApellidosFocusGained

    private void txtApellidosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtApellidosFocusLost
      
         txtApellidos.setBackground(Color.white);
        
    }//GEN-LAST:event_txtApellidosFocusLost

    private void txtDireccionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDireccionFocusGained
       
         txtDireccion.setBackground(Color.yellow);
        
    }//GEN-LAST:event_txtDireccionFocusGained

    private void txtDireccionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDireccionFocusLost
       
         txtDireccion.setBackground(Color.white);
        
    }//GEN-LAST:event_txtDireccionFocusLost

    private void txtClaveFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtClaveFocusGained
       
         txtClave.setBackground(Color.yellow);
        
    }//GEN-LAST:event_txtClaveFocusGained

    private void txtClaveFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtClaveFocusLost
       
         txtClave.setBackground(Color.white);
        
    }//GEN-LAST:event_txtClaveFocusLost

    private void txtCelularFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCelularFocusGained
       
         txtCelular.setBackground(Color.yellow);
        
    }//GEN-LAST:event_txtCelularFocusGained

    private void txtCelularFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCelularFocusLost
        
        txtCelular.setBackground(Color.white);
        
    }//GEN-LAST:event_txtCelularFocusLost

    private void txtBuscar_ApellidosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBuscar_ApellidosFocusGained
       
        txtBuscar_Apellidos.setBackground(Color.yellow);
        
    }//GEN-LAST:event_txtBuscar_ApellidosFocusGained

    private void txtBuscar_ApellidosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBuscar_ApellidosFocusLost
       
         txtBuscar_Apellidos.setBackground(Color.white);
        
    }//GEN-LAST:event_txtBuscar_ApellidosFocusLost

    private void txtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyTyped
        
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) || txtDni.getText().length() >= 8) {
            evt.consume();
        }
        
    }//GEN-LAST:event_txtDniKeyTyped

    private void txtDniKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyPressed
        
          if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtNombres.requestFocus();

        }
        
    }//GEN-LAST:event_txtDniKeyPressed

    private void txtNombresKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresKeyPressed
        
          if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtApellidos.requestFocus();

        }
    }//GEN-LAST:event_txtNombresKeyPressed

    private void txtApellidosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyPressed
       
                   
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtDireccion.requestFocus();

        }
        
    }//GEN-LAST:event_txtApellidosKeyPressed

    private void txtDireccionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyPressed
        
         if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtClave.requestFocus();

        }
        
    }//GEN-LAST:event_txtDireccionKeyPressed

    private void txtClaveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClaveKeyPressed
        
         if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtCelular.requestFocus();

        }
        
    }//GEN-LAST:event_txtClaveKeyPressed

    private void txtCelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCelularKeyTyped
        
          
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) || txtCelular.getText().length() >= 9) {
            evt.consume();
        }
        
        
    }//GEN-LAST:event_txtCelularKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cmbTienda;
    private javax.swing.JComboBox<String> cmbTipo_Usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tabla_reporte_Usuario;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtBuscar_Apellidos;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtid_tipo_usuario;
    // End of variables declaration//GEN-END:variables
}
