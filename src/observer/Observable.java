/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

import java.util.ArrayList;

/**
 *
 * @author Julio Cesar
 */
public class Observable {
      ArrayList<Observer> observadores= new ArrayList<>();
    
    
    public enum Evento{
       LISTA_SESIONES_ACTUALIZADA,
    }

    public Observable() {
    }
    
    public void suscribir(Observer o){
        this.observadores.add(o);
    }
    
    public void desuscribir(Observer o){
        this.observadores.remove(o);
    }
    
    public void notificar(Observable.Evento e ){
        for (Observer o : observadores) {
            o.notificar(this,e);
        }
    }
}
