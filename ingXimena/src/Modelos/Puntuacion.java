/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;


        
public class Puntuacion {
    private int idEstudiante;
    private int idEjercicio;
    private String puntuacion;

    public Puntuacion() {
    }

    public Puntuacion(int idEstudiante, int idEjercicio, String puntuacion) {
        this.idEstudiante = idEstudiante;
        this.idEjercicio = idEjercicio;
        this.puntuacion = puntuacion;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public int getIdEjercicio() {
        return idEjercicio;
    }

    public void setIdEjercicio(int idEjercicio) {
        this.idEjercicio = idEjercicio;
    }

    public String getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(String puntuacion) {
        this.puntuacion = puntuacion;
    }
    
    
}
