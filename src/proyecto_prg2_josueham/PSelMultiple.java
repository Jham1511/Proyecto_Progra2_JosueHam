/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_prg2_josueham;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author skxka
 */
public class PSelMultiple extends Pregunta implements Serializable{
    private String[] opciones = new String[4];

    public PSelMultiple() {
        super();
    }

    public PSelMultiple(double puntaje, String pregunta, Object respuesta) {
        super(puntaje, pregunta, respuesta);
    }
    
    
    
    
    public String[] getOpciones() {
        return opciones;
    }

    public void setOpciones(String[] opciones) {
        this.opciones = opciones;
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

    public void setRespuesta(Object respuesta) {
        this.respuesta = respuesta;
    }

    @Override
    public String toString() {
        return "PSelMultiple{" + "opciones=" + Arrays.toString(opciones) + '}';
    }
    
    public double getPuntos(Examen a, ArrayList<Pregunta> pre){
        double suma = 0.0;
        for (int i = 0; i < pre.size(); i++) {
            if (pre.get(i) instanceof PSelMultiple) {
                if (pre.get(i).equals(respuesta)) {
                    suma+= pre.get(i).getPuntaje();
                }
            }
        }
        return suma;
    }
    
}
