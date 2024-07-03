package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VientoTest {

    @Test
    public void testEsMayorQue() {
        Viento viento = new Viento(55);
        assertTrue(viento.esMayorQue());

        Viento vientoBajo = new Viento(45);
        assertFalse(vientoBajo.esMayorQue());
    }

    @Test
    public void testGetVelocidad() {
        Viento viento = new Viento(55);
        assertEquals(55, viento.getValor());
    }

    @Test
    public void testSetVelocidad() {
        Viento viento = new Viento(55);
        viento.setValor(60);
        assertEquals(60, viento.getValor());
    }
}
