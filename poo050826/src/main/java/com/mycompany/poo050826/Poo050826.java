/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo050826;

/**
 *
 * @author alunolab11
 */
public class Poo050826 {

    public static void main(String[] args) {
        Conta c1 = new Conta(222, 898, 8000.00);
        System.out.println("Agencia: "+ c1.getAgencia());
        System.out.println("Numero: "+ c1.getNumero());
        System.out.println("Saldo da conta: "+ c1.getSaldo());
    }
}
