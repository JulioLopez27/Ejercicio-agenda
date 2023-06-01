/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package observer;

import observer.Observable.Evento;

/**
 *
 * @author Julio Cesar
 */
public interface Observer {
    public void notificar(Observable origen, Evento event);
}
