
package com.mycompany.aula3;

/**
 *
 * @author heloisa.mnbarbosa
 * 
 * 
 */
public class Funcionario extends Pessoa {
    
    private float salario;
    
    public Funcionario(String nome, int idade, float salario) {
        super(nome, idade); // o super chama os metodos da super(o Pessoa é a classe mae e o funcionario a classe filha) classe Pessoa
        this.salario = salario;
        
    }
    
     @Override
    public String toString() {
        return "Funcionario: " + getNome() + ", " + getIdade() + " anos." + " Salário: " + getSalario();
    }    

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    public void receberSalario() {
        
        if(isMatriculado()) {
        System.out.println(getNome() + " recebe salário de " + getSalario());
        } else {
            System.out.println("Funcionario desligado da unidade");
        }
    }
    

}
