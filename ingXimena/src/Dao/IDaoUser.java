package Dao;

import Modelos.ModeloUsuario;
import java.util.ArrayList;

public interface IDaoUser {

    boolean createUser(ModeloUsuario userUsuario);

    ArrayList<ModeloUsuario> verUsuarios();
    
    ArrayList<ModeloUsuario> nameUser(ModeloUsuario userUsuario);
}
