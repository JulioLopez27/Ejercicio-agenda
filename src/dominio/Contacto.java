/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author Julio Cesar
 */
public class Contacto {

    private TipoContacto tipoContacto;
    private String nombre;
    private Telefono telefono;

    public Contacto(TipoContacto tipoContacto, String nombre, Telefono telefono) {
        this.tipoContacto = tipoContacto;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public Contacto() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoContacto getTipoContacto() {
        return tipoContacto;
    }

    public void setTipoContacto(TipoContacto tipoContacto) {
        this.tipoContacto = tipoContacto;
    }

    public Telefono getTelefono() {
        return telefono;
    }

    public void setTelefono(Telefono telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Telefono: " + telefono + " ";
    }

    public boolean validar() {
        return esNombreValido() && esTelefonoValido() && esTipoContactoValido();
    }

    private boolean esNombreValido() {
        return this.getNombre() != null && !this.getNombre().trim().isEmpty();
    }

    private boolean esTelefonoValido() {
        return this.getTelefono() != null && this.getTelefono().esValido();
    }

    private boolean esTipoContactoValido() {
        return this.getTipoContacto() != null;
    }

    public boolean contiene(String criterio) {
        if (this.getNombre().toUpperCase().contains(criterio.toUpperCase())
                || this.getTelefono().contiene(criterio)) {
            return true;
        }
        return false;
    }

}
