/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_prg2_josueham;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author skxka
 */
public class PTrueOrFalse extends Pregunta implements Serializable {

    public PTrueOrFalse() {
        super.respuesta = true;
    }

    

    @Override
    public double getPuntos() {
        if (((Boolean) this.getRespuesta()).equals((Boolean) respuestaUsuario)) {
            return this.getPuntaje();
        }
        return 0;
    }
}
