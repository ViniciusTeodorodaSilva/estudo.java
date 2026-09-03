public class Principal {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.setNumeroConta(123);
        contaBancaria.setSaldo(4000);
        contaBancaria.titular = "Gustavo Teodoro";

        System.out.println("Titular da conta: "+contaBancaria.titular);
        System.out.println("Número da conta: "+contaBancaria.getNumeroConta());
        System.out.println("Saldo: "+contaBancaria.getSaldo());

    }
}
