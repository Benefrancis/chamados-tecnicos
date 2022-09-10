package br.com.fiap.shift.chamados.model;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Chamado {

    // Dados básicos
    private long id;
    private String numero;
    private String titulo;
    private String descricao;

    // Histórico
    private final List<Ocorrencia> ocorrencias = new ArrayList<>();

    // Pessoas
    private Tecnico tecnico;
    private Solicitante solicitante;

    // Datas importantes
    private ZonedDateTime dataAbertura;
    private ZonedDateTime dataPrimeiroAtendimento;
    private ZonedDateTime dataEncerramento;

    // Construtores
    public Chamado(String titulo, String descricao, Solicitante solicitante) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.solicitante = solicitante;
    }

    public Chamado(Long id, String titulo, String descricao, Solicitante solicitante) {
        Random r = new Random();
        int cod = r.nextInt(256);
        this.id = id;
        this.titulo = titulo;
        this.numero = LocalDateTime.now().getYear() + "." + id + "." + cod;
        this.descricao = descricao;
        this.solicitante = solicitante;
        this.dataAbertura = ZonedDateTime.now();
    }

    public long getTiket() {
        return getId();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Ocorrencia> getOcorrencias() {
        return ocorrencias;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public Solicitante getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(Solicitante solicitante) {
        this.solicitante = solicitante;
    }

    public ZonedDateTime getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(ZonedDateTime dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public ZonedDateTime getDataPrimeiroAtendimento() {
        return dataPrimeiroAtendimento;
    }

    public void setDataPrimeiroAtendimento(ZonedDateTime dataPrimeiroAtendimento) {
        this.dataPrimeiroAtendimento = dataPrimeiroAtendimento;
    }

    public ZonedDateTime getDataEncerramento() {
        return dataEncerramento;
    }

    public void setDataEncerramento(ZonedDateTime dataEncerramento) {
        this.dataEncerramento = dataEncerramento;
    }


    @Override
    public String toString() {
        return "Chamado{" +
                "id=" + id +
                ", numero='" + numero + '\'' +
                ", titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", ocorrencias=" + ocorrencias +
                ", tecnico=" + tecnico +
                ", solicitante=" + solicitante +
                ", dataAbertura=" + dataAbertura +
                ", dataPrimeiroAtendimento=" + dataPrimeiroAtendimento +
                ", dataEncerramento=" + dataEncerramento +
                '}';
    }
}
