import br.com.alura.animal.Animal;
import br.com.alura.animal.Cachorro;
import br.com.alura.animal.Gato;


public class Principal {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();
        cachorro.abanarRabo();

        Gato gato = new Gato();
        gato.emitirSom();
        gato.arranharMoveis();
    }
}


