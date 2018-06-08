/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.poli.Reservas.data;

import com.co.poli.Reservas.model.Habitacion;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sala305
 */
public class HabitacionData {

    private static List<Habitacion> listado;

    static {
        listado = new ArrayList<Habitacion>() {
            {
                add(new Habitacion("1", "Privada", 4D));
                add(new Habitacion("2", "Compartida", 10D));
                add(new Habitacion("3", "Privada", 3D));
            }
        };
    }

    public static List<Habitacion> getListado() {
        return listado;
    }

    public static void setListado(List<Habitacion> listado) {
        HabitacionData.listado = listado;
    }

}
