/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import dominio.TipoContacto;
import java.util.ArrayList;

/**
 *
 * @author Julio Cesar
 */
public class ServicioTipoContacto {

    private ArrayList<TipoContacto> tipoContactos = new ArrayList<>();

    public ArrayList<TipoContacto> getTipoContactos() {
        return tipoContactos;
    }

    public boolean agregar(TipoContacto tc) {
        if (tc != null) {
            tipoContactos.add(tc);
            return true;
        }
        return false;
    }

}
