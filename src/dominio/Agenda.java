package dominio;

import exception.AgendaException;
import java.util.ArrayList;
import observer.Observable;

public class Agenda extends Observable {

    private UsuarioAgenda usuarioAgenda;

    public Agenda() {
    }

    public Agenda(UsuarioAgenda usuario) {
        this.usuarioAgenda = usuario;
    }

    ArrayList<Contacto> contactos = new ArrayList<>();

    public ArrayList<Contacto> getContactos() {
        return contactos;
    }

    public int getCantidadContactos() {
        return contactos.size();
    }

    public boolean agregarContacto(TipoContacto tc, String nombre, Telefono telefono) throws AgendaException {
        Contacto contacto = new Contacto(tc, nombre, telefono);
        //bubble up
        contacto.validar();
        contactos.add(contacto);
        this.notificar(Evento.AGENDA_ACTUALIZADA);
        return true;

    }

    public void agregarContactoDatosPrueba(Contacto c) {
        contactos.add(c);
    }

    //pre:Cadena vacia muestro todos los contactos del usuario
    public ArrayList<Contacto> obtenerContactos(String cadena) {
        //verifico si la cadena de busqueda es vacia
        return cadena.isEmpty()
                ? devolverTodosLosContactos()
                : contactosContienenCadena(cadena);
    }

    private ArrayList<Contacto> devolverTodosLosContactos() {
        ArrayList<Contacto> contactosADevolver = new ArrayList<>();
        if (!this.getContactos().isEmpty()) {
            for (Contacto contacto : this.getContactos()) {
                contactosADevolver.add(contacto);
            }
        }
        return contactosADevolver;
    }

    private ArrayList<Contacto> contactosContienenCadena(String cadena) {
        ArrayList<Contacto> contactosADevolver = new ArrayList<>();
        for (Contacto c : this.getContactos()) {
            if (c.contiene(cadena)) {
                contactosADevolver.add(c);
            }
        }
        return contactosADevolver;
    }

    public Contacto contactoSeleccionado(String nombre) {
        Contacto c = null;
        if (!nombre.isEmpty()) {
            for (Contacto contacto : this.getContactos()) {
                if (contacto.getNombre().equals(nombre)) {
                    c = contacto;
                }
            }
        }

        return c;
    }
}
