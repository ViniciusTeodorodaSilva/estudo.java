package exercicios.ordenacaolistas.exercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        var pessoa1 = new Titulo("Vinicius");
        var pessoa2 = new Titulo("Gustavo");
        var pessoa3 = new Titulo("Aline");
        var pessoa4 = new Titulo("Elaine");

        List<Titulo> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);
        listaDePessoas.add(pessoa4);

        Collections.sort(listaDePessoas);
        System.out.println(listaDePessoas);
    }
}
