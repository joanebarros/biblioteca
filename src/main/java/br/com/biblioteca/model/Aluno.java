package br.com.biblioteca.model;

import java.time.LocalDate;

public class Aluno {

    private Integer id;
    private String nome;
    private String sobreNome;
    private String email;
    private LocalDate dataNasc;
    private Endereco enderecoId;

    public Aluno() {

    }

    public Aluno(Integer id, String nome, String sobreNome, String email, LocalDate dataNasc, Endereco enderecoId) {
        this.id = id;
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.email = email;
        this.dataNasc = dataNasc;
        this.enderecoId = enderecoId;
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

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    public Endereco getEnderecoId() {
        return enderecoId;
    }

    public void setEnderecoId(Endereco enderecoId) {
        this.enderecoId = enderecoId;
    }

    public void validarAluno() throws Exception {
        if (id == null)
            errorDeValidacao("Chave primária precisa ser obrigatória");

        if (nome == null)
            errorDeValidacao("O nome precisar ser informado");

        if (sobreNome == null)
            errorDeValidacao("O sobremome precisar ser informado");

        if (dataNasc == null)
            errorDeValidacao("A data de nascimento presisar ser informada");

        if (enderecoId == null)
            errorDeValidacao("O endereco precisa ser preenchido");
    }

    private void errorDeValidacao(String message) throws Exception {
        throw new Exception(message);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", sobreNome='" + sobreNome + '\'' +
                ", email='" + email + '\'' +
                ", dataNasc=" + dataNasc +
                '}';
    }
}
