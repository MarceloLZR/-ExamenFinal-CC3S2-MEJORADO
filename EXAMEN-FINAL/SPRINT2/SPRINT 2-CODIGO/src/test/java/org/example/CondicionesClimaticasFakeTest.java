package org.example;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class CondicionesClimaticasFakeTest {

    @Test
    public void testVerificarCondiciones() {

        // Redirigir la salida estándar para capturar los mensajes de la consola
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Crear una instancia de CondicionesClimaticasFake con valores que deberían activar las alertas
        CondicionesClimaticasFake condiciones = new CondicionesClimaticasFake(35, 55, 65);

        // Verificar las condiciones
        condiciones.verificarCondiciones();

        // Comprobar que se generaron las alertas correctas
        String expectedOutput = "Alerta: Temperatura Alta!\n" +
                "Alerta: Lluvia Intensa!\n" +
                "Alerta: Viento Fuerte!\n";
        assertEquals(expectedOutput, outContent.toString());

        // Restaurar la salida estándar
        System.setOut(System.out);


    }

    @Test
    public void testVerificarCondicionesNoAlertas() {
        // Redirigir la salida estándar para capturar los mensajes de la consola
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Crear una instancia de CondicionesClimaticasFake con valores que no deberían activar las alertas
        CondicionesClimaticasFake condiciones = new CondicionesClimaticasFake(25, 15, 45);

        // Verificar las condiciones
        condiciones.verificarCondiciones();

        // Comprobar que no se generaron alertas
        String expectedOutput = "";
        assertEquals(expectedOutput, outContent.toString());

        // Restaurar la salida estándar
        System.setOut(System.out);
    }
}
