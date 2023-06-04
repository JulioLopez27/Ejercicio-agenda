/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfazSwing;

import dominio.UsuarioAdministrador;
import dominio.UsuarioGenerico;

import java.awt.Frame;
import servicios.Fachada;

/**
 *
 * @author Julio Cesar
 */
public class VentanaLoginUsuarioAdministrador extends VentanaLogin {

    public VentanaLoginUsuarioAdministrador(Frame parent, boolean modal) {
        super(parent, modal);
    }

    @Override
    protected String getSubtitulo() {
        return "Bienvenido usuario administrador";
    }

    @Override
    protected UsuarioGenerico validarUsuario(String usuario, String password) {
        return Fachada.getInstancia().loginUsuarioAdministrador(usuario, password);
    }

    @Override
    protected void ejecutarProximoCasoDeUso(UsuarioGenerico usuario) {
       new VentanaUsuariosConectados(null,false,(UsuarioAdministrador)usuario).setVisible(true);
    }

}
