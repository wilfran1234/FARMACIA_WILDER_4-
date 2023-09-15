/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaNegocio;

import CapaConexion.Conexion;
import CapaDatos.Tipo_Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Tipo_UsuarioBD {

    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sql;
    
    
 public DefaultTableModel reportarTipoUsuarios() {

        DefaultTableModel tabla_temporal;
        String[] cabesera = {"CODIGO", "NOMBRES"};
        String[] registros = new String[2];
        tabla_temporal   = new DefaultTableModel(null, cabesera);

        sql = "SELECT idtipousuario,tuNombre  FROM tipousuario ";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery(sql);

            while (rs.next()) {
                registros[0] = rs.getString("idtipousuario");
                registros[1] = rs.getString("tuNombre");
               

                tabla_temporal.addRow(registros);

            }

            return tabla_temporal;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "PROBELMAS AL RPORTAR TIPO USUARIO", JOptionPane.ERROR_MESSAGE);
            return null;
        }
}
 
 public boolean registrarTipoUsuario(Tipo_Usuario tu){
     
   sql = "INSERT INTO tipousuario(idtipousuario,tuNombre)  VALUES (0,?)";   
   
     try {
         
         PreparedStatement pst = cn.prepareStatement(sql);
         pst.setString(1,tu.getTuNombre());
         
         pst.executeUpdate();
         return  true;
         
     } catch (Exception e) {
         JOptionPane.showMessageDialog(null, e, "PROBLEMAS AL REGISTRAR", JOptionPane.ERROR_MESSAGE);
        return  false;
     }
     
 }
 
 public boolean modificarTipoUsuario(Tipo_Usuario tu){
     
   sql = "UPDATE tipousuario SET tuNombre=? WHERE idtipousuario=?";   
   
     try {
         
         PreparedStatement pst = cn.prepareStatement(sql);
         pst.setString(1,tu.getTuNombre());
         pst.setInt(2,tu.getIdtipousuario());
          
          
         pst.executeUpdate();
         return  true;
         
     } catch (Exception e) {
         JOptionPane.showMessageDialog(null, e);
        return  false;
     }
     
     } 
 
 public boolean eliminarTipoUsuario(Tipo_Usuario tu){
     
   sql = "DELETE FROM tipousuario WHERE idtipousuario=?";   
   
     try {
         
         PreparedStatement pst = cn.prepareStatement(sql);
         pst.setInt(1, tu.getIdtipousuario());
        
          
         pst.executeUpdate();
         
         
     } catch (Exception e) {
         JOptionPane.showMessageDialog(null, e,"PROBLEMAS AL ELIMINAR",JOptionPane.ERROR_MESSAGE);
        return  false;
     }
     return  true;
 }
 
 
 
 
}
