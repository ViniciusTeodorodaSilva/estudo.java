public class Principal {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Gustavo", 7.5, 8.5, 9.0);
        Aluno aluno2 = new Aluno("Vinicius", 8.2, 10, 7.5);

        System.out.println("Aluno1");
        System.out.println(("Nome: " + aluno1.getNome()));
        System.out.println("nota 1: " + aluno1.getNota1());
        System.out.println("nota 2: " + aluno1.getNota2());
        System.out.println("nota 3: " + aluno1.getNota3());
        System.out.println("A média das notas é: " + aluno1.calcularMedia());

        System.out.println("Aluno2");
        System.out.println(("Nome: " + aluno2.getNome()));
        System.out.println("nota 1: " + aluno2.getNota1());
        System.out.println("nota 2: " + aluno2.getNota2());
        System.out.println("nota 3: " + aluno2.getNota3());
        System.out.println("A média das notas é: " + aluno2.calcularMedia());


    }
}
