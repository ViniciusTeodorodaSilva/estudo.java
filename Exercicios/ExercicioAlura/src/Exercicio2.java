import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Insira um número inteiro");
        int primeiroNumero = leitura.nextInt();
        System.out.println("insira outro número");
        int segundoNumero = leitura.nextInt();

        if (primeiroNumero == segundoNumero) {
            System.out.println("Os números são iguais");
        } else if (primeiroNumero > segundoNumero) {
            System.out.println("O primeiro número é maior");
        } else {
            System.out.println("O segundo número é maior");
        }

    }
}
