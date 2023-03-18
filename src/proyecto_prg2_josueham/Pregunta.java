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
public class Pregunta {
    protected double puntaje;
    protected String pregunta;
    protected Object respuesta;

    public Pregunta() {
    }

    public Pregunta(double puntaje, String pregunta, Object respuesta) {
        this.puntaje = puntaje;
        this.pregunta = pregunta;
        this.respuesta = respuesta;
    }

    public double getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(double puntaje) {
        this.puntaje = puntaje;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }
    
    
    public Object getRespuesta() {
        return respuesta;
    }

    @Override
    public String toString() {
        return "Pregunta{" + "puntaje=" + puntaje + ", pregunta=" + pregunta + ", respuesta=" + respuesta + '}';
    }
    
    
}
