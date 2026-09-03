package Exercicio5;

import java.util.Locale;

public class Circulo implements Forma {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public String toString() {
        return String.format(new Locale("pt", "BR"), "Área do círculo: %,.1f", calcularArea());
    }
}
