package br.com.fiap.shift.chamados.repository;

import br.com.fiap.shift.chamados.model.Chamado;

import java.util.ArrayList;
import java.util.List;

public class ChamadoRepository {

    public static SolicitanteRepository solicitanteRepo = new SolicitanteRepository();
    private static List<Chamado> chamados;

    static {
        chamados = new ArrayList<>();
        chamados.add(new Chamado(1L,"Erro na ativação do windows", "Está aparecendo a mensagem que o meu Sistema Operacional não está registrado, porém meu notebook é novo. Comprei na Galeria Pagé no último sábado.", solicitanteRepo.findById(1)));
    }

    public Chamado findById(Long id) {
        return chamados.stream().filter(c -> c.getId() == id).findFirst().orElse(null);
    }


}
