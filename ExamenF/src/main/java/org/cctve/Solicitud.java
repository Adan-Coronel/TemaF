package org.cctve;

import java.time.LocalDate;


public class Solicitud {
    private Abonado informante;
    private int codigoUrgencia; // entre 1 y 5
    private int codigoInforme;
    private LocalDate fechaInforme;
    private String problema;
    private Modem modemRoto;
    private VisitaTecnica visitaTecnica;

    public Solicitud(Abonado informante, int codigoUrgencia, int codigoInforme, LocalDate fechaInforme, String problema, Modem modemRoto, VisitaTecnica visitaTecnica) {
        this.informante = informante;
        this.codigoUrgencia = codigoUrgencia;
        this.codigoInforme = codigoInforme;
        this.fechaInforme = fechaInforme;
        this.problema = problema;
        this.modemRoto = modemRoto;
        this.visitaTecnica = visitaTecnica;
    }

    public Abonado getInformante() {
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

    public void crearSolicitud(Modem m, Abonado a, String problema, int prioridad) {
        this.modemRoto = m;
        this.informante = a;
        this.problema = problema;
        this.codigoUrgencia = prioridad;
        this.fechaInforme = LocalDate.now();
        this.visitaTecnica = null;
    }

    public boolean tieneVisita() {
        return this.visitaTecnica != null;
    }

    public void asignarVisita(VisitaTecnica v) {
        this.visitaTecnica = v;
    }



}
