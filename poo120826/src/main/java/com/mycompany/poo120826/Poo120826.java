/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo120826;

/**
 *
 * @author alunolab11
 */
public class Poo120826 {

    public static void main(String[] args) {
        Conta c1 = new Conta(1,1,1000.00);
        Conta c2 = new Conta(1,2,890.00);
        
        c1.creditar(800);
        c2.debitar(900);
        c1.transferir(1500, c2);
        
        System.out.println("O saldo da Conta 1: " + c1.getSaldo());
        System.out.println("O saldo da Conta 2: " + c2.getSaldo());
        // Ele só repetiu o código inteiro com mais coisas
    }
}
