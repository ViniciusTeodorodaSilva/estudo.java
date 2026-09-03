import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Produto> lista = new ArrayList<>();
        var produto1 = new Produto("Detergente", 2.89, 80);
        var produto2 = new Produto("Pão de forma", 10.50, 100);
        var produto3 = new Produto("Sabão em pó", 20.89, 150);
        var produtoPerecivel = new ProdutoPerecivel("Arroz", 22.30, 100, "20/11/2027");


        lista.add(produto1);
        lista.add(produto2);
        lista.add(produto3);
        lista.add(produtoPerecivel);
        System.out.println("Tamanho da lista: " + lista.size());
        System.out.println("Primeiro produto da lista: " + lista.get(0));

        System.out.println("Lista de Produtos");
        for (var produto : lista) {
            System.out.println(produto);
        }

    }
}