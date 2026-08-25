import java.util.Locale;
import java.util.Scanner;

    public class Resultado {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            scanner.useLocale(Locale.ENGLISH);
            System.out.println("Qual a nota do Vinicius");
            double aluno1 = scanner.nextDouble();
            System.out.println("Qual a nota da Elaine");
            double aluno2 = scanner.nextDouble();
            double media = (aluno1 + aluno2) / 2;
            System.out.println("a media da nota dos alunos é:" + media);
        }
}
