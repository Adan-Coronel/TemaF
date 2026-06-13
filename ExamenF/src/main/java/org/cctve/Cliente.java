package org.cctve;

public class Cliente {
    public String nombre;
    public String mail;
    private Domicilio domicilio;

    public Cliente(String nombre, String mail, Domicilio domicilio) {
        this.nombre = nombre;
        this.mail = mail;
        this.domicilio = domicilio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

}
