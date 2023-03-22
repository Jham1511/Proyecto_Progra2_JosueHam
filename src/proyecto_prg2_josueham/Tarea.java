/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_prg2_josueham;

import java.io.File;
import java.util.Date;

/**
 *
 * @author SKX Kafei
 */
public class Tarea {
    private String nombre;
    private Date fechaInicio, fechaCierre;
    private double size;
    private File archivo;

    public Tarea() {
    }

    public Tarea(String nombre, Date fechaInicio, Date fechaCierre, double size, File archivo) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaCierre = fechaCierre;
        this.size = size;
        this.archivo = archivo;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaCierre() {
        return fechaCierre;
    }

    public void setFechaCierre(Date fechaCierre) {
        this.fechaCierre = fechaCierre;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
