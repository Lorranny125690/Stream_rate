package Interfaces;

public interface Comunicavel {
    void adicionarComentario(String filme, String comentario);
    String[] obterComentarios(String filme);
    boolean removerComentario(String filme, String comentario);
}
