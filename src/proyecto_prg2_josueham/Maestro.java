/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_prg2_josueham;

import java.util.ArrayList;
import java.util.Date;


public class Maestro extends Usuario{
    
    private String nombre, identidad;
    private ArrayList<Curso> clases = new ArrayList();
    private ArrayList<Alumno> alumnos = new ArrayList();

    public Maestro() {
    }

    public Maestro(String nombre, String identidad, String username, String password, String tipo, String estado, Date fechaCrea) {
        super(username, password, tipo, estado, fechaCrea);
        this.nombre = nombre;
        this.identidad = identidad;
    }

    

    public ArrayList<Curso> getClases() {
        return clases;
    }

    public void setClases(ArrayList<Curso> clases) {
        this.clases = clases;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
    
    
}
