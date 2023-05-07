/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import dominio.TipoContacto;
import dominio.TipoTelefono;
import java.util.ArrayList;

/**
 *
 * @author Julio Cesar
 */
public class ServicioAgenda {

    private ArrayList<TipoContacto> tipoContactos = new ArrayList<>();
    private ArrayList<TipoTelefono> tipoTelefonos = new ArrayList<>();

    public ArrayList<TipoTelefono> getTipoTelefonos() {
        return tipoTelefonos;
    }

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

    public boolean agregar(TipoTelefono tt) {
        if (tt != null) {
            tipoTelefonos.add(tt);
            return true;
        }
        return false;
    }
}
