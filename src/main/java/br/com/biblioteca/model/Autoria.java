package br.com.biblioteca.model;

/**
 * TB Intermediária
 */
public class Autoria {

    private Autor autorId;
    private Livro livroId;

    public Autoria() {
    }

    public Autoria(Autor autorId, Livro livroId) {
        this.autorId = autorId;
        this.livroId = livroId;
    }

    public Autor getAutorId() {
        return autorId;
    }

    public void setAutorId(Autor autorId) {
        this.autorId = autorId;
    }

    public Livro getLivroId() {
        return livroId;
    }

    public void setLivroId(Livro livroId) {
        this.livroId = livroId;
    }

    @Override
    public String toString() {
        return "Autoria{" +
                "autorId=" + autorId +
                ", livroId=" + livroId +
                '}';
    }
}
