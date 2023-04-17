/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import dominio.Usuario;
import java.util.ArrayList;

/**
 *
 * @author Julio Cesar
 */
public class ServicioUsuarios {

    private ArrayList<Usuario> usuarios = new ArrayList<>();

    public Usuario login(String username, String password) {
        Usuario user = null;
        for (Usuario usuario : usuarios) {

            if (usuario.compararUsuarios(username, password)) {
                user = usuario;
            }
        }

        return user;
    }

    private ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public boolean agregar(Usuario user) {

        if (user != null && !existeUsuario(user)) {
            usuarios.add(user);
            return true;
        }

        return false;
    }

    private boolean existeUsuario(Usuario user) {
        for (Usuario usuario : usuarios) {
            if (usuario.existeUsuario(user)) {
                return true;
            }
        }
        return false;
    }

}
