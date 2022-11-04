package br.com.biblioteca;

import br.com.biblioteca.model.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws Exception {

        /*
         * Criação do endereço
         */
        Endereco endereco = new Endereco();
        endereco.setId(1);
        endereco.setCep("56320000");
        endereco.setComplemento("Apto 0123");
        endereco.setCidade("Recife");
        endereco.setBairro("Bairro teste");
        endereco.setNumero("A20");
        endereco.setRua("Rua 15");
        endereco.setUf("PE");
        endereco.validarEndereco();

        /*
         * Criação do Aluno
         */
        Aluno aluno = new Aluno(1, "Joane", "Barros", "joane.barros@gmail.com",
                LocalDate.of(1994, 12, 20), endereco);
        aluno.validarAluno();

        /*
         * Criação do Livro
         */
        Livro livro = new Livro(1, "O poder do hábito", "auto ajuda", "2019", "010", null);
        Livro livro2 = new Livro(2, "Uma morte súbita", "Suspense", "2020", "011", null);

        /*
         * Criação do Autor
         */
        Autor autor = new Autor(1, "Charles Duhigg");

        /*
         * Criação do Autoria
         */
        Autoria autoria = new Autoria(autor, livro);
        Autoria autoria2 = new Autoria(autor, livro2);

        HashSet autorias = new HashSet<Autoria>(); //
        autorias.add(autoria);
        autorias.add(autoria2);

        /*
         * Criação do Reserva
         */
        Reserva reserva = new Reserva(1, LocalDate.now(), null, aluno, null, livro);

        /*
         * Criação do Biblioteca
         */
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.setId(1);

        livro.setBiblioteca(biblioteca);
        livro2.setBiblioteca(biblioteca);
        reserva.setBibliotecaId(biblioteca);

        biblioteca.setNome("Biblioteca teste");
        biblioteca.setDescricao("Biblioteca referência da cidade");
        biblioteca.setLivros(Set.of(livro, livro2));
        biblioteca.setReservas(Set.of(reserva));

        // Saídas
        System.out.println("Todas as Reservas: " + reserva);
        System.out.println("Todas as Autorias: " + autorias);
        System.out.println("Livros disponíveis da Biblioteca: " + biblioteca.getLivros());
    }
}