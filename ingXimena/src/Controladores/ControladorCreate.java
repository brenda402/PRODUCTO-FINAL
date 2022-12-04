/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Dao.DaoUser;
import Dao.IDaoUser;
import Modelos.ModeloUsuario;
import Vistas.VistaCreate;
import javax.swing.JOptionPane;


public class ControladorCreate {
    
    static VistaCreate vistacreate = new VistaCreate();
   // static ModeloUsuario modeloUsuario = new ModeloUsuario();
        
    public static void inicio() {
        vistacreate.getNombre().setText("");
        vistacreate.getApellido().setText("");
        vistacreate.getEmail().setText("");
        vistacreate.getPassword().setText("");
        vistacreate.setVisible(true);
    }
    
     public static void hidden() {
        vistacreate.setVisible(false);
    }
    
    public static void btn_crear(){
        
        String nombre = vistacreate.getNombre().getText();
        String apellido = vistacreate.getApellido().getText();
        String email = vistacreate.getEmail().getText();
        String password = vistacreate.getPassword().getText();
        
        if (nombre.equals("") || apellido.equals("")|| email.equals("") || password.equals("")){
            JOptionPane.showMessageDialog(vistacreate, "Rellene los espacios");
        }
        else{
            IDaoUser iDaoUser = new DaoUser();
            ModeloUsuario usuario = new ModeloUsuario();
            
            usuario.setNombre_usuario(nombre);
            usuario.setApellido_usuario(apellido);
            usuario.setEmail_usuario(email);
            usuario.setPass_usuario(password);
            
            if(iDaoUser.createUser(usuario)){
                JOptionPane.showMessageDialog(null, "Usuario registrado con éxito");
                hidden();
        
                ControladorLogin.inicio();
            }
            else{
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error");
            }
        }
        
        
        
    }
    
}
