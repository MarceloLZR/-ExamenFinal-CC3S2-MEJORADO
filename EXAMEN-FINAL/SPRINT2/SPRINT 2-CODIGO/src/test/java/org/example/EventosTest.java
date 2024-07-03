package org.example;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class EventosTest {

    @Test
    public void testGenerarEventos() {

        // Capturar la salida de la consola
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Crear instancias de las condiciones climáticas con valores específicos
        Temperatura temp = new Temperatura(35);
        Lluvia lluvia = new Lluvia(25);
        Viento viento = new Viento(55);

        // Llamar al método que genera eventos
        Eventos.generarEventos(temp, lluvia, viento);

        // Verificar la salida esperada
        String expectedOutput = "Alerta: Temperatura Alta!\n"
                + "Activar Sistema de Riego\n"
                + "Enviar Notificación a Usuarios\n"
                + "Alerta: Viento Fuerte!\n";
        assertEquals(expectedOutput, outContent.toString());

        // Restaurar la salida estándar
        System.setOut(System.out);


    }
}
