import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        System.out.println("Vamos calcular o fatorial ");
        Scanner leitura = new Scanner(System.in);
        System.out.println("Escreva um número inteiro");
        int numero = leitura.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;

        }
        System.out.println(numero + "!:" + fatorial);
    }
}
