package org.cctve;

public class Empleado {

    public enum Estado{
        LIBRE,OCUPADO;
    }

    public int id;
    public String nombre;
    public String puesto;
    private Estado estado;
    public boolean lider;

    public Empleado(int id, String nombre, String puesto, Estado estado, boolean lider) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.estado = estado;
        this.lider = lider;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Estado getEstado() {
        return estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public boolean isLider() {
        return lider;
    }

    public void setLider(boolean lider) {
        this.lider = lider;
    }
}
