package br.com.alura.minhasmusicas.modelos;

public class MInhasPreferidas {

    public void inclui(Audio audio) {
        if (audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + " è considerado sucesso absoluto");
        } else {
            System.out.println(audio.getTitulo() + " tem bastante gente curtindo");
        }
    }
}
