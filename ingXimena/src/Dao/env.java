package Dao;

public class env {

    //variables para conexion
    public static final String USER = "root";
    public static final String PASSWORD = "";
    public static final String DATABASE = "educativo";
    public static final String HOST = "jdbc:mysql://localhost:3306/";
    //variables para las tablas
    
    //Tabla User
    public static final String T_USER="usario";
    public static final String ID_USER= "id_usuario";
    public static final String NOMBRE_USER="nombre_usuario";
    public static final String LASTNAME_USER="apellido_usuario";
    public static final String EMAIL_USER="email_usuario";
    public static final String PASSWORD_USER="pass_usuario";
    
    //Tabla Puntuacion
    public static final String T_PUNTUACION="puntuacion";
    public static final String TP_IDESTUDIANTE= "id_estudiante";
    public static final String TP_IDEJERCICIO="id_ejercicio";
    public static final String TP_PUNTUACION="puntuacion";
    
    
    //tabla info
    public static final String T_INFO="informacion";
    public static final String TI_ID= "id_informacion";
    public static final String TI_TITULO= "titulo";
    public static final String TI_CUERPO="cuerpo";
    

}
