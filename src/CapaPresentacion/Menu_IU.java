/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CapaPresentacion;

import java.awt.Dimension;

/**
 *
 * @author labor
 */
public class Menu_IU extends javax.swing.JFrame {

   
    public Menu_IU() {
        initComponents();
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator3 = new javax.swing.JSeparator();
        jToolBar1 = new javax.swing.JToolBar();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnProducto = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        btnCompras = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        btnIngresos = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JToolBar.Separator();
        jSeparator9 = new javax.swing.JToolBar.Separator();
        btnEgresos = new javax.swing.JButton();
        jSeparator10 = new javax.swing.JToolBar.Separator();
        jSeparator11 = new javax.swing.JToolBar.Separator();
        btnVentas = new javax.swing.JButton();
        jSeparator12 = new javax.swing.JToolBar.Separator();
        jSeparator13 = new javax.swing.JToolBar.Separator();
        btnCerrar = new javax.swing.JButton();
        escritorio = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_mantenimiento = new javax.swing.JMenu();
        TipoUsuario_IU = new javax.swing.JMenuItem();
        Usuario_IU = new javax.swing.JMenuItem();
        Turno_IU = new javax.swing.JMenuItem();
        menu_compras = new javax.swing.JMenu();
        menu_inventario = new javax.swing.JMenu();
        menu_ventas = new javax.swing.JMenu();
        menu_caja = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);

        jToolBar1.setBackground(new java.awt.Color(102, 102, 102));
        jToolBar1.setForeground(new java.awt.Color(204, 204, 204));
        jToolBar1.setRollover(true);
        jToolBar1.add(jSeparator1);
        jToolBar1.add(jSeparator2);

        btnProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_IU/cajas.png"))); // NOI18N
        btnProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnProducto.setFocusable(false);
        btnProducto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProducto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnProducto);
        jToolBar1.add(jSeparator4);
        jToolBar1.add(jSeparator5);

        btnCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_IU/evaluacion.png"))); // NOI18N
        btnCompras.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnCompras.setFocusable(false);
        btnCompras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprasActionPerformed(evt);
            }
        });
        jToolBar1.add(btnCompras);
        jToolBar1.add(jSeparator6);
        jToolBar1.add(jSeparator7);

        btnIngresos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_IU/ingresos.png"))); // NOI18N
        btnIngresos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnIngresos.setFocusable(false);
        btnIngresos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIngresos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnIngresos);
        jToolBar1.add(jSeparator8);
        jToolBar1.add(jSeparator9);

        btnEgresos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_IU/disminucion.png"))); // NOI18N
        btnEgresos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnEgresos.setFocusable(false);
        btnEgresos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEgresos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnEgresos);
        jToolBar1.add(jSeparator10);
        jToolBar1.add(jSeparator11);

        btnVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_IU/caja-registradora.png"))); // NOI18N
        btnVentas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnVentas.setFocusable(false);
        btnVentas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVentas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnVentas);
        jToolBar1.add(jSeparator12);
        jToolBar1.add(jSeparator13);

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_IU/flecha.png"))); // NOI18N
        btnCerrar.setFocusable(false);
        btnCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCerrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnCerrar);

        escritorio.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 593, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(204, 255, 204));

        menu_mantenimiento.setText("MANTENIMIENTO");

        TipoUsuario_IU.setText("Tipo de Usuario");
        TipoUsuario_IU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoUsuario_IUActionPerformed(evt);
            }
        });
        menu_mantenimiento.add(TipoUsuario_IU);

        Usuario_IU.setText("Usuario");
        Usuario_IU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Usuario_IUActionPerformed(evt);
            }
        });
        menu_mantenimiento.add(Usuario_IU);

        Turno_IU.setText("Turno");
        Turno_IU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Turno_IUActionPerformed(evt);
            }
        });
        menu_mantenimiento.add(Turno_IU);

        jMenuBar1.add(menu_mantenimiento);

        menu_compras.setText("COMPRAS");
        jMenuBar1.add(menu_compras);

        menu_inventario.setText("INVENTARIO");
        jMenuBar1.add(menu_inventario);

        menu_ventas.setText("VENTAS");
        jMenuBar1.add(menu_ventas);

        menu_caja.setText("CAJA");
        jMenuBar1.add(menu_caja);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 1136, Short.MAX_VALUE)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnComprasActionPerformed

    private void TipoUsuario_IUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoUsuario_IUActionPerformed

        Tipo_Usuario_IU frame = new Tipo_Usuario_IU();
        escritorio.add(frame);
        Dimension desktopSize = escritorio.getSize();
        Dimension frameSize = frame.getSize();
        frame.setLocation((desktopSize.width - frameSize.width) / 2, (desktopSize.height - frameSize.height) / 2);
        
        frame.show();

    }//GEN-LAST:event_TipoUsuario_IUActionPerformed

    private void Usuario_IUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Usuario_IUActionPerformed
       
        Usuario_IU frame = new Usuario_IU();
        escritorio.add(frame);
        Dimension desktopSize = escritorio.getSize();
        Dimension frameSize = frame.getSize();
        frame.setLocation((desktopSize.width - frameSize.width) / 2, (desktopSize.height - frameSize.height) / 2);
        
        frame.show();
        
    }//GEN-LAST:event_Usuario_IUActionPerformed

    private void Turno_IUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Turno_IUActionPerformed
        
        
        Turno_IU frame = new Turno_IU();
        escritorio.add(frame);
        Dimension desktopSize = escritorio.getSize();
        Dimension frameSize = frame.getSize();
        frame.setLocation((desktopSize.width - frameSize.width) / 2, (desktopSize.height - frameSize.height) / 2);
        
        frame.show();
        
        
    }//GEN-LAST:event_Turno_IUActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu_IU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_IU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_IU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_IU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_IU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem TipoUsuario_IU;
    private javax.swing.JMenuItem Turno_IU;
    private javax.swing.JMenuItem Usuario_IU;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnCompras;
    private javax.swing.JButton btnEgresos;
    private javax.swing.JButton btnIngresos;
    private javax.swing.JButton btnProducto;
    private javax.swing.JButton btnVentas;
    private javax.swing.JPanel escritorio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator10;
    private javax.swing.JToolBar.Separator jSeparator11;
    private javax.swing.JToolBar.Separator jSeparator12;
    private javax.swing.JToolBar.Separator jSeparator13;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JToolBar.Separator jSeparator8;
    private javax.swing.JToolBar.Separator jSeparator9;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenu menu_caja;
    private javax.swing.JMenu menu_compras;
    private javax.swing.JMenu menu_inventario;
    private javax.swing.JMenu menu_mantenimiento;
    private javax.swing.JMenu menu_ventas;
    // End of variables declaration//GEN-END:variables
}
