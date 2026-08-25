import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        String nome = "Elaine Henrique";
        String tipoDeConta = "corrente";
        double saldo = 2500.00;


        System.out.println("""
                **********************************
                
                Nome: %s
                Tipo de conta: %s
                Saldo Total: %.2f
                
                **********************************
                """.formatted(nome, tipoDeConta, saldo));

        Scanner scanner = new Scanner(System.in);


        int menu = 0;

        while (menu != 4) {
            System.out.println("""
                    Operações 
                    
                    1- Consultar saldo
                    2- Receber valor
                    3- Transferir valor
                    4- Sair
                    
                    Escolha uma opção:
                    """);
            menu = scanner.nextInt();

            if (menu == 1) {
                System.out.println("Saldo total: R$" + saldo);
            } else if (menu == 2) {
                System.out.println("Digite o valor a receber:");
                double valorRecebido = scanner.nextDouble();
                saldo += valorRecebido;
                System.out.println("O saldo total: R$" + saldo);
            } else if (menu == 3) {
                System.out.println("Digite o valor para Transferir:");
                double valortransferido = scanner.nextDouble();
                if (valortransferido > saldo) {
                    System.out.println("Saldo indisponível");
                } else {
                    saldo -= valortransferido;
                    System.out.println("O saldo total: R$" + saldo);
                }

            }else if (menu == 4) {


            } else {
                System.out.println("Opção indisponível");
            }


        }
        scanner.close();

    }
}







