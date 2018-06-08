/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.poli.Reservas.dao.impl;

import com.co.poli.Reservas.dao.IHabitacionDao;
import com.co.poli.Reservas.data.HabitacionData;
import com.co.poli.Reservas.model.Habitacion;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sala305
 */
@Repository
public class HabitacionDaoImpl implements IHabitacionDao {

    @Override
    public List<Habitacion> obtenerHabitaciones() {
        return HabitacionData.getListado();
    }

    @Override
    public Habitacion obtenerHabitacion(String codigo) {
        Habitacion habitacion = null;
        List<Habitacion> listado = HabitacionData.getListado();
        for (Habitacion est : listado) {
            if (est.getIdhabitacion().equals(codigo)) {
                habitacion = est;
            }
        }
        return habitacion;
    }

    @Override
    public String crearHabitacion(Habitacion habitacion) {
        String respuesta = "Movimiento Registrado";
        List<Habitacion> listado = HabitacionData.getListado();
        listado.add(habitacion);
        HabitacionData.setListado(listado);
        return respuesta;
    }

}
