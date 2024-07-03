package org.example;

public class TemperaturaStub implements CondicionClimatica {
    private double valor;

    public TemperaturaStub(double valor) {
        this.valor = valor;
    }

    @Override
    public double getValor() {
        return valor;
    }

    @Override
    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public boolean esMayorQue() {
        return valor > 30; // Simula alta temperatura
    }
}