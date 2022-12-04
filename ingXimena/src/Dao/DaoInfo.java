/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Modelos.InfoPanel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Eduar Xavier
 */
public class DaoInfo extends conexionSQL implements IDaoInfo{

    @Override
    public ArrayList<InfoPanel> verInfo() {
        ArrayList<InfoPanel> arrayListInfo = new ArrayList<>();
        
        
        String sql = "Select *  from " + env.T_INFO;
        
         try {
            PreparedStatement ps = getConnection().prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();
            while(resultSet.next()) {
                
                InfoPanel info = new InfoPanel();
        
                info.setIdInfo(resultSet.getInt(env.TI_ID));
                info.setTitulo(resultSet.getString(env.TI_TITULO));
                info.setCuerpo(resultSet.getString(env.TI_CUERPO));
                
                arrayListInfo.add(info);
            }
            return  arrayListInfo;
        } catch (SQLException e) {
            System.out.println("Error al leer los datos " + e.getMessage());
            return  arrayListInfo;
        } finally {
            try {
                getConnection().close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexion " + e);
            }
        }
    }
    
    
}
