public class ExercicioEncapsulado {

        private int numero;
        private int agencia;
        private double saldo;

    public void deposita(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public void saca(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("saldo indisponivel");
    }

        public void setNumero(int numero) {
            this.numero = numero;
        }

        public void setAgencia(int agencia) {
            this.agencia = agencia;
        }

        public int getNumero() {
            return numero;
        }

        public int getAgencia() {
            return agencia;
        }

        public double getSaldo() {
            return saldo;
        }
    }
}
