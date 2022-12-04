package Dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexionSQL {

    Connection conn = null;

    //Conexion y captura de errores en la conexión
    public conexionSQL() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(env.HOST + env.DATABASE, env.USER, env.PASSWORD);
            if (conn != null) {
                System.out.println("conexion exitosa");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    public Connection getConnection() {
        return conn;
    }
}