package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class CondicionClimaticaTest {

    @Test
    public void testTemperatura() {
        Temperatura temp = new Temperatura(35);
        assertTrue(temp.esMayorQue());
        temp.setValor(25);
        assertFalse(temp.esMayorQue());
    }

    @Test
    public void testLluvia() {
        Lluvia lluvia = new Lluvia(25);
        assertTrue(lluvia.esMayorQue());
        lluvia.setValor(15);
        assertFalse(lluvia.esMayorQue());
    }

    @Test
    public void testViento() {
        Viento viento = new Viento(55);
        assertTrue(viento.esMayorQue());
        viento.setValor(45);
        assertFalse(viento.esMayorQue());
    }
}
