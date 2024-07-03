package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la temperatura (en grados Celsius): ");
        double temperatura = scanner.nextDouble();

        System.out.print("Ingrese la cantidad de lluvia (en mm): ");
        double lluvia = scanner.nextDouble();

        System.out.print("Ingrese la velocidad del viento (en km/h): ");
        double viento = scanner.nextDouble();

        CondicionClimatica temp = new Temperatura(temperatura);
        CondicionClimatica lluviaObj = new Lluvia(lluvia);
        CondicionClimatica vientoObj = new Viento(viento);

        Eventos.generarEventos(temp, lluviaObj, vientoObj);

        scanner.close();
    }
}
