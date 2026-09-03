public class Principal {
    public static void main(String[] args) {
        IdadePessoa pessoa1 = new IdadePessoa();
        pessoa1.setNome("Vinicius");
        pessoa1.setIdade(27);

        IdadePessoa pessoa2 = new IdadePessoa();
        pessoa2.setNome("Gabriel");
        pessoa2.setIdade(17);

        pessoa1.verificarIdade();
        pessoa2.verificarIdade();
    }
}
