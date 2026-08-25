import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Jogo de adivinhção");
        System.out.println("você tem 5 tentativas para acertar o número secreto");
        int numeroSecreto = new Random().nextInt(100);
        Scanner leitura = new Scanner(System.in);
        boolean acertou = false;

        for (int tentativas = 0; tentativas < 5; tentativas++) {
            System.out.println("Escreva um numero de 0 a 100");
            int chute = leitura.nextInt();

            if (chute > numeroSecreto) {
                System.out.println("O número secreto é menor");
            }
            if (chute < numeroSecreto) {
                System.out.println("O número secreto é maior");
            }

            if (chute == numeroSecreto) {
                System.out.println(String.format("Você acertou o número secreto com %d tentativas", tentativas+1));
                acertou = true;
                break;
            }
        }
        if (!acertou) {
            System.out.println("Voce não conseguiu acertar com 5 tentativas o numero secreto era: " + numeroSecreto);
        }

    }

}