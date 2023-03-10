/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_prg2_josueham;

import java.io.Serializable;
import java.util.Date;


public class Usuario implements Serializable{
    protected String username, password, tipo, estado;
    protected Date fechaNas;

    public Usuario() {
    }

    public Usuario(String username, String password, String tipo, String estado, Date fechaCrea) {
        this.username = username;
        this.password = password;
        this.tipo = tipo;
        this.estado = estado;
        this.fechaNas = fechaCrea;
    }

    public String getNombre() {
        return username;
    }

    public void setNombre(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaCrea() {
        return fechaNas;
    }

    public void setFechaCrea(Date fechaCrea) {
        this.fechaNas = fechaCrea;
    }

    @Override
    public String toString() {
        return username;
    }
    
    
}