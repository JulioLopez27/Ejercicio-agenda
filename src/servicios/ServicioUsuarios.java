/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import dominio.UsuarioAgenda;
import java.util.ArrayList;

/**
 *
 * @author Julio Cesar
 */
public class ServicioUsuarios {

    private ArrayList<UsuarioAgenda> usuarios = new ArrayList<>();

    public UsuarioAgenda login(String username, String password) {
        UsuarioAgenda user = null;
        for (UsuarioAgenda usuario : usuarios) {

            if (usuario.compararUsuarios(username, password)) {
                user = usuario;
            }
        }

        return user;
    }

    private ArrayList<UsuarioAgenda> getUsuarios() {
        return usuarios;
    }

    public boolean agregar(UsuarioAgenda user) {

        if (user != null && !existeUsuario(user)) {
            usuarios.add(user);
            return true;
        }

        return false;
    }

    private boolean existeUsuario(UsuarioAgenda user) {
        for (UsuarioAgenda usuario : usuarios) {
            if (usuario.existeUsuario(user)) {
                return true;
            }
        }
        return false;
    }

}
