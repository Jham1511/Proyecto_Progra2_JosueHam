/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_prg2_josueham;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;


public class Examen implements Serializable{
    private String nombre, codigo;
    private int duracion;
    private Date fechaInicio, fechaFinal;
    private ArrayList<Pregunta> preguntas = new ArrayList();

    public String getNombre() {
        return nombre;
    }

    public Examen() {
    }

    public Examen(String nombre, String codigo, int duracion, Date fechaInicio, Date fechaFinal) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.duracion = duracion;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public ArrayList<Pregunta> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(ArrayList<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }

    @Override
    public String toString() {
        return nombre;
    }

 
    public String toString2() {
        return "Examen{" + "nombre=" + nombre + ", codigo=" + codigo + ", duracion=" + duracion + ", fechaInicio=" + fechaInicio + ", fechaFinal=" + fechaFinal + ", preguntas=" + preguntas + '}';
    }

    
    
    
}
