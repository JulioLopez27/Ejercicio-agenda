package main;

import dominio.Agenda;
import dominio.Celular;
import dominio.Contacto;
import dominio.Fijo;
import dominio.Internacional;
import dominio.Telefono;
import dominio.TipoContacto;
import dominio.TipoTelefono;
import dominio.UsuarioAgenda;
import servicios.Fachada;

public class DatosPrueba {

    public static void cargar() {

        TipoContacto particular = new TipoContacto("Particular");
        TipoContacto laboral = new TipoContacto("Laboral");
        TipoContacto familiar = new TipoContacto("Familiar");

        Fachada.getInstancia().agregarTipoContacto(particular);
        Fachada.getInstancia().agregarTipoContacto(laboral);
        Fachada.getInstancia().agregarTipoContacto(familiar);

        TipoTelefono tt1 = new Celular();
        TipoTelefono tt2 = new Fijo();
        TipoTelefono tt3 = new Internacional();
        Fachada.getInstancia().agregar(tt1);
        Fachada.getInstancia().agregar(tt2);
        Fachada.getInstancia().agregar(tt3);

        Telefono tel1 = new Telefono("12345678", tt1);
        Telefono tel2 = new Telefono("46228867", tt2);
        Telefono tel3= new Telefono("00548255855",tt3);
////creacion de contactos
        Contacto con1 = new Contacto(particular, "Contacto1", tel1);
        Contacto con2 = new Contacto(familiar, "Contacto2", tel2);
        Contacto con3 = new Contacto(laboral, "Contacto3", tel3);

//creacion agenda
        Agenda ag1 = new Agenda();
        Agenda ag2 = new Agenda();

        //Agrego contacto a la agenda
        ag1.agregarContactoDatosPrueba(con1);
        ag1.agregarContactoDatosPrueba(con2);
        ag2.agregarContactoDatosPrueba(con3);

//creacion usuario
        UsuarioAgenda user1 = new UsuarioAgenda("julio", "julio", ag1);
        UsuarioAgenda user2 = new UsuarioAgenda("user2", "user2", ag2);

        Fachada.getInstancia().agregarUsuario(user1);
        Fachada.getInstancia().agregarUsuario(user2);

    }
}
