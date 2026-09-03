package Exercicio5;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        var quadrado1 = new Quadrado(2, 2);
        var quadrado2 = new Quadrado(5, 5);
        var quadrado3 = new Quadrado(10, 10);
        var circulo1 = new Circulo(25);
        var circulo2 = new Circulo(10);


        ArrayList<Forma> formas = new ArrayList<>();
        formas.add(quadrado1);
        formas.add(quadrado2);
        formas.add(quadrado3);
        formas.add(circulo1);
        formas.add(circulo2);

        for (Forma forma : formas) {
            System.out.println(forma);
        }
    }
}
