/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.poli.Reservas.model;

import java.util.Objects;

/**
 *
 * @author sala305
 */
public class Reserva {
    private String idReserva;
    private Habitacion habitacion;    
    private Double numcamas;
    private Double precioxcama;

    public Reserva() {
    }

    public Reserva(String idReserva, Habitacion habitacion, Double numcamas, Double precioxcama) {
        this.idReserva = idReserva;
        this.habitacion = habitacion;
        this.numcamas = numcamas;
        this.precioxcama = precioxcama;
    }

    public String getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(String idReserva) {
        this.idReserva = idReserva;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public Double getNumcamas() {
        return numcamas;
    }

    public void setNumcamas(Double numcamas) {
        this.numcamas = numcamas;
    }

    public Double getPrecioxcama() {
        return precioxcama;
    }

    public void setPrecioxcama(Double precioxcama) {
        this.precioxcama = precioxcama;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.idReserva);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Reserva other = (Reserva) obj;
        if (!Objects.equals(this.idReserva, other.idReserva)) {
            return false;
        }
        return true;
    }
    
    
}
