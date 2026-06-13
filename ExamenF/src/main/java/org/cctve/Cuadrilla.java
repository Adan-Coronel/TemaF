package org.cctve;

import java.util.List;

public class Cuadrilla {

    private int nroCuadrilla;
    private List<Empleado> trabajadores;
    private String equipacion;
    private String materiales;
    private boolean disponible;

    public Cuadrilla(int nroCuadrilla, List<Empleado> trabajadores, String equipacion, String materiales) {
        this.nroCuadrilla = nroCuadrilla;
        this.trabajadores = trabajadores;
        this.equipacion = equipacion;
        this.materiales = materiales;
    }

    public int getNroCuadrilla() {
        return nroCuadrilla;
    }

    public void setNroCuadrilla(int nroCuadrilla) {
        this.nroCuadrilla = nroCuadrilla;
    }

    public List<Empleado> getTrabajadores() {
        return trabajadores;
    }

    public void setTrabajadores(List<Empleado> trabajadores) {
        this.trabajadores = trabajadores;
    }

    public String getEquipacion() {
        return equipacion;
    }

    public void setEquipacion(String equipacion) {
        this.equipacion = equipacion;
    }

    public String getMateriales() {
        return materiales;
    }

    public void setMateriales(String materiales) {
        this.materiales = materiales;
    }

    public void asignar() {
        this.disponible = false;
    }
    public void liberar() {
        this.disponible = true;
    }
    public boolean estaLibre() {
        return this.disponible;
    }

}