package org.example;

public class Temperatura implements CondicionClimatica {
    private double valor;
    private double valorMinimo;

    public Temperatura(double valor) {
        this.valor = valor;
        this.valorMinimo = 30; // Umbral mínimo por defecto
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
        return valor > valorMinimo;
    }
}
