package main;

import dominio.Usuario;
import interfazConsola.CrearContactoConsola;
import interfazConsola.LoginConsola;
import utilidades.Consola;

public class AgendaConsola {

    public static void main(String[] args) throws Exception {
        DatosPrueba.cargar();

        //inicializo consola para login
        LoginConsola loginConsola = new LoginConsola();
        //Recibo usuario o null
        Usuario user = loginConsola.loguearUsuario();

        if (user == null) {
            Consola.println("Datos no validos");

        } else {
            CrearContactoConsola contactoConsola = new CrearContactoConsola(user);
            contactoConsola.ejecutar();

        }

       
    }

}
