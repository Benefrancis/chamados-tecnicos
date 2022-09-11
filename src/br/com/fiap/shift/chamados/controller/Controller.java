package br.com.fiap.shift.chamados.controller;

import br.com.fiap.shift.chamados.model.Chamado;

public interface Controller<T> {
    public T findById(Long id);
}
