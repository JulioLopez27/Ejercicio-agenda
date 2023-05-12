/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import dominio.UsuarioAdministrador;
import dominio.UsuarioAgenda;
import dominio.UsuarioGenerico;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Julio Cesar
 */
public class ServicioUsuarios {

    private List<UsuarioAgenda> usuariosAgenda;
    private List<UsuarioAdministrador> usuariosAdministrador;

    public ServicioUsuarios() {
        usuariosAgenda = new ArrayList<>();
        usuariosAdministrador = new ArrayList<>();
    }

    public UsuarioAgenda loginAgenda(String usuario, String password) {
        return (UsuarioAgenda)this.loginUsuario(usuario, password, (ArrayList)usuariosAgenda);
    }

    public UsuarioAdministrador loginAdministrador(String usuario, String password) {
        return (UsuarioAdministrador)this.loginUsuario(usuario, password, (ArrayList)usuariosAdministrador);
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

    private UsuarioGenerico loginUsuario(String usuario, String password, List<UsuarioGenerico> listaUsuarios) {
        for (UsuarioGenerico u : listaUsuarios) {
            if (u.getNombre().equals(usuario) && u.esPasswordValida(password)) {
                return u;
            }
        }
        return null;
    }

    //TODO: reactivar codigo de ser necesario verificar si ya existe un usuairo con 
    //datos iguales
//    private boolean existeUsuario(UsuarioAgenda user) {
//        for (UsuarioAgenda usuario : usuarios) {
//            if (usuario.existeUsuario(user)) {
//                return true;
//            }
//        }
//        return false;
//    }
}
