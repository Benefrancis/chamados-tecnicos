package br.com.fiap.shift.chamados.model;

import java.time.ZonedDateTime;

public class Ocorrencia implements Model<Ocorrencia> {

    private long id;

    private long chamado_id;

    private String descricao;

    private Pessoa pessoa;

    private ZonedDateTime data;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getChamado_id() {
        return chamado_id;
    }

    public void setChamado_id(long chamado_id) {
        this.chamado_id = chamado_id;
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
