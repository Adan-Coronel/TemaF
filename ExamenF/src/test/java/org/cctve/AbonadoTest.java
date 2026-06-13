package org.cctve;

import org.junit.jupiter.api.*;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class AbonadoTest {

    static Abonado ciu;
    static Abonado ciu2;
    static Abonado a1;
    static int i = 0;



    @BeforeAll
    static void antesDeTodo() {
        ciu = new Abonado("anonimus", 1212);
        ciu2= new Abonado("juan",1515);
        a1= new Abonado("flor","flor@ulp.com",
                new Domicilio("calle","falsa","Sprinfild",123),
                "2664",123);
        System.out.println( "INGRESO de abonado del bien");
    }
    @AfterAll
    public static void despuesDeTodo() {
        System.out.println(LocalDate.now().minusDays(1)
                + " Modem rotos reparados, Abonados Felices");
    }

    @BeforeEach
    public void antesDeCadaTest() {
        i++;
        System.out.println("Test numero: " + i);
    }

    @AfterEach
    public void despuesDeCadaTest() {
        System.out.println("--------------------------------------");
    }

    @Test
    void validarPsw() {
        boolean resultado = ciu.validarIngreso(123456);
        assertTrue(resultado);
    }

    @Test
    void validarPsw2(){
        boolean resultado = ciu.validarIngreso(1212);
        assertTrue(resultado);
    }

    @Test
    void controlMail(){
     boolean resultado=  Abonado.validarMail(a1.getMail());
     assertTrue(resultado);
    }

    @Test
    public void testCambioPass() {
        String newPsw = "987";
        a1.cambioPassword(newPsw);
        assertEquals(987,a1.getPassword());
        System.out.println("cambio realizado "+a1.getPassword());
    }
    @Test
    public void testAbonadosDiferentes() {
        boolean diferentes = ciu.abonadosDiferentes(ciu);
        assertTrue(diferentes);
        assertNotSame(ciu, ciu2, "misma persona");

    }


}