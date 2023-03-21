/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_prg2_josueham;

import java.util.ArrayList;

/**
 *
 * @author skxka
 */
public class PCompletacion extends Pregunta {
    
    public PCompletacion() {
        super.respuesta = new String();
    }
    
    @Override
    public double getPuntos(Examen a, ArrayList<Pregunta> pre){
        double suma = 0.0;
        for (int i = 0; i < pre.size() - 1; i++) {
            if (pre.get(i).equals(respuesta)) {
                suma+= pre.get(i).getPuntaje();
            }
        }
        return suma;
    }
}
