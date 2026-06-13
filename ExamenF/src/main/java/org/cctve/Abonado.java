package org.cctve;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Abonado {
    private String nombre;
    private String mail;
    private Domicilio domicilio;
    private String telefono;
    private int password;

    public Abonado(String nombre, int password) {
        this.nombre = nombre;
        this.password = password;
    }

    public Abonado(String nombre, String mail, Domicilio domicilio, String telefono, int password) {
        this.nombre = nombre;
        this.mail = mail;
        this.domicilio = domicilio;
        this.telefono= telefono;
        this.password = password;
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

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public boolean validarIngreso(int psw) {
        return this.password == psw;
    }

    public void cambioPassword(String newPass) {
        this.password = Integer.parseInt(newPass);
    }

    public static boolean validarMail(String email) {
// Patron para validar el email
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9- ]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mather = pattern.matcher(email);
        return mather.find();
        }

    public boolean abonadosDiferentes(Abonado c2) {
        if (c2 == null) {
            return true;
        }
        boolean iguales = this.nombre != null
                && this.nombre.equals(c2.nombre)
                && this.password == c2.password;
        return !iguales;
    }
    public void delay(int mili) {
        try {
            Thread.sleep(mili);
        } catch (InterruptedException e) {
            System.out.println("Delay de " + mili + " milisegundos");
        }
    }
}
