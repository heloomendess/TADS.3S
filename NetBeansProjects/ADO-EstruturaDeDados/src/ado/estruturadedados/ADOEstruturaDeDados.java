package ado.estruturadedados;

/**
 *
 * 
 * 
 * 
 * 
 * 
 * CLASSE DE TESTE
 */

import java.util.Scanner;

public class ADOEstruturaDeDados {

    public static void main(String[] args) {
        Vetor vetorFilmes = new Vetor();
        Scanner input = new Scanner(System.in);
        
        while(true) {
            System.out.println("MENU: ");
            System.out.println("1. Adicionar filme");
            System.out.println("2. Pesquisar filme");
            System.out.println("3. Alterar filme");
            System.out.println("4. Excluir filme");
            System.out.println("5. Listar filmes");
            System.out.println("6. Sair");
            System.out.println("Escolha uma opcao: ");
            int opcao = input.nextInt();
            
            input.nextLine();
            
            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do filme: ");
                    String nomeDoFilme = input.nextLine();
                    
                    System.out.println("Digite o nome do diretor do filme: ");
                    String diretor = input.nextLine();
                    
                    System.out.println("Digite o ano de lancamento do filme: ");
                    int anoDeLancamento = input.nextInt();
                    
                    System.out.println("Digite o genero do filme: ");
                    String generoDoFilme = input.nextLine();
                    
                    Filmes filme = new Filmes(nomeDoFilme, diretor, anoDeLancamento);
                    vetorFilmes.addFilme(filme);
                    
                    System.out.println("Filme adicionado com sucesso!");
                    break;
                    
                case 2:
                    System.out.println("Por gentileza, digite o filme que voce deseja encontrar: ");
                    nomeDoFilme = input.nextLine();
                    
                    Filmes buscarFilme = vetorFilmes.pesquisarFilme(nomeDoFilme);
                    
                    if(buscarFilme != null) {
                        System.out.println("Filme encontrado!!");
                    } else {
                        System.out.println("Filme nao encontrado :(");
                    } 
                    break;
                    
                case 3: 
                    System.out.println("Digite nome do filme a ser alterado: ");
                    nomeDoFilme = input.nextLine();
                    
                    System.out.println("Digite o novo nome do filme: ");
                    String novoNome = input.nextLine();
                    
                    System.out.println("Digite o nome do novo diretor do filme: ");
                    String novoDiretor = input.nextLine();
                    
                    System.out.println("Digite o novo ano de lancamento do filme: ");
                    int novoAnoDeLancamento = input.nextInt();
                    
                    Filmes novoFilme = new Filmes(novoNome, novoDiretor, novoAnoDeLancamento);
                    
                    if(vetorFilmes.alterarFilme(nomeDoFilme, novoFilme)) {
                        System.out.println("Filme alterado com sucesso!");
                    } else {
                        System.out.println("Poxa! Filme nao encontrado :(");
                    } 
                    break;
                    
                case 4: 
                    System.out.println("Digite o nome do filme a ser excluido: ");
                    nomeDoFilme = input.nextLine();
                    
                    if(vetorFilmes.excluirFilme(nomeDoFilme)) {
                        System.out.println("Filme excluido com sucesso!");
                    } else {
                        System.out.println("Filme nao encontrado :(");
                    }
                    break;
                    
                case 5:
                    System.err.println("Lista de filmes: ");
                    
                    vetorFilmes.listarFilmes();
                    break;
                    
                case 6:
                    System.err.println("Tchau tchau!");
                    return;
                    
                default:
                    System.out.println("Opcao inválida. Tente novamente.");
            }
        }
    }
    
}
