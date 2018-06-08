/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.poli.Reservas.controller;

import com.co.poli.Reservas.business.IReservaBusiness;
import com.co.poli.Reservas.model.Reserva;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author sala305
 */
public class ReservaController {

    @Autowired
    private IReservaBusiness reservaBusiness;

    @PostMapping("reservas")
    public String crearReserva(@RequestBody Reserva reserva, HttpServletResponse hsr) {
        return reservaBusiness.crearReserva(reserva);
    }

    @GetMapping("valorHabitaciones")
    public Double valorHabitacionesPriOcu(HttpServletResponse hsr) {
        return reservaBusiness.valorHabitacionesPriOcu();
    }
    
    @GetMapping("habitacionMasCostosa")
    public Double habitacionMasCostosa(HttpServletResponse hsr) {
        return reservaBusiness.habitacionMasCostosa();
    }
}
