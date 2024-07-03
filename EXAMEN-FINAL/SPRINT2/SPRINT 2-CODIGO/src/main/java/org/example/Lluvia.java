package org.example;

public class Lluvia implements CondicionClimatica {
    private double cantidad;
    private double cantidadMinima;

    public Lluvia(double cantidad) {
        this.cantidad = cantidad;
        this.cantidadMinima = 20; // Umbral mínimo por defecto
    }

    @Override
    public double getValor() {
        return cantidad;
    }

    @Override
    public void setValor(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public boolean esMayorQue() {
        return cantidad > cantidadMinima;
    }
}
