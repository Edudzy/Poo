/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo090926;

/**
 *
 * @author alunolab11
 */
public class FormaPagamento {
    private double valor;

    public FormaPagamento(double valor) {
        this.valor = valor;
    }
    public double calcularTotal(){
        return valor;
    }
    public void processarPagamento(){
        System.out.println("Processando pagamento");
    }
    
}
