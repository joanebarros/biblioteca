package br.com.biblioteca.model;

import java.time.LocalDate;

public class Reserva {

    private Integer id;
    private LocalDate dataReserva;
    private LocalDate dataDevolucao;
    private Aluno alunoId;
    private Biblioteca bibliotecaId;
    private Livro livroId;

    public Reserva() {
    }

    public Reserva(Integer id, LocalDate dataReserva, LocalDate dataDevolucao,
                   Aluno alunoId, Biblioteca bibliotecaId, Livro livroId) {
        this.id = id;
        this.dataReserva = dataReserva;
        this.dataDevolucao = dataDevolucao;
        this.alunoId = alunoId;
        this.bibliotecaId = bibliotecaId;
        this.livroId = livroId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(LocalDate dataReserva) {
        this.dataReserva = dataReserva;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Aluno getAlunoId() {
        return alunoId;
    }

    public void setAlunoId(Aluno alunoId) {
        this.alunoId = alunoId;
    }

    public Biblioteca getBibliotecaId() {
        return bibliotecaId;
    }

    public void setBibliotecaId(Biblioteca bibliotecaId) {
        this.bibliotecaId = bibliotecaId;
    }

    public Livro getLivroId() {
        return livroId;
    }

    public void setLivroId(Livro livroId) {
        this.livroId = livroId;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "id=" + id +
                ", dataReserva=" + dataReserva +
                ", dataDevolucao=" + dataDevolucao +
                ", alunoId=" + alunoId +
                ", bibliotecaId=" + bibliotecaId +
                ", livroId=" + livroId +
                '}';
    }
}
