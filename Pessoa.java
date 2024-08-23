/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula3;

/**
 *
 * @author heloisa.mnbarbosa
 */
public class Pessoa extends Object {
    
    private String nome;
    private int idade;
    private boolean matriculaAtiva = false;
    private boolean MensalidadePaga = false;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        System.out.println("Pessoa foi criada com sucesso!!");
    }
    
    @Override // ele é uma forma de garantir que voce está sobrescrevendo um metodo e nao criando um novo
    public String toString() { //toString é um padrao para passar informacoes
        return "Pessoa: " + getNome() + ", " + idade + " anos.";
    }
    
    public void AtivaMatricula() {
        this.matriculaAtiva = true;
    }
    
    public boolean isMatriculado() {
        return this.matriculaAtiva;
    }
    
    public boolean isMensalidadePaga() {
        return this.MensalidadePaga;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
}
