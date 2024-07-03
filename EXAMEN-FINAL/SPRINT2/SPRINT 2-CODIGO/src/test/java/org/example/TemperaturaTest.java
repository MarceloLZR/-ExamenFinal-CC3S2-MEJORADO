package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TemperaturaTest {

    @Test
    public void testEsMayorQue() {
        Temperatura temperatura = new Temperatura(35);
        assertTrue(temperatura.esMayorQue());

        Temperatura temperaturaBaja = new Temperatura(25);
        assertFalse(temperaturaBaja.esMayorQue());
    }

    @Test
    public void testGetValor() {
        Temperatura temperatura = new Temperatura(35);
        assertEquals(35, temperatura.getValor());
    }

    @Test
    public void testSetValor() {
        Temperatura temperatura = new Temperatura(35);
        temperatura.setValor(40);
        assertEquals(40, temperatura.getValor());
    }
}
