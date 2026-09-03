package Exercicio1;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Gustavo");
        lista.add("Vinicius");
        lista.add("Teodoro");

        for (String nome : lista) {
            System.out.println(nome);
        }

    }
}