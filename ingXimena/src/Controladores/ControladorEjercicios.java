package Controladores;

import Vistas.Vistaejercicios;


public class ControladorEjercicios {
    
    private String nombre;
    private Vistaejercicios vistaejercicios;

    public ControladorEjercicios() {
        this.vistaejercicios = new Vistaejercicios();
    }
    
    
    
    public void inicio(String nombre){
        this.nombre = nombre;
        vistaejercicios.txtNombre.setText(nombre);
        vistaejercicios.setLocationRelativeTo(null);
        initDatos();
        vistaejercicios.setVisible(true);
        
    }
    
    public void initDatos(){
        vistaejercicios.txtPregunta.setText("¿Qué hace falta en el código para que se pueda ejecutar?");
        vistaejercicios.opcionesEjercicio1.removeAllItems();
        vistaejercicios.opcionesEjercicio1.addItem("");
        vistaejercicios.opcionesEjercicio1.addItem("Main()");
        vistaejercicios.opcionesEjercicio1.addItem("Void Mian()");
        vistaejercicios.opcionesEjercicio1.addItem("Void Mein()");
        vistaejercicios.opcionesEjercicio1.addItem("int main()");
        
    }
}
