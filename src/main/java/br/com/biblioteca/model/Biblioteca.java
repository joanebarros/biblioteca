package br.com.biblioteca.model;

import java.util.HashSet;
import java.util.Set;

public class Biblioteca {

    private Integer id;
    private String nome;
    private String descricao;
    private Set<Livro> livros = new HashSet<>();
    private Set<Reserva> reservas = new HashSet<>();


    public Biblioteca() {

    }

    public Biblioteca(Integer id, String nome, String descricao, Set<Livro> livros, Set<Reserva> reservas) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.livros = livros;
        this.reservas = reservas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public Set<Livro> getLivros() {
        return livros;
    }

    public void setLivros(Set<Livro> livros) {
        this.livros = livros;
    }

    public Set<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(Set<Reserva> reservas) {
        this.reservas = reservas;
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
