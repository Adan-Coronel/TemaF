package org.cctve;

import java.util.List;

public class Cuadrilla {

    public int nroCuadrilla;
    List<Empleado> cantidadTrabajadores;
    public String equipacion;
    public String materiales;

    public Cuadrilla(int nroCuadrilla, List<Empleado> cantidadTrabajadores, String equipacion, String materiales) {
        this.nroCuadrilla = nroCuadrilla;
        this.cantidadTrabajadores = cantidadTrabajadores;
        this.equipacion = equipacion;
        this.materiales = materiales;
    }

    public int getNroCuadrilla() {
        return nroCuadrilla;
    }

    public void setNroCuadrilla(int nroCuadrilla) {
        this.nroCuadrilla = nroCuadrilla;
    }

    public List<Empleado> getCantidadTrabajadores() {
        return cantidadTrabajadores;
    }

    public void setCantidadTrabajadores(List<Empleado> cantidadTrabajadores) {
        this.cantidadTrabajadores = cantidadTrabajadores;
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
}