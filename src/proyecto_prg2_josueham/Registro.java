/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_prg2_josueham;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author SKX Kafei
 */
public class Registro extends Usuario implements Serializable {
    private ArrayList<Usuario> usuarios = new ArrayList();

    public Registro() {
    }

    public Registro(String username, String password, String tipo, String estado, Date fechaCrea) {
        super(username, password, tipo, estado, fechaCrea);
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
}
