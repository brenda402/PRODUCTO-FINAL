package Controladores;

import Dao.DaoUser;
import Dao.IDaoUser;
import Modelos.ModeloUsuario;
import Vistas.Vistalogin;
import javax.swing.JOptionPane;

public class ControladorLogin {

    static Vistalogin vistalogin = new Vistalogin();
    static ModeloUsuario modeloUsuario = new ModeloUsuario();

    public static void inicio() {
        vistalogin.Email.setText("");
        vistalogin.password.setText("");
        vistalogin.setVisible(true);
    }
     public static void hidden() {
        vistalogin.setVisible(false);
    }
     
    
    public static void btn_registrar(){
        ControladorCreate.inicio();
    } 
     
    public static void btn_entrar() {
        String email = vistalogin.getEmail().getText();
        String pass = vistalogin.getPassword().getText();
        if (email.equals("") || pass.equals("")) {
            JOptionPane.showMessageDialog(vistalogin, "Rellene los espacios");
        }
        else{
            IDaoUser iDaoUser = new DaoUser();
            for(ModeloUsuario usuario : iDaoUser.verUsuarios()){
                if(usuario.getEmail_usuario().equals(email) && usuario.getPass_usuario().equals(pass)){
                    hidden();
                    ControladorModulos.inicio("" + usuario.getNombre_usuario() + " " + usuario.getApellido_usuario());
                }
            }
        }
       
    }
        
    
}
