/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author Julio Cesar
 */
public class UsuarioAgenda {

    private String nombre;
    private String password;
    private Agenda agenda;

    public UsuarioAgenda(String nombre, String password, Agenda agenda) {
        this.nombre = nombre;
        this.password = password;
        this.agenda = agenda;
    }

    public UsuarioAgenda() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
    }

    public Agenda getAgenda() {
        return agenda;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return nombre;
    }

    public boolean validarCredenciales(String username, String password) {

        if (username == null || password == null || username.isBlank() || password.isBlank()) {
            return false;
        }

        int largoMaximoPassword = 20;
        if (password.length() > largoMaximoPassword) {
            return false;
        }

        return true;
    }

    public boolean compararUsuarios(String username, String password) {
        return this.nombre.equals(username) && this.password.equals(password);
    }

    public boolean existeUsuario(UsuarioAgenda user) {
        return compararUsuarios(user.nombre, user.password);
    }

}
