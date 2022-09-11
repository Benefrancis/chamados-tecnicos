package br.com.fiap.shift.chamados.repository;

public interface Repository<T> {
    T findById(Long id);

}
