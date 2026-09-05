package exercicios.ordenacaolistas.exercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Integer> listaDeNumeros = new ArrayList<>();
        listaDeNumeros.add(8);
        listaDeNumeros.add(10);
        listaDeNumeros.add(5);
        listaDeNumeros.add(15);
        listaDeNumeros.add(1);

        System.out.println("Antes" + listaDeNumeros);

        Collections.sort(listaDeNumeros);
        System.out.println("Depois" + listaDeNumeros);
    }
}
