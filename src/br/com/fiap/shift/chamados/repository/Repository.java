package br.com.fiap.shift.chamados.repository;

public interface Repository<T> {
    public T findById(Long id);

}
