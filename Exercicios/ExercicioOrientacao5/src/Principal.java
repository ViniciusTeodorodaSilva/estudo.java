public class Principal {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Harry Potter", "J. K. Rowling");
        Livro livro2 = new Livro("A Odisséia", "Homero");

        livro1.exibeFichaTecnica();
        livro2.exibeFichaTecnica();
    }
}
