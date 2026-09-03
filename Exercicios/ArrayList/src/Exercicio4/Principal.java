package Exercicio4;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        var produto1 = new Produto("Alcatra", 43.20);
        var produto2 = new Produto("Detergente", 2.89);
        var produto3 = new Produto("Arroz", 25.50);

        ArrayList<Produto> lista = new ArrayList<>();
        lista.add(produto1);
        lista.add(produto2);
        lista.add(produto3);
        for (Produto produto : lista) {
            System.out.println(produto);
        }

        double somaPreco = 0;
        for (Produto produto : lista) {
            somaPreco += produto.getPreco();
        }

        double media = somaPreco / lista.size();
        System.out.printf("A media do Preco entre os produtos é R$ %.2f%n", media);
    }
}
