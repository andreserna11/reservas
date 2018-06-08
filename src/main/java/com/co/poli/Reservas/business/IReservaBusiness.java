/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.poli.Reservas.business;

import com.co.poli.Reservas.model.Reserva;
import java.util.List;

/**
 *
 * @author sala305
 */
public interface IReservaBusiness {

    public List<Reserva> obtenerReservas();

    public String crearReserva(Reserva reserva);
    
    public Double valorHabitacionesPriOcu();
}
