package Controladores;

import Vistas.Vistaaprendizaje;

public class ControladorAprendizaje {
    
    private Vistaaprendizaje vistaAprendizaje;
    private String nombre;

    public ControladorAprendizaje() {
        this.vistaAprendizaje = new Vistaaprendizaje();
    }
    
    
    public void hidden(){
        vistaAprendizaje.setVisible(false);
    }
    
    public void ver(String nombre){
        
        this.nombre = nombre;
        vistaAprendizaje.txtNombre.setText(nombre);
        vistaAprendizaje.setLocationRelativeTo(null);
        vistaAprendizaje.setVisible(true);
    }
}
