/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_prg2_josueham;

import java.util.ArrayList;


public class Maestro extends Usuario{
    
    
    private ArrayList<Curso> clases = new ArrayList();
    private ArrayList<Alumno> alumnos = new ArrayList();

    public Maestro() {
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
