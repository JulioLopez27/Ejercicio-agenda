/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import dominio.Sesion;
import dominio.TipoContacto;
import dominio.TipoTelefono;
import dominio.UsuarioAdministrador;
import dominio.UsuarioAgenda;
import java.util.ArrayList;
import java.util.List;
import observer.Observable;

/**
 *
 * @author Julio Cesar
 */
public class Fachada extends Observable{

    ServicioUsuarios servicioUsuarios = new ServicioUsuarios();
    ServicioAgenda servicioAgenda = new ServicioAgenda();

    private static Fachada instancia = null;

    private Fachada() {
    }

    public static Fachada getInstancia() {
        if (instancia == null) {
            instancia = new Fachada();
        }
        return instancia;
    }

    
     public List<Sesion> getSesionesActivas() {
       return servicioUsuarios.getSesionesActivas();
     }
    
    public void cerrar(UsuarioAgenda user){
        servicioUsuarios.cerarar(user);
    }
    
    //Logica Usuarios -----------------
    public Sesion loginUsuarioAgenda(String username, String password) {
        return servicioUsuarios.loginUsuarioAgenda(username, password);
    }

    public UsuarioAdministrador loginUsuarioAdministrador(String usuario, String password) {
        return servicioUsuarios.loginUsuarioAdministrador(usuario, password);
    }

    public boolean agregar(UsuarioAgenda usuarioAgenda) {
        return servicioUsuarios.agregar(usuarioAgenda);
    }

    public boolean agregrar(UsuarioAdministrador usuarioAdministrador) {
        return servicioUsuarios.agregar(usuarioAdministrador);
    }

    //Logica agregar contacto
    //-------------------------------
    //Logica TipoContactos ------
    public ArrayList<TipoContacto> getTiposContactos() {
        return servicioAgenda.getTipoContactos();
    }

    public boolean agregar(TipoContacto tc) {
        return servicioAgenda.agregar(tc);
    }

    public boolean agregar(TipoTelefono tt) {
        return servicioAgenda.agregar(tt);
    }

    public ArrayList<TipoTelefono> getTipoTelefonos() {
        return servicioAgenda.getTipoTelefonos();
    }

   

}
