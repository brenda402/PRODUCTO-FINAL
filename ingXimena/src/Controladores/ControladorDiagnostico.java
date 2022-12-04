/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Dao.DaoPuntuacion;
import Dao.DaoUser;
import Dao.IDaoPuntuacion;
import Dao.IDaoUser;
import Modelos.ModeloUsuario;
import Modelos.Puntuacion;
import Vistas.VistaDiagnostico;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author poseidon
 */
public class ControladorDiagnostico implements ActionListener{

    private VistaDiagnostico vistadiagnostico = new VistaDiagnostico();
    private String nombre = "";

    public ControladorDiagnostico() {
        
        this.vistadiagnostico.btnVolver.addActionListener((ActionListener) this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vistadiagnostico.btnVolver){
            volver();
        }
    }
    
    
    public void ver(String nombre){
        
        this.nombre = nombre;
        vistadiagnostico.txtNombre.setText(nombre);
        vistadiagnostico.setLocationRelativeTo(null);
        vistadiagnostico.BarraProgreso.setVisible(false);
        vistadiagnostico.txtBarra.setVisible(false);
        vistadiagnostico.btnVolver.setVisible(false);
        
        IDaoPuntuacion iDaoPuntuacion = new DaoPuntuacion();
        IDaoUser iDaoUser = new DaoUser();
        
        String nomUser = "";
        
        for(Puntuacion puntuacion : iDaoPuntuacion.verPuntuacion()){
            for(ModeloUsuario usuario : iDaoUser.verUsuarios()){
                nomUser = usuario.getNombre_usuario() + " " + usuario.getApellido_usuario();
                if(nomUser.equals(nombre) && usuario.getId_estudiante() == puntuacion.getIdEstudiante()){
                    vistadiagnostico.BarraProgreso.setValue((100*Integer.parseInt(puntuacion.getPuntuacion())/4));
                    vistadiagnostico.BarraProgreso.setVisible(true);
                    vistadiagnostico.txtBarra.setText("Usted ya ha realizado la prueba");
                    vistadiagnostico.txtBarra.setVisible(true);
                    vistadiagnostico.btnVolver.setVisible(true);
                    vistadiagnostico.btnGuardar.setVisible(false);
                }
            }
        }
        
        vistadiagnostico.setVisible(true);
    }
    
    
    public void volver(){
        vistadiagnostico.setVisible(false);
        ControladorModulos.inicio(nombre);
    }

    public void hidden() {
        //vistamodulos.setVisible(false);
        vistadiagnostico.dispose();
    }

    public void exit() {
        hidden();
        ControladorLogout.visible();
    }

    
}
