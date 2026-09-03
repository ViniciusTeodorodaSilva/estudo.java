public class Musica {
    String titulo;
    String artista;
    int anoDeLancamento;
    double avaliacao;
    double numeroDeavaliacao;

    void exibeFichaTecnica(){
        System.out.println(titulo);
        System.out.println(artista);
        System.out.println(anoDeLancamento);
    }
    void avalia (double nota){
        avaliacao += nota;
        numeroDeavaliacao++;
    }

    double mediaDeAvaliacao(){
        return avaliacao/numeroDeavaliacao;
    }
}
