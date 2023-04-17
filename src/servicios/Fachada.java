/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import dominio.Contacto;
import dominio.TipoContacto;
import dominio.Usuario;
import java.util.ArrayList;

/**
 *
 * @author Julio Cesar
 */
public class Fachada {

    ServicioUsuarios servicioUsuarios = new ServicioUsuarios();
    ServicioTipoContacto servicioTipoContactos = new ServicioTipoContacto();

    private static Fachada instancia = null;

    private Fachada() {
    }

    public static Fachada getInstancia() {
        if (instancia == null) {
            instancia = new Fachada();
        }
        return instancia;
    }

    //Logica Usuarios -----------------
    public Usuario loginUsuario(String username, String password) {
        return servicioUsuarios.login(username, password);
    }

    public boolean agregarUsuario(Usuario user) {
        return servicioUsuarios.agregar(user);
    }

    //Logica agregar contacto
 
    
    //-------------------------------
    //Logica TipoContactos ------
    public ArrayList<TipoContacto> getTiposContactos() {
        return servicioTipoContactos.getTipoContactos();
    }

  
    public boolean agregarTipoContacto(TipoContacto tc) {
        return servicioTipoContactos.agregar(tc);
    }

  

}
