package org.cctve;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ParameterAboTest {

    @ParameterizedTest
    @CsvSource({
            "flor@ulp.com, true",
            "juan@gmail.com, true",
            "sinArroba.com, false",
            "sinpunto@gmail, false",
            "'', false"
    })
    void testValidarMailParametrizado(String email, boolean esperado) {

        boolean resultado = Abonado.validarMail(email);

        assertEquals(esperado, resultado);
    }
}