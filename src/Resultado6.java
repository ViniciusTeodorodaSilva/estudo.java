import java.util.Scanner;

public class Resultado6 {
    public static void main(String[] args) {
        System.out.println("Vamos calcular o desconto no produto");
        Scanner leitura = new Scanner(System.in);
        System.out.println("Qual o preço do produto?");
        double precoOriginal = leitura.nextDouble();
        System.out.println("Qual o percentual de desconto?");
        double percentualDesconto = leitura.nextDouble();
        double valorDesconto = precoOriginal/100 * percentualDesconto;
        double precoComDesconto = precoOriginal - valorDesconto;
        System.out.println(String.format("Valor do desconto R$%.2f", valorDesconto));
        System.out.println(String.format("O preço com desconto ficou R$%.2f",precoComDesconto));
    }
}
