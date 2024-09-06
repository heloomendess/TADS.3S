/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula05;

/**
 *
 * @author heloisa.mnbarbosa
 */
public class BatalhaEpica {
    
    public static void main(String[] args) {
        
        Criatura jogador = new Jogador("Harry");
        Criatura inimigo = new Inimigo("Lord Voldemort");
        
        System.out.println("Iniciando a Batalha -----------");
        
        System.out.println("=== " + inimigo.nome + " ===");
        inimigo.fraseApresentacao();
        jogador.fraseApresentacao();
           
       
        System.out.println("====" + jogador.nome + "====");
        
        while(true) {
            jogador.mostraVida();
            inimigo.mostraVida();
        
            jogador.fazAtaque(inimigo);
            if(! inimigo.estaVivo()) {
                inimigo.fraseMorte();
                break;
            }
            inimigo.fazAtaque(jogador);
            if(!jogador.estaVivo()) {
                jogador.fraseMorte();
            }
        }
      }  
}       

