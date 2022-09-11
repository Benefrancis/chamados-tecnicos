package br.com.fiap.shift.chamados.model;

import java.time.ZonedDateTime;

public class Ocorrencia implements Model<Ocorrencia> {

    private long id;

    private long chamado;

    private String descricao;

    private Pessoa pessoa;

    private ZonedDateTime data;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getChamado() {
        return chamado;
    }

    public void setChamado(long id) {
        this.chamado = id;
    }


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public ZonedDateTime getData() {
        return data;
    }

    public void setData(ZonedDateTime data) {
        this.data = data;
    }

}
