package br.com.fiap.shift.chamados.controller;

public interface Controller<T> {
    T findById(Long id);
}
