import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        Pessoa pessoa1 = new Pessoa("Gustavo", 27);
        Pessoa pessoa2 = new Pessoa("Vincius", 27);
        Pessoa pessoa3 = new Pessoa("Elaine", 25);

        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);
        System.out.println("Tamanho da lista: " + listaDePessoas.size());
        System.out.println("Primeiro da lista: " + listaDePessoas.get(0));

        System.out.println("Lista de Pessoas");
        for (Pessoa pessoa : listaDePessoas) {
            System.out.println(pessoa);
        }
    }
}