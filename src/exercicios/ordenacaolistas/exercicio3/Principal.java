package exercicios.ordenacaolistas.exercicio3;

import exercicios.ordenacaolistas.exercicio2.Titulo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        var titulo1 = new Titulo("Vinicius");
        var titulo2 = new Titulo("Gustavo");
        var titulo3 = new Titulo("Aline");
        var titulo4 = new Titulo("Elaine");

        List<Titulo> arraylist = new ArrayList<>();
        arraylist.add(titulo1);
        arraylist.add(titulo2);
        arraylist.add(titulo3);
        arraylist.add(titulo4);

        System.out.println(arraylist);

        List<Titulo> listaTitulos = new LinkedList<>();
        listaTitulos.add(titulo1);
        listaTitulos.add(titulo2);
        listaTitulos.add(titulo3);
        listaTitulos.add(titulo4);

        System.out.println(listaTitulos);

    }
}
