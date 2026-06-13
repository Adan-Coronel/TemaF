package org.cctve;

import java.time.LocalDate;

public class VisitaTecnica {

    private int nroVisita;
    private Domicilio ubicacion;
    private LocalDate fechaCreacion;
    private LocalDate fechaReparacion;
    private String observacion;


    private Cuadrilla cuadrilla;

    public VisitaTecnica(int nroVisita, Domicilio ubicacion, LocalDate fechaCreacion, LocalDate fechaReparacion, String observacion) {
        this.nroVisita = nroVisita;
        this.ubicacion = ubicacion;
        this.fechaCreacion = fechaCreacion;
        this.fechaReparacion = fechaReparacion;
        this.observacion = observacion;
    }

    public int getNroVisita() {
        return nroVisita;
    }

    public void setNroVisita(int nroVisita) {
        this.nroVisita = nroVisita;
    }

    public Domicilio getUbicacion() {
        return ubicacion;
    }


    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public LocalDate getFechaRepacion() {
        return fechaReparacion;
    }

    public void setFechaRepacion(LocalDate fechaRepacion) {
        this.fechaReparacion = fechaRepacion;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Cuadrilla getCuadrilla() {
        return cuadrilla;
    }

    public void setCuadrilla(Cuadrilla cuadrilla) {
        this.cuadrilla = cuadrilla;
    }
    public void crearVisita() {
        this.fechaCreacion = LocalDate.now();
        this.fechaReparacion = LocalDate.now().plusDays(7);
        this.observacion = null;
    }

    public void asignarCuadrilla(Cuadrilla c) {
        this.cuadrilla = c;
        if (c != null) {
            c.asignar();
        }
    }
    public void finalizarVisita(String obs) {
        this.observacion = obs;
        this.fechaReparacion = LocalDate.now();
    }


}
