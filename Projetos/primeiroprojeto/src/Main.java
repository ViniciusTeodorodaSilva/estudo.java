
public class Main {
    public static void main(String[] args) {
        System.out.printf("Este é o Screen Match");
        System.out.println("Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        //media calculada entre as notas dos meus amigos
        double media = (9.1 + 7 + 6.5)/3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Top Gun: Maverick
                Filme de aventura com galã dos anos 90
                Muito bom!
                Ano de lançamento
                """ + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao;
        classificacao = (int) (media/2);
        System.out.println(classificacao);


    }
}