package org.cctve;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("SISTEMA CCTVe\n");

        // ======================
        // DOMICILIOS
        // ======================
        Domicilio domicilioAdan = new Domicilio("calle", "falsa", "siempre Viva", 123);
        Domicilio domicilioJhoel = new Domicilio("9 de julio", "richeri", "centro", 1544);

        Abonado c1 = new Abonado("Adan", "adan@ulp.com", domicilioAdan, "222222", 123);
        Abonado c2 = new Abonado("Jhoel", "jhoel@ulp.com", domicilioJhoel, "333333", 123);

        System.out.println(" PRUEBAS ABONADO ");
        System.out.println("validarIngreso(123): " + c1.validarIngreso(123));
        System.out.println("validarIngreso(999): " + c1.validarIngreso(999));

        c1.cambioPassword("3030");
        System.out.println("Nuevo password: " + c1.getPassword());

        System.out.println("abonadosDiferentes: " + c1.abonadosDiferentes(c2));
        System.out.println("validarMail: " + Abonado.validarMail(c1.getMail()));


        List<Empleado> equipo1 = new ArrayList<>();
        equipo1.add(new Empleado(1, "Carlos", "Tecnico", Empleado.Estado.LIBRE, true));
        equipo1.add(new Empleado(2, "Pedro", "Tecnico", Empleado.Estado.LIBRE, false));
        equipo1.add(new Empleado(3, "Ana", "Ayudante", Empleado.Estado.LIBRE, false));

        List<Empleado> equipo2 = new ArrayList<>();
        equipo2.add(new Empleado(4, "Lucia", "Tecnico", Empleado.Estado.LIBRE, true));
        equipo2.add(new Empleado(5, "Diego", "Ayudante", Empleado.Estado.LIBRE, false));


        Cuadrilla cuadrilla1 = new Cuadrilla(1, equipo1, "Escalera y casco", "Cables UTP");
        Cuadrilla cuadrilla2 = new Cuadrilla(2, equipo2, "Pinza y tester", "Conectores RJ45");


        Modem modem1 = new Modem(1001L, "Cisco", 300.0, 4, "RG6", "DOCSIS", 5, true, Modem.EstadoModem.ROTO);
        Modem modem2 = new Modem(1002L, "Huawei", 150.0, 2, "RG59", "PPPoE", 3, false, Modem.EstadoModem.ROTO);


        Solicitud s1 = new Solicitud(c1, 1, 101, LocalDate.now(), "Sin señal de internet", modem1, null);
        Solicitud s2 = new Solicitud(c2, 3, 102, LocalDate.now(), "Velocidad muy baja", modem2, null);

        VisitaTecnica visita1 = new VisitaTecnica(500, domicilioJhoel, null, null, null);

        visita1.crearVisita();
        visita1.asignarCuadrilla(cuadrilla1);
        s2.asignarVisita(visita1);

        Gerencia gerencia = new Gerencia();

        gerencia.addAbonado(c1);
        gerencia.addAbonado(c2);

        gerencia.addSolicitud(s1);
        gerencia.addSolicitud(s2);

        gerencia.addCuadrilla(cuadrilla1);
        gerencia.addCuadrilla(cuadrilla2);

        gerencia.addVisita(visita1);

        System.out.println("\nREPORTES\n");

        gerencia.listadoAbonados();
        System.out.println();

        gerencia.informesSolicitudesPorMarca();
        System.out.println();

        gerencia.informeCuadrillasOciosas();
        System.out.println();

        gerencia.visitasPorCuadrilla();
        System.out.println();

        gerencia.solicitudesSinVisita();
        System.out.println();

        gerencia.trabajadoresPorCuadrilla();


        visita1.finalizarVisita("Cambio de modem realizado");
        modem2.marcarReparado();

        System.out.println("\nESTADO FINAL");
        System.out.println("Estado modem2: " + modem2.getEstadoModem());
        System.out.println("Cuadrilla 1 libre: " + cuadrilla1.estaLibre());

        System.out.println("\nFIN ");
    }
}
