/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author Julio Cesar
 */
public abstract class UsuarioGenerico {

    private String nombre;
    private String password;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean esPasswordValida(String password) {
        return this.password.equals(password);
    }
    
    
     public boolean compararUsuarios(String username, String password) {
        return this.nombre.equals(username) && this.password.equals(password);
    }

     //TODO: refactorizar codigo
//     public boolean existeUsuario(UsuarioAgenda user) {
//        return compararUsuarios(user.getNombre(), user.get);
//    }
}
