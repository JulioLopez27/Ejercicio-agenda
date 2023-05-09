package main;

import interfazSwing.IuEntrada;


public class AgendaConsola {

    public static void main(String[] args) throws Exception {
        DatosPrueba.cargar();
//---------Logica para la interfaz con swing
        IuEntrada system = new IuEntrada();
        system.setVisible(true);

    }

}
