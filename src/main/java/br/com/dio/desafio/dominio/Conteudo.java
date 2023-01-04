package br.com.dio.desafio.dominio;

public abstract class Conteudo {

    protected static final XP_PADRAO = 10d;
    private Sring titulo;
    private String descricao;

    public abstract double calcularXp();


    public Sring getTitulo() {
        return titulo;
    }

    public void setTitulo(Sring titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
