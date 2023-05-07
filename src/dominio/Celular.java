/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author Julio Cesar
 */
public class Celular extends TipoTelefono {

    public Celular(String nombre) {
        super(nombre);
    }

    public Celular() {
        super("Celular");
    }

    @Override
    public boolean esValido(String numero) {
        return numero.length() == 9 && esNumerico(numero) && numero.substring(0, 1).equals("09");
    }

}
