import br.com.alura.minhasmusicas.modelos.MInhasPreferidas;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica musica = new Musica();
        musica.setTitulo("Wonderwall");
        musica.setCantor("Oasis");

        for (int i = 0; i < 1000; i++) {
            musica.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            musica.curte();
        }

        Podcast podcast = new Podcast();
        podcast.setTitulo("Só Dev");
        podcast.setApresentador("Gustavo Teodoro");

        for (int i = 0; i < 1000; i++) {
            podcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            podcast.curte();
        }

        MInhasPreferidas preferidas = new MInhasPreferidas();
        preferidas.inclui(musica);
        preferidas.inclui(podcast);
    }
}