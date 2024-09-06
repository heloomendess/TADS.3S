/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula05;


/**
 *
 * @author heloisa.mnbarbosa
 */
public class Inimigo extends Criatura {

    private int ataque = 50;
    
    public Inimigo(String nome) {
        super(nome, 1000);
    }

    @Override
    public void fraseApresentacao() {
        System.out.println("Eu vou te matar!! Muahahahahah");
    }

    @Override
    public void fraseMorte() {
        System.out.println("naaaaaaaoooo!!!!");
    }
        

    @Override
    public void fazAtaque(Criatura atacado) {
       atacado.tomaDano(this.ataque);
    }
    
}
