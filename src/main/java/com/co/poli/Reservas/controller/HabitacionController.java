/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.poli.Reservas.controller;

import com.co.poli.Reservas.business.IHabitacionBusiness;
import com.co.poli.Reservas.model.Habitacion;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sala305
 */
@RestController
@RequestMapping(value = "/")
public class HabitacionController {

    @Autowired
    private IHabitacionBusiness habitacionBusiness;

    @GetMapping("habitaciones")
    public List<Habitacion> obtenerHabitaciones(HttpServletResponse hsr) {
        return habitacionBusiness.obtenerHabitaciones();
    }

    @PostMapping("habitacion")
    public String crearHabitacion(@RequestBody Habitacion habitacion, HttpServletResponse hsr) {
        return habitacionBusiness.crearHabitacion(habitacion);
    }
}
