package dominio;

import java.util.ArrayList;

public class Agenda {

    private Usuario usuario;

    public Agenda() {
    }

    public Agenda(Usuario usuario) {
        this.usuario = usuario;
    }

    ArrayList<Contacto> contactos = new ArrayList<>();

    public ArrayList<Contacto> getContactos() {
        return contactos;
    }

    public int getCantidadContactos() {
        return contactos.size();
    }

    public boolean agregarContacto(TipoContacto tc, String nombre, String telefono) {
        if (validar(nombre, telefono)) {
            contactos.add(new Contacto(tc, nombre, telefono));
            return true;
        }
        return false;
    }

    private boolean validar(String nombre, String telefono) {
        if (nombre == null || nombre.trim().isEmpty() && telefono == null || telefono.trim().isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    public void agregarContactoDatosPrueba(Contacto c) {
        contactos.add(c);
    }

    //pre:Cadena vacia muestro todos los contactos del usuario
    public ArrayList<Contacto> obtenerContactos(String cadena) {
        return cadena.isEmpty()
                ? devolverTodosLosContactos()
                : contactosContienenCadena(cadena);
    }

    private ArrayList<Contacto> devolverTodosLosContactos() {
        ArrayList<Contacto> contactos = new ArrayList<>();
        if (this.getContactos().size() == 0) {
            return contactos;
        }
        for (Contacto contacto : this.getContactos()) {
            contactos.add(contacto);
        }
        return contactos;
    }

    private ArrayList<Contacto> contactosContienenCadena(String cadena) {
        ArrayList<Contacto> contactosADevolver = new ArrayList<>();
        for (Contacto c : this.getContactos()) {
            if (c.getNombre().contains(cadena) || c.getTelefono().contains(cadena)) {
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
