package org.cctve;

public class Domicilio {

    public String calle1;
    public String calle2;
    public String barrio;
    public int altura;

    public Domicilio(String calle1, String calle2, String barrio, int altura) {
        this.calle1 = calle1;
        this.calle2 = calle2;
        this.barrio = barrio;
        this.altura = altura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getCalle2() {
        return calle2;
    }

    public void setCalle2(String calle2) {
        this.calle2 = calle2;
    }

    public String getCalle1() {
        return calle1;
    }

    public void setCalle1(String calle1) {
        this.calle1 = calle1;
    }
}
