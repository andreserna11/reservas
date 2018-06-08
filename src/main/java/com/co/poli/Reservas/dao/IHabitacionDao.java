/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.poli.Reservas.dao;

import com.co.poli.Reservas.model.Habitacion;
import java.util.List;

/**
 *
 * @author sala305
 */
public interface IHabitacionDao {

    public List<Habitacion> obtenerHabitaciones();

    public Habitacion obtenerHabitacion(String codigo);

    public String crearHabitacion(Habitacion habitacion);

}
