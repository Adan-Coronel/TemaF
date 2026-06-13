package org.cctve;

import java.util.ArrayList;
import java.util.List;

public class Gerencia {
    private List<Abonado> abonadoList = new ArrayList<>();
    private List<Solicitud> solicitudList=new ArrayList<>();
    private  List<Cuadrilla> cuadrillaList= new ArrayList<>();
    private List<VisitaTecnica> visitaTecnicaList= new ArrayList<>();

    private List<Abonado> abonados;
    private List<Solicitud> solicitudes;
    private List<Cuadrilla> cuadrillas;
    private List<VisitaTecnica> visitas;

    public Gerencia() {
        this.abonados = new ArrayList<>();
        this.solicitudes = new ArrayList<>();
        this.cuadrillas = new ArrayList<>();
        this.visitas = new ArrayList<>();
    }

    public Gerencia(List<Abonado> abonados, List<Solicitud> solicitudes,
                    List<Cuadrilla> cuadrillas, List<VisitaTecnica> visitas) {
        this.abonados = abonados;
        this.solicitudes = solicitudes;
        this.cuadrillas = cuadrillas;
        this.visitas = visitas;
    }

    public void listadoAbonados() {
        System.out.println("LISTADO DE ABONADOS");
        for (Abonado a : abonados) {
            System.out.println(" - " + a.getNombre());
        }
    }

    public void informesSolicitudesPorMarca() {
        System.out.println("SOLICITUDES POR MARCA");
        List<String> marcas = new ArrayList<>();
        for (Solicitud s : solicitudes) {
            if (s.getModemRoto() != null && !marcas.contains(s.getModemRoto().getMarca())) {
                marcas.add(s.getModemRoto().getMarca());
            }
        }
        for (String marca : marcas) {
            int contador = 0;
            for (Solicitud s : solicitudes) {
                if (s.getModemRoto() != null && marca.equals(s.getModemRoto().getMarca())) {
                    contador++;
                }
            }
            System.out.println(" - " + marca + ": " + contador + " solicitud(es)");
        }
    }

    public void informeCuadrillasOciosas() {
        System.out.println("UADRILLAS OCIOSAs");
        for (Cuadrilla c : cuadrillas) {
            if (c.estaLibre()) {
                System.out.println(" - Cuadrilla N° " + c.getNroCuadrilla());
            }
        }
    }

    public void visitasPorCuadrilla() {
        System.out.println("=== VISITAS POR CUADRILLA ===");
        for (Cuadrilla c : cuadrillas) {
            System.out.println(" Cuadrilla N° " + c.getNroCuadrilla() + ":");
            for (VisitaTecnica v : visitas) {
                if (v.getCuadrilla() != null
                        && v.getCuadrilla().getNroCuadrilla() == c.getNroCuadrilla()) {
                    System.out.println("    -> Visita N° " + v.getNroVisita());
                }
            }
        }
    }

    public void solicitudesSinVisita() {
        System.out.println("SOLICITUDES SIN VISITA");
        for (Solicitud s : solicitudes) {
            if (!s.tieneVisita()) {
                System.out.println(" - Solicitud cod " + s.getCodigoInforme()
                        + " (" + s.getProblema() + ")");
            }
        }
    }

    public void trabajadoresPorCuadrilla() {
        System.out.println("TRABAJADORES POR CUADRILLA");
        for (Cuadrilla c : cuadrillas) {
            System.out.println(" Cuadrilla N° " + c.getNroCuadrilla() + ":");
            for (Empleado e : c.getTrabajadores()) {
                System.out.println("    -> " + e.getNombre() + " (" + e.getEstado() + ")");
            }
        }
    }

    public List<Abonado> getAbonados() {
        return abonados;
    }

    public void setAbonados(List<Abonado> abonados) {
        this.abonados = abonados;
    }

    public List<Solicitud> getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(List<Solicitud> solicitudes) {
        this.solicitudes = solicitudes;
    }

    public List<Cuadrilla> getCuadrillas() {
        return cuadrillas;
    }

    public void setCuadrillas(List<Cuadrilla> cuadrillas) {
        this.cuadrillas = cuadrillas;
    }

    public List<VisitaTecnica> getVisitas() {
        return visitas;
    }

    public void setVisitas(List<VisitaTecnica> visitas) {
        this.visitas = visitas;
    }
    public void addAbonado(Abonado c){
        abonados.add(c);

    }
    public void addSolicitud(Solicitud s){
        solicitudes.add(s);
    }

    public void addCuadrilla(Cuadrilla c){
        cuadrillas.add(c);
    }

    public void addVisita(VisitaTecnica v){
        visitas.add(v);
    }

}
