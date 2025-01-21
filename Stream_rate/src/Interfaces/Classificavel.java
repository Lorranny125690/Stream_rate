package Interfaces;

import Classes.Conteudo;

public interface Classificavel {
    double avaliar(Conteudo conteudo);
    String obterClassificacao(double pontuacao);
}
