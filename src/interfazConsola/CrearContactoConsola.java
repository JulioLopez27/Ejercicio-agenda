/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfazConsola;

import dominio.Agenda;
import dominio.Contacto;
import dominio.TipoContacto;
import dominio.Usuario;
import java.util.ArrayList;
import servicios.Fachada;
import utilidades.Consola;

/**
 *
 * @author Julio Cesar
 */
public class CrearContactoConsola {

    private Usuario usuario;
    private Agenda agenda;

    public CrearContactoConsola(Usuario user) {
        usuario = user;
        agenda=user.getAgenda();
    }

    public void ejecutar() {
        Consola.println("Bienvenido " + usuario);
        Consola.println("Cantidad de contactos: " + agenda.getCantidadContactos());
        mostrarContactos();
        crearContacto();
    }

    private void mostrarContactos() {
        Consola.println("");
        Consola.titulo("Lista de contactos");

        ArrayList<Contacto> contactos = agenda.getContactos();
        for (Contacto c : contactos) {
            Consola.println("Nombre: " + c.getNombre() + "- Telefono: " + c.getTelefono() + "- Tipo contacto: " + c.getTipoContacto());
        }
        Consola.println("");
    }

    private void crearContacto() {
        Consola.titulo("Registrar contacto");

       
        String nombre=Consola.leer("Nombre: ");
        String telefono=Consola.leer("Telefono: ");

        //array con las opciones de los tipos de contactos
        ArrayList<TipoContacto> tiposContactos = Fachada.getInstancia().getTiposContactos();
        //muestro las opciones para obtener el indice
        int tipoContactoSeleccionado = Consola.menu(tiposContactos);
        //obtengo cual es el valor respecto al indice
        TipoContacto tc = tiposContactos.get(tipoContactoSeleccionado);
        

        String confirmar = Consola.leer("Desea registrar el nuevo contacto?(s/n) ");
        if (!"s".equals(confirmar)) {
            return;
        }

        if (agenda.agregarContacto(tc,nombre,telefono)) {
            Consola.println("Se agrego correctamente el contacto");
            mostrarContactos();
        } else {
            Consola.println("No se registro correctamente el contacto");
        }

    }

}
