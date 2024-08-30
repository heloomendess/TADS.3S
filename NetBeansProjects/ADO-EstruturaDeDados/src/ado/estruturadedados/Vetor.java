package ado.estruturadedados;

import java.util.ArrayList;

public class Vetor {
    private ArrayList<Filmes>listaDeFilmes;
    
    public Vetor() {
        listaDeFilmes = new ArrayList<>();
    }
    
    //Metodos para add os filmes
    public void adicionarFilme(Filmes filme) {
        listaDeFilmes.add(filme);
    }
    
    //Pesquisar o filme pelo seu nome
    public Filmes pesquisarFilme(String nomeDoFilme) {
        for(Filmes filme : listaDeFilmes) {
            if(filme.getNomeDoFilme().equalsIgnoreCase(nomeDoFilme)) {
                return filme;
            }
        }
        return null;
    }
    
    //Altera o filme
    public boolean alterarFilme (String nomeDoFilme, Filmes novoFilme) {
        for(int i = 0; i < listaDeFilmes.size(); i++) {
            if(listaDeFilmes.get(i).getNomeDoFilme().equalsIgnoreCase(nomeDoFilme)) {
                listaDeFilmes.set(i, novoFilme);
                return true;
            }
        }
        return false;
    }
    
    //Excluir filme
    public boolean excluirFilme(String nomeDoFilme) {
        return listaDeFilmes.removeIf(filme -> filme.getNomeDoFilme().equalsIgnoreCase(nomeDoFilme));
    }
    
    //Listar todos os livros no terminal
    public void listarFilmes() {
        Iterable<Filmes> listarFilmes = null;
        for(Filmes filme : listarFilmes) {
            System.out.println(filme);
        }
    }    

    void addFilme(Filmes filme) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
