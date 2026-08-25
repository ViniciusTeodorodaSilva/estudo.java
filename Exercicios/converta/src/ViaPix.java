public class ViaPix {

            String nome;
            double preco;
            double descontoParaPix;
            boolean pagamentoViaPix;

            double pegaPrecoFinal() {
                if (pagamentoViaPix == true) {
                    return preco - descontoParaPix;
                } else {
                    return preco;
                }

            }

        }


