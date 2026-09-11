/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo110926;

/**
 *
 * @author alunolab11
 */
public class PagamentoPix extends FormaPagamento {

    public PagamentoPix(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double getPrecoFinal() {
        // Aplica 10% de desconto
        return valor * 0.90;
    }
    
}
