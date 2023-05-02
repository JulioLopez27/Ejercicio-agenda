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

    public boolean agregarContacto(Contacto contacto) {
        if (contacto != null) {
            contactos.add(contacto);
            return true;
        }
        return false;
    }

    public void agregarContactoDatosPrueba(Contacto c) {
        contactos.add(c);
    }
}
