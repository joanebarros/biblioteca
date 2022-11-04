package br.com.biblioteca.model;

public class Endereco {

    private Integer id;
    private String rua;
    private String cep;
    private String bairro;
    private String numero;
    private String complemento;
    private String cidade;
    private String uf;

    public Endereco() {
    }

    public Endereco(Integer id, String rua, String cep, String bairro, String numero,
                    String complemento, String cidade, String uf) {
        this.id = id;
        this.rua = rua;
        this.cep = cep;
        this.bairro = bairro;
        this.numero = numero;
        this.complemento = complemento;
        this.cidade = cidade;
        this.uf = uf;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void validarEndereco() throws Exception {
        if (id == null)
            errorDeValidacao("Chave primária precisa ser obrigatória");

        if (cep == null) // Se o cep nao for informado, entao lanca uma Exception de regra de negocio
            errorDeValidacao("O CEP precisa ser informado!");

        if (numero == null)
            errorDeValidacao("O numero precisa ser informado!");

        if (cidade == null)
            errorDeValidacao("A cidade precisa ser informada!");
    }

    private void errorDeValidacao(String message) throws Exception { // Lanca uma excecao tratada
        throw new Exception(message);
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "id=" + id +
                ", rua='" + rua + '\'' +
                ", cep='" + cep + '\'' +
                ", bairro='" + bairro + '\'' +
                ", numero='" + numero + '\'' +
                ", complemento='" + complemento + '\'' +
                ", cidade='" + cidade + '\'' +
                ", uf='" + uf + '\'' +
                '}';
    }
}
