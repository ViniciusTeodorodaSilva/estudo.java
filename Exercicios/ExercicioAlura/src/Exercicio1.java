import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um número inteiro");
        int numero = leitura.nextInt();

        if (numero > 0) {
            System.out.println("Esse número é positivo");
        } else if (numero < 0 ) {
            System.out.println("Esse número é nagativo");
        } else {
            System.out.println("Esse númeero é zero");
        }
    }
}
