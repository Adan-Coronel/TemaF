package org.cctve;

import java.time.LocalDate;

public class VisitaTecnica {

    public int nroVisita;
    private Domicilio ubicacion;
    private LocalDate fechaCreacion;
    public LocalDate fechaRepacion;
    public String observacion;

    public VisitaTecnica(int nroVisita, Domicilio ubicacion, LocalDate fechaCreacion, LocalDate fechaRepacion, String observacion) {
        this.nroVisita = nroVisita;
        this.ubicacion = ubicacion;
        this.fechaCreacion = fechaCreacion;
        this.fechaRepacion = fechaRepacion;
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
        return fechaRepacion;
    }

    public void setFechaRepacion(LocalDate fechaRepacion) {
        this.fechaRepacion = fechaRepacion;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
}
