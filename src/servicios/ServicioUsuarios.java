/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import dominio.Sesion;
import dominio.UsuarioAdministrador;
import dominio.UsuarioAgenda;
import dominio.UsuarioGenerico;
import java.util.ArrayList;
import java.util.List;
import observer.Observable;

/**
 *
 * @author Julio Cesar
 */
public class ServicioUsuarios {

    private List<UsuarioAgenda> usuariosAgenda;
    private List<UsuarioAdministrador> usuariosAdministrador;
    private List<Sesion> sesiones;

    public ServicioUsuarios() {
        usuariosAgenda = new ArrayList<>();
        usuariosAdministrador = new ArrayList<>();
        sesiones = new ArrayList<>();
    }

    private void agregar(Sesion sesion) {
        sesiones.add(sesion);
        //le aviso a la fachada para que ejecute el notificar
        Fachada.getInstancia().notificar(Observable.Evento.LISTA_SESIONES_ACTUALIZADA);
    }

    public void cerrar(UsuarioAgenda user) {
        for (Sesion s : sesiones) {
            if (s.getUsuarioAgenda().equals(user)) {
                sesiones.remove(s);
                Fachada.getInstancia().notificar(Observable.Evento.LISTA_SESIONES_ACTUALIZADA);
            }
            break;
        }
    }

    public boolean agregar(UsuarioAgenda user) {
        if (user != null) {
            usuariosAgenda.add(user);
            return true;
        }
        return false;
    }

    public boolean agregar(UsuarioAdministrador userAdmin) {
        if (userAdmin != null) {
            usuariosAdministrador.add(userAdmin);
            return true;
        }
        return false;
    }

    public Sesion loginUsuarioAgenda(String usuario, String password) {
        UsuarioAgenda usuarioLogueado = (UsuarioAgenda) this.loginUsuario(usuario, password, (ArrayList) usuariosAgenda);
        if (usuarioLogueado != null) {
            Sesion sesion = new Sesion(usuarioLogueado);
            this.agregar(sesion);
            return sesion;
        }
        return null;
    }

    public UsuarioAdministrador loginUsuarioAdministrador(String usuario, String password) {
        return (UsuarioAdministrador) this.loginUsuario(usuario, password, (ArrayList) usuariosAdministrador);
    }

    private UsuarioGenerico loginUsuario(String usuario, String password, List<UsuarioGenerico> listaUsuarios) {
        for (UsuarioGenerico u : listaUsuarios) {
            if (u.getNombre().equals(usuario) && u.esPasswordValida(password)) {
                return u;
            }
        }
        return null;
    }

    public List<Sesion> getSesionesActivas() {
        return sesiones;
    }
}
