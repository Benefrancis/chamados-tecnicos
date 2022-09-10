package br.com.fiap.shift.chamados.view;

import br.com.fiap.shift.chamados.controller.ChamadoController;
import br.com.fiap.shift.chamados.model.Chamado;

import java.util.Scanner;

public class App {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        byte opcao = montaMenu();

        do {
            switch (opcao) {
                case 1:
                    abrirChamado();
                    break;
                case 2:
                    consultarChamado();
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
            opcao = montaMenu();
        } while (opcao > 0);

    }


    public static void consultarChamado() {

        ChamadoController controller = new ChamadoController();
        Scanner scanner = new Scanner(System.in);
        System.out.println("**************************************************************\n");
        System.out.println("   -     CONSULTANDO CHAMADO TÉCNICO      -   \n");

        System.out.println("INFORME O NÚMERO DO TIKET ");
        long tiket = scanner.nextLong();

        Chamado chamado = controller.findById(tiket);

        if (chamado != null) {
            System.out.println(chamado);
        } else {
            System.out.println("Chamado não encontrado");
        }
    }


    public static void abrirChamado() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("**************************************************************");
        System.out.println("   -     ABRIR CHAMADO TÉCNICO      -   \n");

        System.out.println("Informe o Título para o Chamado Técnico");
        String titulo = scanner.nextLine();

        System.out.println("Informe o problema / ocorrido (Descreva com detalhes o que está acontecendo) EVITE PULAR LINHAS");
        String descricao = scanner.nextLine();
        int opFinal = continuaRelatando();

        do {
            if (opFinal == 1) {
                System.out.println(descricao);
                descricao += scanner.nextLine();
            }
            opFinal = continuaRelatando();
        } while (opFinal != 0);

        Chamado chamado = new Chamado(titulo, descricao, null);

        System.out.println("Chamdo Tecnico cadastrado com sucesso!");
        System.out.println(chamado);
        scanner.close();
    }

    public static int continuaRelatando() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("VOCÊ DESEJA: ");
        System.out.print("[ 1 ] - CONTINUAR DESCREVENDO O PROBLEMA \t");
        System.out.println("[ 0 ] - SALVAR O CHAMADO TECNICO");
        scanner.close();
        return scanner.nextInt();

    }

    /**
     * Método para montagem de menú de opções da Tela Principal
     *
     * @return
     */
    private static byte montaMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("**************************************************************");
        System.out.println("                                                              ");
        System.out.println("          BEM VINDO AO SISTEMA DE CHAMADOS TÉCNICOS           ");
        System.out.println("                                                              ");
        System.out.println("                         SHIFT FIAP                           ");
        System.out.println("                                                              ");
        System.out.println("**************************************************************");
        System.out.println("                                                              ");
        System.out.println("      --    INFORME A OPERAÇÃO QUE DESEJA REALIZAR    --      ");
        System.out.println("                                                              ");
        System.out.println("[ 1 ]  -  ABRIR CHAMADO TÉCNICO                               ");
        System.out.println("[ 2 ]  -  CONSULTAR CHAMADOS                                  ");
        System.out.println("[ 3 ]  -  ATENDER CHAMADO                                     ");
        System.out.println("[ 4 ]  -  CADASTRAR PESSOA                                    ");
        System.out.println("[ 0 ]  -  SAIR DO SISTEMA                                     ");
        System.out.println("                                                              ");

        byte opcao = sc.nextByte();

        if (opcao < 0 || opcao > 4) {
            System.exit(1);
        }
        return opcao;
    }

}
