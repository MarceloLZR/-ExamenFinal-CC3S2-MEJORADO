package org.example;

public class Viento implements CondicionClimatica {
    private double velocidad;
    private double velocidadMinima;

    public Viento(double velocidad) {
        this.velocidad = velocidad;
        this.velocidadMinima = 50; // Umbral mínimo por defecto
    }

    @Override
    public double getValor() {
        return velocidad;
    }

    @Override
    public void setValor(double velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public boolean esMayorQue() {
        return velocidad > velocidadMinima;
    }
}
