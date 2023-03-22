/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_prg2_josueham;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JTextField;

/**
 *
 * @author skxka
 */
public class PCompletacion extends Pregunta  implements Serializable{
    
    public PCompletacion() {
        super.respuesta = new String();
    }
    
    public double getPuntos(Examen a, ArrayList<Pregunta> pre, JTextField field){
        double suma = 0.0;
        for (int i = 0; i < pre.size() - 1; i++) {
            if (field.equals(respuesta)) {
                suma+= pre.get(i).getPuntaje();
            } else {
                suma+=0;
            }
        }
        return suma;
    }

    @Override
    public double getPuntos() {
         if (((String)this.getRespuesta()).equals((String) respuestaUsuario)) {
            return this.getPuntaje();
        }
        return 0;
    }
}
