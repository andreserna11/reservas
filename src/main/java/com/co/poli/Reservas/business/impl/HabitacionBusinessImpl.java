/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.poli.Reservas.business.impl;

import com.co.poli.Reservas.business.IHabitacionBusiness;
import com.co.poli.Reservas.dao.IHabitacionDao;
import com.co.poli.Reservas.data.HabitacionData;
import com.co.poli.Reservas.model.Habitacion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabitacionBusinessImpl implements IHabitacionBusiness {

    @Autowired
    private IHabitacionDao habitacionDao;

    @Override
    public List<Habitacion> obtenerHabitaciones() {
        return habitacionDao.obtenerHabitaciones();
    }

    @Override
    public String crearHabitacion(Habitacion habitacion) {
        String respuesta = "";
        List<Habitacion> listado = HabitacionData.getListado();
        if (!listado.contains(habitacion)) {
            if (habitacion.getTipohabitacion().equals("Privada") || habitacion.getTipohabitacion().equals("Compartida")) {
                if (habitacion.getTipohabitacion().equals("Privada")) {
                    if (habitacion.getNucamas() >= 2 && habitacion.getNucamas() <= 4) {
                        respuesta = habitacionDao.crearHabitacion(habitacion);
                    } else {
                        respuesta = "El número minímo de camas es de 2 y un máximo de 4";
                    }
                }
                if (habitacion.getTipohabitacion().equals("Compartida")) {
                    if (habitacion.getNucamas() >= 4 && habitacion.getNucamas() <= 10) {
                        respuesta = habitacionDao.crearHabitacion(habitacion);
                    } else {
                        respuesta = "El número minímo de camas es de 4 y un máximo de 10";
                    }
                }
            }else {
                respuesta = "Tipo de habitación invalido";
            }

            respuesta = habitacionDao.crearHabitacion(habitacion);
        }
        return respuesta;
    }
}
