/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo260826;

/**
 *
 * @author alunolab11
 */
public class ContaCorrente extends Conta{
    private double limite;
    
    public ContaCorrente(){
        
    }
    
    public ContaCorrente(int agencia, int numero, double saldo, double limite){
        //super.setAgencia(agencia);
        //super.setNumero(numero);
        //super.setSaldo(saldo);
        super(agencia,numero,saldo);
        this.limite = limite;
    }
    public void atualizarLimite(double limite){
        if(limite>=0 && limite >= -getSaldo()){
            this.limite = limite;
        }
        
        //Consertar o ML/Atualizar limite, ele não está completo
    }
    
}
