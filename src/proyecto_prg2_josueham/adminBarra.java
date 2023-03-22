/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_prg2_josueham;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

/**
 *
 * @author SKX Kafei
 */
public class adminBarra extends Thread{

    private Examen examen;
    private int duracion;
    private JProgressBar barra;
    private Main pantalla;

    public adminBarra() {
    }

    public adminBarra(Examen examen, int duracion, JProgressBar barra, Main pantalla) {
        this.examen = examen;
        this.duracion = duracion;
        this.barra = barra;
        this.pantalla = pantalla;
    }

    

    public Examen getExamen() {
        return examen;
    }

    public void setExamen(Examen examen) {
        this.examen = examen;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public void run() {
        barra.setMaximum(duracion);
        barra.setValue(0);
        while (true) {
            try {
                Thread.sleep(1000);
                barra.setValue(barra.getValue() + 1);
                if (barra.getValue() == barra.getMaximum()) {
                    JOptionPane.showMessageDialog(pantalla, "Tiempo finalizado");
                    pantalla.tiempoAcabado();
                    break;
                }
            } catch (Exception ex) {
            }
        }
    }
}
