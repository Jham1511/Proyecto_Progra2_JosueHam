/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_prg2_josueham;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author SKX Kafei
 */
public class Registro extends Usuario {
    private String user, contra;
    private ArrayList<Usuario> usuarios = new ArrayList();

    public Registro() {
    }

    public Registro(String user, String contra, String username, String password, String tipo, String estado, Date fechaCrea) {
        super(username, password, tipo, estado, fechaCrea);
        this.user = user;
        this.contra = contra;
    }

    public String getNom() {
        return user;
    }

    public void setNom(String user) {
        this.user = user;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    
    
}
