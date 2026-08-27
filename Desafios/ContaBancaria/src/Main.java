import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nome = leitura.nextLine();
        System.out.println("Acessar conta corrente, digite 1, poupança digite 2");
        int conta = leitura.nextInt();
        double saldoContaCorrente = 2500.00;
        double saldoPoupanca = 5000.00;
        int opcao = 0;
        String menuDeOpcao = ("""
                Operações 
                
                1- Consultar saldo
                2- Transferir valor
                3- Receber valor
                4- Sair
                """);

        if (conta == 1) {
            System.out.println(String.format("""
                    ****************************
                    Dados iniciais  do cliente
                    
                    Nome: %s
                    Tipo de Conta: Corrente
                    Saldo inicial: %.2f
                    ****************************                 
                    """, nome, saldoContaCorrente));
            while (opcao != 4) {
                System.out.println(menuDeOpcao);
                opcao = leitura.nextInt();

                if (opcao == 1) {
                    System.out.println(String.format("R$:%.2f", saldoContaCorrente));
                } else if (opcao == 2) {
                    System.out.println("Qual o Valor que você quer transferir?");
                    double transferencia = leitura.nextDouble();
                    if (transferencia <= saldoContaCorrente && transferencia > 0){
                    saldoContaCorrente -= transferencia;
                    } else {
                        System.out.println("Saldo insuficiente");
                    }
                } else if (opcao == 3) {
                    System.out.println("Qual o valor que você recebeu?");
                    double pixRecebido = leitura.nextDouble();
                    saldoContaCorrente += pixRecebido;
                }
            }
        } else if (conta == 2) {
            System.out.println(String.format("""
                    ****************************
                    Dados iniciais  do cliente
                    
                    Nome: %s
                    Tipo de Conta: Poupança
                    Saldo inicial: %.2f
                    ****************************                 
                    """, nome, saldoPoupanca));
            while (opcao != 4) {
                System.out.println(menuDeOpcao);
                opcao = leitura.nextInt();

                if (opcao == 1) {
                    System.out.println(String.format("R$:%.2f", saldoPoupanca));
                } else if (opcao == 2) {
                    System.out.println("Qual o Valor que você quer transferir?");
                    double transferencia = leitura.nextDouble();
                    if (transferencia <= saldoPoupanca && transferencia > 0){
                        saldoPoupanca -= transferencia;
                    } else {
                        System.out.println("Saldo insuficiente");
                    }
                } else if (opcao == 3) {
                    System.out.println("Qual o valor que você recebeu?");
                    double pixRecebido = leitura.nextDouble();
                    saldoPoupanca += pixRecebido;
                }

            }
        }
    }
}