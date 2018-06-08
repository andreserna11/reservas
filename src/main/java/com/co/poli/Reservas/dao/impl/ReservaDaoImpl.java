/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.poli.Reservas.dao.impl;

import com.co.poli.Reservas.dao.IReservaDao;
import com.co.poli.Reservas.data.ReservaData;
import com.co.poli.Reservas.model.Reserva;
import java.util.List;

/**
 *
 * @author sala305
 */
public class ReservaDaoImpl implements IReservaDao{

    @Override
    public List<Reserva> obtenerReservas() {
        return ReservaData.getListado();
    }

    @Override
    public Reserva obtenerMovimiento(String codigo) {
        Reserva reserva = null;
        List<Reserva> listado = ReservaData.getListado();
        for (Reserva est : listado) {
            if (est.getIdReserva().equals(codigo)) {
                reserva = est;
            }
        }
        return reserva;
    }

    @Override
    public String crearReserva(Reserva reserva) {
        String respuesta = "Reserva Registrado";
        List<Reserva> listado = ReservaData.getListado();
        listado.add(reserva);
        ReservaData.setListado(listado);
        return respuesta;
    }
    
}
