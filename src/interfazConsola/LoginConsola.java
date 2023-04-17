package interfazConsola;

import dominio.Usuario;
import servicios.Fachada;
import utilidades.Consola;

public class LoginConsola {

    public Usuario loguearUsuario() {

        Consola.titulo("Login");

        String username = Consola.leer("Ingrese su usuario: ");
        String password = Consola.leer("Ingrese su password: ");
        return Fachada.getInstancia().loginUsuario(username, password);
    }

    //TODO: logica agregar usuario
//    public Boolean Agegar(Usuario user){
//        return false;
//    }
}
