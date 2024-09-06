/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula05;

/**
 *
 * @author heloisa.mnbarbosa
 */
public abstract class Criatura {
    
    String nome;
    int vida;

    public Criatura(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
    }
    
    public abstract void fraseApresentacao();
    public abstract void fraseMorte();
    public abstract void fazAtaque(Criatura atacado);
    
    public boolean estaVivo() {
        return(this.vida > 0);
    }
    
    public void tomaDano(int dano) {
        if (dano > this.vida) {
        this.vida = 0;
        } else {
            this.vida -= dano;
        }
        System.out.println("Recebe dano");
    }
    
    public void mostraVida() {
        System.out.println(this.nome + ": Vida = " + this.vida);
    }
    
    
}
