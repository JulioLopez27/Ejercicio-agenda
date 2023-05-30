/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.time.LocalDate;

/**
 *
 * @author Julio Cesar
 */
public class Sesion {

    private UsuarioAgenda usuarioAgenda;
    private LocalDate fechaIngreso;
    private LocalDate fechaLogout;

    public Sesion(UsuarioAgenda usuario) {
        this.usuarioAgenda = usuario;
        fechaIngreso = LocalDate.now();
    }

    public UsuarioAgenda getUsuarioAgenda() {
        return usuarioAgenda;
    }

    

}
