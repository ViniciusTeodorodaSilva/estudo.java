import java.util.Scanner;

public class Resultado5 {
    public static void main(String[] args) {
        System.out.println("vamos converter dólares para real");
        Scanner leitura = new Scanner(System.in);
        System.out.println("Valor em dólar?");
        double valorEmDolar = leitura.nextDouble();
        double valorEmReal = 4.94;
        double conversao = valorEmDolar * valorEmReal;
        System.out.println(String.format("$%.2f dólares é igual a R$%.2f",valorEmDolar, conversao ));
    }
}
