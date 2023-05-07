/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author Julio Cesar
 */
public abstract class TipoTelefono {
    private String nombre;

    public TipoTelefono(String nombre) {
        this.nombre = nombre;
    }
public abstract boolean esValido(String numero);

    public String getNombre() {
        return nombre;
    }
    
    public boolean esNumerico(String texto){
        //trata de transformar el string a valor numerico
        Long numero;
        try {
            numero=Long.valueOf(texto);
        } catch (NumberFormatException e) {
            //no es string
            return false;
        }
        return numero>=0;
    }
    
}
