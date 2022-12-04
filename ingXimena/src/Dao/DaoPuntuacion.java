/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Modelos.Puntuacion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Eduar Xavier
 */
public class DaoPuntuacion extends conexionSQL implements IDaoPuntuacion{

    @Override
    public ArrayList<Puntuacion> verPuntuacion() {
        
        ArrayList<Puntuacion> arrayListPuntuacion = new ArrayList<>();
        
        String sql = "SELECT * FROM " + env.T_PUNTUACION;
        
        try {
            PreparedStatement ps = getConnection().prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();
            if (resultSet.next()) {
                
                Puntuacion puntuacion = new Puntuacion();
                
                puntuacion.setIdEstudiante(resultSet.getInt(env.TP_IDESTUDIANTE));
                puntuacion.setIdEjercicio(resultSet.getInt(env.TP_IDEJERCICIO));
                puntuacion.setPuntuacion(resultSet.getString(env.TP_PUNTUACION));
                
                arrayListPuntuacion.add(puntuacion);
            }
            return  arrayListPuntuacion;
        } catch (SQLException e) {
            System.out.println("Error al leer los datos " + e.getMessage());
            return  arrayListPuntuacion;
        } finally {
            try {
                getConnection().close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexion " + e);
            }
        }
    }

    @Override
    public boolean addPuntuacion(Puntuacion puntuacion) {
        String sql = "INSERT INTO " + env.T_PUNTUACION + "(" + env.TP_IDESTUDIANTE + "," + env.TP_IDEJERCICIO + "," + env.TP_PUNTUACION + ") VALUES(?,?,?)";

        System.err.print(sql);
        try {
            PreparedStatement ps = getConnection().prepareStatement(sql);
            ps.setInt(1, puntuacion.getIdEstudiante());
            ps.setInt(2, puntuacion.getIdEjercicio());
            ps.setString(3, puntuacion.getPuntuacion());
            ps.executeUpdate();
            
          return true;
        } catch (SQLException e) {
            System.out.println("Error al crear " + e.getMessage());
        } finally {
            try {
                getConnection().close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexion " + e.getMessage());
            }
        }
        return false;
        
    
    }

    
    
    
}
