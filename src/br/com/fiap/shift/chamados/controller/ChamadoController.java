package br.com.fiap.shift.chamados.controller;

import br.com.fiap.shift.chamados.model.Chamado;
import br.com.fiap.shift.chamados.repository.ChamadoRepository;
import br.com.fiap.shift.chamados.service.ChamadoService;

public class ChamadoController {

    ChamadoService service = new ChamadoService();
    ChamadoRepository repo = new ChamadoRepository();

    public Chamado findById(Long id) {
        return repo.findById(id);
    }


}
