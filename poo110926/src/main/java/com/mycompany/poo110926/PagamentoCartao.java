/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo110926;

/**
 *
 * @author alunolab11
 */
public class PagamentoCartao extends FormaPagamento {
    public PagamentoCartao(String nome, double valor){
        super(nome, valor);
    }
    
    @Override
    public double getPrecoFinal(){
        return valor * 1.05;
    }
    
}
