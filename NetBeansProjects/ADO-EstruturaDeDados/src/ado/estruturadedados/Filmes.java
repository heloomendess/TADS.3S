/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ado.estruturadedados;

/**
 *
 * @author heloisa.mnbarbosa
 */
public class Filmes {
    
    private String nomeDoFilme;
    private String diretor;
    private int anoDeLancamento;
    private String generoDoFilme;

    public Filmes(String nomeDoFilme, String diretor, int anoDeLancamento, String generoDoFilme) {
        this.nomeDoFilme = nomeDoFilme;
        this.diretor = diretor;
        this.anoDeLancamento = anoDeLancamento;
        this.generoDoFilme = generoDoFilme;
    }

    Filmes(String nomeDoFilme, String diretor, int anoDeLancamento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNomeDoFilme() {
        return nomeDoFilme;
    }

    public void setNomeDoFilme(String nomeDoFilme) {
        this.nomeDoFilme = nomeDoFilme;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public String getGeneroDoFilme() {
        return generoDoFilme;
    }

    public void setGeneroDoFilme(String generoDoFilme) {
        this.generoDoFilme = generoDoFilme;
    }
    
    @Override
    public String toString() {
        return "Filme: " + nomeDoFilme +
               "Diretor do filme: " + diretor + 
               "Genero do filme: " + generoDoFilme + 
               "Ano de Lancamento: " + anoDeLancamento; 
    }
    
}
