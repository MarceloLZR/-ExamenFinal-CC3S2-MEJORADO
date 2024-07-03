package org.example;

public class CondicionesClimaticasFake {
    private CondicionClimatica temperatura;
    private CondicionClimatica lluvia;
    private CondicionClimatica viento;

    public CondicionesClimaticasFake(double tempValor, double lluviaValor, double vientoValor) {
        this.temperatura = new TemperaturaStub(tempValor);
        this.lluvia = new LluviaStub(lluviaValor);
        this.viento = new VientoStub(vientoValor);
    }

    public void verificarCondiciones() {
        if (temperatura.esMayorQue()) {
            System.out.println("Alerta: Temperatura Alta!");
        }
        if (lluvia.esMayorQue()) {
            System.out.println("Alerta: Lluvia Intensa!");
        }
        if (viento.esMayorQue()) {
            System.out.println("Alerta: Viento Fuerte!");
        }
    }
}
