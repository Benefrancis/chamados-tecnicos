package br.com.fiap.shift.chamados.model;

public class Pessoa implements Model<Pessoa> {

    private long id;

    private String nome;

    protected Pessoa(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    protected Pessoa() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
