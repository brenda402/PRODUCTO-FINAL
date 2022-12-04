/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

public class ModeloEjercicios {
    private int id_ejercicio;
    private String nombre;

    public ModeloEjercicios() {
    }

    
    public ModeloEjercicios(int id_ejercicio, String nombre) {
        this.id_ejercicio = id_ejercicio;
        this.nombre = nombre;
    }

    public int getId_ejercicio() {
        return id_ejercicio;
    }

    public void setId_ejercicio(int id_ejercicio) {
        this.id_ejercicio = id_ejercicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    
}
