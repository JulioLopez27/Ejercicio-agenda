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
        Contacto con1 = new Contacto(particular, "Contacto1", "12345678");
        Contacto con2 = new Contacto(familiar, "Contacto2", "24681012");
        Contacto con3 = new Contacto(laboral, "Contacto3", "1357911");

//creacion agenda
        Agenda ag1 = new Agenda();
        Agenda ag2 = new Agenda();

        //Agrego contacto a la agenda
        ag1.agregarContactoDatosPrueba(con1);
        ag1.agregarContactoDatosPrueba(con2);
        ag2.agregarContactoDatosPrueba(con3);
        
//creacion usuario
        Usuario user1 = new Usuario("julio", "julio", ag1);
        Usuario user2 = new Usuario("user2", "user2", ag2);
        
        Fachada.getInstancia().agregarUsuario(user1);
        Fachada.getInstancia().agregarUsuario(user2);

    }
}
