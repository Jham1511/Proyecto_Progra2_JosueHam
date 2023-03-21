/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_prg2_josueham;

import java.io.Serializable;
import java.util.ArrayList;

public class Curso implements Serializable {

    private String nombre, codigo, hora,semestre,periodo,anio;
    private  int UV;
    private ArrayList<Examen> examenes = new ArrayList();
    private ArrayList<Tarea> tareas = new ArrayList<>();

    public Curso() {
    }
    
    public Curso(String nombre, String codigo, String hora, String semestre, String periodo, String anio, int UV) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.hora = hora;
        this.semestre = semestre;
        this.periodo = periodo;
        this.anio = anio;
        this.UV = UV;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String aula) {
        this.hora = aula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getUV() {
        return UV;
    }

    public void setUV(int UV) {
        this.UV = UV;
    }

    public ArrayList<Examen> getExamenes() {
        return examenes;
    }

    public void setExamenes(ArrayList<Examen> examenes) {
        this.examenes = examenes;
    }
    
    public ArrayList<Tarea> getTareas() {
        return tareas;
    }

    public void setTareas(ArrayList<Tarea> tareas) {
        this.tareas = tareas;
    }

    @Override
    public String toString() {
        return nombre + " - " + codigo;
    }

}
