/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula3;

/**
 *
 * @author heloisa.mnbarbosa
 */
public class Aluno extends Pessoa {

    private String curso;
    private float mensalidade;
   
    public Aluno(String nome, int idade, String curso, float mensalidade) {
        super(nome, idade);
        this.curso = curso;
        this.mensalidade = mensalidade;
    }
    


    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public float getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(float mensalidade) {
        this.mensalidade = mensalidade;
    }
   
    @Override
    public String toString() {
        return "Aluno: " + getNome() + ",  " + getIdade() + " anos." + " Mensalidade: " + getMensalidade() + "Curso: " + getCurso();
    }
    
    //Versao 1
    public void MensalidadePaga() {
        if(isMensalidadePaga()) {
        System.out.println(getNome() + " pagou a mensalidade de " + getMensalidade());
        } else if (mensalidade == 0){
            System.out.println("Aluno bolsista");
        } else {
            System.out.println("Tá devendo a mensalidade!!");
        }
    }
    
      /* Versao 2
    public void pagaMensalidade() {
        if(isMatriculado()) {
            System.out.println("Pagando mensalidade de R$" + getMensalidade()); 
        } else { 
            System.out.println("Aluno desligado da unidade");
        }
    }
     */
    
}
