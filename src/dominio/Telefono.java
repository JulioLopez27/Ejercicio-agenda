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

    public String getNumero() {
        return numero;
    }

    public TipoTelefono getTipoTelefono() {
        return tipoTelefono;
    }

    public boolean validar() {
        //se valida en secuencia, para no tener un nullPointerException en caso de poner
        // la validacion de numero en ultimo lugar, por ej.
        return numero != null && tipoTelefono != null && tipoTelefono.esValido(numero);
    }
}
