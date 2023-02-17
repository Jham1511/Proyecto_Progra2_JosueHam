/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_prg2_josueham;

import java.util.ArrayList;

/**
 *
 * @author SKX Kafei
 */
public class Alumno extends Usuario{
    
    private String nom, carrera;
    private boolean genero;
    private int numCuenta, edad;
    private double promedio;
    private ArrayList<Curso> clases = new ArrayList();
    
    public Alumno() {
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

    public boolean isGenero() {
        return genero;
    }

    public void setGenero(boolean genero) {
        this.genero = genero;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public ArrayList<Curso> getClases() {
        return clases;
    }

    public void setClases(ArrayList<Curso> clases) {
        this.clases = clases;
    }

    @Override
    public String toString() {
        return "Nombre: " + " - " + nom + "Carrera: " + " - " + carrera + ", Numero de Cuenta: " + " - " + numCuenta + "Promedio: " + " - " + promedio;
    }
    
    
}
