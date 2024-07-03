package org.example;

public class VientoStub implements CondicionClimatica {
    private double velocidad;

    public VientoStub(double velocidad) {
        this.velocidad = velocidad;
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
        return velocidad > 50; // Simula viento fuerte
    }
}