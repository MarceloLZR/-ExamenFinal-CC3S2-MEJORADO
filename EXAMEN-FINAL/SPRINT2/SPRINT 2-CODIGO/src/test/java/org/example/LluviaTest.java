package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LluviaTest {

    @Test
    public void testEsMayorQue() {
        Lluvia lluvia = new Lluvia(25);
        assertTrue(lluvia.esMayorQue());

        Lluvia lluviaBaja = new Lluvia(15);
        assertFalse(lluviaBaja.esMayorQue());
    }

    @Test
    public void testGetCantidad() {
        Lluvia lluvia = new Lluvia(25);
        assertEquals(25, lluvia.getValor());
    }

    @Test
    public void testSetCantidad() {
        Lluvia lluvia = new Lluvia(25);
        lluvia.setValor(30);
        assertEquals(30, lluvia.getValor());
    }
}
