import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        System.out.println("Menu");
        System.out.println("1. Calcular área do quadrado");
        System.out.println("2. Calcular área do círculo");
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite a opção desejada 1 ou 2");
        int escolha = leitura.nextInt();

        if (escolha == 1) {
            System.out.println("Qual a medida dos lados do quadrado?");
            double lado = leitura.nextDouble();
            double area = lado * lado;
            System.out.println (String.format("A área do quadrado é %.2f",area));
        } else if (escolha ==2) {
            System.out.println("Qual o raio do círculo?");
            double raio = leitura.nextDouble();
            double areaDoCirculo = Math.PI * Math.pow(raio, 2);
            System.out.println(String.format("A área do círculo é %.2f",areaDoCirculo));
        } else {
            System.out.println("Comando inválido");
        }
    }
}
