package Controladores;

import Vistas.VistaDiagnostico;
import Vistas.Vistamodulos;

public class ControladorModulos{

    static Vistamodulos vistamodulos = new Vistamodulos();

    public static void inicio(String name) {
        vistamodulos.getTextName().setText(name);
        vistamodulos.setVisible(true);
    }

    public static void hidden() {
        //vistamodulos.setVisible(false);
        vistamodulos.dispose();
    }

    public static void exit() {
        hidden();
        ControladorLogout.visible();
    }

}
