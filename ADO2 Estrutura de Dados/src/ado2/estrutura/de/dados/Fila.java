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
public class Fila {
    private Paciente[] filaComum;
    private Paciente[] filaPrioridade;
    int tamanhoComum;
    int tamanhoPrioridade;
    private int tamanhoMax;
    
    public Fila(int tamanhoMax) {
        this.tamanhoMax = tamanhoMax;
        this.filaComum = new Paciente[tamanhoMax];
        this.filaPrioridade = new Paciente[tamanhoMax];
        this.tamanhoComum = 0;
        this.tamanhoPrioridade = 0;
    }
    
    public void adicionarPaciente(String tipo, int numeroSenha) {
        Paciente paciente = new Paciente(tipo, numeroSenha);
        
        if(tipo.equals("Prioridade")) {
            if(tamanhoPrioridade < tamanhoMax) {
                filaPrioridade[tamanhoPrioridade++] = paciente;
            } else {
                 System.out.println("Fila de prioridade cheia");
            }
        } else {
            if(tamanhoComum < tamanhoMax) {
                filaComum[tamanhoComum++] = paciente;
            } else {
                System.out.println("Fila comum cheia");
            }
        }
    }
    
    public Paciente chamarProximoPaciente() {
        if(tamanhoPrioridade > 0) {
            Paciente paciente = filaPrioridade[0];
            
            for(int i = 0; i < tamanhoPrioridade - 1; i++) {
                filaPrioridade[i] = filaPrioridade[i + 1];
            }
            
            tamanhoPrioridade--;
            return paciente;
        } else if(tamanhoComum > 0) {
            Paciente paciente = filaComum[0];
            
            for(int i = 0; i < tamanhoComum - 1; i++) {
                filaComum[i] = filaComum[i + 1];
            }
            tamanhoComum--;
            return paciente;
            
        } else {
            System.out.println("Sem pacientes na fila.");
            return null;
        }
    }
    
    public void listarSenhas() {
        
        System.out.println("Fila de prioridade: ");
        for(int i = 0; i < tamanhoPrioridade; i++) {
            System.out.println(filaPrioridade[i]);
        }
        
        System.err.println("Fila comum: ");
        for(int i = 0; i < tamanhoComum; i++) {
            System.out.println(filaComum[i]);
        }
    }
    
    public Paciente proximoPaciente() {
        
        if(tamanhoPrioridade > 0) {
            return filaPrioridade[0];
        } else if(tamanhoComum > 0) {
            return filaComum[0];
        } else {
            return null;
        }
    }

    public void removerSenha(String tipo, int numeroSenha) {
        if (tipo.equals("Prioridade")) {
            boolean encontrado = false;
            for (int i = 0; i < tamanhoPrioridade; i++) {
                if (filaPrioridade[i].getNumeroSenha() == numeroSenha) {
                    encontrado = true;
                    for (int j = i; j < tamanhoPrioridade - 1; j++) {
                        filaPrioridade[j] = filaPrioridade[j + 1];
                    }
                    filaPrioridade[tamanhoPrioridade - 1] = null;
                    tamanhoPrioridade--;
                    System.out.println("Senha de prioridade " + numeroSenha + " removida com sucesso.");
                    break;
                }
            }
            if (!encontrado) {
                System.out.println("Senha de prioridade não encontrada.");
            }
        } else {
            boolean encontrado = false;
            for (int i = 0; i < tamanhoComum; i++) {
                if (filaComum[i].getNumeroSenha() == numeroSenha) {
                    encontrado = true;
                    for (int j = i; j < tamanhoComum - 1; j++) {
                        filaComum[j] = filaComum[j + 1];
                    }
                    filaComum[tamanhoComum - 1] = null;
                    tamanhoComum--;
                    System.out.println("Senha comum " + numeroSenha + " removida com sucesso.");
                    break;
                }
            }
            if (!encontrado) {
                System.out.println("Senha comum não encontrada.");
            }
        }
    }
}

