/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author Julio Cesar
 */
public class TipoContacto {

    private String nombre;

    public TipoContacto(String nombre) {
        this.nombre = nombre;
    }

    public TipoContacto() {
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }

   
}
