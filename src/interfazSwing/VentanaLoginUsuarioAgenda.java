/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfazSwing;

import dominio.Sesion;
import dominio.UsuarioAgenda;
import dominio.UsuarioGenerico;
import java.awt.Frame;
import servicios.Fachada;

/**
 *
 * @author Julio Cesar
 */
public class VentanaLoginUsuarioAgenda extends VentanaLogin {

    public VentanaLoginUsuarioAgenda(Frame parent, boolean modal) {
        super(parent, modal);
    }

    @Override
    protected String getSubtitulo() {
        return "Bienvenido usuario Agenda";
    }

    @Override
    protected UsuarioGenerico validarUsuario(String usuario, String password) {
        Sesion sesion = Fachada.getInstancia().loginUsuarioAgenda(usuario, password);
        return sesion != null
                ? sesion.getUsuarioAgenda()
                : null;
    }

    @Override
    protected void ejecutarProximoCasoDeUso(UsuarioGenerico usuario) {
        new VentanaAgenda(null, false, (UsuarioAgenda) usuario).setVisible(true);
    }

}
