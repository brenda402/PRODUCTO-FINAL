
package Modelos;

public class ModeloUsuario {

    private int id_estudiante;
    private int id_rol;
    private String nombre_usuario;
    private String apellido_usuario;
    private String email_usuario;
    private String pass_usuario;

    public ModeloUsuario() {
        
    }

    public ModeloUsuario(int id_estudiante, int id_rol, String nombre_usuario, String apellido_usuario, String email_usuario, String pass_usuario) {
        this.id_estudiante = id_estudiante;
        this.id_rol = id_rol;
        this.nombre_usuario = nombre_usuario;
        this.apellido_usuario = apellido_usuario;
        this.email_usuario = email_usuario;
        this.pass_usuario = pass_usuario;
    }

    public int getId_estudiante() {
        return id_estudiante;
    }

    public void setId_estudiante(int id_estudiante) {
        this.id_estudiante = id_estudiante;
    }

    public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getApellido_usuario() {
        return apellido_usuario;
    }

    public void setApellido_usuario(String apellido_usuario) {
        this.apellido_usuario = apellido_usuario;
    }

    public String getEmail_usuario() {
        return email_usuario;
    }

    public void setEmail_usuario(String email_usuario) {
        this.email_usuario = email_usuario;
    }

    public String getPass_usuario() {
        return pass_usuario;
    }

    public void setPass_usuario(String pass_usuario) {
        this.pass_usuario = pass_usuario;
    }

   

}
