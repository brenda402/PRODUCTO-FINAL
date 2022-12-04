/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

/**
 *
 * @author Denilson
 */
public class ControladorLogout {
    
    static Vistas.Vistalogin v = new Vistas.Vistalogin();
    
    public static void visible(){
        v.setVisible(true);
    }
    
    public static void hidden(){
        v.dispose();
    }
    
    
    
}
