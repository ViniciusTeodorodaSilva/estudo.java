public class Principal {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setNome("celular");
        produto.setPreco(2000);

        System.out.println("O " + produto.getNome() + " tem o preço de R$" + produto.getPreco());

        produto.aplicarDesconto(10);
        System.out.println("Com desconto fica R$" + produto.getPreco());


    }
}
