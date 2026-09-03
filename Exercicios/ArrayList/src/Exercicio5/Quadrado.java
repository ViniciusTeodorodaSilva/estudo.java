package Exercicio5;

import java.util.Locale;

public class Quadrado implements Forma {
    private double ladoA;
    private double ladoB;

    public Quadrado(double ladoA, double ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }
    @Override
    public double calcularArea() {
        return ladoA * ladoB;
    }

    @Override
    public String toString() {
        return String.format(new Locale("pt", "BR"), "Área do quadrado: %,.1f", calcularArea());
    }
}
