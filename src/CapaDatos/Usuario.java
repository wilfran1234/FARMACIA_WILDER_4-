/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaDatos;

public class Usuario {

    private String uDni;
    private String uNombre;
    private String uApellidos;
    private String uDireccion;
    private String uClave;
    private String uCelular;
    private int utipo;
    private String tienda;

    public Usuario() {
    }

    public Usuario(String uDni, String uNombre, String uApellidos, String uDireccion, String uClave, String uCelular, int utipo, String tienda) {
        this.uDni = uDni;
        this.uNombre = uNombre;
        this.uApellidos = uApellidos;
        this.uDireccion = uDireccion;
        this.uClave = uClave;
        this.uCelular = uCelular;
        this.utipo = utipo;
        this.tienda = tienda;
    }

    public String getuDni() {
        return uDni;
    }

    public void setuDni(String uDni) {
        this.uDni = uDni;
    }

    public String getuNombre() {
        return uNombre;
    }

    public void setuNombre(String uNombre) {
        this.uNombre = uNombre;
    }

    public String getuApellidos() {
        return uApellidos;
    }

    public void setuApellidos(String uApellidos) {
        this.uApellidos = uApellidos;
    }

    public String getuDireccion() {
        return uDireccion;
    }

    public void setuDireccion(String uDireccion) {
        this.uDireccion = uDireccion;
    }

    public String getuClave() {
        return uClave;
    }

    public void setuClave(String uClave) {
        this.uClave = uClave;
    }

    public String getuCelular() {
        return uCelular;
    }

    public void setuCelular(String uCelular) {
        this.uCelular = uCelular;
    }

    public int getUtipo() {
        return utipo;
    }

    public void setUtipo(int utipo) {
        this.utipo = utipo;
    }

    public String getTienda() {
        return tienda;
    }

    public void setTienda(String tienda) {
        this.tienda = tienda;
    }
    
    
}
