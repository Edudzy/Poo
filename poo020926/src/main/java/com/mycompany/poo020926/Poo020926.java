/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo020926;

/**
 *
 * @author alunolab11
 */
public class Poo020926 {

    public static void main(String[] args) {
        Conta conta = new Conta(123, 456, 100.0);
        conta.sacar(50.0);  
        conta.sacar(70.0);
        System.out.println("Aparece: " + conta.saldo);
    }
}