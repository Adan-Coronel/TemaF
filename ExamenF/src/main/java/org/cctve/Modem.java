package org.cctve;

public class Modem {

    public enum EstadoModem{
        NUEVO,REPARADO,ROTO;
    }
    public long nroSerial;
    public String marca;
    public double velocidad;
    public int puertoEthernet;
    public String puertoCoaxial;
    public String protocoloRed;
    public int nroLed;
    public boolean firewall;
    public EstadoModem estadoModem;


    public Modem(long nroSerial, String marca, double velocidad, int puertoEthernet, String puertoCoaxial, String protocoloRed, int nroLed, boolean firewall, EstadoModem estadoModem) {
        this.nroSerial = nroSerial;
        this.marca = marca;
        this.velocidad = velocidad;
        this.puertoEthernet = puertoEthernet;
        this.puertoCoaxial = puertoCoaxial;
        this.protocoloRed = protocoloRed;
        this.nroLed = nroLed;
        this.firewall = firewall;
        this.estadoModem = estadoModem;
    }

    public long getNroSerial() {
        return nroSerial;
    }

    public void setNroSerial(long nroSerial) {
        this.nroSerial = nroSerial;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public int getPuertoEthernet() {
        return puertoEthernet;
    }

    public void setPuertoEthernet(int puertoEthernet) {
        this.puertoEthernet = puertoEthernet;
    }

    public String getPuertoCoaxial() {
        return puertoCoaxial;
    }

    public void setPuertoCoaxial(String puertoCoaxial) {
        this.puertoCoaxial = puertoCoaxial;
    }

    public String getProtocoloRed() {
        return protocoloRed;
    }

    public void setProtocoloRed(String protocoloRed) {
        this.protocoloRed = protocoloRed;
    }

    public int getNroLed() {
        return nroLed;
    }

    public void setNroLed(int nroLed) {
        this.nroLed = nroLed;
    }

    public boolean isFirewall() {
        return firewall;
    }

    public void setFirewall(boolean firewall) {
        this.firewall = firewall;
    }

    public EstadoModem getEstadoModem() {
        return estadoModem;
    }

    public void setEstadoModem(EstadoModem estadoModem) {
        this.estadoModem = estadoModem;
    }
}