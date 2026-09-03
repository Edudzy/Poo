/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo020926;

/**
 *
 * @author alunolab11
 */
public class Conta {
    int agencia, numero;
    double saldo;
    
    public Conta(int agencia, int numero) {
        this.agencia = agencia;
        this.numero = numero;
    }
    
    public Conta(int agencia, int numero, double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = Math.max(0.0, saldo);
    }
   //Impedir que o saldo fique negativo
    public boolean sacar(double valor) {
        if (valor <= 0 || valor > saldo) {
            return false;
        }

        saldo -= valor;
        return true;
    }

    double obterSaldo(){
        return this.saldo;
    }
}
