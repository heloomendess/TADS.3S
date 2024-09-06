/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula05;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author heloisa.mnbarbosa
 */
public class Jogador extends Criatura {

    private int ataqueForte = 140;
    private int ataqueFraco = 40;
    
    public Jogador(String nome) {
        super(nome, 1000);
    }

    @Override
    public void fraseApresentacao() {
        
    }

    @Override
    public void fraseMorte() {
       
    }

    @Override
    public void fazAtaque(Criatura atacado) {
        Random r = new Random();
        Scanner input = new Scanner(System.in);
        
        System.out.println("1)Faca: Dano 40 - Risco 0%");
        System.out.println("2)Pistola: Dano 140 - Risco 50%");
        System.out.println("Escolha a sua arma:");
        int escolha = input.nextInt();
        
        switch (escolha) {
            case 1:
                atacado.tomaDano(this.ataqueFraco);
                break;
            case 2: 
                int sorteio = r.nextInt(2);
                if(sorteio == 1) {
                    atacado.tomaDano(this.ataqueForte);
                } else {
                    System.out.println("Ataque falhou!");
                }
                break; 
        }
    }
    
}
