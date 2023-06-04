/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author Julio Cesar
 */
public class UsuarioAgenda extends UsuarioGenerico {

    private Agenda agenda;

    public UsuarioAgenda(String nombre,String password,Agenda agenda){
        this.setNombre(nombre);
        this.setPassword(password);
        this.agenda=agenda;
    }
    
    public UsuarioAgenda() {
    }

    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
    }

    public Agenda getAgenda() {
        return agenda;
    }

   
}
