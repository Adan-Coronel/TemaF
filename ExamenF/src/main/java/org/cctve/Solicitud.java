package org.cctve;

import java.time.LocalDate;


public class Solicitud {
    private Cliente informante;
    public int codigoUrgencia; // entre 1 y 5
    public int codigoInforme;
    private LocalDate fechaInforme;
    public String problema;
    private Modem modemRoto;
    private VisitaTecnica visitaTecnica;

    public Solicitud(Cliente informante, int codigoUrgencia, int codigoInforme, LocalDate fechaInforme, String problema, Modem modemRoto, VisitaTecnica visitaTecnica) {
        this.informante = informante;
        this.codigoUrgencia = codigoUrgencia;
        this.codigoInforme = codigoInforme;
        this.fechaInforme = fechaInforme;
        this.problema = problema;
        this.modemRoto = modemRoto;
        this.visitaTecnica = visitaTecnica;
    }

    public Cliente getInformante() {
        return informante;
    }

    public int getCodigoUrgencia() {
        return codigoUrgencia;
    }

    public void setCodigoUrgencia(int codigoUrgencia) {
        this.codigoUrgencia = codigoUrgencia;
    }

    public int getCodigoInforme() {
        return codigoInforme;
    }

    public void setCodigoInforme(int codigoInforme) {
        this.codigoInforme = codigoInforme;
    }

    public LocalDate getFechaInforme() {
        return fechaInforme;
    }


    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public Modem getModemRoto() {
        return modemRoto;
    }

    public VisitaTecnica getVisitaTecnica() {
        return visitaTecnica;
    }

}
