import java.util.Scanner;

public class Resultado4 {
    public static void main(String[] args) {
        System.out.println("Vamos calcular o preço total da compra");
        Scanner leitura = new Scanner(System.in);
        System.out.println("Qual o valor do produto?");
        double precoProduto = leitura.nextDouble();
        System.out.println("Qual a quantidade?");
        int quantidade = leitura.nextInt();
        double total = precoProduto * quantidade;
        System.out.println(String.format("R$ %.2f", total));

    }
}
