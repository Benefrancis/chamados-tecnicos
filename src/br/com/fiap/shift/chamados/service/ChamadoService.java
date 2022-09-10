package br.com.fiap.shift.chamados.service;

import br.com.fiap.shift.chamados.repository.ChamadoRepository;

public class ChamadoService {
    ChamadoRepository repo;

    public ChamadoService() {
        repo = new ChamadoRepository();
    }
}
