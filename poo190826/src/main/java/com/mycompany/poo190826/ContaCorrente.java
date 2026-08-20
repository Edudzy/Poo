/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo190826;

/**
 *
 * @author alunolab11
 */
public class ContaCorrente extends Conta{
    private double limite;
    
    public ContaCorrente(){
        
    }
    
    public ContaCorrente(int agencia, int numero, double saldo, double limite){
        super.setAgencia(agencia);
        super.setNumero(numero);
        //super(agencia,numero,saldo);
        this.limite = limite;
    }
}
