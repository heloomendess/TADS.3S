/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula3;

/**
 *
 * @author heloisa.mnbarbosa
 * 
 * Heranca
 */
public class Aula3 {

    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa("Heloisa", 19);
        System.out.println(p1.toString());
        
        Funcionario f1 = new Funcionario("Henrique", 19, 3400f);
        System.out.println(f1.toString());
        f1.receberSalario();
        f1.AtivaMatricula();
        f1.receberSalario();
        
        Aluno a1 = new Aluno("Renan", 20, "TADS", 350);
        a1.MensalidadePaga();
        
        AlunoBolsista aB1 = new AlunoBolsista("Kevin", 24, "TADS", 50);
        aB1.pagaMensalidade();
    }
      
}
