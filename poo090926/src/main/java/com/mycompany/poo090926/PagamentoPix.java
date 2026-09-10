/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo090926;

/**
 *
 * @author alunolab11
 */
public class PagamentoPix extends FormaPagamento {
    public PagamentoPix(double valor) {
        super(valor);
    }

    @Override
    public double calcularTotal() {
        return valor * 0.90;
    }
    
}
