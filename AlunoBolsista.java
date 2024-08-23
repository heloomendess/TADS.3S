/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula3;

/**
 *
 * @author heloisa.mnbarbosa
 */
public class AlunoBolsista extends Aluno {

    float bolsa;
    
    public AlunoBolsista(String nome, int idade, String curso, float mensalidade) {
        super(nome, idade, curso, mensalidade);
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
   // @Override
    public void pagaMensalidade() {
        if(isMatriculado()) {
          if(bolsa <= 1) {
              System.out.println("Aluno isento");
          } else {
            System.out.println("Pagando a mensalidade de " + getBolsa() * getMensalidade());
            }
        } else {
            System.out.println("Aluno Desligado");
        }
    }
    
    
}
