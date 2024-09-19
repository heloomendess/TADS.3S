/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ado2.estrutura.de.dados;

/**
 *
 * @author heloisa.mnbarbosa
 */
public class Paciente {
    
    private String tipo;
    private int numeroSenha;

    public Paciente(String tipo, int numeroSenha) {
        this.tipo = tipo;
        this.numeroSenha = numeroSenha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumeroSenha() {
        return numeroSenha;
    }

    public void setNumeroSenha(int numeroSenha) {
        this.numeroSenha = numeroSenha;
    }

    @Override
    public String toString() {
        return "Paciente{" + "tipo=" + tipo + ", numeroSenha=" + numeroSenha + '}';
    }
    
        
    
}
