public class Resultado3 {
    public static void main(String[] args) {
        char alunoNota = 'A';
        String palavra = "Vinicius";
        String texto = String.format("O aluno %s é um aluno nota %c",palavra, alunoNota);
        System.out.println(texto);
    }
}
