/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaNegocio;

import CapaConexion.Conexion;
import CapaDatos.Tipo_Usuario;
import CapaDatos.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class UsuarioBD {

    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sql;

    public DefaultTableModel reportarUsuarios() {

        DefaultTableModel tabla_temporal;
        String[] cabesera = {"CODIGO", "NOMBRES", "APELLIDOS", "DIRECCION", "CLAVE", "CELULAR", "TIPO_USUARIO", "TIENDA"};
        String[] registros = new String[8];
        tabla_temporal = new DefaultTableModel(null, cabesera);

        sql = "SELECT uDni,uNombre,uApellidos,uDireccion,uClave,uCelular,tuNombre,tienda FROM usuario AS u "
                + "INNER JOIN tipousuario AS tp ON u.idtipousuario=tp.idtipousuario ";

        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                registros[0] = rs.getString("uDni");
                registros[1] = rs.getString("uNombre");
                registros[2] = rs.getString("uApellidos");
                registros[3] = rs.getString("uDireccion");
                registros[4] = rs.getString("uClave");
                registros[5] = rs.getString("uCelular");
                registros[6] = rs.getString("tuNombre");
                registros[7] = rs.getString("tienda");

                tabla_temporal.addRow(registros);

            }

            return tabla_temporal;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "ERROR AL REPORTAR USUARIOS", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public DefaultTableModel buscarUsuarioXdni(String dni){
     
       DefaultTableModel tabla_temporal;
        String[] cabesera = {"CODIGO", "NOMBRES", "APELLIDOS", "DIRECCION", "CLAVE", "CELULAR", "TIPO_USUARIO", "TIENDA"};
        String[] registros = new String[8];
        tabla_temporal = new DefaultTableModel(null, cabesera);

        sql = "SELECT uDni,uNombre,uApellidos,uDireccion,uClave,uCelular,tuNombre,tienda FROM usuario AS u "
                + "INNER JOIN tipousuario AS tp ON u.idtipousuario=tp.idtipousuario "
                + "WHERE uDni=? ";

        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, dni);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                registros[0] = rs.getString("uDni");
                registros[1] = rs.getString("uNombre");
                registros[2] = rs.getString("uApellidos");
                registros[3] = rs.getString("uDireccion");
                registros[4] = rs.getString("uClave");
                registros[5] = rs.getString("uCelular");
                registros[6] = rs.getString("tuNombre");
                registros[7] = rs.getString("tienda");

                tabla_temporal.addRow(registros);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "ERROR AL REPORTAR USUARIOS", JOptionPane.ERROR_MESSAGE);
            return null;
        }
         return tabla_temporal;
    }
    
    public boolean registrarUsuario(Usuario u) {
        boolean respuesta = false;

        sql = "INSERT INTO usuario(uDni,uNombre,uApellidos,uDireccion,uClave,uCelular,idtipousuario,tienda)  VALUES (?,?,?,?,?,?,?,?)";

        try {

            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, u.getuDni());
            pst.setString(2, u.getuNombre());
            pst.setString(3, u.getuApellidos());
            pst.setString(4, u.getuDireccion());
            pst.setString(5, u.getuClave());
            pst.setString(6, u.getuCelular());
            pst.setInt(7, u.getUtipo());
            pst.setString(8, u.getTienda());

            respuesta = pst.executeUpdate() == 1 ? true : false;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "PROBLEMAS AL REGISTRAR USUARIO BD", JOptionPane.ERROR_MESSAGE);
            return respuesta;
        }
        return respuesta;
    }

    public boolean modificarUsuario(Usuario u) {

        boolean respuesta = false;
        sql = "UPDATE usuario SET uNombre=?,uApellidos=?,uDireccion=?,uClave=?,uCelular=?,idtipousuario=?,tienda=? WHERE uDni=?";

        try {

            PreparedStatement pst = cn.prepareStatement(sql);

            pst.setString(1, u.getuNombre());
            pst.setString(2, u.getuApellidos());
            pst.setString(3, u.getuDireccion());
            pst.setString(4, u.getuClave());
            pst.setString(5, u.getuCelular());
            pst.setInt(6, u.getUtipo());
            pst.setString(7, u.getTienda());
            pst.setString(8, u.getuDni());

            respuesta = pst.executeUpdate() == 1 ? true : false;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return respuesta;
        }
        return respuesta;
    }

    public boolean eliminarUsuario(String dni){
      boolean respuesta =false;
      
     try {
         
         sql = "DELETE FROM usuario WHERE uDni=?";  
         PreparedStatement pst = cn.prepareStatement(sql);
         pst.setString(1,dni);
        
          
         respuesta = pst.executeUpdate()== 1 ? true : false;
         
         
     } catch (Exception e) {
         JOptionPane.showMessageDialog(null, e,"PROBLEMAS AL ELIMINAR UN USUARIO BD",JOptionPane.ERROR_MESSAGE);
        return  respuesta;
     }
     return  respuesta;
 }
    
    
}
