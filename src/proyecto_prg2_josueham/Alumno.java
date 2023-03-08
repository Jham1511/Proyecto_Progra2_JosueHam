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
public class Alumno extends Usuario{
    
    private String nom, carrera,rol;
    private ArrayList<Curso> clases = new ArrayList();
    
    public Alumno() {
    }

    public Alumno(String nom, String carrera, String rol, String username, String password, String tipo, String estado, Date fechaCrea) {
        super(username, password, tipo, estado, fechaCrea);
        this.nom = nom;
        this.carrera = carrera;
        this.rol = rol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public ArrayList<Curso> getClases() {
        return clases;
    }

    public void setClases(ArrayList<Curso> clases) {
        this.clases = clases;
    }

    @Override
    public String toString() {
        return nom;
    }
    
    
}
