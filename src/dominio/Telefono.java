/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author Julio Cesar
 */
public class Telefono {

    private String numero;
    private TipoTelefono tipoTelefono;

    public Telefono(String numero, TipoTelefono tipoTelefono) {
        this.numero = numero;
        this.tipoTelefono = tipoTelefono;
    }

    public String getNumero() {
        return numero;
    }

    public TipoTelefono getTipoTelefono() {
        return tipoTelefono;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setTipoTelefono(TipoTelefono tipoTelefono) {
        this.tipoTelefono = tipoTelefono;
    }

    public boolean esValido() {
        //se valida en secuencia, para no tener un nullPointerException en caso de poner
        // la validacion de numero en ultimo lugar, por ej.
        return numero != null && tipoTelefono != null && tipoTelefono.esValido(numero);
    }

    public boolean contiene(String criterio) {
        return numero.contains(criterio) || tipoTelefono.getNombre().contains(criterio);
    }

    @Override
    public String toString() {
        return numero;
    }

}
