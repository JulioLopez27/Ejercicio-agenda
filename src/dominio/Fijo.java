/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author Julio Cesar
 */
public class Fijo extends TipoTelefono {

    public Fijo(String nombre) {
        super(nombre);
    }

    public Fijo() {
        super("Fijo");
    }

    @Override
    public boolean esValido(String numero) {
        return numero.length() == 8 && esNumerico(numero);
    }

}
