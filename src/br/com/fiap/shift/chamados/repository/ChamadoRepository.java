package br.com.fiap.shift.chamados.repository;

import br.com.fiap.shift.chamados.model.Chamado;
import br.com.fiap.shift.chamados.model.Ocorrencia;
import br.com.fiap.shift.chamados.model.Tecnico;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

public class ChamadoRepository implements Repository<Chamado> {

    public static SolicitanteRepository solicitanteRepo = new SolicitanteRepository();

    public static TecnicoRepository tecnicoRepo = new TecnicoRepository();

    private static final List<Chamado> chamados;

    static {
        chamados = new ArrayList<>();
        chamados.add(new Chamado(1L, "Erro na ativação do windows", "Está aparecendo a mensagem que o meu Sistema Operacional não está registrado, porém meu notebook é novo. Comprei na Galeria Pagé no último sábado.", solicitanteRepo.findById(2L)));


        //
        Chamado cControl = new Chamado(2L, "Como saber o histórico do comando copiar e colar do windows", "Gostaria de saber como acessar o histórico do comando Control+C ", solicitanteRepo.findById(7L));
        Tecnico t = tecnicoRepo.findById(1L);
        if (t != null) cControl.setTecnico(t);
        cControl.setDataPrimeiroAtendimento(ZonedDateTime.now());
        Ocorrencia ocorrencia = new Ocorrencia();
        ocorrencia.setData(ZonedDateTime.now());
        ocorrencia.setDescricao("Para acessar o histórico da área de transferência a qualquer momento, pressione a tecla do Windows + V no seu teclado. Você também pode colar e fixar itens usados com frequência, escolhendo um item individual usando o menu da área de transferência.");
        ocorrencia.setPessoa(t);
        ocorrencia.setId(1L);
        ocorrencia.setChamado(cControl.getId());
        cControl.getOcorrencias().add(ocorrencia);

        chamados.add(cControl);

        chamados.add(new Chamado(1L, "Erro na ativação do windows", "Está aparecendo a mensagem que o meu Sistema Operacional não está registrado, porém meu notebook é novo. Comprei na Galeria Pagé no último sábado.", solicitanteRepo.findById(1L)));

        chamados.add(new Chamado(1L, "Erro na ativação do windows", "Está aparecendo a mensagem que o meu Sistema Operacional não está registrado, porém meu notebook é novo. Comprei na Galeria Pagé no último sábado.", solicitanteRepo.findById(1L)));

        chamados.add(new Chamado(1L, "Erro na ativação do windows", "Está aparecendo a mensagem que o meu Sistema Operacional não está registrado, porém meu notebook é novo. Comprei na Galeria Pagé no último sábado.", solicitanteRepo.findById(1L)));

        chamados.add(new Chamado(1L, "Erro na ativação do windows", "Está aparecendo a mensagem que o meu Sistema Operacional não está registrado, porém meu notebook é novo. Comprei na Galeria Pagé no último sábado.", solicitanteRepo.findById(1L)));

        chamados.add(new Chamado(1L, "Erro na ativação do windows", "Está aparecendo a mensagem que o meu Sistema Operacional não está registrado, porém meu notebook é novo. Comprei na Galeria Pagé no último sábado.", solicitanteRepo.findById(1L)));


    }

    public Chamado findById(Long id) {
        return chamados.stream().filter(c -> c.getId() == id).findFirst().orElse(null);
    }


}
