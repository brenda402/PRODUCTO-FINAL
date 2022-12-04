/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Modelos.Puntuacion;
import java.util.ArrayList;

/**
 *
 * @author Eduar Xavier
 */
public interface IDaoPuntuacion {
    public ArrayList<Puntuacion> verPuntuacion();
    
    public boolean addPuntuacion(Puntuacion puntuacion);
}
