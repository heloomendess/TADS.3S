
package ado2.estrutura.de.dados;

import java.util.Scanner;

public class TesteFila {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fila fila = new Fila(10);

        while (true) {
            System.out.println("\n1. Solicitar nova senha");
            System.out.println("2. Excluir uma senha");
            System.out.println("3. Listar todas as senhas");
            System.out.println("4. Visualizar próximo a ser atendido");
            System.out.println("5. Chamar próximo a ser atendido");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o tipo de paciente (Comum ou Prioridade): ");
                    String tipo = scanner.next();
                    int numeroSenha = (tipo.equals("Prioridade")) ? fila.tamanhoPrioridade + 1 : fila.tamanhoComum + 1;
                    fila.adicionarPaciente(tipo, numeroSenha);
                    System.out.println("Senha " + numeroSenha + " gerada para paciente " + tipo);
                    break;
                case 2:
                    System.out.print("Digite o tipo de senha a ser removida (Comum ou Prioridade): ");
                    String tipoRemover = scanner.next();
                    System.out.print("Digite o número da senha a ser removida: ");
                    int numeroSenhaRemover = scanner.nextInt();
                    fila.removerSenha(tipoRemover, numeroSenhaRemover);
                    break;
                case 3:
                    fila.listarSenhas();
                    break;
                case 4:
                    Paciente proximo = fila.proximoPaciente();
                    if (proximo != null) {
                        System.out.println("Próximo a ser atendido: " + proximo);
                    } else {
                        System.out.println("Não há pacientes na fila.");
                    }
                    break;
                case 5:
                    Paciente chamado = fila.chamarProximoPaciente();
                    if (chamado != null) {
                        System.out.println("Paciente chamado: " + chamado);
                    } else {
                        System.out.println("Não há pacientes na fila.");
                    }
                    break;
                case 6:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}

