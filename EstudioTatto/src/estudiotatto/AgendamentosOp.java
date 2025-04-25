/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiotatto;

import java.util.Scanner;

/**
 *
 * @author 00354887
 */
public class AgendamentosOp {

    Scanner entrada = new Scanner(System.in);

    String nomeCli, imagem, nomeProfissional, formPag, horarioMarcado, tamanhoEscolhido;
    int cor, pagamento, dia, profissional, tamanho_tattoo, flag_val, horario;

    private void nomeCliente() {
        System.out.println("Informe seu nome completo:");
        nomeCli = entrada.nextLine();
    
        while (nomeCli.isEmpty()) {
            System.out.println("Digite um nome válido.");
            nomeCli = entrada.nextLine();
        }
    }

    private void forMulario() {
        flag_val = 1;
        while (flag_val == 1) {
            System.out.println("\n*******Formulário de agendamento*******");
            System.out.println("* Qual o tamanho desejado da tatuagem? *\n"
                    + "* Digite um número de 1 a 5:         *\n"
                    + "* (1)5cm                                *\n"
                    + "* (2)10cm                               *\n"
                    + "* (3)15cm                               *\n"
                    + "* (4)+15cm                              *\n"
                    + "* (5)Cancelar agendamento               *\n");
            tamanho_tattoo = entrada.nextInt();
            if (tamanho_tattoo >= 1 && tamanho_tattoo <= 5) {
                switch (tamanho_tattoo) {
                    case 1:
                        tamanhoEscolhido = "5cm";
                        break;
                    case 2:
                        tamanhoEscolhido = "10cm";
                        break;
                    case 3:
                        tamanhoEscolhido = "15cm";
                        break;
                    case 4:
                        tamanhoEscolhido = "+15cm";
                        break;
                    case 5:
                        exibirSair();
                }
                flag_val = 0;
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }

    private void OpcCor() {
        flag_val = 1;
        while (flag_val == 1) {
            System.out.println("\n*******Formulário de agendamento*******");
            System.out.println("* Selecione a cor da tatuagem:           *\n"
                    + "* Digite um número de 1 a 3:             *\n"
                    + "* (1)Preto                              *\n"
                    + "* (2)Colorido                           *\n"
                    + "* (3)Cancelar agendamento               *\n");
            cor = entrada.nextInt();
            if (cor == 1 || cor == 2) {
                imagem = (cor == 1) ? "Preto" : "Colorido";
                flag_val = 0;
            } else if (cor == 3) {
                exibirSair();
                
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }

    private void OpcProfissional() {
        flag_val = 1;
        while (flag_val == 1) {
            System.out.println("\n********Formulário de agendamento*******");
            System.out.println("* Selecione um dos nossos profissionais: *\n"
                    + "* Digite um número de 1 a 3:             *\n"
                    + "* (1)Beatriz                             *\n"
                    + "* (2)Guilherme                           *\n"
                    + "* (3)Cancelar agendamento                *\n");
            profissional = entrada.nextInt();
            if (profissional >= 1 && profissional <= 3) {
                flag_val = 0;
            } else if (profissional == 3) {
                exibirSair();
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }

    private void exibirHorarios() {
        flag_val = 1;
        while (flag_val == 1) {
            System.out.println("*******HORÁRIOS DE ATENDIMENTO*******\n");
            System.out.println("Informe o horário desejado:          \n"
                    + "* Digite um número de 1 a 5:            *\n"
                    + "* (1) Das 10:00 as 11:30hrs             *\n"
                    + "* (2) Das 12:00 as 13:30hrs             *\n"
                    + "* (3) Das 15:00 as 16:30hrs             *\n"
                    + "* (4) Das 17:00 as 18:30hrs             *\n"
                    + "* (5)Cancelar agendamento               *\n");
            horario = entrada.nextInt();
    
            if (horario >= 1 && horario <= 5) {
                
                switch (horario) {
                    case 1:
                        horarioMarcado = "Das 10:00 as 11:30hrs";
                        break;
                    case 2:
                        horarioMarcado = "Das 12:00 as 13:30hrs";
                        break;
                    case 3:
                        horarioMarcado = "Das 15:00 as 16:30hrs";
                        break;
                    case 4:
                        horarioMarcado = "Das 17:00 as 18:30hrs";
                        break;
                    case 5:
                        exibirSair();
                }
                flag_val = 0;
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }

    private void formasPagamento() {
        flag_val = 1;
        while (flag_val == 1) {
            System.out.println("\n--------------------------------------\n");
            System.out.println("*******Formas de pagamento*******\n"
                    + "* (1)PIX\n"
                    + "* (2)Cartão Crédito/Débito\n"
                    + "* (3)Cancelar agendamento");
            pagamento = entrada.nextInt();
            if (pagamento == 1 || pagamento == 2) {
                formPag = (pagamento == 1) ? "PIX" : "Cartão Crédito/Débito";
                flag_val = 0;
            } else if (pagamento == 3) {
                exibirSair();
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }

    private void exibirSair() {
        System.out.println("Saindo do Sistema");
        System.exit(0);
    }

    private void exibirMenu() {
        System.out.println("\n*******AGENDAMENTO CONCLUÍDO*******");
        System.out.println("* Nome: " + nomeCli);
        System.out.println("* Tamanho da tatuagem: " + tamanhoEscolhido);
        System.out.println("* Cor da tatuagem: " + imagem);
        System.out.println("* Profissional: " + nomeProfissional);
        System.out.println("* Dia do agendamento: " + dia);
        System.out.println("* Horário: " + horarioMarcado);
        System.out.println("* Forma de pagamento: " + formPag);
        System.out.println("*************************************");
    }

    private void OpcSPrincipais() {

        OpcCor();

        OpcProfissional();

        switch (profissional) {
            case 1:
                nomeProfissional = "Beatriz";
                flag_val = 1;
                while (flag_val == 1) {
                    System.out.println("\n*******Agenda de Beatriz*******\n* Dias disponíveis: 1 ao 15    *\n");
                    System.out.println("Informe o dia desejado: ");
                    dia = entrada.nextInt();
                    if (dia >= 1 && dia <= 15) {
                        flag_val = 0;
                    } else {
                        System.out.println("Dia indisponível. Tente novamente.");
                    }
                }
                break;

            case 2:
                nomeProfissional = "Guilherme";
                flag_val = 1;
                while (flag_val == 1) {
                    System.out.println("\n*******Agenda de Guilherme*******\n* Dias disponíveis: 16 ao 30    *\n");
                    System.out.println("Informe o dia desejado: ");
                    dia = entrada.nextInt();
                    if (dia >= 16 && dia <= 30) {
                        flag_val = 0;
                    } else {
                        System.out.println("Dia indisponível. Tente novamente.");
                    }
                }
                break;

            case 3:
                exibirSair();
                return;
        }

        exibirHorarios();
        formasPagamento();
        exibirMenu();
    }

    public void getChama() {
        nomeCliente();
        forMulario();
        OpcSPrincipais();
    }
}