/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author Julio Cesar
 */
public class Internacional extends TipoTelefono {

    public Internacional(String nombre) {
        super(nombre);
    }

    public Internacional() {
        super("Internacional");
    }

    @Override
    public boolean esValido(String numero) {
        return  numero.matches("^(\\+|(0){2})[0-9\\s]{10,20}");
    }

}
