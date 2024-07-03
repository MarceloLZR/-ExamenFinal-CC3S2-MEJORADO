package org.example;

public class Eventos {

    public static void generarEventos(CondicionClimatica temp, CondicionClimatica lluvia, CondicionClimatica viento) {
        if (temp.esMayorQue()) {
            System.out.println("Alerta: Temperatura Alta!");
        }

        if (lluvia.esMayorQue()) {
            System.out.println("Alerta: Lluvia Intensa!");
        }

        if (viento.esMayorQue()) {
            System.out.println("Alerta: Viento Fuerte!");
        }

        if (lluvia.esMayorQue()) {
            System.out.println("Activar Sistema de Riego");
        }

        if (viento.esMayorQue()) {
            System.out.println("Cerrar Persianas");
        }

        if (temp.esMayorQue() || lluvia.esMayorQue()) {
            System.out.println("Enviar Notificación a Usuarios");
        }
    }
}
