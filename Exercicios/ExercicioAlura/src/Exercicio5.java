import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        System.out.println("Vamos verificar se o número é par ou impar");
        Scanner leitura = new Scanner(System.in);
        System.out.println("Escreva um número inteiro");
        int numero = leitura.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Esse número é par");
        } else {
            System.out.println("Esse número é impar");
        }
    }
}
