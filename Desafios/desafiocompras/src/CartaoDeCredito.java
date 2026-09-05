import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {
    private double saldo;
    private double limite;
    private List<Compra> compras;

    public CartaoDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public boolean lancaValor(Compra compra) {
        if (compra.getValor() <= saldo) {
            this.compras.add(compra);
            this.saldo -= compra.getValor();
            return true;
        }
        return false;
    }
}

