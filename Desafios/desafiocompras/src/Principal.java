import java.util.Collections;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o limite do seu cartão de crédito");
        double limite = leitura.nextDouble();

        CartaoDeCredito cartaoDeCredito = new CartaoDeCredito(limite);

        int opcao = 1;

        while (opcao != 0) {
            System.out.println("Digite a descrição do produto");
            leitura.nextLine();
            String descricao = leitura.nextLine();
            System.out.println("Digite o valor do produto");
            double valor = leitura.nextDouble();

            Compra compra = new Compra(descricao, valor);
            boolean compraRealizada = cartaoDeCredito.lancaValor(compra);
            if (compraRealizada) {
                System.out.println("Compra realizada com sucesso!");
                System.out.println("Continuar a compra digite 1 encerrar digite 0");
                opcao = leitura.nextInt();
            } else {
                System.out.println("Saldo insuficiente!");
                opcao = 0;
            }

        }

        Collections.sort(cartaoDeCredito.getCompras());

        System.out.println("COMPRAS REALIZADAS!");

        for (Compra compras : cartaoDeCredito.getCompras() ) {
            System.out.println(compras);
        }

        System.out.printf("Saldo do cartão: R$ %.2f%n", cartaoDeCredito.getSaldo());

        leitura.close();
    }
}
