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
public class Habitacion {

    private String idhabitacion;
    private String tipohabitacion;
    private Double nucamas;

    public Habitacion() {
    }

    public Habitacion(String idhabitacion, String tipohabitacion, Double nucamas) {
        this.idhabitacion = idhabitacion;
        this.tipohabitacion = tipohabitacion;
        this.nucamas = nucamas;
    }

    public String getIdhabitacion() {
        return idhabitacion;
    }

    public void setIdhabitacion(String idhabitacion) {
        this.idhabitacion = idhabitacion;
    }

    public String getTipohabitacion() {
        return tipohabitacion;
    }

    public void setTipohabitacion(String tipohabitacion) {
        this.tipohabitacion = tipohabitacion;
    }

    public Double getNucamas() {
        return nucamas;
    }

    public void setNucamas(Double nucamas) {
        this.nucamas = nucamas;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.idhabitacion);
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
        final Habitacion other = (Habitacion) obj;
        if (!Objects.equals(this.idhabitacion, other.idhabitacion)) {
            return false;
        }
        return true;
    }

  
}
