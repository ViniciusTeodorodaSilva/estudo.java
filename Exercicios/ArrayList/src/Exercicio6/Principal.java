package Exercicio6;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(1234, 2000.50);
        ContaBancaria conta2 = new ContaBancaria(2345, 5250.50);
        ContaBancaria conta3 = new ContaBancaria(4452,3500.00);

        ArrayList<ContaBancaria> listaDeConta = new ArrayList<>();
        listaDeConta.add(conta1);
        listaDeConta.add(conta2);
        listaDeConta.add(conta3);

        for (ContaBancaria contaBancaria : listaDeConta) {
            System.out.println(contaBancaria);
        }

        ContaBancaria contaMaiorSaldo = listaDeConta.get(0);
        for (ContaBancaria contaBancaria : listaDeConta) {
            if (contaBancaria.getSaldo() > contaMaiorSaldo.getSaldo()){
                 contaMaiorSaldo = contaBancaria;
            }
        }

        System.out.println("Conta com maior saldo: " + contaMaiorSaldo.getNumeroDaConta());
        System.out.println("Saldo: " + contaMaiorSaldo.getSaldo());

    }
}
