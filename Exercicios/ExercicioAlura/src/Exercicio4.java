import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        System.out.println("Vamos verificar a tabuada do número escolhido");
        Scanner leitura = new Scanner(System.in);
        System.out.println(" Escolha um numero inteiro:");
        int numero = leitura.nextInt();

        for (int tabuada = 1; tabuada <= 10; tabuada++) {
            int resultado = numero * tabuada;
            System.out.println(numero + " x " + tabuada + " = " + resultado);;

        }

    }
}
