package org.example;

public class LluviaStub implements CondicionClimatica {
    private double cantidad;

    public LluviaStub(double cantidad) {
        this.cantidad = cantidad;
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
        return cantidad > 20; // Simula lluvia intensa
    }
}