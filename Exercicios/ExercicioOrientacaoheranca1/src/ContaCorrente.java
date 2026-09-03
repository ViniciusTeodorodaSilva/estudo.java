public class ContaCorrente extends ContaBancaria{
    private double tarifaMensal = 30;

    public void cobrarTarifaMensal() {
        saldo -= tarifaMensal;
        System.out.println("A tarifa mensal é: " + tarifaMensal + " saldo atual: " +saldo);
    }
}
