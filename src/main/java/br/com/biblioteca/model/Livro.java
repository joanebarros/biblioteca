package br.com.biblioteca.model;

public class Livro {

    private Integer id;
    private String titulo;
    private String genero;
    private String ano;
    private String codLivro;
    private Biblioteca biblioteca;

    public Livro() {
    }

    public Livro(Integer id, String titulo, String genero, String ano, String codLivro, Biblioteca biblioteca) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.ano = ano;
        this.codLivro = codLivro;
        this.biblioteca = biblioteca;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getCodLivro() {
        return codLivro;
    }

    public void setCodLivro(String codLivro) {
        this.codLivro = codLivro;
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", ano='" + ano + '\'' +
                ", codLivro='" + codLivro + '\'' +
                '}';
    }
}
