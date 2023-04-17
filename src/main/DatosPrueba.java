package main;

import dominio.Agenda;
import dominio.Contacto;
import dominio.TipoContacto;
import dominio.Usuario;
import servicios.Fachada;

public class DatosPrueba {

    public static void cargar() {

        TipoContacto particular = new TipoContacto("Particular");
        TipoContacto laboral = new TipoContacto("Laboral");
        TipoContacto familiar = new TipoContacto("Familiar");

        Fachada.getInstancia().agregarTipoContacto(particular);
        Fachada.getInstancia().agregarTipoContacto(laboral);
        Fachada.getInstancia().agregarTipoContacto(familiar);
//
////creacion de contactos
//        Contacto con1 = new Contacto(particular, "Contacto1", "12345678");
//        Contacto con2 = new Contacto(familiar, "Contacto2", "24681012");
//        Contacto con3 = new Contacto(laboral, "Contacto3", "1357911");
//
//        Fachada.getInstancia().agregarContacto(con1);
//        Fachada.getInstancia().agregarContacto(con2);
//        Fachada.getInstancia().agregarContacto(con3);
      
//creacion agenda
        Agenda ag1 = new Agenda();
        Agenda ag2 = new Agenda();
        Agenda ag3=new Agenda();

//creacion usuario
        Usuario user1 = new Usuario("user1", "user1", ag1);
        Usuario user2 = new Usuario("user2", "user2", ag2);
        Fachada.getInstancia().agregarUsuario(user1);
        Fachada.getInstancia().agregarUsuario(user2);
    }
}
