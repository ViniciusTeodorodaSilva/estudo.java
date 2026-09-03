public class Principal {
    public static void main(String[] args) {
        Musica musica = new Musica();
        musica.titulo = "Beautiful Thing";
        musica.artista = "benson Boone";
        musica.anoDeLancamento = 2025;

        musica.avalia(10);
        musica.avalia(8);
        musica.exibeFichaTecnica();
        System.out.println(musica.mediaDeAvaliacao());



    }
}