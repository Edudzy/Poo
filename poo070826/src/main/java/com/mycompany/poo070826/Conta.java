/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo070826;

/**
 *
 * @author alunolab11
 */
public class Conta {
    private int agencia, numero;
    private double saldo, saldo2;
    // Isso é metodos
    Conta(){
    
    }
    
    Conta(int agencia, int numero){
        this.agencia =  agencia;
        this.numero = numero;
    }
    
    Conta(int agencia, int numero, double saldo){
        this.agencia =  agencia;
        this.numero = numero;
        this.saldo = saldo;
    }// Para pegar o privado, precisa disso
    double getSaldo(){
        return saldo;
    }
    //Esses void e int é para conseguir pegar o privado das variaveis e parametros
    void setAgencia(int agencia){
        this.agencia = agencia;
    }
    int getAgencia(){
        return agencia;
    }
    void setNumero(int Numero){
        this.numero = numero;
    }
    int getNumero(){
        return numero;
    }
    // 3 metodos
    //creditar(acrescentar), debitar(retirar) e transferir, fazer um processo que faça esses três
    void creditar(double valor){
        saldo = saldo + valor;
    }
    double debitar(double valor){
        if (valor <= saldo){
            saldo = saldo - valor;
            return true;
        }
        else{
            System.out.println("Saldo insuficiente");
            return false;
        }
    }
    void transferir(double valor, Conta destino){
        if(debitar(valor)){
            destino.creditar(valor);
        }
        else{
            System.out.println("Transferencia negada");
        }
    }
}
