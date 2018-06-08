/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.poli.Reservas.business.impl;

import com.co.poli.Reservas.business.IReservaBusiness;
import com.co.poli.Reservas.dao.IHabitacionDao;
import com.co.poli.Reservas.dao.IReservaDao;
import com.co.poli.Reservas.data.ReservaData;
import com.co.poli.Reservas.model.Habitacion;
import com.co.poli.Reservas.model.Reserva;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class ReservaBusinessImpl implements IReservaBusiness {

    @Autowired
    private IReservaDao reservaDao;
    @Autowired
    private IHabitacionDao habitacionDao;

    @Override
    public List<Reserva> obtenerReservas() {
        return reservaDao.obtenerReservas();
    }

    @Override
    public String crearReserva(Reserva reserva) {
        String respuesta = "Reserva Ya Registrado";
        List<Reserva> listado = ReservaData.getListado();
        Double disponibilidadC = 0D;
        if (!listado.contains(reserva)) {
            Habitacion habitacion = habitacionDao.obtenerHabitacion(reserva.getHabitacion().getIdhabitacion());
            if (habitacion != null) {
                if (reserva.getNumcamas() > 0D) {
                    Double camasOcup = 0D;
                    for (Reserva r : listado) {
                        if (r.getHabitacion().equals(reserva.getHabitacion())) {
                            camasOcup = camasOcup + r.getNumcamas();
                        }
                    }
                    if ((camasOcup + reserva.getNumcamas() <= habitacion.getNucamas())) {
                        if (reserva.getHabitacion().getTipohabitacion().equals("Privada")) {
                            reserva.setNumcamas(4D);
                            reserva.setPrecioxcama(50000D);
                            respuesta = reservaDao.crearReserva(reserva);
                        }
                        if (reserva.getHabitacion().getTipohabitacion().equals("Compartida")) {

                            reserva.setNumcamas(reserva.getNumcamas());
                            reserva.setPrecioxcama(30000D);
                        }
                    }
                } else {
                    respuesta = "La reserva de habitación debe ser al menos 0";
                }
            } else {
                respuesta = "Habitación inexistente";
            }
        }
        return respuesta;
    }

    @Override
    public Double valorHabitacionesPriOcu() {
        
        
        return 0D;
    }

    
}
