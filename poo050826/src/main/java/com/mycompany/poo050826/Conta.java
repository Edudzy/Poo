/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo050826;
// O programa leia em ordem e o tipo da variavel(conta), não liga se tiver coisas repetidas a não ser que sejam exatamente iguais
/**
 *
 * @author alunolab11
 */
public class Conta {//Isso é variaveis
    private int agencia, numero;
    private double saldo;
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
    //Esses void e int é para conseguir pegar o privado das variaveis
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
    void debitar(double valor){
        saldo = saldo - valor;
    }
}
