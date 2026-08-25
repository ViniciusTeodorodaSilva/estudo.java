import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("quantos graus celsius está em são paulo hoje?");
        int celsius = scanner.nextInt();
        int temperatura = (int) (celsius * 1.8) + 32;
        String resultado = String.format("%d graus celsius é igual a %d graus Fahrenheit",celsius, temperatura);
        System.out.println(resultado);

    }
}



