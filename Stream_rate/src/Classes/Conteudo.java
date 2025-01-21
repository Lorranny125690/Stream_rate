package Classes;

import Interfaces.Exibivel;
import Interfaces.Comunicavel;
import Interfaces.Classificavel;

public abstract class Conteudo implements Exibivel, Comunicavel, Classificavel {

    private String nome;
    private String descricao;
    private String genero;
    private int ano;
    private String tipo;
    private String idioma;
    private double nota;

    public Conteudo(String nome, String descricao, String genero, int ano, String tipo, String idioma, double nota) {
        this.nome = nome;
        this.descricao = descricao;
        this.genero = genero;
        this.ano = ano;
        this.tipo = tipo;
        this.idioma = idioma;
        this.nota = nota;
    }

    // Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    // Implementation of Exibivel methods
    @Override
    public String exibirDetalhes(String nome, double nota, String genero, int ano, String tipo, String idioma) {
        return "Nome: " + nome + "\nNota: " + nota + "\nGênero: " + genero + "\nAno: " + ano + "\nTipo: " + tipo + "\nIdioma: " + idioma;
    }

    @Override
    public String exibirPrevia(String descricao) {
        return descricao.length() > 100 ? descricao.substring(0, 100) + "..." : descricao;
    }

    // Implementation of Comunicavel methods
    @Override
    public void adicionarComentario(String filme, String comentario) {
        // Implementation logic for adding a comment
    }

    @Override
    public String[] obterComentarios(String filme) {
        // Implementation logic for retrieving comments
        return new String[0];
    }

    @Override
    public boolean removerComentario(String filme, String comentario) {
        // Implementation logic for removing a comment
        return false;
    }

    // Implementation of AvaliacaoFilme methods
    @Override
    public double avaliar(Conteudo filme) {
        // Example logic for calculating a rating
        return filme.getNota();
    }

    @Override
    public String obterClassificacao(double pontuacao) {
        if (pontuacao >= 9) {
            return "Excelente";
        } else if (pontuacao >= 7) {
            return "Bom";
        } else if (pontuacao >= 5) {
            return "Regular";
        } else {
            return "Ruim";
        }
    }
}
