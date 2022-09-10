package br.com.fiap.shift.chamados.view;

import br.com.fiap.shift.chamados.model.Chamado;
import br.com.fiap.shift.chamados.model.Ocorrencia;

import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;

/**
 * View do módrl Chamado do sistema de Chamados Técnicos
 *
 * @author Francis
 * @version 1.0
 * @since 1.0
 */
public class ChamadoView implements View<Chamado> {
    /**
     * Exibe os dados de um chamado no prompt
     *
     * @param chamado
     */
    public void exibe(final Chamado chamado) {
        limparTela();
        Scanner scanner = new Scanner(System.in);
        System.out.println("**************************************************************");
        System.out.println("     -                CHAMADO TÉCNICO                 -    \n");
        System.out.println(setCor("Número: ", 94) + setCor(String.valueOf(chamado.getId()), 31) + setCor("                                  TIKET: ", 94) + setCor(chamado.getNumero(), 31) + "\n\n");

        System.out.println(setCor("TITULO: \n", 94) + chamado.getTitulo() + "                      \n");
        System.out.println(setCor("DESCRICÃO: \n", 94));
        System.out.println(chamado.getDescricao() + "\n\n");

        if (chamado.getTecnico() != null)
            System.out.println(setCor("TECNICO: ", 94) + setCor(chamado.getTecnico().getNome(), 31) + "                 \n");
        System.out.println(setCor("INÍCIO: ", 94) + chamado.getDataPrimeiroAtendimento().format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)));

        System.out.println(setCor("OCORRÊNCIAS:", 94));
        if (chamado.getOcorrencias().size() > 0) {
            for (Ocorrencia o : chamado.getOcorrencias()) {
                System.out.println(setCor("DATA: ", 94) + o.getData().format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)));
                System.out.println(setCor("DESCRICÃO: ", 94));
                System.out.println(o.getDescricao() + "\n");
            }
        } else {
            System.out.println("NÃO TEMOS OCORRÊNCIAS CADASTRADAS PARA ESTE CHAMADO");
        }


        System.out.println("---------------------------------------------------------------");
    }


}
